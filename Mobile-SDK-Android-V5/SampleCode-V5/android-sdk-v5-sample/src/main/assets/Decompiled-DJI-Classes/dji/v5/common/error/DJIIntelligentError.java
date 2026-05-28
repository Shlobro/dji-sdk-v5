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

public class DJIIntelligentError
extends IErrorFactory.DefaultErrorFactory {
    public static final String FC_DISCONNECT = "FC_DISCONNECT";
    public static final String NEED_FLYING = "NEED_FLYING";
    public static final String START_AUTO_SENSING_FIRST = "START_AUTO_SENSING_FIRST";
    public static final String CAN_NOT_EXECUTE_IN_CURRENT_MODE = "CAN_NOT_EXECUTE_IN_CURRENT_MODE";
    public static final DJIIntelligentError FACTORY = new DJIIntelligentError();

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
        public static final /* enum */ Error FC_DISCONNECT = new Error("FC_DISCONNECT", "FC_DISCONNECT", R.string.dji_msdk_error_real_name_sync_drone_disconnect);
        public static final /* enum */ Error NEED_FLYING = new Error("NEED_FLYING", "POI_NEED_FLYING", R.string.dji_msdk_error_intelligent_need_flying);
        public static final /* enum */ Error START_AUTO_SENSING_FIRST = new Error("START_AUTO_SENSING_FIRST", "START_AUTO_SENSING_FIRST", -1);
        public static final /* enum */ Error CAN_NOT_EXECUTE_IN_CURRENT_MODE = new Error("CAN_NOT_EXECUTE_IN_CURRENT_MODE", "CAN_NOT_EXECUTE_IN_CURRENT_MODE", -1);
        private String errorCode;
        private String hint;
        private int resId;
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

        public Error setHint(String string2) {
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

