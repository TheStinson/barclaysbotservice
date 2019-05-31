package com.barclaycard.hackathon.befuturemindservice.service;

import com.barclaycard.hackathon.befuturemindservice.entities.SenderSession;
import com.barclaycard.hackathon.befuturemindservice.repository.SenderSessionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SenderSessionService {

    @Autowired
    SenderSessionRepository repository;

    public SenderSession getSenderSession(String senderId) {
        return repository.findOne(senderId);
    }

    public SenderSession saveSenderSession(SenderSession senderSession) {
        return repository.save(senderSession);
    }
}
