package com.chida.csca.ws.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity(name = "member_payment_info")
public class MemberPaymentEntity implements Serializable {
    /**
     *  Private members
     */
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(name = "payment_type", nullable = false, length = 20)
    private String paymentType;

    @Column(name = "payment_description", nullable = false, length = 100)
    private String paymentDescription;

    @Column(name = "donation_category", nullable = false, length = 30)
    private String donationCategory;

    @Column(name = "paid_amount", nullable = false)
    private int paidAmount;

    @Column(name = "payment_date", nullable = false)
    private LocalDate paymentDate;

    @Column(name = "payment_instrument", nullable = false, length = 20)
    private String paymentInstrument;

    @Column(name = "instrument_no", length = 20)
    private String instrumentNo;

    @Column(name = "payment_status", nullable = false, length = 10)
    private String paymentStatus;

    @ManyToOne
    @JoinColumn(name = "member_registration_info_id")
    private MemberDetailsEntity memberDetails;

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

    public MemberDetailsEntity getMemberDetails() {
        return memberDetails;
    }

    public void setMemberDetails(MemberDetailsEntity memberDetails) {
        this.memberDetails = memberDetails;
    }
}
