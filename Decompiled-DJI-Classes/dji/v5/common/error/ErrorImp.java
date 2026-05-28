/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Nullable
 */
package dji.v5.common.error;

import androidx.annotation.Nullable;
import dji.v5.common.error.ErrorType;
import dji.v5.common.error.IDJIError;

public class ErrorImp
implements IDJIError {
    private final ErrorType errorType;
    private final String errorCode;
    @Nullable
    private final String innerCode;
    @Nullable
    private final String description;
    @Nullable
    private final String hint;

    ErrorImp(ErrorType errorType, String string2, @Nullable String string3, @Nullable String string4, @Nullable String string5) {
    }

    @Override
    public ErrorType errorType() {
        return null;
    }

    @Override
    public String errorCode() {
        return null;
    }

    @Override
    public String innerCode() {
        return null;
    }

    @Override
    public String hint() {
        return null;
    }

    @Override
    public String description() {
        return null;
    }

    @Override
    public boolean isError(String string2) {
        return false;
    }

    @Override
    public String toString() {
        return null;
    }
}

