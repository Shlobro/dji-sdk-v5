/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.msdkkeyinfo;

import dji.sdk.keyvalue.key.MSDKKeyInfo;
import dji.sdk.keyvalue.value.KeyParam;
import dji.sdk.keyvalue.value.flightcontroller.FCFlightMode;
import dji.sdk.keyvalue.value.flightcontroller.FlightMode;
import dji.v5.common.callback.CommonCallbacks;

public class KeyFlightMode
extends MSDKKeyInfo<FlightMode> {
    @Override
    public FlightMode getValue(KeyParam keyParam) {
        return null;
    }

    @Override
    public void getValue(CommonCallbacks.CompletionCallbackWithParam<FlightMode> completionCallbackWithParam, KeyParam keyParam) {
    }

    @Override
    public void listen(Object object, boolean bl, CommonCallbacks.KeyListener<FlightMode> keyListener, KeyParam keyParam) {
    }

    @Override
    public void listen(Object object, CommonCallbacks.KeyListener<FlightMode> keyListener, KeyParam keyParam) {
    }

    @Override
    public void cancelListen(KeyParam keyParam) {
    }

    @Override
    public void cancelListen(Object object, KeyParam keyParam) {
    }

    private static /* synthetic */ void lambda$listen$0(CommonCallbacks.KeyListener keyListener, FCFlightMode fCFlightMode, FCFlightMode fCFlightMode2) {
    }
}

