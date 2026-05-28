/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.pigeoniframe;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.common.VideoStreamType;

public class PigeonIFrameControlManager
implements JNIProguardKeepTag {
    public static boolean parseVideoFrameAsssitantInfo(long l2, long l3, int n, long l4, VideoStreamType videoStreamType) {
        return false;
    }

    public static boolean parseVideoFrameAsssitantInfoWithoutRequest(long l2, long l3, int n, VideoStreamType videoStreamType) {
        return false;
    }

    public static boolean isNeedFitFrameWidth(long l2) {
        return false;
    }

    public static void syncDecoderStatus(long l2, boolean bl) {
    }

    public static void decodingDidSucceedWithTimestamp(long l2, int n) {
    }

    public static void decodingDidFailInDecoder(long l2) {
    }

    public static void decodingDidFailed(long l2) {
    }

    public static long getCurrentTimestampFromRc(long l2) {
        return 0L;
    }

    public static void sendLiveviewTimestampDelay(long l2, int n) {
    }

    private static native boolean native_ParseVideoFrameAsssitantInfo(long var0, long var2, int var4, long var5, int var7);

    private static native boolean native_ParseVideoFrameAsssitantInfoWithoutRequest(long var0, long var2, int var4, int var5);

    private static native boolean native_IsNeedFitFrameWidth(long var0);

    private static native void native_SyncDecoderStatus(long var0, boolean var2);

    private static native void native_DecodingDidSucceedWithTimestamp(long var0, int var2);

    private static native void native_DecodingDidFailInDecoder(long var0);

    private static native void native_DecodingDidFailed(long var0);

    private static native long native_GetCurrentTimestampFromRc(long var0);

    private static native void native_SendLiveviewTimestampDelay(long var0, int var2);
}

