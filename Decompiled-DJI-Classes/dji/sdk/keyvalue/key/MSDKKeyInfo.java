/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.key;

import dji.sdk.keyvalue.IMSDKKey;
import dji.sdk.keyvalue.converter.IDJIValueConverter;
import dji.sdk.keyvalue.key.ComponentType;
import dji.sdk.keyvalue.key.DJIActionKeyInfo;
import dji.sdk.keyvalue.key.DJIKey;
import dji.sdk.keyvalue.key.DJIKeyInfo;
import dji.sdk.keyvalue.value.KeyParam;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.camera.CameraType;
import dji.v5.common.callback.CommonCallbacks;

public abstract class MSDKKeyInfo<T>
extends DJIKeyInfo<T>
implements IMSDKKey<T> {
    protected MSDKKeyInfo(String string) {
    }

    protected MSDKKeyInfo(String string, IDJIValueConverter<T, ? extends DJIValue> iDJIValueConverter) {
    }

    protected MSDKKeyInfo(String string, ComponentType componentType) {
    }

    protected MSDKKeyInfo(String string, ComponentType componentType, IDJIValueConverter<T, ? extends DJIValue> iDJIValueConverter) {
    }

    @Override
    public T getValue(KeyParam keyParam) {
        return null;
    }

    @Override
    public void setValue(T t, CommonCallbacks.CompletionCallback completionCallback, KeyParam keyParam) {
    }

    @Override
    public void getValue(CommonCallbacks.CompletionCallbackWithParam<T> completionCallbackWithParam, KeyParam keyParam) {
    }

    @Override
    public void listen(Object object, boolean bl, CommonCallbacks.KeyListener<T> keyListener, KeyParam keyParam) {
    }

    @Override
    public void listen(Object object, CommonCallbacks.KeyListener<T> keyListener, KeyParam keyParam) {
    }

    @Override
    public void cancelListen(Object object, KeyParam keyParam) {
    }

    @Override
    public void cancelListen(KeyParam keyParam) {
    }

    public <X> DJIKey<X> createKey(DJIKeyInfo<X> dJIKeyInfo, KeyParam keyParam) {
        return null;
    }

    public <T, R> DJIKey.ActionKey<T, R> createKey(DJIActionKeyInfo<T, R> dJIActionKeyInfo, KeyParam keyParam) {
        return null;
    }

    public CameraType getCameraType(KeyParam keyParam) {
        return null;
    }

    @Override
    public String toString() {
        return null;
    }
}

