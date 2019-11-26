package com.chida.csca.ws.repository;

import com.chida.csca.ws.entity.MemberDetailsEntity;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;


/**
 * Paging and Sorting Repository has ability to provide the data only specific set of members based on Page number and limit value
 */

@Repository
public interface MemberRepository extends PagingAndSortingRepository<MemberDetailsEntity, Long> {


    MemberDetailsEntity findByMembershipId(String membershipId);

    MemberDetailsEntity findByEmail(String email);


}
