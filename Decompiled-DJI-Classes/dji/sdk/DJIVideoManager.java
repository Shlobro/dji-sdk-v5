/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.Surface
 */
package dji.sdk;

import android.view.Surface;
import dji.sdk.common.CallBack2;
import dji.sdk.keyvalue.value.camera.IFrameInfo;
import dji.sdk.keyvalue.value.media.VideoBufferInfo;

public class DJIVideoManager {
    private static volatile DJIVideoManager mInstance = null;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static synchronized DJIVideoManager getInstance() {
        return null;
    }

    private DJIVideoManager() {
    }

    public void setVideoObserver(int n, CallBack2<VideoBufferInfo, byte[]> callBack2) {
    }

    public void setVideoObserver(int n, int n2, CallBack2<VideoBufferInfo, byte[]> callBack2) {
    }

    public void removeVideoObserver(int n) {
    }

    public void removeVideoObserver(int n, int n2) {
    }

    public void setSurface(int n, Surface surface) {
    }

    public void setSurface(int n, int n2, Surface surface) {
    }

    public void removeSurface(int n) {
    }

    public void removeSurface(int n, int n2) {
    }

    public byte[] getKeyFrame(int n, int n2, IFrameInfo iFrameInfo) {
        return null;
    }

    private static /* synthetic */ void lambda$setVideoObserver$1(CallBack2 callBack2, VideoBufferInfo videoBufferInfo, byte[] byArray) {
    }

    private static /* synthetic */ void lambda$setVideoObserver$0(CallBack2 callBack2, VideoBufferInfo videoBufferInfo, byte[] byArray) {
    }
}

