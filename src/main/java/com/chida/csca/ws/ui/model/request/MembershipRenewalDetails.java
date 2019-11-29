package com.chida.csca.ws.ui.model.request;

import java.time.LocalDate;

public class MembershipRenewalDetails {

    //////// private members ////////////////

    private String membershipType;                      //////// family / individual ////////
    private String subscriptionType;                    ///////// One year / Lifetime //////
    private LocalDate membershipStartDate;
    private LocalDate membershipExpiryDate;
    private int subscriptionAmount;

    ////////////// Setters and Getters /////////


    public String getMembershipType() {
        return membershipType;
    }

    public void setMembershipType(String membershipType) {
        this.membershipType = membershipType;
    }

    public String getSubscriptionType() {
        return subscriptionType;
    }

    public void setSubscriptionType(String subscriptionType) {
        this.subscriptionType = subscriptionType;
    }

    public LocalDate getMembershipStartDate() {
        return membershipStartDate;
    }

    public void setMembershipStartDate(LocalDate membershipStartDate) {
        this.membershipStartDate = membershipStartDate;
    }

    public LocalDate getMembershipExpiryDate() {
        return membershipExpiryDate;
    }

    public void setMembershipExpiryDate(LocalDate membershipExpiryDate) {
        this.membershipExpiryDate = membershipExpiryDate;
    }

    public int getSubscriptionAmount() {
        return subscriptionAmount;
    }

    public void setSubscriptionAmount(int subscriptionAmount) {
        this.subscriptionAmount = subscriptionAmount;
    }

}
