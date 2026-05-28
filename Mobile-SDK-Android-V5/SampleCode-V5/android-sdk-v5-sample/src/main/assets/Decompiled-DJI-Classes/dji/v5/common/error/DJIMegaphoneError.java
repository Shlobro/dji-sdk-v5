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

public class DJIMegaphoneError
extends IErrorFactory.DefaultErrorFactory {
    public static final String INVALID_PARAM = "INVALID_PARAM";
    public static final String START_TRANSFER_FAILED = "START_TRANSFER_FAILED";
    public static final String ADD_BUFFER_FAILED = "ADD_BUFFER_FAILED";
    public static final String CANNOT_START_TRANSFER_WHILE_IN_TRANSMISSION = "CANNOT_START_TRANSFER_WHILE_IN_TRANSMISSION";
    public static final String CANNOT_ADD_BUFFER_WHILE_NOT_IN_TRANSMISSION = "CANNOT_ADD_BUFFER_WHILE_NOT_IN_TRANSMISSION";
    public static final String CANNOT_FINISH_TRANSFER_WHILE_NOT_IN_TRANSMISSION = "CANNOT_FINISH_TRANSFER_WHILE_NOT_IN_TRANSMISSION";
    public static final String FAIL_UPLOAD = "FAIL_UPLOAD";
    public static final String ABORTED = "ABORTED";
    public static final String FAIL_MD5 = "FAIL_MD5";
    public static final String TRANSMISSION_HAS_STARTED = "TRANSMISSION_HAS_STARTED";
    public static final String MEGAPHONE_HAS_STARTED = "MEGAPHONE_HAS_STARTED";
    public static final String MEGAPHONE_DISCONNECT = "MEGAPHONE_DISCONNECT";
    public static final String FEATURE_NOT_SUPPORTED = "FEATURE_NOT_SUPPORTED";
    public static final String UNKNOWN = "UNKNOWN";
    public static final DJIMegaphoneError FACTORY = new DJIMegaphoneError();

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
        public static final /* enum */ Error INVALID_PARAM = new Error("INVALID_PARAM", "A valid parameter is required to open the transmission channel", R.string.dji_msdk_error_megaphone_invalid_param);
        public static final /* enum */ Error START_TRANSFER_FAILED = new Error("START_TRANSFER_FAILED", "An error was encountered while opening the transport channel", R.string.dji_msdk_error_megaphone_start_transfer_failed);
        public static final /* enum */ Error ADD_BUFFER_FAILED = new Error("ADD_BUFFER_FAILED", "An error occurred while adding data to the transport channel", R.string.dji_msdk_error_megaphone_add_buffer_failed);
        public static final /* enum */ Error CANNOT_START_TRANSFER_WHILE_IN_TRANSMISSION = new Error("CANNOT_START_TRANSFER_WHILE_IN_TRANSMISSION", "Cannot open another transmission channel while transmitting", R.string.dji_msdk_error_megaphone_cannot_start_transfer);
        public static final /* enum */ Error CANNOT_ADD_BUFFER_WHILE_NOT_IN_TRANSMISSION = new Error("CANNOT_ADD_BUFFER_WHILE_NOT_IN_TRANSMISSION", "Cannot add data when the transmission channel is not open", R.string.dji_msdk_error_megaphone_cannot_add_data);
        public static final /* enum */ Error CANNOT_FINISH_TRANSFER_WHILE_NOT_IN_TRANSMISSION = new Error("CANNOT_FINISH_TRANSFER_WHILE_NOT_IN_TRANSMISSION", "Cannot close transmission when the transmission channel is not open", R.string.dji_msdk_error_megaphone_cannot_finish_transfer);
        public static final /* enum */ Error FAIL_UPLOAD = new Error("FAIL_UPLOAD", "File upload failed", R.string.dji_msdk_error_megaphone_upload_failed);
        public static final /* enum */ Error ABORTED = new Error("ABORTED", "File upload terminated by user", R.string.dji_msdk_error_megaphone_terminated_by_user);
        public static final /* enum */ Error FAIL_MD5 = new Error("FAIL_MD5", "File MD5 verification failed", R.string.dji_msdk_error_megaphone_file_md5_verification_failed);
        public static final /* enum */ Error TRANSMISSION_HAS_STARTED = new Error("TRANSMISSION_HAS_STARTED", "There is already a transport channel started", R.string.dji_msdk_error_megaphone_already_channel_started);
        public static final /* enum */ Error MEGAPHONE_HAS_STARTED = new Error("MEGAPHONE_HAS_STARTED", "There is already a transport channel playing", R.string.dji_msdk_error_megaphone_already_play);
        public static final /* enum */ Error MEGAPHONE_DISCONNECT = new Error("MEGAPHONE_DISCONNECT", "Megaphone is not connect", R.string.dji_msdk_error_megaphone_megaphone_not_connect);
        public static final /* enum */ Error FEATURE_NOT_SUPPORTED = new Error("FEATURE_NOT_SUPPORTED", "The feature is not supported", R.string.dji_msdk_error_megaphone_feature_not_supported);
        public static final /* enum */ Error UNKNOWN = new Error("UNKNOWN", "Megaphone Error is Unknown", R.string.dji_msdk_error_megaphone_unknown_err);
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

