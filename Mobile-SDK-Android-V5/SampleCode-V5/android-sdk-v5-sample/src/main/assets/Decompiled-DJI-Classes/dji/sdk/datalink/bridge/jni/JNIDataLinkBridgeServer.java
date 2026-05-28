/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.datalink.bridge.jni;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.datalink.bridge.DataLinkBridgeServerCallback;

public class JNIDataLinkBridgeServer
implements JNIProguardKeepTag {
    public static void setCallback(DataLinkBridgeServerCallback dataLinkBridgeServerCallback) {
    }

    public static native boolean native_bridge_send_raw_data(String var0, byte[] var1, int var2);

    public static native void native_data_link_bridge_server_set_callback(DataLinkBridgeServerCallback var0);

    static {
        try {
            System.loadLibrary("djisdk_jni");
        }
        catch (UnsatisfiedLinkError e2) {
            e2.printStackTrace();
        }
    }
}

