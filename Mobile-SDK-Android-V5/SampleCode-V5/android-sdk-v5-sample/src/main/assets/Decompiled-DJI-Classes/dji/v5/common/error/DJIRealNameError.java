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

public class DJIRealNameError
extends IErrorFactory.DefaultErrorFactory {
    public static final String FC_DISCONNECT = "FC_DISCONNECT";
    public static final String NO_NETWORK = "NO_NETWORK";
    public static final String LDM_MODE = "LDM_MODE";
    public static final String NETWORK_ERROR = "UOM_REALNAME_NETWORK_ERROR";
    public static final String UOM_ERROR = "UOM_REALNAME_UOM_ERROR";
    public static final String VALIDATION_FAILURE = "UOM_REALNAME_VALIDATION_FAILURE";
    public static final String NOT_ACTIVE_YET = "UOM_REALNAME_NOT_ACTIVE_YET";
    public static final String NO_REALNAME_CHECK_NEEDED = "UOM_REALNAME_NO_REALNAME_CHECK_NEEDED";
    public static final String UNLOCKED = "UOM_REALNAME_UNLOCKED";
    public static final String NOT_IN_CHINA_MAINLAND = "UOM_REALNAME_DONT_IN_CHINA_MAINLAND";
    public static final String UNKNOWN = "UOM_REALNAME_UNKNOWN";
    public static final String SUBCMD_MISMATCH = "UOM_REALNAME_SUBCMD_MISMATCH";
    public static final String NEED_DRONE_PARAM = "UOM_REALNAME_NEED_DRONE_PARAM";
    public static final String UNSUPPORTED = "UOM_REALNAME_UNSUPPORTED";
    public static final DJIRealNameError FACTORY = new DJIRealNameError();

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
        public static final /* enum */ Error FC_DISCONNECT = new Error("FC_DISCONNECT", "FC_DISCONNECT", R.string.dji_msdk_error_real_name_sync_drone_disconnect);
        public static final /* enum */ Error NO_NETWORK = new Error("NO_NETWORK", "NO_NETWORK", R.string.dji_msdk_error_real_name_sync_network_failed);
        public static final /* enum */ Error LDM_MODE = new Error("LDM_MODE", "LDM_MODE", R.string.dji_msdk_error_real_name_sync_ldm_mode);
        public static final /* enum */ Error NETWORK_ERROR = new Error("UOM_REALNAME_NETWORK_ERROR", "NETWORK_ERROR", R.string.dji_msdk_error_real_name_sync_network_timeout);
        public static final /* enum */ Error UOM_ERROR = new Error("UOM_REALNAME_UOM_ERROR", "UOM_ERROR", R.string.dji_msdk_error_real_name_sync_uom_error);
        public static final /* enum */ Error VALIDATION_FAILURE = new Error("UOM_REALNAME_VALIDATION_FAILURE", "VALIDATION_FAILURE", R.string.dji_msdk_error_real_name_sync_validation_fail);
        public static final /* enum */ Error NOT_ACTIVE_YET = new Error("UOM_REALNAME_NOT_ACTIVE_YET", "NOT_ACTIVE_YET", R.string.dji_msdk_error_real_name_sync_not_active_yet);
        public static final /* enum */ Error NO_REALNAME_CHECK_NEEDED = new Error("UOM_REALNAME_NO_REALNAME_CHECK_NEEDED", "NO_REALNAME_CHECK_NEEDED", R.string.dji_msdk_error_real_name_sync_no_need);
        public static final /* enum */ Error NOT_IN_CHINA_MAINLAND = new Error("UOM_REALNAME_DONT_IN_CHINA_MAINLAND", "DONT_IN_CHINA_MAINLAND", R.string.dji_msdk_error_real_name_sync_do_not_in_china);
        public static final /* enum */ Error UNKNOWN = new Error("UOM_REALNAME_UNKNOWN", "UNKNOWN", R.string.dji_msdk_error_real_name_sync_unknown);
        public static final /* enum */ Error SUBCMD_MISMATCH = new Error("UOM_REALNAME_SUBCMD_MISMATCH", "SUBCMD_MISMATCH", R.string.dji_msdk_error_real_name_sync_subcmd_mismatch);
        public static final /* enum */ Error NEED_DRONE_PARAM = new Error("UOM_REALNAME_NEED_DRONE_PARAM", "NEED_DRONE_PARAM", R.string.dji_msdk_error_real_name_sync_need_drone_param);
        public static final /* enum */ Error UNSUPPORTED = new Error("UOM_REALNAME_UNSUPPORTED", "UNSUPPORTED", R.string.dji_msdk_error_real_name_sync_unsupported);
        public static final /* enum */ Error UNLOCKED = new Error("UOM_REALNAME_UNLOCKED", "UNLOCKED", R.string.dji_msdk_error_real_name_sync_unlocked);
        private String errorCode;
        private String hint;
        private int resId;
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

        public Error setHint(String string2) {
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

