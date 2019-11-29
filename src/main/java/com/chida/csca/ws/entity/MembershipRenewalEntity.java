package com.chida.csca.ws.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity(name = "membership_renewal_info")
public class MembershipRenewalEntity implements Serializable {
    /**
     *  Private members
     */
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(name = "membership_type", nullable = false, length = 20)
    private String membershipType;

    @Column(name = "subscription_type", nullable = false, length = 20)
    private String subscriptionType;

    @Column(name = "membership_start_date", nullable = false)
    private LocalDate membershipStartDate;

    @Column(name = "membership_expiry_date", nullable = false)
    private LocalDate membershipExpiryDate;

    @Column(name = "subscription_amount", nullable = false)
    private int subscriptionAmount;

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

    public MemberDetailsEntity getMemberDetails() {
        return memberDetails;
    }

    public void setMemberDetails(MemberDetailsEntity memberDetails) {
        this.memberDetails = memberDetails;
    }
}
