/*
 * Decompiled with CFR 0.152.
 */
package dji.file.jni;

import dji.file.callback.WorkingInfoObserver;
import dji.file.jni.JNIFileDataCallback;
import dji.file.jni.JNIFileTaskCallback;
import dji.file.jni.JNIStreamInfoCallback;
import dji.file.jni.JNIWorkingInfoObserver;
import dji.jni.JNIProguardKeepTag;
import dji.jni.callback.key.JNIActionCallback;
import dji.sdk.keyvalue.value.file.FileActionRequest;
import dji.sdk.keyvalue.value.file.FileCacheRequest;
import dji.sdk.keyvalue.value.file.FileDataRequest;
import dji.sdk.keyvalue.value.file.FileListRequest;
import dji.sdk.keyvalue.value.file.FileLocationMsg;
import dji.sdk.keyvalue.value.file.FileTaskRequest;
import dji.sdk.keyvalue.value.file.StreamFileDataRequest;

public class JNIFile
implements JNIProguardKeepTag {
    private static native void native_file_transfer_list(int var0, int var1, byte[] var2, JNIActionCallback var3);

    private static native void native_file_transfer_data(int var0, int var1, byte[] var2, JNIFileDataCallback var3);

    private static native void native_stream_file_transfer_data(int var0, int var1, byte[] var2, JNIStreamInfoCallback var3, JNIFileDataCallback var4);

    private static native void native_file_cancel_transfer(int var0, int var1, JNIActionCallback var2);

    private static native void native_file_batch_action(int var0, int var1, byte[] var2, JNIActionCallback var3);

    private static native void native_set_working_info_observer(int var0, int var1, JNIWorkingInfoObserver var2);

    private static native void native_file_query_location(int var0, int var1, JNIActionCallback var2);

    public static void transferList(int n, int n2, FileListRequest fileListRequest, JNIActionCallback jNIActionCallback) {
    }

    public static void transferData(int n, int n2, FileDataRequest fileDataRequest, JNIFileDataCallback jNIFileDataCallback) {
    }

    public static void transferStreamData(int n, int n2, StreamFileDataRequest streamFileDataRequest, JNIStreamInfoCallback jNIStreamInfoCallback, JNIFileDataCallback jNIFileDataCallback) {
    }

    public static void cancelTransfer(int n, int n2, JNIActionCallback jNIActionCallback) {
    }

    public static void batchAction(int n, int n2, FileActionRequest fileActionRequest, JNIActionCallback jNIActionCallback) {
    }

    public static void setWorkingInfoObserver(int n, int n2, WorkingInfoObserver workingInfoObserver) {
    }

    public static void queryLocation(int n, int n2, JNIActionCallback jNIActionCallback) {
    }

    private static native void native_file_task_push_front(int var0, int var1, byte[] var2, JNIFileTaskCallback var3);

    private static native void native_file_task_push_back(int var0, int var1, byte[] var2, JNIFileTaskCallback var3);

    private static native void native_file_task_try_sync(int var0, int var1, byte[] var2, JNIFileTaskCallback var3, JNIActionCallback var4);

    private static native void native_file_task_cancel(int var0, int var1, byte[] var2, boolean var3, JNIActionCallback var4);

    private static native void native_file_task_defer_execute(int var0, int var1, int var2, JNIActionCallback var3);

    private static native void native_file_task_suspend_queue(int var0, int var1, boolean var2, JNIActionCallback var3);

    public static void taskPushFront(int n, int n2, FileTaskRequest fileTaskRequest, JNIFileTaskCallback jNIFileTaskCallback) {
    }

    public static void taskPushBack(int n, int n2, FileTaskRequest fileTaskRequest, JNIFileTaskCallback jNIFileTaskCallback) {
    }

    public static void taskTrySync(int n, int n2, FileTaskRequest fileTaskRequest, JNIFileTaskCallback jNIFileTaskCallback, JNIActionCallback jNIActionCallback) {
    }

    public static void taskCancel(int n, int n2, FileTaskRequest fileTaskRequest, boolean bl, JNIActionCallback jNIActionCallback) {
    }

    public static void taskDeferExecute(int n, int n2, int n3, JNIActionCallback jNIActionCallback) {
    }

    public static void taskSuspendQueue(int n, int n2, boolean bl, JNIActionCallback jNIActionCallback) {
    }

    private static native void native_file_cache_action(int var0, int var1, byte[] var2, JNIActionCallback var3);

    private static native int native_file_cache_attach(int var0, int var1, byte[] var2, JNIActionCallback var3);

    private static native void native_file_cache_detach(int var0, int var1, int var2);

    public static void cacheAction(int n, int n2, FileCacheRequest fileCacheRequest, JNIActionCallback jNIActionCallback) {
    }

    public static int cacheAttach(int n, int n2, FileLocationMsg fileLocationMsg, JNIActionCallback jNIActionCallback) {
        return 0;
    }

    public static void cacheDetach(int n, int n2, int n3) {
    }
}

