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

public class CompletionCallbackWrapper
implements CommonCallbacks.CompletionCallback {
    private final CommonCallbacks.CompletionCallback mCallback;

    public CompletionCallbackWrapper(CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    @CallSuper
    public void onSuccess() {
    }

    @Override
    @CallSuper
    public void onFailure(@NonNull IDJIError iDJIError) {
    }

    private /* synthetic */ void lambda$onFailure$0(IDJIError iDJIError) {
    }
}

