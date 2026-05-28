/*
 * Decompiled with CFR 0.152.
 */
package dji.activate.jni;

import dji.activate.jni.JNIActivateConnectionStateCallback;
import dji.activate.jni.JNIActivateDataBufferCallback;
import dji.activate.jni.JNIActivateModuleInfoCallback;
import dji.activate.jni.JNIActivateStateInfoCallback;
import dji.activate.jni.JNIDeActivateDataBufferCallback;
import dji.jni.JNIProguardKeepTag;
import dji.jni.callback.key.JNIActionCallback;
import dji.jni.callback.key.JNIGetCallback;
import dji.jni.callback.key.JNISetCallback;

public class JNIActivate
implements JNIProguardKeepTag {
    public static native void native_get_activate_state(int var0, byte[] var1, JNIActivateStateInfoCallback var2);

    public static native void native_register_activate_observer(int var0, byte[] var1, JNIActivateDataBufferCallback var2, JNISetCallback var3);

    public static native void native_unregister_activate_observer(int var0, byte[] var1, JNISetCallback var2);

    public static native void native_register_activate_state_observer(int var0, byte[] var1, JNIActivateModuleInfoCallback var2, JNISetCallback var3);

    public static native void native_unregister_activate_state_observer(int var0, byte[] var1, JNISetCallback var2);

    public static native void native_set_activate_data(int var0, byte[] var1, byte[] var2, JNISetCallback var3);

    public static native void native_action_deactivate_request(int var0, byte[] var1, JNIDeActivateDataBufferCallback var2);

    public static native void native_set_deactivate_data(int var0, byte[] var1, byte[] var2, JNISetCallback var3);

    public static native void native_set_activate_state(int var0, byte[] var1, byte[] var2, JNISetCallback var3);

    public static native void native_set_activate_connect_state_observer(JNIActivateConnectionStateCallback var0, JNISetCallback var1);

    public static native void native_get_firmware_version(int var0, JNIGetCallback var1);

    public static native void native_get_serial_number(int var0, JNIGetCallback var1);

    public static native void native_set_camera_language(int var0, byte[] var1, JNISetCallback var2);

    public static native void native_cancel_activation(int var0, byte[] var1, JNIActionCallback var2);

    public static native void native_get_device_used_times(int var0, JNIGetCallback var1);

    public static native void native_reboot_device(int var0, byte[] var1, JNIActionCallback var2);
}

