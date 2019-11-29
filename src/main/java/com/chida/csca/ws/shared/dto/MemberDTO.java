package com.chida.csca.ws.shared.dto;

import java.time.LocalDate;
import java.util.Set;

/**
 *  DTO to hold complete information of a member.
 */

public class MemberDTO {

    /**
     * Private members
     */

        private static final long serialVersionUID = 4865903039190150223L;
        private Long id;
        private String membershipId;
        private String firstName;
        private String lastName;
        private String address1;
        private String address2;
        private String address3;
        private String city;
        private String state;
        private String pincode;
        private String email;
        private String mobileNo;
        private String landlineNo;
        private String photo;
        private LocalDate dateOfBirth;
        private String gender;
        private String isMarried;
        private LocalDate dateOfMarriage;
        private String memberNative;
        private String occupation;
        private String designation;
        private String referredBy;
        private MemberLoginDTO memberLoginInfo;
        private Set<MemberFamilyDTO> memberFamilyDetails;
        private Set<MembershipRenewalDTO> membershipRenewalDetails;
        private Set<MemberPaymentDTO> memberPaymentDetails;
        private String isMemberActive;


    /**
     *  Setters & Getters
     */

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

        public MemberLoginDTO getMemberLoginInfo() {
            return memberLoginInfo;
        }

        public void setMemberLoginInfo(MemberLoginDTO memberLoginInfo) {
            this.memberLoginInfo = memberLoginInfo;
        }

        public Set<MemberFamilyDTO> getMemberFamilyDetails() {
            return memberFamilyDetails;
        }

        public void setMemberFamilyDetails(Set<MemberFamilyDTO> memberFamilyDetails) {
            this.memberFamilyDetails = memberFamilyDetails;
        }

        public Set<MembershipRenewalDTO> getMembershipRenewalDetails() {
            return membershipRenewalDetails;
        }

        public void setMembershipRenewalDetails(Set<MembershipRenewalDTO> membershipRenewalDetails) {
            this.membershipRenewalDetails = membershipRenewalDetails;
        }

        public Set<MemberPaymentDTO> getMemberPaymentDetails() {
            return memberPaymentDetails;
        }

        public void setMemberPaymentDetails(Set<MemberPaymentDTO> memberPaymentDetails) {
            this.memberPaymentDetails = memberPaymentDetails;
        }

        public String getIsMemberActive() {
            return isMemberActive;
        }

        public void setIsMemberActive(String isMemberActive) {
            this.isMemberActive = isMemberActive;
        }


}
