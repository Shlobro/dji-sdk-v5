/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.media;

import dji.jni.JNIProguardKeepTag;

public final class MediaVideoEncodeType
extends Enum<MediaVideoEncodeType>
implements JNIProguardKeepTag {
    public static final /* enum */ MediaVideoEncodeType H264 = new MediaVideoEncodeType(0);
    public static final /* enum */ MediaVideoEncodeType H265 = new MediaVideoEncodeType(1);
    public static final /* enum */ MediaVideoEncodeType PRORES = new MediaVideoEncodeType(2);
    public static final /* enum */ MediaVideoEncodeType UNKNOWN = new MediaVideoEncodeType(255);
    private int value;
    private static final MediaVideoEncodeType[] allValues;
    private static final /* synthetic */ MediaVideoEncodeType[] $VALUES;

    public static MediaVideoEncodeType[] values() {
        return null;
    }

    public static MediaVideoEncodeType valueOf(String string) {
        return null;
    }

    private MediaVideoEncodeType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static MediaVideoEncodeType find(int n) {
        return null;
    }

    private static /* synthetic */ MediaVideoEncodeType[] $values() {
        return null;
    }

    static {
        $VALUES = MediaVideoEncodeType.$values();
        allValues = MediaVideoEncodeType.values();
    }
}

