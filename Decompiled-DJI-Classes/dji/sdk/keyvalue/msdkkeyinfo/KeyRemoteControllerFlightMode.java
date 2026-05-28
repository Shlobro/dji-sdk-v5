/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.msdkkeyinfo;

import dji.sdk.keyvalue.key.MSDKKeyInfo;
import dji.sdk.keyvalue.value.KeyParam;
import dji.sdk.keyvalue.value.flightcontroller.RemoteControllerFlightMode;
import dji.sdk.keyvalue.value.flightcontroller.RemoteControllerFlightModeMsg;
import dji.v5.common.callback.CommonCallbacks;

public class KeyRemoteControllerFlightMode
extends MSDKKeyInfo<RemoteControllerFlightMode> {
    @Override
    public RemoteControllerFlightMode getValue(KeyParam keyParam) {
        return null;
    }

    @Override
    public void getValue(CommonCallbacks.CompletionCallbackWithParam<RemoteControllerFlightMode> completionCallbackWithParam, KeyParam keyParam) {
    }

    @Override
    public void listen(Object object, CommonCallbacks.KeyListener<RemoteControllerFlightMode> keyListener, KeyParam keyParam) {
    }

    @Override
    public void listen(Object object, boolean bl, CommonCallbacks.KeyListener<RemoteControllerFlightMode> keyListener, KeyParam keyParam) {
    }

    @Override
    public void cancelListen(KeyParam keyParam) {
    }

    @Override
    public void cancelListen(Object object, KeyParam keyParam) {
    }

    private void processListener(Object object, boolean bl, CommonCallbacks.KeyListener<RemoteControllerFlightMode> keyListener, KeyParam keyParam) {
    }

    private RemoteControllerFlightMode getMode(RemoteControllerFlightModeMsg remoteControllerFlightModeMsg) {
        return null;
    }

    private /* synthetic */ void lambda$processListener$0(CommonCallbacks.KeyListener keyListener, RemoteControllerFlightModeMsg remoteControllerFlightModeMsg, RemoteControllerFlightModeMsg remoteControllerFlightModeMsg2) {
    }
}

