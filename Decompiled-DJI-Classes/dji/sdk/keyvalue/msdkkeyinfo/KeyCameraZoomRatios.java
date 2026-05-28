/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.msdkkeyinfo;

import dji.sdk.keyvalue.key.MSDKKeyInfo;
import dji.sdk.keyvalue.value.KeyParam;
import dji.sdk.keyvalue.value.camera.CameraOpticalZoomSpec;
import dji.v5.common.callback.CommonCallbacks;

public class KeyCameraZoomRatios
extends MSDKKeyInfo<Double> {
    private int maxZoomRatios;
    private int minZoomRatios;

    @Override
    public void setValue(Double d2, CommonCallbacks.CompletionCallback completionCallback, KeyParam keyParam) {
    }

    private void setPayloadValue(Double d2, CommonCallbacks.CompletionCallback completionCallback, KeyParam keyParam) {
    }

    @Override
    public Double getValue(KeyParam keyParam) {
        return null;
    }

    @Override
    public void getValue(CommonCallbacks.CompletionCallbackWithParam<Double> completionCallbackWithParam, KeyParam keyParam) {
    }

    private Double getOpticalRatios(Integer n, CameraOpticalZoomSpec cameraOpticalZoomSpec) {
        return null;
    }

    private int getOpticalLength(Double d2, CameraOpticalZoomSpec cameraOpticalZoomSpec) {
        return 0;
    }

    @Override
    public void listen(Object object, CommonCallbacks.KeyListener<Double> keyListener, KeyParam keyParam) {
    }

    @Override
    public void listen(Object object, boolean bl, CommonCallbacks.KeyListener<Double> keyListener, KeyParam keyParam) {
    }

    @Override
    public void cancelListen(Object object, KeyParam keyParam) {
    }

    @Override
    public void cancelListen(KeyParam keyParam) {
    }

    private void processListener(Object object, boolean bl, CommonCallbacks.KeyListener<Double> keyListener, KeyParam keyParam) {
    }

    private CameraOpticalZoomSpec getZoomSpec(KeyParam keyParam) {
        return null;
    }

    private Double getZoomRatios(Integer n, KeyParam keyParam) {
        return null;
    }

    private boolean isValidArray(int[] nArray) {
        return false;
    }

    private boolean isL2Camera(KeyParam keyParam) {
        return false;
    }

    private boolean isPayloadCamera(KeyParam keyParam) {
        return false;
    }

    private static /* synthetic */ void lambda$processListener$2(float f2, float f3, int[] nArray, int[] nArray2, int n, CommonCallbacks.KeyListener keyListener, Integer n2, Integer n3) {
    }

    private /* synthetic */ void lambda$processListener$1(CommonCallbacks.KeyListener keyListener, CameraOpticalZoomSpec cameraOpticalZoomSpec, Integer n, Integer n2) {
    }

    private /* synthetic */ void lambda$processListener$0(CommonCallbacks.KeyListener keyListener, KeyParam keyParam, Integer n, Integer n2) {
    }
}

