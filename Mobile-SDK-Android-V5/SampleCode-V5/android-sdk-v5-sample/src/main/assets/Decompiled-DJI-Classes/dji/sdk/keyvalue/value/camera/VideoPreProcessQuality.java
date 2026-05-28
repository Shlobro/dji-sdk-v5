/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class VideoPreProcessQuality
extends Enum<VideoPreProcessQuality>
implements JNIProguardKeepTag {
    public static final /* enum */ VideoPreProcessQuality NORMAL = new VideoPreProcessQuality(0);
    public static final /* enum */ VideoPreProcessQuality HTGH = new VideoPreProcessQuality(1);
    public static final /* enum */ VideoPreProcessQuality UNKNOWN = new VideoPreProcessQuality(65535);
    private int value;
    private static final VideoPreProcessQuality[] allValues;
    private static final /* synthetic */ VideoPreProcessQuality[] $VALUES;

    public static VideoPreProcessQuality[] values() {
        return null;
    }

    public static VideoPreProcessQuality valueOf(String string) {
        return null;
    }

    private VideoPreProcessQuality(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static VideoPreProcessQuality find(int n) {
        return null;
    }

    private static /* synthetic */ VideoPreProcessQuality[] $values() {
        return null;
    }

    static {
        $VALUES = VideoPreProcessQuality.$values();
        allValues = VideoPreProcessQuality.values();
    }
}

