package com.chida.csca.ws.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "member_login_info")
public class MemberLoginEntity implements Serializable {

    private static final Long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(nullable = false, length = 20)
    private String loginId;

    @Column(nullable = false)
    private String encryptedPassword;

    private String emailVerificationToken;

    @Column(nullable = false)
    private Boolean emailVerificationStatus = false;

    @Column(nullable = false)
    private String securityQuestion;

    @Column(nullable = false)
    private String securityAnswer;

    ////// One to One relationship with MemberDetailsEntity, MemberDetailsEntity is the owner of the relationship////////////////////////////
    ////// mappedBy should have the value of the name of the fields MemberLoginDTO in MemberLoginEntity ////////////////////////

    @OneToOne
    @JoinColumn(name = "member_registration_info_id")
    private MemberDetailsEntity memberDetails;

    /**
     *  Getters & Setters
     */
    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getEncryptedPassword() {
        return encryptedPassword;
    }

    public void setEncryptedPassword(String encryptedPassword) {
        this.encryptedPassword = encryptedPassword;
    }

    public String getEmailVerificationToken() {
        return emailVerificationToken;
    }

    public void setEmailVerificationToken(String emailVerificationToken) {
        this.emailVerificationToken = emailVerificationToken;
    }

    public Boolean getEmailVerificationStatus() {
        return emailVerificationStatus;
    }

    public void setEmailVerificationStatus(Boolean emailVerificationStatus) {
        this.emailVerificationStatus = emailVerificationStatus;
    }

    public String getSecurityQuestion() {
        return securityQuestion;
    }

    public void setSecurityQuestion(String securityQuestion) {
        this.securityQuestion = securityQuestion;
    }

    public String getSecurityAnswer() {
        return securityAnswer;
    }

    public void setSecurityAnswer(String securityAnswer) {
        this.securityAnswer = securityAnswer;
    }

    public MemberDetailsEntity getMemberDetails() {
        return memberDetails;
    }

    public void setMemberDetails(MemberDetailsEntity memberDetails) {
        this.memberDetails = memberDetails;
    }
}
