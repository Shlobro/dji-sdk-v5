/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.payload;

import dji.sdk.keyvalue.value.payload.MegaphoneFileBitRate;
import dji.sdk.keyvalue.value.payload.MegaphonePosition;
import dji.sdk.keyvalue.value.payload.MegaphoneUploadFileType;
import dji.sdk.payload.callback.MegaphoneCancelCallback;
import dji.sdk.payload.callback.MegaphoneErrorCodeCallback;
import dji.sdk.payload.callback.MegaphoneUploadProgressCallback;

public class DJIMegaphoneManager {
    private static DJIMegaphoneManager instance = null;

    private DJIMegaphoneManager() {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static DJIMegaphoneManager getInstance() {
        return null;
    }

    public static void registerUploadListener(MegaphoneUploadProgressCallback megaphoneUploadProgressCallback) {
    }

    public static void unRegisterUploadListener() {
    }

    public static void startUpload(long l2, String string, String string2, MegaphoneUploadFileType megaphoneUploadFileType, Boolean bl, MegaphoneErrorCodeCallback megaphoneErrorCodeCallback) {
    }

    public static void startUpload(long l2, String string, String string2, MegaphoneUploadFileType megaphoneUploadFileType, MegaphoneFileBitRate megaphoneFileBitRate, Boolean bl, MegaphoneErrorCodeCallback megaphoneErrorCodeCallback) {
    }

    public static void finishUpload(byte[] byArray, MegaphoneErrorCodeCallback megaphoneErrorCodeCallback) {
    }

    public static void addUploadBuffer(byte[] byArray, int n, MegaphoneErrorCodeCallback megaphoneErrorCodeCallback) {
    }

    public static void cancelUpload(MegaphoneCancelCallback megaphoneCancelCallback) {
    }

    public static void setTargetPosition(MegaphonePosition megaphonePosition) {
    }
}

