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

public class DJICommonError
extends IErrorFactory.DefaultErrorFactory {
    public static final String EXECUTION_FAILED = "EXECUTION_FAILED";
    public static final String SYSTEM_BUSY = "SYSTEM_BUSY";
    public static final String UNKNOWN = "UNKNOWN";
    public static final String UNDEFINED = "UNDEFINED";
    public static final String TIMEOUT = "TIMEOUT";
    public static final String PARAM_ILLEGAL = "PARAM_ILLEGAL";
    public static final String PARAM_INVALID = "PARAM_INVALID";
    public static final String UNSUPPORTED = "UNSUPPORTED";
    public static final String DISCONNECTED = "DISCONNECTED";
    public static final String OUT_OF_RANGE = "OUT_OF_RANGE";
    public static final DJICommonError FACTORY = new DJICommonError();

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
        public static final /* enum */ Error EXECUTION_FAILED = new Error("EXECUTION_FAILED", "The execution could not be executed.", R.string.dji_msdk_error_common_execution_failed);
        public static final /* enum */ Error SYSTEM_BUSY = new Error("SYSTEM_BUSY", "The system is too busy to execute the action", R.string.dji_msdk_error_common_system_busy);
        public static final /* enum */ Error UNKNOWN = new Error("UNKNOWN", "SDK error, please contact <dev@dji.com> for help.", R.string.dji_msdk_error_common_unknown);
        public static final /* enum */ Error UNDEFINED = new Error("UNDEFINED", "Undefined Error", R.string.dji_msdk_error_common_undefined);
        public static final /* enum */ Error TIMEOUT = new Error("TIMEOUT", "Execution of this process has timed out", R.string.dji_msdk_error_common_timeout);
        public static final /* enum */ Error PARAM_ILLEGAL = new Error("PARAM_ILLEGAL", "Param Illegal", R.string.dji_msdk_error_common_param_illegal);
        public static final /* enum */ Error PARAM_INVALID = new Error("PARAM_INVALID", "Param Invalid", R.string.dji_msdk_error_common_param_invalid);
        public static final /* enum */ Error UNSUPPORTED = new Error("UNSUPPORTED", "Not supported", R.string.dji_msdk_error_common_unsupported);
        public static final /* enum */ Error DISCONNECTED = new Error("DISCONNECTED", "Disconnected", R.string.dji_msdk_error_common_disconnected);
        public static final /* enum */ Error OUT_OF_RANGE = new Error("OUT_OF_RANGE", "Out of range", R.string.dji_msdk_error_common_out_of_range);
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

