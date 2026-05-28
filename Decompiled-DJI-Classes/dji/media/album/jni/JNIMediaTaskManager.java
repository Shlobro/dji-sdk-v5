/*
 * Decompiled with CFR 0.152.
 */
package dji.media.album.jni;

import dji.jni.JNIProguardKeepTag;
import dji.media.album.jni.FileActionCallback;
import dji.media.album.jni.FileTaskCallback;
import dji.sdk.common.RetCodeCallback;
import dji.sdk.keyvalue.value.file.FileActionRequest;
import dji.sdk.keyvalue.value.file.FileTaskRequest;

public class JNIMediaTaskManager
implements JNIProguardKeepTag {
    public static void fileTaskPushFront(int n, int n2, int n3, FileTaskRequest fileTaskRequest, FileTaskCallback fileTaskCallback) {
    }

    public static void fileTaskPushBack(long l2, int n, int n2, FileTaskRequest fileTaskRequest, FileTaskCallback fileTaskCallback) {
    }

    public static void fileTaskTrySync(long l2, int n, int n2, FileTaskRequest fileTaskRequest, FileTaskCallback fileTaskCallback, RetCodeCallback retCodeCallback) {
    }

    public static void fileTaskCancel(long l2, int n, int n2, FileTaskRequest fileTaskRequest, boolean bl, RetCodeCallback retCodeCallback) {
    }

    public static void fileTaskDeferExecute(long l2, int n, int n2, int n3, RetCodeCallback retCodeCallback) {
    }

    public static void fileTaskSuspendQueue(long l2, int n, int n2, boolean bl, RetCodeCallback retCodeCallback) {
    }

    public static void mediaFileBatchAction(long l2, int n, int n2, FileActionRequest fileActionRequest, FileActionCallback fileActionCallback) {
    }

    private static native void native_FileTaskPushFront(int var0, int var1, int var2, byte[] var3, FileTaskCallback var4);

    private static native void native_FileTaskPushBack(long var0, int var2, int var3, byte[] var4, FileTaskCallback var5);

    private static native void native_FileTaskTrySync(long var0, int var2, int var3, byte[] var4, FileTaskCallback var5, RetCodeCallback var6);

    private static native void native_FileTaskCancel(long var0, int var2, int var3, byte[] var4, boolean var5, RetCodeCallback var6);

    private static native void native_FileTaskDeferExecute(long var0, int var2, int var3, int var4, RetCodeCallback var5);

    private static native void native_FileTaskSuspendQueue(long var0, int var2, int var3, boolean var4, RetCodeCallback var5);

    private static native void native_MediaFileBatchAction(long var0, int var2, int var3, byte[] var4, FileActionCallback var5);
}

