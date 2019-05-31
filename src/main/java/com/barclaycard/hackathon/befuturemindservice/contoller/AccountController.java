package com.barclaycard.hackathon.befuturemindservice.contoller;

import com.barclaycard.hackathon.befuturemindservice.service.AccountService;
import com.test.gen.AccountDetails;
import com.test.gen.Branch;
import com.test.gen.Transaction;
import com.test.gen.TransactionDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vbhatia on 11/22/2017.
 */
@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    AccountService accountService;

    @GetMapping(value = "/details/{ASID}")
    public ResponseEntity getAccountDetails(@PathVariable String ASID) {
        AccountDetails account = accountService.getAccount(ASID);
        return ResponseEntity.ok(account);
    }

    @GetMapping(value = "/balance/{socialId}")
    public ResponseEntity getAccountBalance(@PathVariable String socialId) {
        AccountDetails account = accountService.getAccount(socialId);
        String balance = "null";
        if (null != account) {
            balance = account.getAccountBalance().toString();
        }
        return ResponseEntity.ok(balance);
    }

    @GetMapping(value = "/transactions/last/{socialId}")
    public ResponseEntity getLast5Txn(@PathVariable String socialId) {
        TransactionDetails transactionDetails = accountService.getTransactions(socialId);
        List<Transaction> transactionList = new ArrayList<>();
        if (null != transactionDetails.getTransactions()) {
            int transactionCount = 0;
            while(transactionDetails.getTransactions().size()>0 && transactionCount<5)
            {
                transactionList.add(transactionDetails.getTransactions().get(transactionCount));
                transactionCount++;
            }
        }
        return ResponseEntity.ok(transactionList);
    }

    @GetMapping(value = "/branch/{ASID}")
    public ResponseEntity getBranchDetails(@PathVariable String ASID){
        AccountDetails account = accountService.getAccount(ASID);
        Branch branch = null;
        if (null != account) {
            branch = account.getBranch();
        }
        return ResponseEntity.ok(branch);
    }
}
