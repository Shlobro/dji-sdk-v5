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

public class DJIRTKError
extends IErrorFactory.DefaultErrorFactory {
    public static final String RTK_HAS_CONNECTED = "RTK_HAS_CONNECTED";
    public static final String RTK_POSITION_ILLEGAL = "RTK_POSITION_ILLEGAL";
    public static final String COORDINATE_SYSTEM_NOT_SUPPORT = "COORDINATE_SYSTEM_NOT_SUPPORT";
    public static final String RTK_NO_NETWORK = "RTK_NO_NETWORK";
    public static final String RTK_CUSTOM_NETWORK_SETTING_INVALID = "RTK_CUSTOM_NETWORK_SETTING_INVALID";
    public static final String RTK_INCORRECT_REFERENCE_STATION_SOURCE = "RTK_INCORRECT_REFERENCE_STATION_SOURCE";
    public static final String RTK_NOT_SUPPORT_IN_CURRENT_AREA = "RTK_NOT_SUPPORT_IN_CURRENT_AREA";
    public static final DJIRTKError FACTORY = new DJIRTKError();

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
        public static final /* enum */ Error RTK_HAS_CONNECTED = new Error("RTK_HAS_CONNECTED", "RTK_HAS_CONNECTED", R.string.dji_msdk_error_rtk_has_connected);
        public static final /* enum */ Error RTK_POSITION_ILLEGAL = new Error("RTK_POSITION_ILLEGAL", "RTK_POSITION_ILLEGAL", R.string.dji_msdk_error_rtk_position_illegal);
        public static final /* enum */ Error COORDINATE_SYSTEM_NOT_SUPPORT = new Error("COORDINATE_SYSTEM_NOT_SUPPORT", "COORDINATE_SYSTEM_NOT_SUPPORT", R.string.dji_msdk_error_rtk_coordinate_system_not_support);
        public static final /* enum */ Error RTK_NO_NETWORK = new Error("RTK_NO_NETWORK", "RTK_NO_NETWORK", R.string.dji_msdk_error_rtk_setting_fail_no_network);
        public static final /* enum */ Error RTK_CUSTOM_NETWORK_SETTING_INVALID = new Error("RTK_CUSTOM_NETWORK_SETTING_INVALID", "RTK_CUSTOM_NETWORK_SETTING_INVALID", R.string.dji_msdk_error_rtk_setting_fail_settings_invalid);
        public static final /* enum */ Error RTK_INCORRECT_REFERENCE_STATION_SOURCE = new Error("RTK_INCORRECT_REFERENCE_STATION_SOURCE", "RTK_INCORRECT_REFERENCE_STATION_SOURCE", R.string.dji_msdk_error_rtk_setting_fail_incorrect_reference_station_source);
        public static final /* enum */ Error RTK_NOT_SUPPORT_IN_CURRENT_AREA = new Error("RTK_NOT_SUPPORT_IN_CURRENT_AREA", "RTK_NOT_SUPPORT_IN_CURRENT_AREA", R.string.dji_msdk_error_rtk_not_supprot);
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

