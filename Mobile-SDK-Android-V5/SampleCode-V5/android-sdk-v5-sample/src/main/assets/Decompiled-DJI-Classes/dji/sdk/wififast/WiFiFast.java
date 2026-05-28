/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.wififast;

import dji.jni.JNIProguardKeepTag;
import dji.jni.callback.ResultCodeCallback;
import dji.sdk.wififast.PhoneConnectStateCallback;
import dji.sdk.wififast.WiFiDataLinkConnectStateCallback;
import dji.sdk.wififast.WiFiFastStateCallback;

public class WiFiFast
implements JNIProguardKeepTag {
    public static long addWiFiFastStateObserver(WiFiFastStateCallback wiFiFastStateCallback) {
        return 0L;
    }

    public static void removeWiFiFastStateObserver(long l2) {
    }

    public static long addPhoneConnectStateObserver(PhoneConnectStateCallback phoneConnectStateCallback) {
        return 0L;
    }

    public static void removePhoneConnectStateObserver(long l2) {
    }

    public static long addWiFiDataLinkConnectStateObserver(WiFiDataLinkConnectStateCallback wiFiDataLinkConnectStateCallback) {
        return 0L;
    }

    public static void removeWiFiDataLinkConnectStateObserver(long l2) {
    }

    public static boolean isInWiFiFast() {
        return false;
    }

    public static boolean isPhoneConnectedToDevice() {
        return false;
    }

    public static boolean isWiFiDataLinkConnected() {
        return false;
    }

    public static void wakeWiFi(ResultCodeCallback resultCodeCallback) {
    }

    public static void enterWiFiFast(ResultCodeCallback resultCodeCallback) {
    }

    public static void exitWiFiFast(ResultCodeCallback resultCodeCallback) {
    }

    private static native long native_AddWiFiFastStateObserver(WiFiFastStateCallback var0);

    private static native void native_RemoveWiFiFastStateObserver(long var0);

    private static native long native_AddPhoneConnectStateObserver(PhoneConnectStateCallback var0);

    private static native void native_RemovePhoneConnectStateObserver(long var0);

    private static native long native_AddWiFiDataLinkConnectStateObserver(WiFiDataLinkConnectStateCallback var0);

    private static native void native_RemoveWiFiDataLinkConnectStateObserver(long var0);

    private static native boolean native_IsInWiFiFast();

    private static native boolean native_IsPhoneConnectedToDevice();

    private static native boolean native_IsWiFiDataLinkConnected();

    private static native void native_WakeWiFi(ResultCodeCallback var0);

    private static native void native_EnterWiFiFast(ResultCodeCallback var0);

    private static native void native_ExitWiFiFast(ResultCodeCallback var0);
}

