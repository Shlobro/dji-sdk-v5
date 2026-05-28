/*
 * Decompiled with CFR 0.152.
 */
package dji.v5.manager.datacenter.media;

public final class VideoPlayState
extends Enum<VideoPlayState> {
    public static final /* enum */ VideoPlayState IDLE = new VideoPlayState(0);
    public static final /* enum */ VideoPlayState PLAYING = new VideoPlayState(1);
    public static final /* enum */ VideoPlayState PAUSED = new VideoPlayState(2);
    public static final /* enum */ VideoPlayState ENDED = new VideoPlayState(3);
    public static final /* enum */ VideoPlayState STOPPED = new VideoPlayState(4);
    public static final /* enum */ VideoPlayState BUFFERING = new VideoPlayState(5);
    public static final /* enum */ VideoPlayState UNKNOWN = new VideoPlayState(65535);
    private int value;
    private static final VideoPlayState[] allValues;
    private static final /* synthetic */ VideoPlayState[] $VALUES;

    public static VideoPlayState[] values() {
        return null;
    }

    public static VideoPlayState valueOf(String string2) {
        return null;
    }

    private VideoPlayState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean _equals(int n) {
        return false;
    }

    public static VideoPlayState find(int n) {
        return null;
    }

    private static /* synthetic */ VideoPlayState[] $values() {
        return null;
    }

    static {
        $VALUES = VideoPlayState.$values();
        allValues = VideoPlayState.values();
    }
}

