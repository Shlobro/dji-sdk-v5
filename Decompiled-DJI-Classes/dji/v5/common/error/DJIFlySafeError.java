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

public class DJIFlySafeError
extends IErrorFactory.DefaultErrorFactory {
    public static final String COMMON_ERROR = "COMMON_ERROR";
    public static final String NO_AVAILABLE_LICENSES = "NO_AVAILABLE_LICENSES";
    public static final String UNSUPPORT_MODE_ERROR = "UNSUPPORT_MODE_ERROR";
    public static final String INVALID_JSON = "CEImportInvalidJson";
    public static final String INVALID_GPS = "CEInvalidAircraftGPS";
    public static final String EXPORT_CE_DATA_FAILED = "CEExportFCDBFailed";
    public static final String DATA_BASE_FILE_UNKNOWN = "DataBaseFileUnknownError";
    public static final String UNKNOWN = "UNKNOWN";
    public static final DJIFlySafeError FACTORY = new DJIFlySafeError();

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
        public static final /* enum */ Error COMMON_ERROR = new Error("COMMON_ERROR", "common error", R.string.dji_msdk_error_fly_safe_common_error);
        public static final /* enum */ Error NO_AVAILABLE_LICENSES = new Error("NO_AVAILABLE_LICENSES", "No available licenses", R.string.dji_msdk_error_no_available_licenses);
        public static final /* enum */ Error UNSUPPORT_MODE_ERROR = new Error("UNSUPPORT_MODE_ERROR", "", R.string.dji_msdk_error_upsupport_mode_error);
        public static final /* enum */ Error INVALID_JSON = new Error("CEImportInvalidJson", "", R.string.dji_msdk_error_invalid_json);
        public static final /* enum */ Error INVALID_GPS = new Error("CEInvalidAircraftGPS", "", R.string.dji_msdk_error_invalid_gps);
        public static final /* enum */ Error EXPORT_CE_DATA_FAILED = new Error("CEExportFCDBFailed", "", R.string.dji_msdk_error_export_ce_data_failed);
        public static final /* enum */ Error DATA_BASE_FILE_UNKNOWN = new Error("DataBaseFileUnknownError", "", R.string.dji_msdk_error_data_base_file_unkonw);
        public static final /* enum */ Error UNKNOWN = new Error("UNKNOWN", "Fly Safe Error is Unknown", R.string.dji_msdk_error_fly_safe_unknown_err);
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

