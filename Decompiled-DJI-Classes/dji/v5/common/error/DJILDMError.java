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

public class DJILDMError
extends IErrorFactory.DefaultErrorFactory {
    public static final String NEED_LOCAL_LICENSE = "NEED_LOCAL_LICENSE";
    public static final String SIGN_ERROR = "SIGN_ERROR";
    public static final String LDM_PARAMETER_ERROR = "LDM_PARAMETER_ERROR";
    public static final String AREA_CODE_RESTRICTED = "AREA_CODE_RESTRICTED";
    public static final String APP_NOT_FOUND = "APP_NOT_FOUND";
    public static final String LDM_LICENSE_NOT_VALID = "LDM_LICENSE_NOT_VALID";
    public static final String CLIENT_TIME_NOT_VALID = "CLIENT_TIME_NOT_VALID";
    public static final String LDM_UNKNOWN_ERROR = "LDM_UNKNOWN_ERROR";
    public static final String PRODUCT_NOT_CONNECTED = "PRODUCT_NOT_CONNECTED";
    public static final String LICENSE_OUT_OF_DATE = "LICENSE_OUTDATED";
    public static final String UNAVAILABLE = "UNAVAILABLE";
    public static final String LDM_NETWORK_ACCESS_FAILED = "LDM_NETWORK_ACCESS_FAILED";
    public static final String MISSING_LDM_LICENSE_FAILED = "MISSING_LDM_LICENSE_FAILED";
    public static final DJILDMError FACTORY = new DJILDMError();

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
        public static final /* enum */ Error NEED_LOCAL_LICENSE = new Error("NEED_LOCAL_LICENSE", "Need load local LDM License", R.string.dji_msdk_error_ldm_need_local_license);
        public static final /* enum */ Error SIGN_ERROR = new Error("SIGN_ERROR", "Signature error", R.string.dji_msdk_error_ldm_sign_error);
        public static final /* enum */ Error AREA_CODE_RESTRICTED = new Error("AREA_CODE_RESTRICTED", "LDM is not supported in the current area", R.string.dji_msdk_error_ldm_area_code_restricted);
        public static final /* enum */ Error APP_NOT_FOUND = new Error("APP_NOT_FOUND", "App does not exist", R.string.dji_msdk_error_ldm_app_not_found);
        public static final /* enum */ Error LDM_LICENSE_NOT_VALID = new Error("LDM_LICENSE_NOT_VALID", "No valid LDM certificate exists", R.string.dji_msdk_error_ldm_license_not_valid);
        public static final /* enum */ Error CLIENT_TIME_NOT_VALID = new Error("CLIENT_TIME_NOT_VALID", "Client's current time is invalid", R.string.dji_msdk_error_ldm_client_time_not_valid);
        public static final /* enum */ Error LDM_UNKNOWN_ERROR = new Error("LDM_UNKNOWN_ERROR", "LDM unknown error", R.string.dji_msdk_error_ldm_unknown_error);
        public static final /* enum */ Error PRODUCT_NOT_CONNECTED = new Error("PRODUCT_NOT_CONNECTED", "Please connect your product first!", R.string.dji_msdk_error_ldm_product_not_connected);
        public static final /* enum */ Error LICENSE_OUTDATED = new Error("LICENSE_OUTDATED", "License has expired!", R.string.dji_msdk_error_ldm_license_out_of_date);
        public static final /* enum */ Error UNAVAILABLE = new Error("UNAVAILABLE", "Only available when the Local Data Mode is enabled.", R.string.dji_msdk_error_ldm_unavailable);
        public static final /* enum */ Error LDM_NETWORK_ACCESS_FAILED = new Error("LDM_NETWORK_ACCESS_FAILED", "In Local Data Mode. Network access failed!", R.string.dji_msdk_error_ldm_network_access_failed);
        public static final /* enum */ Error MISSING_LDM_LICENSE_FAILED = new Error("MISSING_LDM_LICENSE_FAILED", "Miss LDM License", R.string.dji_msdk_error_ldm_missing_ldm_license_failed);
        private final String errorCode;
        private final String hint;
        private final int resID;
        private static Error[] mValues;
        private static final /* synthetic */ Error[] $VALUES;

        public static Error[] values() {
            return null;
        }

        public static Error valueOf(String string2) {
            return null;
        }

        private Error(String string3, String string4, int n2) {
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

