/*
 * Decompiled with CFR 0.152.
 */
package dji.v5.manager.account;

import dji.v5.common.KeepProguard;
import dji.v5.manager.account.LoginState;
import dji.v5.utils.common.LogUtils;

public class LoginInfo
implements KeepProguard {
    public static final String TAG = LogUtils.getTag("LoginInfo");
    private String account;
    private String token;
    private String userId;
    private static final String KEY_ACCOUNT = "key_dji_user_info";
    private boolean isValidToken;

    public LoginInfo(String string2, String string3, String string4) {
    }

    public LoginInfo() {
    }

    public void setValidToken(boolean bl) {
    }

    public String getAccount() {
        return null;
    }

    public LoginState getLoginState() {
        return null;
    }
}

