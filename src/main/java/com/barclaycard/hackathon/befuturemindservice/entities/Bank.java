package com.barclaycard.hackathon.befuturemindservice.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Bank implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    @Column( name = "ID")
    private String bankId;

    @OneToMany(mappedBy = "bank")
    @JsonManagedReference
    private List<Account> accounts;

    @Column
    private String branchDetails;

    @Column
    private String Ifsc;

    public String getBankId() {
        return bankId;
    }

    public void setBankId(String bankId) {
        this.bankId = bankId;
    }

    public String getBranchDetails() {
        return branchDetails;
    }

    public void setBranchDetails(String branchDetails) {
        this.branchDetails = branchDetails;
    }

    public String getIfsc() {
        return Ifsc;
    }

    public void setIfsc(String ifsc) {
        Ifsc = ifsc;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }
}
