/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dji.v5.core.R$string
 */
package dji.v5.common.error;

import dji.v5.common.error.ErrorType;
import dji.v5.common.error.IDJIError;
import dji.v5.common.error.IErrorFactory;
import dji.v5.core.R;

public class DJIPipeLineError
extends IErrorFactory.DefaultErrorFactory {
    public static final String UNKNOWN = "UNKNOWN";
    public static final String CRC_CHECK_FAILED = "CRC_CHECK_FAILED";
    public static final String INVALID_PARAMETERS = "INVALID_PARAMETERS";
    public static final String NOT_ENOUGH_MEMORY = "NOT_ENOUGH_MEMORY";
    public static final String NOT_READY = "NOT_READY";
    public static final String SEND_FAILED = "SEND_FAILED";
    public static final String RECEIVE_FAILED = "RECEIVE_FAILED";
    public static final String TIMEOUT = "TIMEOUT";
    public static final String BUSY_OPERATION = "BUSY_OPERATION";
    public static final String UNACCEPTABLE_OPERATIONS = "UNACCEPTABLE_OPERATIONS";
    public static final String CLOSED = "CLOSED";
    public static final String CONNECTING = "CONNECTING";
    public static final String RESOURCES_NOT_AVAILABLE = "RESOURCES_NOT_AVAILABLE";
    public static final String CLOSING = "CLOSING";
    public static final String NOT_CONNECTED = "NOT_CONNECTED";
    public static final String LINK_BREAK = "LINK_BREAK";
    public static final String CONNECTION_REFUSED = "CONNECTION_REFUSED";
    public static final String ID_OCCUPIED = "ID_OCCUPIED";
    public static final String INTERNAL_STATUS_ERROR = "INTERNAL_STATUS_ERROR";
    public static final DJIPipeLineError FACTORY = new DJIPipeLineError();

    @Override
    public IErrorFactory.InnerError findInnerError(String string2) {
        return null;
    }

    @Override
    public ErrorType errorType() {
        return null;
    }

    public static IDJIError buildPipelineError(int n) {
        return null;
    }

    private static final class Error
    extends Enum<Error>
    implements IErrorFactory.InnerError {
        public static final /* enum */ Error UNKNOWN = new Error("UNKNOWN", "Unknown", R.string.dji_msdk_error_mop_unknown);
        public static final /* enum */ Error CRC_CHECK_FAILED = new Error("CRC_CHECK_FAILED", "CRC check failed", R.string.dji_msdk_error_mop_crc_check_failed);
        public static final /* enum */ Error INVALID_PARAMETERS = new Error("INVALID_PARAMETERS", "Invalid Parameters", R.string.dji_msdk_error_mop_invalid_parameters);
        public static final /* enum */ Error NOT_ENOUGH_MEMORY = new Error("NOT_ENOUGH_MEMORY", " Not enough memory", R.string.dji_msdk_error_mop_not_enough_memory);
        public static final /* enum */ Error NOT_READY = new Error("NOT_READY", "Not ready", R.string.dji_msdk_error_mop_not_ready);
        public static final /* enum */ Error SEND_FAILED = new Error("SEND_FAILED", "Send failed", R.string.dji_msdk_error_mop_send_failed);
        public static final /* enum */ Error RECEIVE_FAILED = new Error("RECEIVE_FAILED", "Receiving data exceptions", R.string.dji_msdk_error_mop_receive_failed);
        public static final /* enum */ Error TIMEOUT = new Error("TIMEOUT", "TimeOut", R.string.dji_msdk_error_mop_time_out);
        public static final /* enum */ Error BUSY_OPERATION = new Error("BUSY_OPERATION", "Busy operation", R.string.dji_msdk_error_mop_busy_operation);
        public static final /* enum */ Error UNACCEPTABLE_OPERATIONS = new Error("UNACCEPTABLE_OPERATIONS", "Busy operation", R.string.dji_msdk_error_mop_unacceptable_operations);
        public static final /* enum */ Error CLOSED = new Error("CLOSED", "Connection closed", R.string.dji_msdk_error_mop_closed);
        public static final /* enum */ Error CONNECTING = new Error("CONNECTING", "CONNECTING", R.string.dji_msdk_error_mop_closed);
        public static final /* enum */ Error RESOURCES_NOT_AVAILABLE = new Error("RESOURCES_NOT_AVAILABLE", "Resources not available", R.string.dji_msdk_error_mop_resources_not_available);
        public static final /* enum */ Error CLOSING = new Error("CLOSING", "CLOSING", R.string.dji_msdk_error_mop_closing);
        public static final /* enum */ Error NOT_CONNECTED = new Error("NOT_CONNECTED", "Not connected", R.string.dji_msdk_error_mop_not_connected);
        public static final /* enum */ Error LINK_BREAK = new Error("LINK_BREAK", "Link break", R.string.dji_msdk_error_mop_link_break);
        public static final /* enum */ Error CONNECTION_REFUSED = new Error("CONNECTION_REFUSED", "Connection refused", R.string.dji_msdk_error_mop_connection_refused);
        public static final /* enum */ Error ID_OCCUPIED = new Error("ID_OCCUPIED", "Id occupied", R.string.dji_msdk_error_mop_closing);
        public static final /* enum */ Error INTERNAL_STATUS_ERROR = new Error("INTERNAL_STATUS_ERROR", "Internal status error", R.string.dji_msdk_error_mop_closing);
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

