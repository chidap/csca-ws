package com.chida.csca.ws.shared.dto;

import java.time.LocalDate;

/**
 * DTO to hold member family information
 */
public class MemberFamilyDTO {

    /**
     *  Private members
     */

        private Long Id;
        private String firstName;
        private String lastName;
        private LocalDate dateOfBirth;
        private String relation;
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

        public LocalDate getDateOfBirth() {
            return dateOfBirth;
        }

        public void setDateOfBirth(LocalDate dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
        }

        public String getRelation() {
            return relation;
        }

        public void setRelation(String relation) {
            this.relation = relation;
        }

        public MemberDTO getMemberDetails() {
            return memberDetails;
        }

        public void setMemberDetails(MemberDTO memberDetails) {
            this.memberDetails = memberDetails;
        }
}
