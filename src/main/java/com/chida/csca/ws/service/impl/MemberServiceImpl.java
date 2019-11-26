package com.chida.csca.ws.service.impl;

import com.chida.csca.ws.entity.MemberDetailsEntity;
import com.chida.csca.ws.repository.LoginRepository;
import com.chida.csca.ws.repository.MemberRepository;
import com.chida.csca.ws.service.MemberService;
import com.chida.csca.ws.shared.Utils;
import com.chida.csca.ws.shared.dto.*;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;


@Service
public class MemberServiceImpl implements MemberService {

    private MemberRepository memberRepository;
    private LoginRepository loginRepository;
    private Utils utils;

    /**
     * Constructor
     */

    public MemberServiceImpl( MemberRepository memberRepository,
                              LoginRepository loginRepository,
                              Utils utils
                             ) {
        this.memberRepository = memberRepository;
        this.loginRepository = loginRepository;
        this.utils = utils;
    }

    /**
     * This method is used to create a new Member and store into the DB
     * Its accepts a MemberDTO as input, copies MemberDTO to MemberDetailsEntity and create a user
     * finally returns created Member info as MemberDTO
     * @param   - MemberDTO
     * @return  - MemberDTO
     * @throws  - ClassNotFoundException
     * @throws  - SQLException
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public MemberDTO createMember(MemberDTO member) throws ClassNotFoundException, SQLException {
        /**
         *  Copying member infro from MemberDTO to MemberDetailsEntity
         */
        MemberDetailsEntity storedMemberDetails = memberRepository.findByEmail(member.getEmail()) ;
        if ( storedMemberDetails != null ) throw new RuntimeException("Member already exists!");

        for ( MemberFamilyDTO family: member.getMemberFamilyDetails() ) {
            family.setMemberDetails(member);

        }

        for ( MemberPaymentDTO payment: member.getMemberPaymentDetails()) {
            payment.setMemberDetails(member);

        }

        for (MembershipRenewalDTO renewal: member.getMembershipRenewalDetails()) {
            renewal.setMemberDetails(member);

        }

        MemberLoginDTO loginInfo = member.getMemberLoginInfo();
        //loginInfo.setEncryptedPassword(bCryptPasswordEncoder.encode(loginInfo.getPassword()));
        loginInfo.setEncryptedPassword("test");
        loginInfo.setMemberDetails(member);
        member.setMemberLoginInfo(loginInfo);


        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration()
                .setMatchingStrategy(MatchingStrategies.STRICT);
        MemberDetailsEntity memberEntity = modelMapper.map(member, MemberDetailsEntity.class);

        String uniqueMemberId = utils.generateMemberId(10);
        memberEntity.setMembershipId(uniqueMemberId);


        MemberDetailsEntity createdMemberDetails =  memberRepository.save(memberEntity);

        MemberDTO returnMemberDTO = modelMapper.map(createdMemberDetails, MemberDTO.class);

        return returnMemberDTO;
    }
}
