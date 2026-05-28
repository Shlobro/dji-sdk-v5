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

public class DJINetworkError
extends IErrorFactory.DefaultErrorFactory {
    public static final String NETWORK_ACCESS_FAIL = "NETWORK_ACCESS_FAIL";
    public static final String CALL_CANCELED = "CALL_CANCELED";
    public static final String NO_NETWORK = "NO_NETWORK";
    public static final String NO_NETWORK_DELEGATE = "NO_NETWORK_DELEGATE";
    public static final String SYSTEM_ERROR = "SYSTEM_ERROR";
    public static final DJINetworkError FACTORY = new DJINetworkError();

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
        public static final /* enum */ Error NETWORK_ACCESS_FAIL = new Error("NETWORK_ACCESS_FAIL", "access server failure.", R.string.dji_msdk_error_network_network_access_fail);
        public static final /* enum */ Error CALL_CANCELED = new Error("CALL_CANCELED", "call is canceled.", R.string.dji_msdk_error_network_call_canceled);
        public static final /* enum */ Error NO_NETWORK = new Error("NO_NETWORK", "no network.", R.string.dji_msdk_error_network_no_network);
        public static final /* enum */ Error NO_NETWORK_DELEGATE = new Error("NO_NETWORK_DELEGATE", "no network delegate.", R.string.dji_msdk_error_network_no_network_delegate);
        public static final /* enum */ Error SYSTEM_ERROR = new Error("SYSTEM_ERROR", "system error.", R.string.dji_msdk_error_network_system_error);
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

