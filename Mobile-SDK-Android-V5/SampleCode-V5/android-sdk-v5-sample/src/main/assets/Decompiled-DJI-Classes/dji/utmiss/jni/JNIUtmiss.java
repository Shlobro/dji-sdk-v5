/*
 * Decompiled with CFR 0.152.
 */
package dji.utmiss.jni;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.jni.LibraryLoader;
import dji.utmiss.jni.callback.JNIUtmissOrderIDCallback;
import dji.utmiss.jni.callback.JNIUtmissUploadRecordCallback;
import dji.utmiss.jni.callback.JNIUtmissUploadStatusCallback;

public class JNIUtmiss
implements JNIProguardKeepTag {
    public static native int native_InitUtmissUpload(String var0);

    public static native void native_UninitUtmissUpload();

    public static native int native_SetUASId(String var0);

    public static native long native_AddUploadStatusObserver(JNIUtmissUploadStatusCallback var0);

    public static native void native_RemoveUploadStatusObserver(long var0);

    public static native void native_RegisterOrderIDObserver(JNIUtmissOrderIDCallback var0);

    public static native byte[] native_GetUploadStatus();

    public static native void native_GetUploadRecord(JNIUtmissUploadRecordCallback var0);

    public static native void native_SetUtmissSimulatorEnable(boolean var0);

    static {
        LibraryLoader.load();
    }
}

