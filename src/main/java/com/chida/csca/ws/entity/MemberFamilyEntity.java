package com.chida.csca.ws.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity(name = "member_family_info")
public class MemberFamilyEntity implements Serializable {
    ////////////// members ///////////////////////////////
    //////////////Add Serial Version Id///////////////////
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(name = "first_name", length = 40, nullable = false)
    private String firstName;

    @Column(name = "last_name", length = 40, nullable = false)
    private String lastName;

    @Column(name = "date_of_birth")
    private LocalDate dateOfBirth;

    @Column(name = "relation", length = 20)
    private String relation;

    @ManyToOne
    @JoinColumn(name = "member_registration_info_id")
    private MemberDetailsEntity memberDetails;

    /**
     *     Setters & Getters
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

    public MemberDetailsEntity getMemberDetails() {
        return memberDetails;
    }

    public void setMemberDetails(MemberDetailsEntity memberDetails) {
        this.memberDetails = memberDetails;
    }
}
