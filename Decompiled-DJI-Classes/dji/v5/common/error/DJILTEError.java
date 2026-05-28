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

public class DJILTEError
extends IErrorFactory.DefaultErrorFactory {
    public static final String DO_NOT_SUPPORT_PUBLIC_AND_PRIVATE_LTE_IN_CURRENT_AREA = "DO_NOT_SUPPORT_LTE_IN_CURRENT_AREA";
    public static final String DO_NOT_SUPPORT_PUBLIC_LTE_IN_CURRENT_AREA = "DO_NOT_SUPPORT_PUBLIC_LTE_IN_CURRENT_AREA";
    public static final String DO_NOT_SUPPORT_PRIVATE_LTE_IN_CURRENT_AREA = "DO_NOT_SUPPORT_PRIVATE_LTE_IN_CURRENT_AREA";
    public static final String CAN_NOT_GET_SN = "CAN_NOT_GET_SN";
    public static final String CAN_NOT_ENABLE_LTE = "CAN_NOT_ENABLE_LTE";
    public static final String LTE_AUTHENTICATION_FAILED = "LTE_AUTHENTICATION_FAILED";
    public static final String DO_NOT_NEED_AUTHENTICATION_IN_CURRENT_AREA = "DO_NOT_NEED_AUTHENTICATION_IN_CURRENT_AREA";
    public static final String DO_NOT_NEED_AUTHENTICATION_IN_PRIVATIZATION_SCENARIO = "DO_NOT_NEED_AUTHENTICATION_IN_PRIVATIZATION_SCENARIO";
    public static final String PRODUCT_NOT_CONNECT = "PRODUCT_NOT_CONNECT";
    public static final String UNKNOWN = "UNKNOWN";
    public static final DJILTEError FACTORY = new DJILTEError();

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
        public static final /* enum */ Error DO_NOT_SUPPORT_LTE_IN_CURRENT_AREA = new Error("DO_NOT_SUPPORT_LTE_IN_CURRENT_AREA", "Do not support LTE in current area", R.string.dji_msdk_error_do_not_support_public_lte_and_private_lte_in_current_area);
        public static final /* enum */ Error DO_NOT_SUPPORT_PUBLIC_LTE_IN_CURRENT_AREA = new Error("DO_NOT_SUPPORT_PUBLIC_LTE_IN_CURRENT_AREA", "Do not support Public Network LTE in current area", R.string.dji_msdk_error_do_not_support_public_lte_in_current_area);
        public static final /* enum */ Error DO_NOT_SUPPORT_PRIVATE_LTE_IN_CURRENT_AREA = new Error("DO_NOT_SUPPORT_PRIVATE_LTE_IN_CURRENT_AREA", "Do not support Private LTE in current area", R.string.dji_msdk_error_do_not_support_private_lte_in_current_area);
        public static final /* enum */ Error CAN_NOT_GET_SN = new Error("CAN_NOT_GET_SN", "Get SN failed", R.string.dji_msdk_error_get_aircraft_sn_failed);
        public static final /* enum */ Error DO_NOT_NEED_AUTHENTICATION_IN_CURRENT_AREA = new Error("DO_NOT_NEED_AUTHENTICATION_IN_CURRENT_AREA", "Do not need authentication in current area", R.string.dji_msdk_error_do_not_need_lte_authentication_in_current_area);
        public static final /* enum */ Error CAN_NOT_ENABLE_LTE = new Error("CAN_NOT_ENABLE_LTE", "Can not enable LTE", R.string.dji_msdk_error_can_not_enable_lte);
        public static final /* enum */ Error AUTHENTICATE_LTE_FAILED = new Error("LTE_AUTHENTICATION_FAILED", "Authenticate LTE failed", R.string.dji_msdk_error_authenticate_lte_failed);
        public static final /* enum */ Error DO_NOT_NEED_AUTHENTICATION_IN_PRIVATIZATION_SCENARIO = new Error("DO_NOT_NEED_AUTHENTICATION_IN_PRIVATIZATION_SCENARIO", "No real-name authentication is required in privatization scenarios", R.string.dji_msdk_error_do_not_need_lte_authentication_in_privatization_scenario);
        public static final /* enum */ Error PRODUCT_NOT_CONNECT = new Error("PRODUCT_NOT_CONNECT", "Can not get transmission type", R.string.dji_msdk_error_lte_product_not_connect);
        public static final /* enum */ Error UNKNOWN = new Error("UNKNOWN", "LTE Error is Unknown", R.string.dji_msdk_error_lte_unknown_err);
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

        public static Error[] getValues() {
            return null;
        }

        public static Error find(String string2) {
            return null;
        }

        private boolean _eauqlas(String string2) {
            return false;
        }

        private static /* synthetic */ Error[] $values() {
            return null;
        }

        static {
            $VALUES = Error.$values();
        }
    }
}

