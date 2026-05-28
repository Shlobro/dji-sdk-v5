/*
 * Decompiled with CFR 0.152.
 */
package dji.v5.manager.account.data;

import dji.v5.common.KeepProguard;
import java.util.List;

public class LoginResultResponse
implements KeepProguard {
    private int status;
    private int code;
    private String status_msg;
    private String message;
    private int item_total;
    private List<Result> items;

    public List<Result> getItems() {
        return null;
    }

    public void setItems(List<Result> list) {
    }

    public int getStatus() {
        return 0;
    }

    public void setStatus(int n) {
    }

    public String getStatus_msg() {
        return null;
    }

    public void setStatus_msg(String string2) {
    }

    public String getMessage() {
        return null;
    }

    public void setMessage(String string2) {
    }

    public int getItem_total() {
        return 0;
    }

    public void setItem_total(int n) {
    }

    public boolean isSuccess() {
        return false;
    }

    public int getCode() {
        return 0;
    }

    public void setCode(int n) {
    }

    public static class Result
    implements KeepProguard {
        private String token;
        private String email;
        private String user_id;
        private String register_phone;

        public String getToken() {
            return null;
        }

        public void setToken(String string2) {
        }

        public String getEmail() {
            return null;
        }

        public void setEmail(String string2) {
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
    }
}

