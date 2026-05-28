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

public class DJIVideoError
extends IErrorFactory.DefaultErrorFactory {
    public static final String VIDEO_MANAGER_ACTION_EXECUTE_FAILED = "VIDEO_MANAGER_ACTION_EXECUTE_FAILED";
    public static final String VIDEO_CHANNEL_IS_ALREADY_OPENED = "VIDEO_CHANNEL_IS_ALREADY_OPENED";
    public static final String VIDEO_CHANNEL_ACTION_EXECUTE_FAILED = "VIDEO_CHANNEL_ACTION_EXECUTE_FAILED";
    public static final String VIDEO_CHANNEL_PARAM_IS_ILLEGAL = "VIDEO_CHANNEL_PARAM_IS_ILLEGAL";
    public static final String CANNOT_OPEN_SOCKET_IN_THE_STATE = "CANNOT_OPEN_SOCKET_IN_THE_STATE";
    public static final String CANNOT_CLOSE_SOCKET_IN_THE_STATE = "CANNOT_CLOSE_SOCKET_IN_THE_STATE";
    public static final String CANNOT_EXECUTE_VIDEO_CHANNEL_ACTION_IN_THE_STATE = "CANNOT_EXECUTE_VIDEO_CHANNEL_ACTION_IN_THE_STATE";
    public static final DJIVideoError FACTORY = new DJIVideoError();

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
        public static final /* enum */ Error VIDEO_MANAGER_ACTION_EXECUTE_FAILED = new Error("VIDEO_MANAGER_ACTION_EXECUTE_FAILED", "", R.string.dji_msdk_error_video_manager_action_execute_failed);
        public static final /* enum */ Error VIDEO_CHANNEL_IS_ALREADY_OPENED = new Error("VIDEO_MANAGER_ACTION_EXECUTE_FAILED", "", R.string.dji_msdk_error_video_channel_is_already_opened);
        public static final /* enum */ Error VIDEO_CHANNEL_ACTION_EXECUTE_FAILED = new Error("VIDEO_MANAGER_ACTION_EXECUTE_FAILED", "", R.string.dji_msdk_error_video_channel_action_execute_failed);
        public static final /* enum */ Error VIDEO_CHANNEL_PARAM_IS_ILLEGAL = new Error("VIDEO_MANAGER_ACTION_EXECUTE_FAILED", "", R.string.dji_msdk_error_video_channel_param_is_illegal);
        public static final /* enum */ Error CANNOT_OPEN_SOCKET_IN_THE_STATE = new Error("VIDEO_MANAGER_ACTION_EXECUTE_FAILED", "", R.string.dji_msdk_error_video_cannot_open_socket_in_the_state);
        public static final /* enum */ Error CANNOT_CLOSE_SOCKET_IN_THE_STATE = new Error("VIDEO_MANAGER_ACTION_EXECUTE_FAILED", "", R.string.dji_msdk_error_video_cannot_close_socket_in_the_state);
        public static final /* enum */ Error CANNOT_EXECUTE_VIDEO_CHANNEL_ACTION_IN_THE_STATE = new Error("VIDEO_MANAGER_ACTION_EXECUTE_FAILED", "", R.string.dji_msdk_error_video_cannot_execute_video_channel_action_in_the_state);
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

