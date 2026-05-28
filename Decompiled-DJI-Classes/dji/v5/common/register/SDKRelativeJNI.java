/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Keep
 */
package dji.v5.common.register;

import androidx.annotation.Keep;
import dji.v5.utils.common.LogUtils;

@Keep
public class SDKRelativeJNI {
    public static final String TAG = LogUtils.getTag("SDKRelativeJNI");

    private SDKRelativeJNI() {
    }

    public static native String native_getSDKConfigFileName();

    public static native int native_startRegistration(String var0, String var1, String var2, String var3, String var4);

    public static native int native_startRegistrationWithoutInternet(String var0, String var1, String var2, String var3);

    public static native boolean native_isSDKActivated();

    static {
        try {
            System.loadLibrary("DJIRegister");
        }
        catch (UnsatisfiedLinkError e2) {
            LogUtils.e(TAG, "loadLibrary:DJIRegister fail,!!!", e2.getMessage());
        }
    }
}

