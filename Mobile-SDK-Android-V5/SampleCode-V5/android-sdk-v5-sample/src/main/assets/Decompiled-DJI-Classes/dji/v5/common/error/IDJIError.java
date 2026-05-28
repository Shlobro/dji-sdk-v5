/*
 * Decompiled with CFR 0.152.
 */
package dji.v5.common.error;

import dji.v5.common.error.ErrorType;

public interface IDJIError {
    public ErrorType errorType();

    public String errorCode();

    public String innerCode();

    public String hint();

    public String description();

    public String toString();

    public boolean isError(String var1);
}

