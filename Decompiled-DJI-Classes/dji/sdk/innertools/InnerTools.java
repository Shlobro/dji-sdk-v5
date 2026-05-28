/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.innertools;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.innertools.CmdWatchCallback;
import dji.sdk.innertools.MSDKKeyCallback;
import dji.sdk.keyvalue.value.common.StringListMsg;
import dji.sdk.keyvalue.value.innertool.AppCustomPushType;
import dji.sdk.keyvalue.value.innertool.CSDKRecordItemType;
import dji.sdk.keyvalue.value.innertool.DataType;
import dji.sdk.keyvalue.value.innertool.KeyLogConfig;
import dji.sdk.keyvalue.value.innertool.V1Filter;

public class InnerTools
implements JNIProguardKeepTag {
    public static void setDataRecordSavePath(String string) {
    }

    public static void setDataRecordNetworkInfo(String string, int n) {
    }

    public static void startRecord(DataType dataType, boolean bl) {
    }

    public static void stopRecord(DataType dataType, boolean bl) {
    }

    public static void setTcpServerInfo(String string, int n) {
    }

    public static void setUsbmuxdMode(boolean bl) {
    }

    public static void connectToTcpServer() {
    }

    public static void disconnectToTcpServer() {
    }

    public static boolean isConnectedToTcpServer() {
        return false;
    }

    public static void setCmdWatchFilter(V1Filter v1Filter) {
    }

    public static void setCmdWatchCallback(CmdWatchCallback cmdWatchCallback) {
    }

    public static void setKeyDumpConfig(KeyLogConfig keyLogConfig) {
    }

    public static KeyLogConfig getKeyDumpConfig() {
        return null;
    }

    public static boolean isKeyDumpSaveToFile() {
        return false;
    }

    public static void saveSendV1(byte[] byArray, long l2) {
    }

    public static void setV1BlacklistEnable(boolean bl) {
    }

    public static boolean getV1BlacklistEnable() {
        return false;
    }

    public static boolean adbDataLinkEnable() {
        return false;
    }

    public static void setAdbDataLinkEnable(boolean bl) {
    }

    public static void setMSDKKeyCallback(MSDKKeyCallback mSDKKeyCallback) {
    }

    public static void logKeyInfoToCDA(String string) {
    }

    public static void appCustomPush(AppCustomPushType appCustomPushType, String string) {
    }

    public static boolean innerToolsEnable() {
        return false;
    }

    public static boolean recordEnable(CSDKRecordItemType cSDKRecordItemType) {
        return false;
    }

    public static void setRecordEnable(CSDKRecordItemType cSDKRecordItemType, boolean bl) {
    }

    public static void setKeyBlacklistEnable(boolean bl) {
    }

    public static boolean getKeyBlacklistEnable() {
        return false;
    }

    public static void setKeyBlacklist(StringListMsg stringListMsg) {
    }

    private static native void native_SetDataRecordSavePath(String var0);

    private static native void native_SetDataRecordNetworkInfo(String var0, int var1);

    private static native void native_StartRecord(int var0, boolean var1);

    private static native void native_StopRecord(int var0, boolean var1);

    private static native void native_SetTcpServerInfo(String var0, int var1);

    private static native void native_SetUsbmuxdMode(boolean var0);

    private static native void native_ConnectToTcpServer();

    private static native void native_DisconnectToTcpServer();

    private static native boolean native_IsConnectedToTcpServer();

    private static native void native_SetCmdWatchFilter(byte[] var0);

    private static native void native_SetCmdWatchCallback(CmdWatchCallback var0);

    private static native void native_SetKeyDumpConfig(byte[] var0);

    private static native byte[] native_GetKeyDumpConfig();

    private static native boolean native_IsKeyDumpSaveToFile();

    private static native void native_SaveSendV1(byte[] var0, long var1);

    private static native void native_SetV1BlacklistEnable(boolean var0);

    private static native boolean native_GetV1BlacklistEnable();

    private static native boolean native_AdbDataLinkEnable();

    private static native void native_SetAdbDataLinkEnable(boolean var0);

    private static native void native_SetMSDKKeyCallback(MSDKKeyCallback var0);

    private static native void native_LogKeyInfoToCDA(String var0);

    private static native void native_AppCustomPush(int var0, String var1);

    private static native boolean native_InnerToolsEnable();

    private static native boolean native_RecordEnable(int var0);

    private static native void native_SetRecordEnable(int var0, boolean var1);

    private static native void native_SetKeyBlacklistEnable(boolean var0);

    private static native boolean native_GetKeyBlacklistEnable();

    private static native void native_SetKeyBlacklist(byte[] var0);
}

