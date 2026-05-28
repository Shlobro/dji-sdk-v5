/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.hmslog.jni;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.hmslog.HMSCodeModuleMapLoadCallback;
import dji.sdk.hmslog.HMSLogDownloadCallback;
import dji.sdk.hmslog.HMSLogDownloadStateUpadateCallback;
import dji.sdk.hmslog.HMSLogFetchListCallback;
import dji.sdk.hmslog.HMSLogUserLockCheckCallback;
import dji.sdk.hmslog.HMSLogUserLockResultCallback;
import dji.sdk.keyvalue.value.hmslog.HMSLogDownloadRequest;
import dji.sdk.keyvalue.value.hmslog.HMSLogFetchListRequest;
import dji.sdk.keyvalue.value.hmslog.HMSLogFileInfo;
import dji.sdk.keyvalue.value.hmslog.HMSLogLockInfo;
import java.util.List;

public class HMSLogManager
implements JNIProguardKeepTag {
    public static boolean checkSupportedHMSLog(long l2, long l3) {
        return false;
    }

    public static void setupHMSLogSavePath(String string) {
    }

    public static void loadHMSCodeModuleMapPath(String string, HMSCodeModuleMapLoadCallback hMSCodeModuleMapLoadCallback) {
    }

    public static long fetchHMSLogList(long l2, long l3, HMSLogFetchListRequest hMSLogFetchListRequest, HMSLogFetchListCallback hMSLogFetchListCallback) {
        return 0L;
    }

    public static void stopFetchHMSLogList(long l2, long l3, long l4, HMSLogFetchListRequest hMSLogFetchListRequest) {
    }

    public static HMSLogDownloadRequest makeHMSLogDownloadRequest(HMSLogFileInfo hMSLogFileInfo) {
        return null;
    }

    public static HMSLogDownloadRequest makeHMSLogDownloadRequest(HMSLogFileInfo hMSLogFileInfo, boolean bl) {
        return null;
    }

    public static HMSLogDownloadRequest makeHMSLogDownloadRequest(HMSLogFileInfo hMSLogFileInfo, boolean bl, String string) {
        return null;
    }

    public static void startHMSLogDownload(long l2, long l3, HMSLogDownloadRequest hMSLogDownloadRequest, HMSLogDownloadCallback hMSLogDownloadCallback) {
    }

    public static long addDownloadHMSLogUpdateCallback(long l2, long l3, HMSLogDownloadRequest hMSLogDownloadRequest, HMSLogDownloadStateUpadateCallback hMSLogDownloadStateUpadateCallback) {
        return 0L;
    }

    public static void removeDownloadHMSLogUpdateCallback(long l2, long l3, long l4) {
    }

    public static void stopHMSLogDownload(long l2, long l3, HMSLogDownloadRequest hMSLogDownloadRequest) {
    }

    public static List<HMSLogFileInfo> fetchLocalHMSLogList(HMSLogFetchListRequest hMSLogFetchListRequest) {
        return null;
    }

    public static boolean checkHMSLogLocalExist(HMSLogFileInfo hMSLogFileInfo, boolean bl) {
        return false;
    }

    public static boolean checkHMSLogLocalExist(HMSLogFileInfo hMSLogFileInfo) {
        return false;
    }

    public static void checkHMSLogUserLockSupported(long l2, long l3, HMSLogUserLockCheckCallback hMSLogUserLockCheckCallback) {
    }

    public static void lockHMSLogByUser(long l2, long l3, HMSLogLockInfo hMSLogLockInfo, HMSLogUserLockResultCallback hMSLogUserLockResultCallback) {
    }

    public static void unLockHMSLogByUser(long l2, long l3, long l4, HMSLogUserLockResultCallback hMSLogUserLockResultCallback) {
    }

    private static native boolean native_CheckSupportedHMSLog(long var0, long var2);

    private static native void native_SetupHMSLogSavePath(String var0);

    private static native void native_LoadHMSCodeModuleMapPath(String var0, HMSCodeModuleMapLoadCallback var1);

    private static native long native_FetchHMSLogList(long var0, long var2, byte[] var4, HMSLogFetchListCallback var5);

    private static native void native_StopFetchHMSLogList(long var0, long var2, long var4, byte[] var6);

    private static native byte[] native_MakeHMSLogDownloadRequest(byte[] var0);

    private static native byte[] native_MakeHMSLogDownloadRequest(byte[] var0, boolean var1);

    private static native byte[] native_MakeHMSLogDownloadRequest(byte[] var0, boolean var1, String var2);

    private static native void native_StartHMSLogDownload(long var0, long var2, byte[] var4, HMSLogDownloadCallback var5);

    private static native long native_AddDownloadHMSLogUpdateCallback(long var0, long var2, byte[] var4, HMSLogDownloadStateUpadateCallback var5);

    private static native void native_RemoveDownloadHMSLogUpdateCallback(long var0, long var2, long var4);

    private static native void native_StopHMSLogDownload(long var0, long var2, byte[] var4);

    private static native List<byte[]> native_FetchLocalHMSLogList(byte[] var0);

    private static native boolean native_CheckHMSLogLocalExist(byte[] var0, boolean var1);

    private static native boolean native_CheckHMSLogLocalExist(byte[] var0);

    private static native void native_CheckHMSLogUserLockSupported(long var0, long var2, HMSLogUserLockCheckCallback var4);

    private static native void native_LockHMSLogByUser(long var0, long var2, byte[] var4, HMSLogUserLockResultCallback var5);

    private static native void native_UnLockHMSLogByUser(long var0, long var2, long var4, HMSLogUserLockResultCallback var6);
}

