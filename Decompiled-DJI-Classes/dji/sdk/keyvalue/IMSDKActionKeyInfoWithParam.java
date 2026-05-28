/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue;

import dji.sdk.keyvalue.value.KeyParam;
import dji.v5.common.callback.CommonCallbacks;

public interface IMSDKActionKeyInfoWithParam<T, R> {
    public void performAction(T var1, CommonCallbacks.CompletionCallbackWithParam<R> var2, KeyParam var3);
}

