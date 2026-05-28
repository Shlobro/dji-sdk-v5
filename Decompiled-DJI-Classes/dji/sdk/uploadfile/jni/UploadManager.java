/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.uploadfile.jni;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.uploadfile.UploadFileDescInfo;
import dji.sdk.keyvalue.value.uploadfile.UploadFileInfo;
import dji.sdk.uploadfile.HasTaskObserver;
import dji.sdk.uploadfile.UploadFileCallback;
import java.util.List;

public class UploadManager
implements JNIProguardKeepTag {
    public static long startUploadFile(List<UploadFileInfo> list, UploadFileDescInfo uploadFileDescInfo, UploadFileCallback uploadFileCallback) {
        return 0L;
    }

    public static boolean cancelUploadFile(long l2) {
        return false;
    }

    public static long addHasTaskObserver(HasTaskObserver hasTaskObserver) {
        return 0L;
    }

    public static void removeHasTaskObserver(long l2) {
    }

    private static native long native_StartUploadFile(List<byte[]> var0, byte[] var1, UploadFileCallback var2);

    private static native boolean native_CancelUploadFile(long var0);

    private static native long native_AddHasTaskObserver(HasTaskObserver var0);

    private static native void native_RemoveHasTaskObserver(long var0);
}

