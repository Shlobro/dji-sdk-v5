/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.payload.jni;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.payload.MegaphoneFileBitRate;
import dji.sdk.keyvalue.value.payload.MegaphonePosition;
import dji.sdk.keyvalue.value.payload.MegaphoneUploadFileType;
import dji.sdk.payload.callback.MegaphoneCancelCallback;
import dji.sdk.payload.callback.MegaphoneErrorCodeCallback;
import dji.sdk.payload.callback.MegaphoneUploadProgressCallback;

public class MegaphoneManager
implements JNIProguardKeepTag {
    public static void registerUploadListener(MegaphoneUploadProgressCallback megaphoneUploadProgressCallback) {
    }

    public static void unRegisterUploadListener() {
    }

    public static void startUpload(long l2, String string, String string2, MegaphoneUploadFileType megaphoneUploadFileType, boolean bl, MegaphoneErrorCodeCallback megaphoneErrorCodeCallback) {
    }

    public static void startUpload(long l2, String string, String string2, MegaphoneUploadFileType megaphoneUploadFileType, MegaphoneFileBitRate megaphoneFileBitRate, boolean bl, MegaphoneErrorCodeCallback megaphoneErrorCodeCallback) {
    }

    public static void finishUpload(byte[] byArray, MegaphoneErrorCodeCallback megaphoneErrorCodeCallback) {
    }

    public static void addUploadBuffer(byte[] byArray, int n, MegaphoneErrorCodeCallback megaphoneErrorCodeCallback) {
    }

    public static void cancelUpload(MegaphoneCancelCallback megaphoneCancelCallback) {
    }

    public static void setTargetPosition(MegaphonePosition megaphonePosition) {
    }

    private static native void native_RegisterUploadListener(MegaphoneUploadProgressCallback var0);

    private static native void native_UnRegisterUploadListener();

    private static native void native_StartUpload(long var0, String var2, String var3, int var4, boolean var5, MegaphoneErrorCodeCallback var6);

    private static native void native_StartUpload(long var0, String var2, String var3, int var4, int var5, boolean var6, MegaphoneErrorCodeCallback var7);

    private static native void native_FinishUpload(byte[] var0, MegaphoneErrorCodeCallback var1);

    private static native void native_AddUploadBuffer(byte[] var0, int var1, MegaphoneErrorCodeCallback var2);

    private static native void native_CancelUpload(MegaphoneCancelCallback var0);

    private static native void native_SetTargetPosition(int var0);
}

