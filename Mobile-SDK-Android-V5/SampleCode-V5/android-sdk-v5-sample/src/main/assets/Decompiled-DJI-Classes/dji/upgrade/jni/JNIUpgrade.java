/*
 * Decompiled with CFR 0.152.
 */
package dji.upgrade.jni;

import dji.jni.JNIProguardKeepTag;
import dji.jni.callback.key.JNIActionCallback;
import dji.sdk.jni.LibraryLoader;
import dji.upgrade.jni.JNIDeviceInfoCallback;
import dji.upgrade.jni.JNIQueryModuleVersionCallback;
import dji.upgrade.jni.JNISetVersionConfigCallback;
import dji.upgrade.jni.JNIUpgradeIntCallback;
import dji.upgrade.jni.JNIUpgradeStatusCallback;
import dji.upgrade.jni.JNIVersionConfigCallback;

public class JNIUpgrade
implements JNIProguardKeepTag {
    public static native void native_set_upgrade_observer(int var0, byte[] var1, JNIUpgradeStatusCallback var2, JNIActionCallback var3);

    public static native void native_cancel_upgrade_observer(int var0, byte[] var1, JNIActionCallback var2);

    public static native void native_set_upgrade_hot_plugin_observer(int var0, byte[] var1, JNIUpgradeStatusCallback var2, JNIActionCallback var3);

    public static native void native_cancel_upgrade_hot_plugin_observer(int var0, byte[] var1, JNIActionCallback var2);

    public static native void native_start_upgrade(int var0, byte[] var1, String var2, JNIActionCallback var3);

    public static native void native_get_version_config(int var0, byte[] var1, JNIVersionConfigCallback var2);

    public static native void native_get_device_info(int var0, byte[] var1, JNIDeviceInfoCallback var2);

    public static native void native_set_version_config(int var0, byte[] var1, byte[] var2, JNISetVersionConfigCallback var3);

    public static native void native_get_charge_remaining_in_persent(int var0, byte[] var1, JNIUpgradeIntCallback var2);

    public static native void native_set_block_num_once_ack(int var0, byte[] var1, int var2, JNIActionCallback var3);

    public static native void native_firmware_md5_verify(int var0, byte[] var1, byte[] var2, JNIActionCallback var3);

    public static native void native_query_module_version(int var0, int var1, int var2, JNIQueryModuleVersionCallback var3);

    static {
        LibraryLoader.load();
    }
}

