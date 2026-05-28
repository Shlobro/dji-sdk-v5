/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk;

import dji.jni.callback.JNIDatalinkBridgeCallback;

public class DatalinkBridge {
    private static volatile DatalinkBridge mInstance;
    private JNIDatalinkBridgeCallback callback;

    public JNIDatalinkBridgeCallback getCallback() {
        return null;
    }

    public void setCallback(JNIDatalinkBridgeCallback jNIDatalinkBridgeCallback) {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static DatalinkBridge get() {
        return null;
    }

    public void receiveRawData(byte[] byArray, int n) {
    }

    private native void native_set_bridge_callback(JNIDatalinkBridgeCallback var1);

    private native void native_receive_data(byte[] var1, int var2);

    static {
        try {
            System.loadLibrary("djisdk_jni");
        }
        catch (UnsatisfiedLinkError e2) {
            e2.printStackTrace();
        }
        mInstance = null;
    }
}

