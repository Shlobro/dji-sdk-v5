/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class VideoRatio
extends Enum<VideoRatio>
implements JNIProguardKeepTag {
    public static final /* enum */ VideoRatio RATIO_4COLON3 = new VideoRatio(0);
    public static final /* enum */ VideoRatio RATIO_16COLON9 = new VideoRatio(1);
    public static final /* enum */ VideoRatio RATIO_17COLON9 = new VideoRatio(2);
    public static final /* enum */ VideoRatio RATIO_18COLON9 = new VideoRatio(3);
    public static final /* enum */ VideoRatio RATIO_22COLON9 = new VideoRatio(4);
    public static final /* enum */ VideoRatio UNKNOWN = new VideoRatio(65535);
    private int value;
    private static final VideoRatio[] allValues;
    private static final /* synthetic */ VideoRatio[] $VALUES;

    public static VideoRatio[] values() {
        return null;
    }

    public static VideoRatio valueOf(String string) {
        return null;
    }

    private VideoRatio(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static VideoRatio find(int n) {
        return null;
    }

    private static /* synthetic */ VideoRatio[] $values() {
        return null;
    }

    static {
        $VALUES = VideoRatio.$values();
        allValues = VideoRatio.values();
    }
}

