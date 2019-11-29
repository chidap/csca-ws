package com.chida.csca.ws.shared.dto;

public class MemberLoginDTO {

    /**
     * Private members
     */
        private Long Id;
        private String loginId;
        private String password;
        private String encryptedPassword;
        private String emailVerificationToken;
        private Boolean emailVerificationStatus = false;
        private String securityQuestion;
        private String securityAnswer;
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

        public String getLoginId() {
            return loginId;
        }

        public void setLoginId(String loginId) {
            this.loginId = loginId;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
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

        public MemberDTO getMemberDetails() {
            return memberDetails;
        }

        public void setMemberDetails(MemberDTO memberDetails) {
            this.memberDetails = memberDetails;
        }
}
