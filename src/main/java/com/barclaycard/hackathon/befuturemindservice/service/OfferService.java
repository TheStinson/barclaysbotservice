package com.barclaycard.hackathon.befuturemindservice.service;

import com.test.gen.AccountDetails;
import com.test.gen.OfferDetails;
import com.test.gen.TransactionDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by vbhatia on 11/25/2017.
 */
@Service
public class OfferService {

    @Autowired
    RestTemplate serviceRestTemplate;

    @Value("${remote.mongo.endpoint}")
    String baseUrl;

    public OfferDetails getOffer(String ASID, String category) {

        String url = baseUrl+"/offer/"+ASID+"/"+category;
        OfferDetails offerDetails = serviceRestTemplate.getForObject(url, OfferDetails.class);
        return offerDetails;
    }
}
