package com.barclaycard.hackathon.befuturemindservice.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.sql.Timestamp;


@Entity(name = "SenderSession")
public class SenderSession implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "senderId")
    private String senderID;

    @Column(name = "lastLoginTS")
    private Timestamp lastLoginTS;

    @Column(name = "authenticatedFlag")
    private boolean authenticatedFlag;

    @Column(name = "securePin")
    private String securePin;

    @Column(name = "updateTS")
    private Timestamp updateTS;

    private boolean sessionStarted;

    public boolean isSessionStarted() {
        return sessionStarted;
    }

    public void setSessionStarted(boolean sessionStarted) {
        this.sessionStarted = sessionStarted;
    }

    public String getSenderID() {
        return senderID;
    }

    public void setSenderID(String senderID) {
        this.senderID = senderID;
    }

    public Timestamp getLastLoginTS() {
        return lastLoginTS;
    }

    public void setLastLoginTS(Timestamp lastLoginTS) {
        this.lastLoginTS = lastLoginTS;
    }

    public boolean isAuthenticatedFlag() {
        return authenticatedFlag;
    }

    public void setAuthenticatedFlag(boolean authenticatedFlag) {
        this.authenticatedFlag = authenticatedFlag;
    }

    public String getSecurePin() {
        return securePin;
    }

    public void setSecurePin(String securePin) {
        this.securePin = securePin;
    }

    public Timestamp getUpdateTS() {
        return updateTS;
    }

    public void setUpdateTS(Timestamp updateTS) {
        this.updateTS = updateTS;
    }
}

