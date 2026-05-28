/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.file;

import dji.jni.JNIProguardKeepTag;

public final class FrameRoundType
extends Enum<FrameRoundType>
implements JNIProguardKeepTag {
    public static final /* enum */ FrameRoundType ROUND_UP = new FrameRoundType(0);
    public static final /* enum */ FrameRoundType ROUND_DOWN = new FrameRoundType(1);
    public static final /* enum */ FrameRoundType UNKNOWN = new FrameRoundType(65535);
    private int value;
    private static final FrameRoundType[] allValues;
    private static final /* synthetic */ FrameRoundType[] $VALUES;

    public static FrameRoundType[] values() {
        return null;
    }

    public static FrameRoundType valueOf(String string) {
        return null;
    }

    private FrameRoundType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static FrameRoundType find(int n) {
        return null;
    }

    private static /* synthetic */ FrameRoundType[] $values() {
        return null;
    }

    static {
        $VALUES = FrameRoundType.$values();
        allValues = FrameRoundType.values();
    }
}

