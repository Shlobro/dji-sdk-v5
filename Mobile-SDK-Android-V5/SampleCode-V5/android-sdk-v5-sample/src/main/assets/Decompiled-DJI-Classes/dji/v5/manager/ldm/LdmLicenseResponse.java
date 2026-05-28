/*
 * Decompiled with CFR 0.152.
 */
package dji.v5.manager.ldm;

import dji.v5.common.KeepProguard;
import dji.v5.common.error.IDJIError;

public class LdmLicenseResponse
implements KeepProguard {
    private int code;
    private String message;
    private DataBean data;

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

    public DataBean getData() {
        return null;
    }

    public void setData(DataBean dataBean) {
    }

    public boolean isSuccess() {
        return false;
    }

    public IDJIError getDJIError() {
        return null;
    }

    public static class DataBean
    implements KeepProguard {
        private static final String TAG = DataBean.class.getName();
        private String license;
        private String sign;

        public String getLicense() {
            return null;
        }

        public void setLicense(String string2) {
        }

        public String getSign() {
            return null;
        }

        public void setSign(String string2) {
        }

        public boolean isVerify(String string2) {
            return false;
        }
    }
}

