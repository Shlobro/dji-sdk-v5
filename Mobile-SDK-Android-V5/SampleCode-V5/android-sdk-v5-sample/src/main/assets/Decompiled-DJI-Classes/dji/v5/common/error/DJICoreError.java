/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Nullable
 */
package dji.v5.common.error;

import androidx.annotation.Nullable;
import dji.sdk.errorcode.DJIErrorCode;
import dji.v5.common.error.ErrorImp;
import dji.v5.common.error.ErrorType;
import dji.v5.common.error.IErrorFactory;

public class DJICoreError
extends IErrorFactory.DefaultErrorFactory {
    public static final String UNKNOWN = "UNKNOWN";
    public static final DJICoreError FACTORY = new DJICoreError();

    @Override
    public IErrorFactory.InnerError findInnerError(String string2) {
        return null;
    }

    @Override
    public ErrorType errorType() {
        return null;
    }

    public ErrorImp build(DJIErrorCode dJIErrorCode) {
        return null;
    }

    public ErrorImp build(DJIErrorCode dJIErrorCode, String string2, @Nullable String string3) {
        return null;
    }

    private static final class Error
    extends Enum<Error>
    implements IErrorFactory.InnerError {
        public static final /* enum */ Error INVALID_PARAM = new Error(DJIErrorCode.INVALID_PARAM.name(), "invalid param");
        public static final /* enum */ Error SYSTEM_BUSY = new Error(DJIErrorCode.SYSTEM_BUSY.name(), "system is not ready");
        public static final /* enum */ Error REQUEST_HANDLER_NOT_FOUND = new Error(DJIErrorCode.REQUEST_HANDLER_NOT_FOUND.name(), "not support");
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

        private Error(String string3, String string4) {
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

