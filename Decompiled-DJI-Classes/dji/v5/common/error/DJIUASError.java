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

public class DJIUASError
extends IErrorFactory.DefaultErrorFactory {
    public static final String AREA_CODE_EMPTY = "AREA_CODE_EMPTY";
    public static final String AREA_STRATEGY_EMPTY = "AREA_STRATEGY_EMPTY";
    public static final String AREA_CODE_NOT_SAME = "AREA_CODE_NOT_SAME";
    public static final String AREA_CODE_NOT_ALLOW_SET_CHINA = "AREA_CODE_NOT_ALLOW_SET_CHINA";
    public static final DJIUASError FACTORY = new DJIUASError();

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
        public static final /* enum */ Error AREA_CODE_EMPTY = new Error("AREA_CODE_EMPTY", "Area code is null", R.string.dji_msdk_error_uas_area_code_empty);
        public static final /* enum */ Error AREA_STRATEGY_EMPTY = new Error("AREA_STRATEGY_EMPTY", "Area strategy is null", R.string.dji_msdk_error_uas_area_strategy_empty);
        public static final /* enum */ Error AREA_CODE_IS_NOT_SAME = new Error("AREA_CODE_NOT_SAME", "", R.string.dji_msdk_error_uas_area_not_same);
        public static final /* enum */ Error AREA_CODE_NOT_ALLOW_SET_CHINA = new Error("AREA_CODE_NOT_ALLOW_SET_CHINA", "", R.string.dji_msdk_error_uas_area_code_not_allow_set_china);
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

