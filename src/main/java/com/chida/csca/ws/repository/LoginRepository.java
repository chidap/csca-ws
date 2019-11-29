package com.chida.csca.ws.repository;

import com.chida.csca.ws.entity.MemberLoginEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepository extends CrudRepository<MemberLoginEntity, Long> {

    //@Query("SELECT l FROM MemberLoginEntity as l JOIN FETCH l.MemberDetailsEntity as MemberDetailsEntity")
    MemberLoginEntity findByLoginId(String loginId);
}