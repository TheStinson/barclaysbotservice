package com.barclaycard.hackathon.befuturemindservice.repository;

import com.barclaycard.hackathon.befuturemindservice.entities.Account;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by vbhatia on 11/23/2017.
 */
@Repository
public interface AccountRepository extends CrudRepository<Account, String> {
    List<Account> findBySocialId(@Param("socialId")String socialId);
}
