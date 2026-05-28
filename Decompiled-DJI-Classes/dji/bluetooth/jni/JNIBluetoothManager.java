/*
 * Decompiled with CFR 0.152.
 */
package dji.bluetooth.jni;

import dji.bluetooth.jni.JNIBleActionHandler;
import dji.bluetooth.jni.JNIBleSendDataHandler;
import dji.bluetooth.jni.JNIBleStateCallback;
import dji.bluetooth.jni.JNIBleUpdateListCallback;
import dji.jni.JNIProguardKeepTag;
import dji.jni.callback.JNIRetCodeCallback;
import dji.jni.callback.JNIRetCodeWithValueCallback;
import dji.jni.callback.key.JNIGetCallback;
import dji.sdk.jni.LibraryLoader;

public final class JNIBluetoothManager
implements JNIProguardKeepTag {
    public static native void native_ReleaseResource();

    public static native void native_SetActionHandler(JNIBleActionHandler var0);

    public static native void native_SetSendDataHandler(JNIBleSendDataHandler var0);

    public static native void native_SetSendExternalHandler(JNIBleSendDataHandler var0);

    public static native void native_OnReceivedData(byte[] var0);

    public static native void native_OnBLEStateUpdate(int var0);

    public static native void native_OnBLEScanStateUpdate(boolean var0);

    public static native void native_OnDeviceListUpdate(byte[] var0);

    public static native void native_StartBleScan(double var0, JNIRetCodeCallback var2);

    public static native void native_StopBleScan(JNIRetCodeCallback var0);

    public static native void native_StartBleConnect(byte[] var0, JNIRetCodeCallback var1);

    public static native void native_StartBleDisconnect(JNIRetCodeCallback var0);

    public static native void native_SendExternalData(byte[] var0);

    public static native void native_SetBleStateListener(JNIBleStateCallback var0);

    public static native void native_GetBleState(JNIBleStateCallback var0);

    public static native void native_SetUpdateListCallback(JNIBleUpdateListCallback var0);

    public static native void native_GetWifiSsidThroughBle(JNIGetCallback var0);

    public static native void native_GetWifiMacThroughBle(JNIGetCallback var0);

    public static native void native_GetWifiPwdThroughBle(JNIGetCallback var0);

    public static native void native_BleVerifyDevice(String var0, String var1, int var2, JNIRetCodeCallback var3);

    public static native void native_BleCancelVerifyDevice(JNIRetCodeCallback var0);

    public static native void native_BleCancelVerifyDeviceEnable(JNIRetCodeCallback var0);

    public static native void native_StartAwakeBleDevice(String var0, int var1, JNIRetCodeCallback var2);

    public static native void native_StopAwakeBleDevice(JNIRetCodeCallback var0);

    public static native void native_SetCountryCodeThroughBle(String var0, JNIRetCodeCallback var1);

    public static native void native_getWiFiFrequencyBand(JNIRetCodeWithValueCallback var0);

    public static native void native_setWiFiFrequencyBand(int var0, JNIRetCodeCallback var1);

    static {
        LibraryLoader.load();
    }
}

