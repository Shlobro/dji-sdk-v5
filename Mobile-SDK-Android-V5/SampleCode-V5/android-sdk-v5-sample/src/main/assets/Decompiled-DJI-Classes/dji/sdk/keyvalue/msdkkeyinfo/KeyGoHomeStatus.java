/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 */
package dji.sdk.keyvalue.msdkkeyinfo;

import android.os.Handler;
import dji.sdk.keyvalue.key.MSDKKeyInfo;
import dji.sdk.keyvalue.value.KeyParam;
import dji.sdk.keyvalue.value.flightcontroller.FCFlightMode;
import dji.sdk.keyvalue.value.flightcontroller.GoHomeState;
import dji.v5.common.callback.CommonCallbacks;

public class KeyGoHomeStatus
extends MSDKKeyInfo<GoHomeState> {
    private final Handler notifyHandler;

    @Override
    public GoHomeState getValue(KeyParam keyParam) {
        return null;
    }

    @Override
    public void getValue(CommonCallbacks.CompletionCallbackWithParam<GoHomeState> completionCallbackWithParam, KeyParam keyParam) {
    }

    @Override
    public void listen(Object object, boolean bl, CommonCallbacks.KeyListener<GoHomeState> keyListener, KeyParam keyParam) {
    }

    @Override
    public void listen(Object object, CommonCallbacks.KeyListener<GoHomeState> keyListener, KeyParam keyParam) {
    }

    @Override
    public void cancelListen(Object object, KeyParam keyParam) {
    }

    @Override
    public void cancelListen(KeyParam keyParam) {
    }

    private void processListener(Object object, boolean bl, CommonCallbacks.KeyListener<GoHomeState> keyListener, KeyParam keyParam) {
    }

    private GoHomeState convertFlightMode(FCFlightMode fCFlightMode) {
        return null;
    }

    private GoHomeState getNewGoHomeState(GoHomeState goHomeState, GoHomeState goHomeState2) {
        return null;
    }

    private /* synthetic */ void lambda$processListener$1(CommonCallbacks.KeyListener keyListener, FCFlightMode fCFlightMode, FCFlightMode fCFlightMode2) {
    }

    private static /* synthetic */ void lambda$processListener$0(CommonCallbacks.KeyListener keyListener) {
    }

    static /* synthetic */ GoHomeState access$000(KeyGoHomeStatus keyGoHomeStatus, FCFlightMode fCFlightMode) {
        return null;
    }
}

