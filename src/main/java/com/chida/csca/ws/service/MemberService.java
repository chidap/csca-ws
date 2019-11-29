package com.chida.csca.ws.service;

import com.chida.csca.ws.shared.dto.MemberDTO;

import java.sql.SQLException;

public interface MemberService {

    MemberDTO createMember(MemberDTO member) throws ClassNotFoundException, SQLException;
}
