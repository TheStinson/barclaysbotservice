package com.barclaycard.hackathon.befuturemindservice.repository;

import com.barclaycard.hackathon.befuturemindservice.entities.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, String>{
}
