/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class VideoStandard
extends Enum<VideoStandard>
implements JNIProguardKeepTag {
    public static final /* enum */ VideoStandard PAL = new VideoStandard(0);
    public static final /* enum */ VideoStandard NTSC = new VideoStandard(1);
    public static final /* enum */ VideoStandard UNKNOWN = new VideoStandard(65535);
    private int value;
    private static final VideoStandard[] allValues;
    private static final /* synthetic */ VideoStandard[] $VALUES;

    public static VideoStandard[] values() {
        return null;
    }

    public static VideoStandard valueOf(String string) {
        return null;
    }

    private VideoStandard(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static VideoStandard find(int n) {
        return null;
    }

    private static /* synthetic */ VideoStandard[] $values() {
        return null;
    }

    static {
        $VALUES = VideoStandard.$values();
        allValues = VideoStandard.values();
    }
}

