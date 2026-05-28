/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.msdkkeyinfo;

import dji.sdk.keyvalue.key.MSDKKeyInfo;
import dji.sdk.keyvalue.value.KeyParam;
import dji.sdk.keyvalue.value.camera.ZoomRatiosRange;
import dji.v5.common.callback.CommonCallbacks;

public class KeyThermalZoomRatiosRange
extends MSDKKeyInfo<ZoomRatiosRange> {
    @Override
    public ZoomRatiosRange getValue(KeyParam keyParam) {
        return null;
    }

    @Override
    public void getValue(CommonCallbacks.CompletionCallbackWithParam<ZoomRatiosRange> completionCallbackWithParam, KeyParam keyParam) {
    }

    @Override
    public void listen(Object object, boolean bl, CommonCallbacks.KeyListener<ZoomRatiosRange> keyListener, KeyParam keyParam) {
    }

    @Override
    public void listen(Object object, CommonCallbacks.KeyListener<ZoomRatiosRange> keyListener, KeyParam keyParam) {
    }

    private ZoomRatiosRange getZoomRatiosRange(int n) {
        return null;
    }

    private boolean isUnSupportCamera(int n) {
        return false;
    }
}

