package com.chida.csca.ws.ui.controller;

import com.chida.csca.ws.service.MemberService;
import com.chida.csca.ws.shared.dto.MemberDTO;
import com.chida.csca.ws.ui.model.request.MemberDetailsRequestModel;
import com.chida.csca.ws.ui.model.response.MemberDetailsResponse;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("csca/members")
public class MemberController {

    @Autowired
    private MemberService memberService;

    /**
     * Get method to find a member complete information
     * @return
     */
    @GetMapping
    public String getMember() {
        return "get member was called";
    }


    /**
     * Post method to store and create a new member information
     * @RequestBody converts JSON payload into Java Object of MemberDetailsRequestModel class. The attributes of the JSON payload should match with Java class
     * @return
     */
    @PostMapping
    public MemberDetailsResponse createMember(@RequestBody MemberDetailsRequestModel memberDetails) throws Exception {
        /**
         *  MemberDTO object will copy the MemberDetailsRequestModel data and send to the service layer for storage
         *  BeanUtils.copyProperties copies the memberDetails properties to MemberDTO
         *  BeanUtils does not able to copy an object that has another object into it and Model Mapper does that
         *  MemberDTO memberDto = new MemberDTO();
         *  BeanUtils.copyProperties(memberDetails, memberDto);
         */

            ModelMapper modelMapper = new ModelMapper();
            modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
            MemberDTO memberDto = modelMapper.map(memberDetails, MemberDTO.class);
            /**
             *  passing memberDto to service layer for storage
             *   and sending back the created member details by copying createdMemberDTO to MemberDetailsResp
             */
            MemberDTO createdMemberDTO = memberService.createMember(memberDto);
            MemberDetailsResponse createdMemberResp = modelMapper.map(createdMemberDTO, MemberDetailsResponse.class);

            return createdMemberResp;

    }


    /**
     * Put method to update an existing member information
     * @return
     */
    @PutMapping
    public String updateMember() {
        return "update member was called";
    }


    /**
     * Delete method to delete an existing member information
     * @return
     */
    @DeleteMapping
    public String deleteMember() {
        return "delete member was called";
    }

}
