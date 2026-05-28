/*
 * Decompiled with CFR 0.152.
 */
package dji.flightrecord.jni;

import dji.flightrecord.jni.JNIFileEventCallback;
import dji.flightrecord.jni.JNIRecoveryEventCallback;
import dji.jni.JNIProguardKeepTag;
import dji.jni.callback.JNIBoolCallback;
import dji.sdk.common.BoolCallback;

public class JNIFlightRecord
implements JNIProguardKeepTag {
    public static void setFileEventCallback(JNIFileEventCallback jNIFileEventCallback) {
    }

    public static void setRecoveryEventCallback(JNIRecoveryEventCallback jNIRecoveryEventCallback) {
    }

    public static void updateUserID(String string2) {
    }

    public static void updateAppVersion(byte[] byArray) {
    }

    public static void updateAppShootPhoto(int n) {
    }

    public static void updateAppSnapShot(byte[] byArray, byte[] byArray2) {
    }

    public static void updateAppRecordVideoStart() {
    }

    public static void updateAppRecordVideoEnd(int n) {
    }

    public static void updateAppMobileDeviceLocation(double[] dArray) {
    }

    public static void updateAppOperation(int n, int n2) {
    }

    public static void updateRemoteControllerSN(String string2) {
    }

    public static void updateAppBusinessData(byte[] byArray) {
    }

    public static String getFlightRecordDirPath() {
        return null;
    }

    public static boolean writeTlvFrameData(int n, int n2, byte[] byArray, boolean bl) {
        return false;
    }

    public static boolean writeTlvSummaryData(int n, int n2, byte[] byArray, boolean bl) {
        return false;
    }

    public static int addWriteStateObserver(BoolCallback boolCallback) {
        return 0;
    }

    public static void removeWriteStateObserver(int n) {
    }

    public static boolean setFlightRecordDirPath(String string2) {
        return false;
    }

    public static void setRecordUnderSimulator(boolean bl) {
    }

    public static void updateAppForegroundBackgroundChange(int n) {
    }

    public static void updateAppShowTipsPopedUp(String string2) {
    }

    public static void updateAppWarning(String string2) {
    }

    public static void updateAppVisionWarning(String string2) {
    }

    public static void updateAppSeriousWarning(String string2) {
    }

    private static native void native_set_record_under_simulator(boolean var0);

    private static native int native_add_write_state_callback(JNIBoolCallback var0);

    private static native void native_remove_write_state_callback(int var0);

    private static native boolean native_write_tlv_frame_data(int var0, int var1, byte[] var2, boolean var3);

    private static native boolean native_write_tlv_summary_data(int var0, int var1, byte[] var2, boolean var3);

    private static native void native_update_app_version(byte[] var0);

    private static native void native_update_app_shoot_photo(int var0);

    private static native void native_update_app_snap_shot(byte[] var0, byte[] var1);

    private static native void native_update_app_record_video_start();

    private static native void native_update_app_record_video_end(int var0);

    private static native void native_update_app_mobile_device_location(double[] var0);

    private static native void native_update_app_operation(int var0, int var1);

    private static native void native_update_remote_controller_sn(String var0);

    private static native void native_update_app_business_data(byte[] var0);

    private static native void native_update_user_id(String var0);

    private static native void native_set_file_event_callback(JNIFileEventCallback var0);

    private static native void native_set_recovery_event_callback(JNIRecoveryEventCallback var0);

    private static native String native_get_flight_record_dir_path();

    private static native boolean native_set_flight_record_dir_path(String var0);

    private static native void native_update_app_foreground_background_change(int var0);

    private static native void native_update_app_show_tips_poped_up(String var0);

    private static native void native_update_app_warning(String var0);

    private static native void native_update_app_vision_warning(String var0);

    private static native void native_update_app_serious_warning(String var0);
}

