/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.callback;

import dji.sdk.keyvalue.key.DJIKey;

public interface IListenCallback<T> {
    public void onPush(DJIKey var1, T var2, T var3);
}

