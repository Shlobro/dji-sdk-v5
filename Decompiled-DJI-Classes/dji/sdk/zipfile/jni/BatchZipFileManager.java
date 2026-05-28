/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.zipfile.jni;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.zipfile.BatchZipFileInfo;
import dji.sdk.zipfile.BatchZipFileCallback;
import java.util.List;

public class BatchZipFileManager
implements JNIProguardKeepTag {
    public static long startBatchZip(List<BatchZipFileInfo> list, BatchZipFileCallback batchZipFileCallback) {
        return 0L;
    }

    public static boolean cancelBatchZip(long l2) {
        return false;
    }

    private static native long native_StartBatchZip(List<byte[]> var0, BatchZipFileCallback var1);

    private static native boolean native_CancelBatchZip(long var0);
}

