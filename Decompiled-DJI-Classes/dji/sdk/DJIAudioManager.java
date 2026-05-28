/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk;

import dji.sdk.common.CallBack2;
import dji.sdk.keyvalue.value.media.AudioBufferInfo;

public class DJIAudioManager {
    private static volatile DJIAudioManager mInstance = null;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static DJIAudioManager getInstance() {
        return null;
    }

    private DJIAudioManager() {
    }

    public void setAudioObserver(int n, CallBack2<AudioBufferInfo, byte[]> callBack2) {
    }

    public void removeAudioObserver(int n) {
    }
}

