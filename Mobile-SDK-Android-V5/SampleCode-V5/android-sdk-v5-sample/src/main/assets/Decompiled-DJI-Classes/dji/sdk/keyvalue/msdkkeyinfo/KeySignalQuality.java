/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.msdkkeyinfo;

import dji.sdk.keyvalue.key.MSDKKeyInfo;
import dji.sdk.keyvalue.value.KeyParam;
import dji.v5.common.callback.CommonCallbacks;

public class KeySignalQuality
extends MSDKKeyInfo<Integer> {
    private static final int CONVERT_FACTOR = 20;

    @Override
    public Integer getValue(KeyParam keyParam) {
        return null;
    }

    @Override
    public void getValue(CommonCallbacks.CompletionCallbackWithParam<Integer> completionCallbackWithParam, KeyParam keyParam) {
    }

    @Override
    public void listen(Object object, CommonCallbacks.KeyListener<Integer> keyListener, KeyParam keyParam) {
    }

    @Override
    public void listen(Object object, boolean bl, CommonCallbacks.KeyListener<Integer> keyListener, KeyParam keyParam) {
    }

    @Override
    public void cancelListen(Object object, KeyParam keyParam) {
    }

    @Override
    public void cancelListen(KeyParam keyParam) {
    }

    int getUpDownLinkSignal(KeyParam keyParam) {
        return 0;
    }

    Integer calculateSignal(Integer n, Integer n2, Integer n3) {
        return null;
    }

    private void processListen(Object object, boolean bl, CommonCallbacks.KeyListener<Integer> keyListener, KeyParam keyParam) {
    }

    private Integer getMinValue(Integer n, Integer n2) {
        return null;
    }

    @Override
    public String toString() {
        return null;
    }

    private static /* synthetic */ void lambda$processListen$2(CommonCallbacks.KeyListener keyListener, Integer n) throws Throwable {
    }

    private static /* synthetic */ void lambda$getValue$1(CommonCallbacks.CompletionCallbackWithParam completionCallbackWithParam, Throwable throwable) throws Throwable {
    }

    private static /* synthetic */ void lambda$getValue$0(CommonCallbacks.CompletionCallbackWithParam completionCallbackWithParam, Integer n) throws Throwable {
    }

    public static class Value {
        private final Integer oldValue;
        private final Integer newValue;

        public Integer getOldValue() {
            return null;
        }

        public Integer getNewValue() {
            return null;
        }

        public Value(Integer n, Integer n2) {
        }
    }
}

