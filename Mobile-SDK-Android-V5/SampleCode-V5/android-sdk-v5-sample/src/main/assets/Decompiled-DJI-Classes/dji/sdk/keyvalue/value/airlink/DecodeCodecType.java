/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.airlink;

import dji.jni.JNIProguardKeepTag;

public final class DecodeCodecType
extends Enum<DecodeCodecType>
implements JNIProguardKeepTag {
    public static final /* enum */ DecodeCodecType H264 = new DecodeCodecType(0);
    public static final /* enum */ DecodeCodecType H265 = new DecodeCodecType(1);
    public static final /* enum */ DecodeCodecType UNKNOWN = new DecodeCodecType(65535);
    private int value;
    private static final DecodeCodecType[] allValues;
    private static final /* synthetic */ DecodeCodecType[] $VALUES;

    public static DecodeCodecType[] values() {
        return null;
    }

    public static DecodeCodecType valueOf(String string) {
        return null;
    }

    private DecodeCodecType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static DecodeCodecType find(int n) {
        return null;
    }

    private static /* synthetic */ DecodeCodecType[] $values() {
        return null;
    }

    static {
        $VALUES = DecodeCodecType.$values();
        allValues = DecodeCodecType.values();
    }
}

