/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue;

import dji.sdk.keyvalue.value.KeyParam;
import dji.v5.common.callback.CommonCallbacks;

public interface IMSDKKey<T> {
    public T getValue(KeyParam var1);

    public void getValue(CommonCallbacks.CompletionCallbackWithParam<T> var1, KeyParam var2);

    public void setValue(T var1, CommonCallbacks.CompletionCallback var2, KeyParam var3);

    public void listen(Object var1, CommonCallbacks.KeyListener<T> var2, KeyParam var3);

    public void listen(Object var1, boolean var2, CommonCallbacks.KeyListener<T> var3, KeyParam var4);

    public void cancelListen(Object var1, KeyParam var2);

    public void cancelListen(KeyParam var1);
}

