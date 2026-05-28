/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.media;

import dji.jni.JNIProguardKeepTag;

public final class PlaybackStatus
extends Enum<PlaybackStatus>
implements JNIProguardKeepTag {
    public static final /* enum */ PlaybackStatus PREPARED = new PlaybackStatus(0);
    public static final /* enum */ PlaybackStatus PLAYING = new PlaybackStatus(1);
    public static final /* enum */ PlaybackStatus PAUSED = new PlaybackStatus(2);
    public static final /* enum */ PlaybackStatus ENDED = new PlaybackStatus(3);
    public static final /* enum */ PlaybackStatus STOPPED = new PlaybackStatus(4);
    public static final /* enum */ PlaybackStatus BUFFERING = new PlaybackStatus(5);
    public static final /* enum */ PlaybackStatus UNKNOWN = new PlaybackStatus(65535);
    private int value;
    private static final PlaybackStatus[] allValues;
    private static final /* synthetic */ PlaybackStatus[] $VALUES;

    public static PlaybackStatus[] values() {
        return null;
    }

    public static PlaybackStatus valueOf(String string) {
        return null;
    }

    private PlaybackStatus(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static PlaybackStatus find(int n) {
        return null;
    }

    private static /* synthetic */ PlaybackStatus[] $values() {
        return null;
    }

    static {
        $VALUES = PlaybackStatus.$values();
        allValues = PlaybackStatus.values();
    }
}

