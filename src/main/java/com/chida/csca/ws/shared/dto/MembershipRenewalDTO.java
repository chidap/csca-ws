package com.chida.csca.ws.shared.dto;

import java.time.LocalDate;

public class MembershipRenewalDTO {

    /**
     * private members
     */

        private Long Id;
        private String membershipType;                      //////// family / individual ////////
        private String subscriptionType;                    ///////// One year / Lifetime //////
        private LocalDate membershipStartDate;
        private LocalDate membershipExpiryDate;
        private int subscriptionAmount;
        private MemberDTO memberDetails;

    /**
     *  Setters & Getters
     */

        public Long getId() {
            return Id;
        }

        public void setId(Long id) {
            Id = id;
        }

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

        public MemberDTO getMemberDetails() {
            return memberDetails;
        }

        public void setMemberDetails(MemberDTO memberDetails) {
            this.memberDetails = memberDetails;
        }
}
