/*
 * Decompiled with CFR 0.152.
 */
package dji.flysafe.jni;

import dji.jni.JNIProguardKeepTag;
import dji.jni.callback.JNIBoolCallback;
import dji.jni.callback.JNIBytesCallback;
import dji.jni.callback.JNIRetCodeCallback;
import dji.jni.callback.JNIStringCallback;
import dji.sdk.keyvalue.value.common.LocationCoordinate2D;

public class JNIFlysafe
implements JNIProguardKeepTag {
    private static native void native_GetShowingAreas(int var0, int var1, JNIBytesCallback var2);

    private static native void native_FetchLimitAreas(int var0, int var1, byte[] var2, int var3, boolean var4, JNIBytesCallback var5);

    private static native void native_UnlockLimitAreasAndEnableLicense(int var0, int var1, int[] var2, JNIRetCodeCallback var3);

    private static native void native_DownloadLicenseFromServerToLocal(int var0, int var1, JNIRetCodeCallback var2, JNIBytesCallback var3);

    private static native void native_GetLocalLicense(int var0, int var1, JNIBytesCallback var2);

    private static native void native_UploadLocalLicenseToFC(int var0, int var1, JNIRetCodeCallback var2);

    private static native void native_UploadLocalLicenseToFC(int var0, int var1, int var2, JNIRetCodeCallback var3);

    private static native void native_QueryLicenseFromFC(int var0, int var1, JNIRetCodeCallback var2, JNIBytesCallback var3);

    private static native void native_SetLicenseEnable(int var0, int var1, boolean var2, int var3, JNIRetCodeCallback var4);

    private static native void native_QueryPreciseDBVersion(int var0, int var1, JNIStringCallback var2);

    private static native void native_ReplacePreciseDBFile(int var0, int var1, String var2, JNIBoolCallback var3);

    private static native void native_SetPreciseDBVersionChangedCallback(int var0, int var1, JNIStringCallback var2);

    public static void getShowingAreas(int n, int n2, JNIBytesCallback jNIBytesCallback) {
    }

    public static void fetchLimitAreas(int n, int n2, LocationCoordinate2D locationCoordinate2D, int n3, boolean bl, JNIBytesCallback jNIBytesCallback) {
    }

    public static void unlockLimitAreasAndEnableLicense(int n, int n2, int[] nArray, JNIRetCodeCallback jNIRetCodeCallback) {
    }

    public static void downloadLicenseFromServerToLocal(int n, int n2, JNIRetCodeCallback jNIRetCodeCallback, JNIBytesCallback jNIBytesCallback) {
    }

    public static void getLocalLicense(int n, int n2, JNIBytesCallback jNIBytesCallback) {
    }

    public static void uploadLocalLicenseToFC(int n, int n2, JNIRetCodeCallback jNIRetCodeCallback) {
    }

    public static void uploadLocalLicenseToFC(int n, int n2, int n3, JNIRetCodeCallback jNIRetCodeCallback) {
    }

    public static void setLicenseEnable(int n, int n2, boolean bl, int n3, JNIRetCodeCallback jNIRetCodeCallback) {
    }

    public static void queryPreciseDBVersion(int n, int n2, JNIStringCallback jNIStringCallback) {
    }

    public static void queryLicenseFromFC(int n, int n2, JNIRetCodeCallback jNIRetCodeCallback, JNIBytesCallback jNIBytesCallback) {
    }

    public static void replacePreciseDBFile(int n, int n2, String string2, JNIBoolCallback jNIBoolCallback) {
    }

    public static void setPreciseDBVersionChangedCallback(int n, int n2, JNIStringCallback jNIStringCallback) {
    }
}

