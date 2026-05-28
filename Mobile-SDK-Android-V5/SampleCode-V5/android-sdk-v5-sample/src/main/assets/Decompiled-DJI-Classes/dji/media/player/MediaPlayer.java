/*
 * Decompiled with CFR 0.152.
 */
package dji.media.player;

import dji.media.player.jni.PlaybackAudioCallback;
import dji.media.player.jni.PlaybackStateCallback;
import dji.media.player.jni.PlaybackVideoCallback;
import dji.sdk.common.RetCodeCallback;
import dji.sdk.keyvalue.value.common.ComponentIndexType;
import dji.sdk.keyvalue.value.common.DoubleMsg;
import dji.sdk.keyvalue.value.media.VideoPlayInfo;
import java.util.HashMap;
import java.util.Map;

public class MediaPlayer {
    private static final String TAG = "[MediaPlayer] ";
    private static final String TaskManagerKeyInfix = "-PlayerKey-";
    private static Map<String, MediaPlayer> playerRecorder = new HashMap<String, MediaPlayer>();
    private int productId;
    private int deviceId;
    private int cameraIndex;

    private MediaPlayer() {
    }

    private MediaPlayer(int n, int n2, int n3) {
    }

    public static MediaPlayer getInstance() {
        return null;
    }

    public static MediaPlayer getInstance(ComponentIndexType componentIndexType) {
        return null;
    }

    public static MediaPlayer getInstance(int n, int n2, ComponentIndexType componentIndexType) {
        return null;
    }

    public void preparePlayData(VideoPlayInfo videoPlayInfo, RetCodeCallback retCodeCallback) {
    }

    public void playVideo(RetCodeCallback retCodeCallback) {
    }

    public void resumeVideo(RetCodeCallback retCodeCallback) {
    }

    public void pauseVideo(RetCodeCallback retCodeCallback) {
    }

    public void stopVideo(RetCodeCallback retCodeCallback) {
    }

    public void seekVideo(DoubleMsg doubleMsg, RetCodeCallback retCodeCallback) {
    }

    public void setVideoObserver(PlaybackVideoCallback playbackVideoCallback) {
    }

    public void setAudioObserver(PlaybackAudioCallback playbackAudioCallback) {
    }

    public void setStateObserver(PlaybackStateCallback playbackStateCallback) {
    }

    public void cancelVideoAudioObserver() {
    }

    public void cancelStateObserver() {
    }
}

