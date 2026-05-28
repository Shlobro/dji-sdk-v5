/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.CallSuper
 *  androidx.annotation.NonNull
 */
package dji.v5.common.callback;

import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import dji.v5.common.callback.CommonCallbacks;
import dji.v5.common.error.IDJIError;

public class CompletionCallbackWithParamWrapper<T>
implements CommonCallbacks.CompletionCallbackWithParam<T> {
    private final CommonCallbacks.CompletionCallbackWithParam<T> mCallback;

    public CompletionCallbackWithParamWrapper(CommonCallbacks.CompletionCallbackWithParam<T> completionCallbackWithParam) {
    }

    @Override
    @CallSuper
    public void onSuccess(T t) {
    }

    @Override
    @CallSuper
    public void onFailure(@NonNull IDJIError iDJIError) {
    }

    private /* synthetic */ void lambda$onFailure$1(IDJIError iDJIError) {
    }

    private /* synthetic */ void lambda$onSuccess$0(Object object) {
    }
}

