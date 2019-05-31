package com.barclaycard.hackathon.befuturemindservice.contoller;

import com.barclaycard.hackathon.befuturemindservice.entities.SenderSession;
import com.barclaycard.hackathon.befuturemindservice.service.SenderSessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sendersession")
public class SenderSessionController {

    @Autowired
    SenderSessionService senderSessionService;

    @GetMapping(value = "/{senderID}", headers = {"apiKey=ssdWEWdWDw3434FDFe5FefEefef"})
    public ResponseEntity getSenderSession(@PathVariable String senderID) {
        SenderSession senderSession = senderSessionService.getSenderSession(senderID);
        return ResponseEntity.ok(senderSession);
    }

    @PostMapping(headers = {"apiKey=ssdWEWdWDw3434FDFe5FefEefef"})
    public ResponseEntity saveSenderSession(@RequestBody SenderSession senderSession) {
        SenderSession senderSession1 = senderSessionService.saveSenderSession(senderSession);
        return ResponseEntity.ok(senderSession1);
    }
}
