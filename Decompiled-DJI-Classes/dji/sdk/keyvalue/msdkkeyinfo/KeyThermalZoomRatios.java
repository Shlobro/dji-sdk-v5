/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.msdkkeyinfo;

import dji.sdk.keyvalue.key.MSDKKeyInfo;
import dji.sdk.keyvalue.value.KeyParam;
import dji.sdk.keyvalue.value.camera.ThermalDigitalZoomFactor;
import dji.v5.common.callback.CommonCallbacks;

public class KeyThermalZoomRatios
extends MSDKKeyInfo<Double> {
    @Override
    public Double getValue(KeyParam keyParam) {
        return null;
    }

    @Override
    public void setValue(Double d2, CommonCallbacks.CompletionCallback completionCallback, KeyParam keyParam) {
    }

    @Override
    public void getValue(CommonCallbacks.CompletionCallbackWithParam<Double> completionCallbackWithParam, KeyParam keyParam) {
    }

    @Override
    public void listen(Object object, boolean bl, CommonCallbacks.KeyListener<Double> keyListener, KeyParam keyParam) {
    }

    @Override
    public void listen(Object object, CommonCallbacks.KeyListener<Double> keyListener, KeyParam keyParam) {
    }

    @Override
    public void cancelListen(Object object, KeyParam keyParam) {
    }

    @Override
    public void cancelListen(KeyParam keyParam) {
    }

    private void processListener(Object object, boolean bl, CommonCallbacks.KeyListener<Double> keyListener, KeyParam keyParam) {
    }

    private void processCancelListener(KeyParam keyParam) {
    }

    private void processCancelListener(Object object, KeyParam keyParam) {
    }

    private int toIrFocalLength(Integer n, Double d2) {
        return 0;
    }

    private Double toIrTimes(Integer n, Integer n2) {
        return null;
    }

    private Double toIrTimes(ThermalDigitalZoomFactor thermalDigitalZoomFactor) {
        return null;
    }

    private /* synthetic */ void lambda$processListener$1(int n, CommonCallbacks.KeyListener keyListener, Integer n2, Integer n3) {
    }

    private /* synthetic */ void lambda$processListener$0(int n, CommonCallbacks.KeyListener keyListener, ThermalDigitalZoomFactor thermalDigitalZoomFactor, ThermalDigitalZoomFactor thermalDigitalZoomFactor2) {
    }

    static /* synthetic */ Double access$000(KeyThermalZoomRatios keyThermalZoomRatios, ThermalDigitalZoomFactor thermalDigitalZoomFactor) {
        return null;
    }

    static /* synthetic */ Double access$100(KeyThermalZoomRatios keyThermalZoomRatios, Integer n, Integer n2) {
        return null;
    }
}

