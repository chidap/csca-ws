package com.chida.csca.ws.service;

import com.chida.csca.ws.shared.dto.MemberDTO;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.sql.SQLException;

public interface MemberService extends UserDetailsService {

    MemberDTO createMember(MemberDTO member) throws ClassNotFoundException, SQLException;
}
