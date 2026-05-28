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

public class DJILiveStreamError
extends IErrorFactory.DefaultErrorFactory {
    public static final String INVALID_PARAM = "INVALID_PARAM";
    public static final String NETWORK_ERR = "NETWORK_ERR";
    public static final String LIVE_STREAM_NOT_STARTED = "LIVE_STREAM_NOT_STARTED";
    public static final String LIVE_STREAM_ALREADY_STARTED = "LIVE_STREAM_ALREADY_STARTED";
    public static final String LIVE_STREAM_CHANNEL_CREATE_ERR = "LIVE_STREAM_CHANNEL_CREATE_ERR";
    public static final String LIVE_STREAM_START_ERR = "LIVE_STREAM_START_ERR";
    public static final String LIVE_STREAM_IS_NOT_READY = "LIVE_STREAM_IS_NOT_READY";
    public static final String UNSUPPORTED = "LIVE_STREAM_IS_NOT_SUPPORTED";
    public static final String UNKNOWN = "UNKNOWN";
    public static final DJILiveStreamError FACTORY = new DJILiveStreamError();

    private DJILiveStreamError() {
    }

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
        public static final /* enum */ Error INVALID_PARAM = new Error("INVALID_PARAM", "Live stream param is invalid", R.string.dji_msdk_error_live_stream_param_is_invalid);
        public static final /* enum */ Error NETWORK_ERR = new Error("NETWORK_ERR", "Live stream network error", R.string.dji_msdk_error_live_stream_network_error);
        public static final /* enum */ Error LIVE_STREAM_NOT_STARTED = new Error("LIVE_STREAM_NOT_STARTED", "Live stream not started yet", R.string.dji_msdk_error_live_stream_not_started);
        public static final /* enum */ Error LIVE_STREAM_ALREADY_STARTED = new Error("LIVE_STREAM_ALREADY_STARTED", "Live stream already started", R.string.dji_msdk_error_live_stream_already_started);
        public static final /* enum */ Error LIVE_STREAM_CHANNEL_CREATE_ERR = new Error("LIVE_STREAM_CHANNEL_CREATE_ERR", "Live stream channel create error", R.string.dji_msdk_error_Live_stream_channel_create_error);
        public static final /* enum */ Error LIVE_STREAM_START_ERR = new Error("LIVE_STREAM_START_ERR", "Live stream start error", R.string.dji_msdk_error_Live_stream_start_error);
        public static final /* enum */ Error LIVE_STREAM_IS_NOT_READY = new Error("LIVE_STREAM_IS_NOT_READY", "Live stream is not ready", R.string.dji_msdk_error_Live_stream_is_not_ready);
        public static final /* enum */ Error UNSUPPORT = new Error("LIVE_STREAM_IS_NOT_SUPPORTED", "Live stream is not supported", R.string.dji_msdk_error_Live_stream_is_not_ready);
        public static final /* enum */ Error UNKNOWN = new Error("UNKNOWN", "Live Stream error is unknown", R.string.dji_msdk_error_live_stream_unknown_error);
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

