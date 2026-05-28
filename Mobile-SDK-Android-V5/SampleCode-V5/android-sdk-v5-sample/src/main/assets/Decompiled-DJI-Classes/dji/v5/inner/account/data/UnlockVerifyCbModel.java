/*
 * Decompiled with CFR 0.152.
 */
package dji.v5.inner.account.data;

import dji.v5.common.KeepProguard;

public class UnlockVerifyCbModel
implements KeepProguard {
    private int code;
    private String message;
    private UnlockVerifyCbData data;

    public void setCode(int n) {
    }

    public void setMessage(String string2) {
    }

    public void setData(UnlockVerifyCbData unlockVerifyCbData) {
    }

    public int getCode() {
        return 0;
    }

    public String getMessage() {
        return null;
    }

    public UnlockVerifyCbData getData() {
        return null;
    }

    public static class UnlockVerifyCbData
    implements KeepProguard {
        private String countryCode;
        private String language;
        private String userToken;
        private String ostype;
        private String appver;
        private String app;

        public String getCountryCode() {
            return null;
        }

        public String getLanguage() {
            return null;
        }

        public String getUserToken() {
            return null;
        }

        public String getOstype() {
            return null;
        }

        public String getAppver() {
            return null;
        }

        public String getApp() {
            return null;
        }

        public void setCountryCode(String string2) {
        }

        public void setLanguage(String string2) {
        }

        public void setUserToken(String string2) {
        }

        public void setOstype(String string2) {
        }

        public void setAppver(String string2) {
        }

        public void setApp(String string2) {
        }
    }
}

