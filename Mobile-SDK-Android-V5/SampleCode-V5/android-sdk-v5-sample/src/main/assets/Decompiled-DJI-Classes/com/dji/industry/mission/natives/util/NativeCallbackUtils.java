/*
 * Decompiled with CFR 0.152.
 */
package com.dji.industry.mission.natives.util;

import dji.v5.common.KeepProguard;

public class NativeCallbackUtils
implements KeepProguard {

    public static interface CommonCallbackWithTwoParam<X, Y> {
        public void onSuccess(X var1, Y var2);

        public void onFailure(int var1);
    }

    public static interface CommonCallbackWith<T> {
        public void onSuccess(T var1);

        public void onFailure(int var1);
    }

    public static interface CommonCallback {
        public void onSuccess() throws InterruptedException;

        public void onFailure(int var1);
    }
}

