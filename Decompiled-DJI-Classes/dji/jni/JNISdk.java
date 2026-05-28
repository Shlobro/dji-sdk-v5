/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.Surface
 */
package dji.jni;

import android.view.Surface;
import dji.jni.JNIProguardKeepTag;
import dji.jni.callback.JNIBoolCallback;
import dji.jni.callback.JNIChangeDatalinkCallback;
import dji.jni.callback.JNIComponentConnectionCallback;
import dji.jni.callback.JNIProductConnectionCallback;
import dji.jni.callback.data.JNIAudioDataCallback;
import dji.jni.callback.data.JNIVideoDataCallback;
import dji.jni.value.InitializeInfo;
import dji.sdk.common.CallBack2;
import dji.sdk.handler.Network.INetworkHandler;
import dji.sdk.handler.TTS.ITTSHandler;
import dji.sdk.handler.TimeSync.jni.JNITimeSyncRequestCallback;
import dji.sdk.jni.LibraryLoader;
import dji.sdk.keyvalue.value.camera.IFrameInfo;
import dji.sdk.keyvalue.value.common.LocationCoordinate2D;
import dji.sdk.keyvalue.value.common.SDKInitializeInfo;
import dji.sdk.keyvalue.value.media.AudioBufferInfo;
import dji.sdk.keyvalue.value.media.VideoBufferInfo;
import dji.sdk.systeminfo.UserAccountLoginInfo;

public final class JNISdk
implements JNIProguardKeepTag {
    public static synchronized boolean initialize(InitializeInfo initializeInfo, SDKInitializeInfo sDKInitializeInfo, JNIProductConnectionCallback jNIProductConnectionCallback) {
        return false;
    }

    public static synchronized void uninitialize() {
    }

    public static String getCSDKVersion() {
        return null;
    }

    public static synchronized void setComponentConnectionListener(int n, JNIComponentConnectionCallback jNIComponentConnectionCallback) {
    }

    public static void setVideoObserver(int n, int n2, CallBack2<VideoBufferInfo, byte[]> callBack2) {
    }

    public static void removeVideoObserver(int n, int n2) {
    }

    public static void setAudioObserver(int n, CallBack2<AudioBufferInfo, byte[]> callBack2) {
    }

    public static void removeAudioObserver(int n) {
    }

    public static void setSurface(int n, int n2, Surface surface) {
    }

    public static void removeSurface(int n, int n2) {
    }

    public static byte[] getKeyFrame(int n, int n2, IFrameInfo iFrameInfo) {
        return null;
    }

    public static void updateUserLoginInfo(UserAccountLoginInfo userAccountLoginInfo, JNIBoolCallback jNIBoolCallback) {
    }

    public static LocationCoordinate2D getAppLocation() {
        return null;
    }

    public static void setAppLocation(LocationCoordinate2D locationCoordinate2D) {
    }

    public static void setNetworkHandler(INetworkHandler iNetworkHandler) {
    }

    public static void setTTSHandler(ITTSHandler iTTSHandler) {
    }

    public static void setTimeSyncRequestCallback(JNITimeSyncRequestCallback jNITimeSyncRequestCallback) {
    }

    public static void changeDatalinkV1ToUpgrade(int n, JNIChangeDatalinkCallback jNIChangeDatalinkCallback) {
    }

    public static void changeDatalinkUpgradeToV1(int n, JNIChangeDatalinkCallback jNIChangeDatalinkCallback) {
    }

    public static void setNetworkStatus(boolean bl) {
    }

    public static long getAppPackManagerPointer() {
        return 0L;
    }

    public static void setNeedTryConnect(boolean bl) {
    }

    public static void setLDMConfig(SDKInitializeInfo sDKInitializeInfo) {
    }

    private static native boolean native_initialize(InitializeInfo var0, byte[] var1, JNIProductConnectionCallback var2);

    private static native void native_uninitialize();

    private static native void native_setComponentConnectionListener(int var0, JNIComponentConnectionCallback var1);

    private static native boolean native_setSurface(int var0, int var1, int var2, Surface var3);

    private static native boolean native_setMockSurface(int var0, int var1, int var2, Surface var3);

    private static native boolean native_clearSurface(int var0, int var1);

    private static native void native_startVideoDataListener(int var0, int var1, JNIVideoDataCallback var2);

    private static native void native_stopVideoDataListener(int var0, int var1);

    private static native void native_startAudioDataListener(int var0, JNIAudioDataCallback var1);

    private static native void native_stopAudioDataListener(int var0);

    private static native byte[] native_getIFrame(int var0, int var1, byte[] var2);

    private static native void native_updateUserLoginInfo(UserAccountLoginInfo var0, JNIBoolCallback var1);

    private static native String native_getAppLocation();

    private static native void native_setAppLocation(byte[] var0);

    private static native void native_setNetworkHandler(INetworkHandler var0);

    private static native void native_setNetworkStatus(boolean var0);

    private static native void native_setTTSHandler(ITTSHandler var0);

    private static native void native_setTimeSyncRequestCallback(JNITimeSyncRequestCallback var0);

    private static native String native_getCSDKVersion();

    private static native long native_getAppPackManagerPointer();

    private static native void native_changeDatalinkV1ToUpgrade(int var0, JNIChangeDatalinkCallback var1);

    private static native void native_changeDatalinkUpgradeToV1(int var0, JNIChangeDatalinkCallback var1);

    private static native void native_SetNeedTryConnect(boolean var0);

    private static native void native_setLDMConfig(byte[] var0);

    static {
        LibraryLoader.load();
    }
}

