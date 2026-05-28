/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Nullable
 */
package dji.v5.common.callback;

import androidx.annotation.Nullable;
import dji.v5.common.callback.CommonCallbacks;

public class KeyListenerWrapper<T>
implements CommonCallbacks.KeyListener<T> {
    private final CommonCallbacks.KeyListener<T> mCallback;

    public KeyListenerWrapper(CommonCallbacks.KeyListener<T> keyListener) {
    }

    @Override
    public void onValueChange(@Nullable T t, @Nullable T t2) {
    }

    private /* synthetic */ void lambda$onValueChange$0(Object object, Object object2) {
    }
}

