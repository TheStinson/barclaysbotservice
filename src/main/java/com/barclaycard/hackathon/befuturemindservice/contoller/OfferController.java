package com.barclaycard.hackathon.befuturemindservice.contoller;

import com.barclaycard.hackathon.befuturemindservice.service.OfferService;
import com.test.gen.AccountDetails;
import com.test.gen.OfferDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by vbhatia on 11/25/2017.
 */
@RestController
@RequestMapping("/offer")
public class OfferController {

    @Autowired
    OfferService offerService;

    @GetMapping(value = "/offer/{ASID}/{category}")
    public ResponseEntity getAccountDetails(@PathVariable String ASID, @PathVariable String category) {
        OfferDetails offerDetails = offerService.getOffer(ASID, category);
        return ResponseEntity.ok(offerDetails);
    }
}

