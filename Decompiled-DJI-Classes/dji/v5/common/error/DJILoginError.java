/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dji.v5.core.R$string
 */
package dji.v5.common.error;

import dji.v5.common.error.ErrorType;
import dji.v5.common.error.IErrorFactory;
import dji.v5.core.R;

public class DJILoginError
extends IErrorFactory.DefaultErrorFactory {
    public static final String NOT_LOGGED_IN = "NOT_LOGGED_IN";
    public static final String LOGIN_CANCEL = "LOGIN_CANCEL";
    public static final String LOGIN_REPEAT = "LOGIN_REPEAT";
    public static final String LOGIN_NEED_VERIFICATION_CODE = "LOGIN_NEED_VERIFICATION_CODE";
    public static final String LOGIN_VERIFICATION_CODE_ERROR = "LOGIN_VERIFICATION_CODE_ERROR";
    public static final DJILoginError FACTORY = new DJILoginError();

    @Override
    public IErrorFactory.InnerError findInnerError(String string2) {
        return null;
    }

    @Override
    public ErrorType errorType() {
        return null;
    }

    private static final class Error
    extends Enum<Error>
    implements IErrorFactory.InnerError {
        public static final /* enum */ Error NOT_LOGGED_IN = new Error("NOT_LOGGED_IN", "No logged in account", R.string.dji_msdk_error_login_not_login);
        public static final /* enum */ Error LOGIN_CANCEL = new Error("LOGIN_CANCEL", "Login cancel", R.string.dji_msdk_error_login_login_cancel);
        public static final /* enum */ Error LOGIN_REPEAT = new Error("LOGIN_REPEAT", "Login repeat", R.string.dji_msdk_error_login_login_repeat);
        public static final /* enum */ Error LOGIN_NEED_VERIFICATION_CODE = new Error("LOGIN_NEED_VERIFICATION_CODE", "Login need verificationCode", R.string.dji_msdk_error_login_login_need_verification_code);
        public static final /* enum */ Error LOGIN_VERIFICATION_CODE_ERROR = new Error("LOGIN_VERIFICATION_CODE_ERROR", "Login verification error", R.string.dji_msdk_error_login_verification_code_error);
        private final String errorCode;
        private final String hint;
        private final int resId;
        private static Error[] mValues;
        private static final /* synthetic */ Error[] $VALUES;

        public static Error[] values() {
            return null;
        }

        public static Error valueOf(String string2) {
            return null;
        }

        @Override
        public String errorCode() {
            return null;
        }

        @Override
        public String hint() {
            return null;
        }

        @Override
        public int resID() {
            return 0;
        }

        private Error(String string3, String string4, int n2) {
        }

        private static Error[] getValues() {
            return null;
        }

        private static Error find(String string2) {
            return null;
        }

        static /* synthetic */ Error access$000(String string2) {
            return null;
        }

        private static /* synthetic */ Error[] $values() {
            return null;
        }

        static {
            $VALUES = Error.$values();
        }
    }
}

