/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Nullable
 */
package dji.v5.common.error;

import androidx.annotation.Nullable;
import dji.v5.common.error.ErrorImp;
import dji.v5.common.error.ErrorType;

interface IErrorFactory {
    public ErrorImp defaultBuild(String var1, @Nullable String var2, @Nullable String var3, int var4, @Nullable Object[] var5);

    public ErrorImp build(String var1);

    public ErrorImp buildWithResValue(String var1, Object ... var2);

    public ErrorImp build(String var1, String var2, @Nullable String var3);

    public ErrorImp build(String var1, String var2, @Nullable String var3, int var4, @Nullable Object[] var5);

    public InnerError findInnerError(String var1);

    public ErrorType errorType();

    public static interface InnerError {
        public String errorCode();

        public String hint();

        public int resID();
    }

    public static abstract class DefaultErrorFactory
    implements IErrorFactory {
        public static final int DEFAULT_RES_ID = -1;

        @Override
        public ErrorImp defaultBuild(String string2, @Nullable String string3, @Nullable String string4, int n, @Nullable Object[] objectArray) {
            return null;
        }

        @Override
        public ErrorImp build(String string2) {
            return null;
        }

        @Override
        public ErrorImp buildWithResValue(String string2, Object ... objectArray) {
            return null;
        }

        @Override
        public ErrorImp build(String string2, String string3, @Nullable String string4) {
            return null;
        }

        @Override
        public ErrorImp build(String string2, String string3, @Nullable String string4, int n, @Nullable Object[] objectArray) {
            return null;
        }

        @Override
        public abstract InnerError findInnerError(String var1);

        @Override
        public abstract ErrorType errorType();
    }
}

