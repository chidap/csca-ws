package com.chida.csca.ws.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

/**
 * JPA Entity class to hols member's primary information
 */

@Entity(name = "member_registration_info")            //////////// Name of the table
public class MemberDetailsEntity implements Serializable {

    /**
     *  Private members
     */

    private static final long serialVersionUID = 1L;                //////////////Add Serial Version Id///////////////////
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "membership_id", nullable = false, unique = true, length = 20)
    private String membershipId;

    @Column(name = "first_name", nullable = false, length = 40)
    private String firstName;

    @Column(name = "last_name", nullable = false, length = 40)
    private String lastName;

    @Column(name = "address1", nullable = false, length = 80)
    private String address1;

    @Column(name = "address2", nullable = false, length = 80)
    private String address2;

    @Column(name = "address3", nullable = false, length = 80)
    private String address3;

    @Column(name = "city", nullable = false, length = 30)
    private String city;

    @Column(name = "state", nullable = false, length = 30)
    private String state;

    @Column(name = "pincode", nullable = false, length = 6)
    private String pincode;

    @Column(name = "email_id", nullable = false, unique = true, length = 100)
    private String email;

    @Column(name = "mobile_no", nullable = false, unique = true, length = 13)
    private String mobileNo;

    @Column(name = "landline_no", length = 20)
    private String landlineNo;

    @Column(name = "member_photo", length = 150)
    private String photo;

    @Column(name = "date_of_birth", nullable = false)
    private LocalDate dateOfBirth;

    @Column(name = "gender", nullable = false, length = 6)
    private String gender;

    @Column(name = "is_married", nullable = false, length = 3)
    private String isMarried;

    @Column(name = "date_of_marriage")
    private LocalDate dateOfMarriage;

    @Column(name = "member_native", length = 30)
    private String memberNative;

    @Column(name = "occupation", length = 30)
    private String occupation;

    @Column(name = "designation", length = 30)
    private String designation;

    @Column(name = "referred_by", length = 50)
    private String referredBy;

    /**
     *  CascadeType.All is to make sure MemberLoginInfo will be persisted when Member details are persisted
     *  FetchType.LAZY will avoid eager loading for performance benefit
     */

    @OneToOne( mappedBy = "memberDetails", cascade = CascadeType.ALL)
    private MemberLoginEntity memberLoginInfo;

    /**
     *  Since MemberFamilyEntity is owning the relationship, mappedBy = object name of the MemberDetailsEntity in MemberFamilyEntity
     *  cascade make sure when member Family Details gets persisted along with member details
     *  */
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "memberDetails", cascade = CascadeType.ALL)
    private Set<MemberFamilyEntity> memberFamilyDetails = new HashSet<>();

    /**
     * Since MembershipRenewalEntity is owning the relationship( being the many side), mappedBy = object name
     * of the MemberDetailsEntity in MembershipRenewalEntity
     * cascade make sure when member membership renewal Details gets persisted along with member details
     */
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "memberDetails", cascade = CascadeType.ALL)
    private Set<MembershipRenewalEntity> membershipRenewalDetails;


    /**
     * Since MemberPaymentEntity is owning the relationship( being the many side), mappedBy = object name of the MemberDetailsEntity in MemberPaymentEntity
     * cascade make sure when member payment Details gets persisted along with member details
     */
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "memberDetails", cascade = CascadeType.ALL)
    private Set<MemberPaymentEntity> memberPaymentDetails;


    private String isMemberActive;


    /////////////////// Setters & Getters ////////////////////////////


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMembershipId() {
        return membershipId;
    }

    public void setMembershipId(String membershipId) {
        this.membershipId = membershipId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getAddress3() {
        return address3;
    }

    public void setAddress3(String address3) {
        this.address3 = address3;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getLandlineNo() {
        return landlineNo;
    }

    public void setLandlineNo(String landlineNo) {
        this.landlineNo = landlineNo;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIsMarried() {
        return isMarried;
    }

    public void setIsMarried(String isMarried) {
        this.isMarried = isMarried;
    }

    public LocalDate getDateOfMarriage() {
        return dateOfMarriage;
    }

    public void setDateOfMarriage(LocalDate dateOfMarriage) {
        this.dateOfMarriage = dateOfMarriage;
    }

    public String getMemberNative() {
        return memberNative;
    }

    public void setMemberNative(String memberNative) {
        this.memberNative = memberNative;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getReferredBy() {
        return referredBy;
    }

    public void setReferredBy(String referredBy) {
        this.referredBy = referredBy;
    }

    public MemberLoginEntity getMemberLoginInfo() {
        return memberLoginInfo;
    }

    public void setMemberLoginInfo(MemberLoginEntity memberLoginInfo) {
        this.memberLoginInfo = memberLoginInfo;
    }

    public Set<MemberFamilyEntity> getMemberFamilyDetails() {
        return memberFamilyDetails;
    }

    public void setMemberFamilyDetails(Set<MemberFamilyEntity> memberFamilyDetails) {
        this.memberFamilyDetails = memberFamilyDetails;
    }

    public Set<MembershipRenewalEntity> getMembershipRenewalDetails() {
        return membershipRenewalDetails;
    }

    public void setMembershipRenewalDetails(Set<MembershipRenewalEntity> membershipRenewalDetails) {
        this.membershipRenewalDetails = membershipRenewalDetails;
    }

    public Set<MemberPaymentEntity> getMemberPaymentDetails() {
        return memberPaymentDetails;
    }

    public void setMemberPaymentDetails(Set<MemberPaymentEntity> memberPaymentDetails) {
        this.memberPaymentDetails = memberPaymentDetails;
    }

    public String getIsMemberActive() {
        return isMemberActive;
    }

    public void setIsMemberActive(String isMemberActive) {
        this.isMemberActive = isMemberActive;
    }
}


