/*
 * Decompiled with CFR 0.152.
 */
package dji.media.player.jni;

import dji.jni.JNIProguardKeepTag;
import dji.media.player.jni.PlaybackAudioCallback;
import dji.media.player.jni.PlaybackStateCallback;
import dji.media.player.jni.PlaybackVideoCallback;
import dji.sdk.common.RetCodeCallback;
import dji.sdk.keyvalue.value.common.DoubleMsg;
import dji.sdk.keyvalue.value.media.VideoPlayInfo;

public class JNIMediaPlayer
implements JNIProguardKeepTag {
    public static void preparePlayData(int n, int n2, int n3, VideoPlayInfo videoPlayInfo, RetCodeCallback retCodeCallback) {
    }

    public static void playVideo(int n, int n2, int n3, RetCodeCallback retCodeCallback) {
    }

    public static void resumeVideo(int n, int n2, int n3, RetCodeCallback retCodeCallback) {
    }

    public static void pauseVideo(int n, int n2, int n3, RetCodeCallback retCodeCallback) {
    }

    public static void stopVideo(int n, int n2, int n3, RetCodeCallback retCodeCallback) {
    }

    public static void seekVideo(int n, int n2, int n3, DoubleMsg doubleMsg, RetCodeCallback retCodeCallback) {
    }

    public static void setVideoObserver(long l2, int n, int n2, PlaybackVideoCallback playbackVideoCallback) {
    }

    public static void setAudioObserver(long l2, int n, int n2, PlaybackAudioCallback playbackAudioCallback) {
    }

    public static void setStateObserver(long l2, int n, int n2, PlaybackStateCallback playbackStateCallback) {
    }

    public static void cancelVideoAudioObserver(long l2, int n, int n2) {
    }

    public static void cancelStateObserver(long l2, int n, int n2) {
    }

    private static native void native_PreparePlayData(int var0, int var1, int var2, byte[] var3, RetCodeCallback var4);

    private static native void native_PlayVideo(int var0, int var1, int var2, RetCodeCallback var3);

    private static native void native_ResumeVideo(int var0, int var1, int var2, RetCodeCallback var3);

    private static native void native_PauseVideo(int var0, int var1, int var2, RetCodeCallback var3);

    private static native void native_StopVideo(int var0, int var1, int var2, RetCodeCallback var3);

    private static native void native_SeekVideo(int var0, int var1, int var2, byte[] var3, RetCodeCallback var4);

    private static native void native_SetVideoObserver(long var0, int var2, int var3, PlaybackVideoCallback var4);

    private static native void native_SetAudioObserver(long var0, int var2, int var3, PlaybackAudioCallback var4);

    private static native void native_SetStateObserver(long var0, int var2, int var3, PlaybackStateCallback var4);

    private static native void native_CancelVideoAudioObserver(long var0, int var2, int var3);

    private static native void native_CancelStateObserver(long var0, int var2, int var3);
}

