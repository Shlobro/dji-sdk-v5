/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue;

import dji.sdk.keyvalue.value.KeyParam;
import dji.v5.common.callback.CommonCallbacks;

public interface IMSDKActionKeyInfo<T> {
    public void performAction(CommonCallbacks.CompletionCallbackWithParam<T> var1, KeyParam var2);
}

