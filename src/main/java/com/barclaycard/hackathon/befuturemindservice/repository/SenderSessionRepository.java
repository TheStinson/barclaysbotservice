package com.barclaycard.hackathon.befuturemindservice.repository;

import com.barclaycard.hackathon.befuturemindservice.entities.SenderSession;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SenderSessionRepository extends CrudRepository<SenderSession, String>{

}
