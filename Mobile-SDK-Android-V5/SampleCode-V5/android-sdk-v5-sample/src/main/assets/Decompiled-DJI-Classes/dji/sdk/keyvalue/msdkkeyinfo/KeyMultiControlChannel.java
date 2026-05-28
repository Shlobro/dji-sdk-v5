/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.msdkkeyinfo;

import dji.sdk.keyvalue.key.MSDKKeyInfo;
import dji.sdk.keyvalue.value.KeyParam;
import dji.sdk.keyvalue.value.common.MultiControlChannel;
import dji.sdk.keyvalue.value.remotecontroller.RCMode;
import dji.v5.common.callback.CommonCallbacks;

public class KeyMultiControlChannel
extends MSDKKeyInfo<MultiControlChannel> {
    @Override
    public MultiControlChannel getValue(KeyParam keyParam) {
        return null;
    }

    @Override
    public void getValue(CommonCallbacks.CompletionCallbackWithParam<MultiControlChannel> completionCallbackWithParam, KeyParam keyParam) {
    }

    @Override
    public void listen(Object object, boolean bl, CommonCallbacks.KeyListener<MultiControlChannel> keyListener, KeyParam keyParam) {
    }

    @Override
    public void listen(Object object, CommonCallbacks.KeyListener<MultiControlChannel> keyListener, KeyParam keyParam) {
    }

    @Override
    public void cancelListen(Object object, KeyParam keyParam) {
    }

    @Override
    public void cancelListen(KeyParam keyParam) {
    }

    private MultiControlChannel getControlChannel(RCMode rCMode) {
        return null;
    }

    private /* synthetic */ void lambda$listen$0(CommonCallbacks.KeyListener keyListener, RCMode rCMode, RCMode rCMode2) {
    }

    static /* synthetic */ MultiControlChannel access$000(KeyMultiControlChannel keyMultiControlChannel, RCMode rCMode) {
        return null;
    }
}

