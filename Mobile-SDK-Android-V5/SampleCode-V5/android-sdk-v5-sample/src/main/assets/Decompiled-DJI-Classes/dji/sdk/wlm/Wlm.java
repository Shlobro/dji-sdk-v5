/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.wlm;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.wlm.LogLevel;
import dji.sdk.keyvalue.value.wlm.RadioType;

public class Wlm
implements JNIProguardKeepTag {
    public static void setConfigFilePath(String string) {
    }

    public static void setIpAddress(String string, String string2) {
    }

    public static void setIdentificationID(String string) {
    }

    public static void setRadioType(RadioType radioType) {
    }

    public static void setLogLevel(LogLevel logLevel) {
    }

    public static void setTestInfo(boolean bl, int n, int n2, int n3) {
    }

    private static native void native_SetConfigFilePath(String var0);

    private static native void native_SetIpAddress(String var0, String var1);

    private static native void native_SetIdentificationID(String var0);

    private static native void native_SetRadioType(int var0);

    private static native void native_SetLogLevel(int var0);

    private static native void native_SetTestInfo(boolean var0, int var1, int var2, int var3);
}

