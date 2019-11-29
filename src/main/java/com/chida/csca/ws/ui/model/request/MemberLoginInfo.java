package com.chida.csca.ws.ui.model.request;

/**
 *  Class to store the Member's Login Information and Password Security Questions and Answers
 */

public class MemberLoginInfo {

    ////////// Private members ////////////
        private String loginId;
        private String password;
        private String securityQuestion;
        private String securityAnswer;

    //////////// Setters and Getters /////////


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
}
