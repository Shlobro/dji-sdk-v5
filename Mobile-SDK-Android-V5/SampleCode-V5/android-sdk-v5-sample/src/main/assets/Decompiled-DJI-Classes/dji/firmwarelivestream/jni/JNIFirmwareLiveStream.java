/*
 * Decompiled with CFR 0.152.
 */
package dji.firmwarelivestream.jni;

import dji.jni.JNIProguardKeepTag;
import dji.jni.callback.JNIRetCodeCallback;
import dji.jni.callback.JNIStringCallback;

public final class JNIFirmwareLiveStream
implements JNIProguardKeepTag {
    public static native void native_switchLiveStreamMode(boolean var0, JNIRetCodeCallback var1);

    public static native void native_connectWiFi(String var0, String var1, JNIRetCodeCallback var2);

    public static native void native_setLiveStreamParam(byte[] var0, JNIRetCodeCallback var1);

    public static native void native_controlLiveStream(int var0, JNIRetCodeCallback var1);

    public static native void native_getLiveStreamSettingInfo(JNIStringCallback var0);

    public static native void native_getLiveStreamDeviceState(JNIStringCallback var0);

    public static native void native_setLiveStreamDeviceStateListener(JNIStringCallback var0);

    public static native void native_getLiveStreamRunningState(JNIStringCallback var0);

    public static native void native_setLiveStreamRunningStateListener(JNIStringCallback var0);

    static {
        try {
            System.loadLibrary("djisdk_jni");
        }
        catch (UnsatisfiedLinkError e2) {
            e2.printStackTrace();
        }
    }
}

