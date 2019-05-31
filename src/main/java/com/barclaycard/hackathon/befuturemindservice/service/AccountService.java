package com.barclaycard.hackathon.befuturemindservice.service;

import com.barclaycard.hackathon.befuturemindservice.entities.Account;
import com.barclaycard.hackathon.befuturemindservice.repository.AccountRepository;
import com.test.gen.AccountDetails;
import com.test.gen.TransactionDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

/**
 * Created by vbhatia on 11/23/2017.
 */
@Service
public class AccountService {

    @Autowired
    RestTemplate serviceRestTemplate;

    @Value("${remote.mongo.endpoint}")
    String baseUrl;

    public AccountDetails getAccount(String ASID) {

        String url = baseUrl+"/account/details/"+ASID;
        AccountDetails accountDetails = serviceRestTemplate.getForObject(url, AccountDetails.class);
        return accountDetails;
    }
    public TransactionDetails getTransactions(String ASID){

        String url = baseUrl+"/account/transactions/"+ASID;
        TransactionDetails transactionDetails = serviceRestTemplate.getForObject(url, TransactionDetails.class);
        return transactionDetails;
    }

}
