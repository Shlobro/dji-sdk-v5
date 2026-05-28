/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.airlink;

import dji.jni.JNIProguardKeepTag;

public final class VideoFeedPhysicalSource
extends Enum<VideoFeedPhysicalSource>
implements JNIProguardKeepTag {
    public static final /* enum */ VideoFeedPhysicalSource MAIN_CAMERA = new VideoFeedPhysicalSource(0);
    public static final /* enum */ VideoFeedPhysicalSource FPV_CAMERA = new VideoFeedPhysicalSource(1);
    public static final /* enum */ VideoFeedPhysicalSource LB = new VideoFeedPhysicalSource(2);
    public static final /* enum */ VideoFeedPhysicalSource EXT = new VideoFeedPhysicalSource(3);
    public static final /* enum */ VideoFeedPhysicalSource HDMI = new VideoFeedPhysicalSource(4);
    public static final /* enum */ VideoFeedPhysicalSource AV = new VideoFeedPhysicalSource(5);
    public static final /* enum */ VideoFeedPhysicalSource LEFT_CAMERA = new VideoFeedPhysicalSource(6);
    public static final /* enum */ VideoFeedPhysicalSource RIGHT_CAMERA = new VideoFeedPhysicalSource(7);
    public static final /* enum */ VideoFeedPhysicalSource UP_CAMERA = new VideoFeedPhysicalSource(8);
    public static final /* enum */ VideoFeedPhysicalSource UNKNOWN = new VideoFeedPhysicalSource(65535);
    private int value;
    private static final VideoFeedPhysicalSource[] allValues;
    private static final /* synthetic */ VideoFeedPhysicalSource[] $VALUES;

    public static VideoFeedPhysicalSource[] values() {
        return null;
    }

    public static VideoFeedPhysicalSource valueOf(String string) {
        return null;
    }

    private VideoFeedPhysicalSource(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static VideoFeedPhysicalSource find(int n) {
        return null;
    }

    private static /* synthetic */ VideoFeedPhysicalSource[] $values() {
        return null;
    }

    static {
        $VALUES = VideoFeedPhysicalSource.$values();
        allValues = VideoFeedPhysicalSource.values();
    }
}

