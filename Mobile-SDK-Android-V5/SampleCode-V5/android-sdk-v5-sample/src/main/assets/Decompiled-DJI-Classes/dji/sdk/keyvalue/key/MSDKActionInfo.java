/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Keep
 */
package dji.sdk.keyvalue.key;

import androidx.annotation.Keep;
import dji.sdk.keyvalue.IMSDKActionKeyInfo;
import dji.sdk.keyvalue.IMSDKActionKeyInfoWithParam;
import dji.sdk.keyvalue.converter.IDJIValueConverter;
import dji.sdk.keyvalue.key.ComponentType;
import dji.sdk.keyvalue.key.DJIActionKeyInfo;
import dji.sdk.keyvalue.key.DJIKey;
import dji.sdk.keyvalue.value.KeyParam;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.v5.common.callback.CommonCallbacks;

@Keep
public class MSDKActionInfo<T, R>
extends DJIActionKeyInfo<T, R>
implements IMSDKActionKeyInfo<R>,
IMSDKActionKeyInfoWithParam<T, R> {
    public MSDKActionInfo() {
    }

    public MSDKActionInfo(String string, ComponentType componentType) {
    }

    public MSDKActionInfo(String string, ComponentType componentType, IDJIValueConverter<T, ? extends DJIValue> iDJIValueConverter, IDJIValueConverter<R, ? extends DJIValue> iDJIValueConverter2) {
    }

    @Override
    public void performAction(CommonCallbacks.CompletionCallbackWithParam<R> completionCallbackWithParam, KeyParam keyParam) {
    }

    @Override
    public void performAction(T t, CommonCallbacks.CompletionCallbackWithParam<R> completionCallbackWithParam, KeyParam keyParam) {
    }

    public <X, Y> DJIKey.ActionKey<X, Y> createKey(DJIActionKeyInfo<X, Y> dJIActionKeyInfo, KeyParam keyParam) {
        return null;
    }
}

