package com.barclaycard.hackathon.befuturemindservice.service;

import com.barclaycard.hackathon.befuturemindservice.entities.User;
import com.barclaycard.hackathon.befuturemindservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public User getUser(String userId){
        return userRepository.findOne(userId);
    }
}
