package com.chida.csca.ws.shared.dto;

import java.time.LocalDate;

/**
 *  DTO to hold Members Payment Information
 */
public class MemberPaymentDTO {

    /**
     * Private members
     */
    private Long Id;
    private String paymentType;                             ////////////// Membership / Donation
    private String paymentDescription;
    private String donationCategory;
    private int paidAmount;
    private LocalDate paymentDate;
    private String paymentInstrument;
    private String instrumentNo;
    private String paymentStatus;
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

        public String getPaymentType() {
            return paymentType;
        }

        public void setPaymentType(String paymentType) {
            this.paymentType = paymentType;
        }

        public String getPaymentDescription() {
            return paymentDescription;
        }

        public void setPaymentDescription(String paymentDescription) {
            this.paymentDescription = paymentDescription;
        }

        public String getDonationCategory() {
            return donationCategory;
        }

        public void setDonationCategory(String donationCategory) {
            this.donationCategory = donationCategory;
        }

        public int getPaidAmount() {
            return paidAmount;
        }

        public void setPaidAmount(int paidAmount) {
            this.paidAmount = paidAmount;
        }

        public LocalDate getPaymentDate() {
            return paymentDate;
        }

        public void setPaymentDate(LocalDate paymentDate) {
            this.paymentDate = paymentDate;
        }

        public String getPaymentInstrument() {
            return paymentInstrument;
        }

        public void setPaymentInstrument(String paymentInstrument) {
            this.paymentInstrument = paymentInstrument;
        }

        public String getInstrumentNo() {
            return instrumentNo;
        }

        public void setInstrumentNo(String instrumentNo) {
            this.instrumentNo = instrumentNo;
        }

        public String getPaymentStatus() {
            return paymentStatus;
        }

        public void setPaymentStatus(String paymentStatus) {
            this.paymentStatus = paymentStatus;
        }

        public MemberDTO getMemberDetails() {
            return memberDetails;
        }

        public void setMemberDetails(MemberDTO memberDetails) {
            this.memberDetails = memberDetails;
        }
}
