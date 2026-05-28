/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class PlaybackMode
extends Enum<PlaybackMode>
implements JNIProguardKeepTag {
    public static final /* enum */ PlaybackMode SINGLE_IMAGE = new PlaybackMode(0);
    public static final /* enum */ PlaybackMode SINGLE_IMAGE_ZOOM_IN = new PlaybackMode(1);
    public static final /* enum */ PlaybackMode SINGLE_VIDEO_PLAY = new PlaybackMode(2);
    public static final /* enum */ PlaybackMode SINGLE_VIDEO_PAUSE = new PlaybackMode(3);
    public static final /* enum */ PlaybackMode MULTIPLE_IMAGE_DELETE = new PlaybackMode(4);
    public static final /* enum */ PlaybackMode MULTIPLE_IMAGES = new PlaybackMode(5);
    public static final /* enum */ PlaybackMode DOWNLOAD = new PlaybackMode(6);
    public static final /* enum */ PlaybackMode VIDEO_PLAYBACK_STOP = new PlaybackMode(7);
    public static final /* enum */ PlaybackMode MODE_ERROR = new PlaybackMode(255);
    public static final /* enum */ PlaybackMode UNKNOWN = new PlaybackMode(65535);
    private int value;
    private static final PlaybackMode[] allValues;
    private static final /* synthetic */ PlaybackMode[] $VALUES;

    public static PlaybackMode[] values() {
        return null;
    }

    public static PlaybackMode valueOf(String string) {
        return null;
    }

    private PlaybackMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static PlaybackMode find(int n) {
        return null;
    }

    private static /* synthetic */ PlaybackMode[] $values() {
        return null;
    }

    static {
        $VALUES = PlaybackMode.$values();
        allValues = PlaybackMode.values();
    }
}

