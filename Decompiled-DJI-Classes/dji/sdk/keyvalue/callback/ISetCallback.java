/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.callback;

import dji.sdk.keyvalue.key.DJIKey;

public interface ISetCallback {
    public void onSuccess(DJIKey var1);

    public void onFailed(DJIKey var1, int var2, String var3);
}

