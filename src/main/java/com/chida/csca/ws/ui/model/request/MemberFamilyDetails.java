package com.chida.csca.ws.ui.model.request;

import java.time.LocalDate;

/**
 * THis class stores the Member's family information details
 */

public class MemberFamilyDetails {

    /**
     * Private members
     */

    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private String relation;

    /**
     * Define Setter & Getter
     */
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


}
