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

public class DJIMediaError
extends IErrorFactory.DefaultErrorFactory {
    public static final String MEDIA_MANAGER_FETCH_FILE_LIST_FAILED = "MEDIA_MANAGER_FETCH_FILE_LIST_FAILED";
    public static final String MEDIA_MANAGER_ENTER_PLAYBACK_FAILED = "MEDIA_MANAGER_ENTER_PLAYBACK_FAILED";
    public static final String MEDIA_MANAGER_EXIT_PLAYBACK_FAILED = "MEDIA_MANAGER_EXIT_PLAYBACK_FAILED";
    public static final String MEDIA_MANAGER_PULL_THUMBNAIL_FILE_FAILED = "MEDIA_MANAGER_PULL_FILE_EMPTY";
    public static final String MEDIA_MANAGER_PULL_ORIGIN_FILE_FAILED = "MEDIA_MANAGER_PULL_ORIGIN_FILE_FAILED";
    public static final String MEDIA_MANAGER_STOP_PULL_ORIGIN_FILE_FAILED = "MEDIA_MANAGER_STOP_PULL_ORIGIN_FILE_FAILED";
    public static final String MEDIA_MANAGER_DELETE_FILE_FAILED = "MEDIA_MANAGER_DELETE_FILE_FAILED";
    public static final String MEDIA_MANAGER_PREPARE_DATA_FAILED = "MEDIA_MANAGER_PREPARE_DATA_FAILED";
    public static final String MEDIA_MANAGER_VIDEO_OPERATOR_FAILED = "MEDIA_MANAGER_VIDEO_OPERATOR_FAILED";
    public static final String MEDIA_MANAGER_BACK_UP_CHANNEL_FAILED = "MEDIA_MANAGER_BACK_UP_CHANNEL_FAILED";
    public static final DJIMediaError FACTORY = new DJIMediaError();

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
        public static final /* enum */ Error MEDIA_MANAGER_FETCH_LISAT_FAILED = new Error("MEDIA_MANAGER_FETCH_FILE_LIST_FAILED", "", R.string.dji_msdk_error_common_execution_failed);
        public static final /* enum */ Error MEDIA_MANAGER_ENTER_PLAYBACK_FAILED = new Error("MEDIA_MANAGER_ENTER_PLAYBACK_FAILED", "", R.string.dji_msdk_error_common_execution_failed);
        public static final /* enum */ Error MEDIA_MANAGER_EXIT_PLAYBACK_FAILED = new Error("MEDIA_MANAGER_EXIT_PLAYBACK_FAILED", "", R.string.dji_msdk_error_common_execution_failed);
        public static final /* enum */ Error MEDIA_MANAGER_PULL_THUMBNAIL_FILE_FAILED = new Error("MEDIA_MANAGER_PULL_FILE_EMPTY", "", R.string.dji_msdk_error_common_execution_failed);
        public static final /* enum */ Error MEDIA_MANAGER_PULL_ORIGIN_FILE_FAILED = new Error("MEDIA_MANAGER_PULL_ORIGIN_FILE_FAILED", "", R.string.dji_msdk_error_common_execution_failed);
        public static final /* enum */ Error MEDIA_MANAGER_STOP_PULL_ORIGIN_FILE_FAILED = new Error("MEDIA_MANAGER_STOP_PULL_ORIGIN_FILE_FAILED", "", R.string.dji_msdk_error_common_execution_failed);
        public static final /* enum */ Error MEDIA_MANAGER_DELETE_FILE_FAILED = new Error("MEDIA_MANAGER_DELETE_FILE_FAILED", "", R.string.dji_msdk_error_common_execution_failed);
        public static final /* enum */ Error MEDIA_MANAGER_PREPARE_DATA_FAILED = new Error("MEDIA_MANAGER_PREPARE_DATA_FAILED", "", R.string.dji_msdk_error_common_execution_failed);
        public static final /* enum */ Error MEDIA_MANAGER_VIDEO_OPERATOR_FAILED = new Error("MEDIA_MANAGER_VIDEO_OPERATOR_FAILED", "", R.string.dji_msdk_error_common_execution_failed);
        public static final /* enum */ Error MEDIA_MANAGER_BACK_UP_CHANNEL_FAILED = new Error("MEDIA_MANAGER_BACK_UP_CHANNEL_FAILED", "", R.string.dji_msdk_error_common_execution_failed);
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

