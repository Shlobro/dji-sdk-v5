/*
 * Decompiled with CFR 0.152.
 */
package dji.media.jni;

import dji.jni.JNIProguardKeepTag;
import dji.jni.callback.JNIRetCodeCallback;
import dji.jni.callback.key.JNIActionCallback;
import dji.media.jni.callback.JNIFilelistStateCallback;
import dji.media.jni.callback.JNIPlaybackAudioCallback;
import dji.media.jni.callback.JNIPlaybackStateCallback;
import dji.media.jni.callback.JNIPlaybackVideoCallback;

public class JNIMedia
implements JNIProguardKeepTag {
    public static void listenPlayBackVideoData(int n, int n2, JNIPlaybackVideoCallback jNIPlaybackVideoCallback) {
    }

    public static void listenPlayBackAudioData(int n, int n2, JNIPlaybackAudioCallback jNIPlaybackAudioCallback) {
    }

    public static void cancelListenPlayBack(int n, int n2) {
    }

    public static void preparePlayData(int n, int n2, byte[] byArray, JNIActionCallback jNIActionCallback) {
    }

    public static void playVideo(int n, int n2, byte[] byArray, JNIActionCallback jNIActionCallback) {
    }

    public static void resumeVideo(int n, int n2, byte[] byArray, JNIActionCallback jNIActionCallback) {
    }

    public static void pauseVideo(int n, int n2, byte[] byArray, JNIActionCallback jNIActionCallback) {
    }

    public static void stopVideo(int n, int n2, byte[] byArray, JNIRetCodeCallback jNIRetCodeCallback) {
    }

    public static void seekVideo(int n, int n2, byte[] byArray, JNIActionCallback jNIActionCallback) {
    }

    public static void listenPlayBackState(int n, int n2, JNIPlaybackStateCallback jNIPlaybackStateCallback) {
    }

    public static void stopListenPlayBackState(int n, int n2) {
    }

    public static void listenFileListState(int n, int n2, JNIFilelistStateCallback jNIFilelistStateCallback) {
    }

    public static void stopListenFileListState(int n, int n2) {
    }

    private static native void native_file_list_state_observer(int var0, int var1, JNIFilelistStateCallback var2);

    private static native void native_cancel_file_list_state_observer(int var0, int var1);

    private static native void native_playback_video_observer(int var0, int var1, JNIPlaybackVideoCallback var2);

    private static native void native_playback_audio_observer(int var0, int var1, JNIPlaybackAudioCallback var2);

    private static native void native_cancel_playback_data_observer(int var0, int var1);

    private static native void native_playback_state_observer(int var0, int var1, JNIPlaybackStateCallback var2);

    private static native void native_cancel_playback_state_observer(int var0, int var1);

    private static native void native_play_video(int var0, int var1, byte[] var2, JNIActionCallback var3);

    private static native void native_prepare_play_data(int var0, int var1, byte[] var2, JNIActionCallback var3);

    private static native void native_resume_video(int var0, int var1, JNIActionCallback var2);

    private static native void native_pause_video(int var0, int var1, JNIActionCallback var2);

    private static native void native_stop_video(int var0, int var1, JNIRetCodeCallback var2);

    private static native void native_seek_video(int var0, int var1, byte[] var2, JNIActionCallback var3);

    private static native String native_get_file_list_state(int var0, int var1);
}

