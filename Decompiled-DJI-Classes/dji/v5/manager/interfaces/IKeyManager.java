/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 */
package dji.v5.manager.interfaces;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import dji.sdk.keyvalue.key.DJIActionKeyInfo;
import dji.sdk.keyvalue.key.DJIKey;
import dji.sdk.keyvalue.key.DJIKeyInfo;
import dji.v5.common.callback.CommonCallbacks;

public interface IKeyManager {
    @Nullable
    public <R> R getValue(DJIKey<R> var1);

    @NonNull
    public <R> R getValue(DJIKey<R> var1, @NonNull R var2);

    public <R> void getValue(DJIKey<R> var1, CommonCallbacks.CompletionCallbackWithParam<R> var2);

    public <P> void setValue(DJIKey<P> var1, P var2, CommonCallbacks.CompletionCallback var3);

    public <R> void performAction(DJIKey.ActionKey<?, R> var1, CommonCallbacks.CompletionCallbackWithParam<R> var2);

    public <P, R> void performAction(DJIKey.ActionKey<P, R> var1, P var2, CommonCallbacks.CompletionCallbackWithParam<R> var3);

    public <R> void listen(DJIKey<R> var1, Object var2, CommonCallbacks.KeyListener<R> var3);

    public <R> void listen(DJIKey<R> var1, Object var2, boolean var3, CommonCallbacks.KeyListener<R> var4);

    public void cancelListen(DJIKey<?> var1, Object var2);

    public void cancelListen(DJIKey<?> var1);

    public void cancelListen(Object var1);

    public <T> boolean isKeySupported(DJIKey<T> var1);

    public <T> DJIKey<T> create(DJIKeyInfo<T> var1, int var2, int var3, int var4, int var5);

    public <T, R> DJIKey.ActionKey<T, R> create(DJIActionKeyInfo<T, R> var1, int var2, int var3, int var4, int var5);
}

