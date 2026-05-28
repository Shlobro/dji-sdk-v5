/*
 * Decompiled with CFR 0.152.
 */
package dji.v5.manager.account.data;

import dji.v5.common.KeepProguard;

public class LoginCommonResponse
implements KeepProguard {
    private int code;
    private String message;
    private Data data;

    public int getCode() {
        return 0;
    }

    public void setCode(int n) {
    }

    public String getMessage() {
        return null;
    }

    public void setMessage(String string2) {
    }

    public Data getData() {
        return null;
    }

    public void setData(Data data) {
    }

    public boolean isSuccess() {
        return false;
    }

    public boolean isNeedVerificationCode() {
        return false;
    }

    public boolean isVerificationCodeError() {
        return false;
    }

    public static class Data
    implements KeepProguard {
        private String nick_name;
        private String cookie_name;
        private String cookie_key;
        private String active;
        private String email;
        private String token;
        private String validity;
        private String user_id;
        private String register_phone;
        private String area_code;
        private String inner_email;
        private String subscription;
        private String vip_level;

        public String getNick_name() {
            return null;
        }

        public void setNick_name(String string2) {
        }

        public String getCookie_name() {
            return null;
        }

        public void setCookie_name(String string2) {
        }

        public String getCookie_key() {
            return null;
        }

        public void setCookie_key(String string2) {
        }

        public String getActive() {
            return null;
        }

        public void setActive(String string2) {
        }

        public String getEmail() {
            return null;
        }

        public void setEmail(String string2) {
        }

        public String getToken() {
            return null;
        }

        public void setToken(String string2) {
        }

        public String getValidity() {
            return null;
        }

        public void setValidity(String string2) {
        }

        public String getUser_id() {
            return null;
        }

        public void setUser_id(String string2) {
        }

        public String getRegister_phone() {
            return null;
        }

        public void setRegister_phone(String string2) {
        }

        public String getArea_code() {
            return null;
        }

        public void setArea_code(String string2) {
        }

        public String getInner_email() {
            return null;
        }

        public void setInner_email(String string2) {
        }

        public String getSubscription() {
            return null;
        }

        public void setSubscription(String string2) {
        }

        public String getVip_level() {
            return null;
        }

        public void setVip_level(String string2) {
        }
    }
}

