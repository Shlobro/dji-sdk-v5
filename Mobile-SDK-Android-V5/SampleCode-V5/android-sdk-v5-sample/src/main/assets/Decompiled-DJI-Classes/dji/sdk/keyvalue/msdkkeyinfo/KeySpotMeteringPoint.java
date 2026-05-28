/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  io.reactivex.rxjava3.core.Completable
 */
package dji.sdk.keyvalue.msdkkeyinfo;

import android.annotation.SuppressLint;
import dji.sdk.keyvalue.key.MSDKKeyInfo;
import dji.sdk.keyvalue.value.KeyParam;
import dji.sdk.keyvalue.value.common.DoublePoint2D;
import dji.sdk.keyvalue.value.common.DoubleRect;
import dji.sdk.keyvalue.value.common.IntPoint2D;
import dji.v5.common.callback.CommonCallbacks;
import io.reactivex.rxjava3.core.Completable;

public class KeySpotMeteringPoint
extends MSDKKeyInfo<DoublePoint2D> {
    private static final int NUM_ROWS = 8;
    private static final int NUM_COLUMNS = 12;

    @Override
    @SuppressLint(value={"CheckResult"})
    public void setValue(DoublePoint2D doublePoint2D, CommonCallbacks.CompletionCallback completionCallback, KeyParam keyParam) {
    }

    @Override
    public void getValue(CommonCallbacks.CompletionCallbackWithParam<DoublePoint2D> completionCallbackWithParam, KeyParam keyParam) {
    }

    @Override
    public DoublePoint2D getValue(KeyParam keyParam) {
        return null;
    }

    @Override
    public void listen(Object object, CommonCallbacks.KeyListener<DoublePoint2D> keyListener, KeyParam keyParam) {
    }

    @Override
    public void listen(Object object, boolean bl, CommonCallbacks.KeyListener<DoublePoint2D> keyListener, KeyParam keyParam) {
    }

    @Override
    public void cancelListen(Object object, KeyParam keyParam) {
    }

    @Override
    public void cancelListen(KeyParam keyParam) {
    }

    private Completable updateMetering(double d2, double d3, KeyParam keyParam) {
        return null;
    }

    private boolean isParamValid(DoublePoint2D doublePoint2D) {
        return false;
    }

    private static /* synthetic */ void lambda$listen$3(CommonCallbacks.KeyListener keyListener, IntPoint2D intPoint2D, IntPoint2D intPoint2D2) {
    }

    private static /* synthetic */ void lambda$listen$2(CommonCallbacks.KeyListener keyListener, DoubleRect doubleRect, DoubleRect doubleRect2) {
    }

    private static /* synthetic */ void lambda$setValue$1(CommonCallbacks.CompletionCallback completionCallback, Throwable throwable) throws Throwable {
    }

    private static /* synthetic */ void lambda$setValue$0(CommonCallbacks.CompletionCallback completionCallback) throws Throwable {
    }
}

