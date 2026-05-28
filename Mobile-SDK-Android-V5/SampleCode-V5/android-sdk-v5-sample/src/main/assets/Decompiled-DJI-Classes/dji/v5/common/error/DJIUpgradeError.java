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

public class DJIUpgradeError
extends IErrorFactory.DefaultErrorFactory {
    public static final String INVALID_PARAM = "INVALID_PARAM";
    public static final String MOVE_FILE_FAILED = "MOVE_FILE_FAILED";
    public static final String SPACE_LIMIT = "SPACE_LIMIT";
    public static final DJIUpgradeError FACTORY = new DJIUpgradeError();

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
        public static final /* enum */ Error INVALID_PARAM = new Error("INVALID_PARAM", R.string.dji_msdk_error_common_param_invalid);
        public static final /* enum */ Error MOVE_FILE_FAILED = new Error("MOVE_FILE_FAILED", R.string.dji_msdk_error_upgrade_move_file_failed);
        public static final /* enum */ Error SPACE_LIMIT = new Error("SPACE_LIMIT", R.string.dji_msdk_error_upgrade_space_limit);
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

        private Error(String string3, int n2) {
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

        private boolean eauqlas(String string2) {
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

