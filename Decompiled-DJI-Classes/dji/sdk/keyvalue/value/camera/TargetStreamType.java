/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class TargetStreamType
extends Enum<TargetStreamType>
implements JNIProguardKeepTag {
    public static final /* enum */ TargetStreamType LIVEVIEW = new TargetStreamType(1);
    public static final /* enum */ TargetStreamType VIDEO = new TargetStreamType(2);
    public static final /* enum */ TargetStreamType STILL = new TargetStreamType(4);
    public static final /* enum */ TargetStreamType UNKNOWN = new TargetStreamType(65535);
    private int value;
    private static final TargetStreamType[] allValues;
    private static final /* synthetic */ TargetStreamType[] $VALUES;

    public static TargetStreamType[] values() {
        return null;
    }

    public static TargetStreamType valueOf(String string) {
        return null;
    }

    private TargetStreamType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static TargetStreamType find(int n) {
        return null;
    }

    private static /* synthetic */ TargetStreamType[] $values() {
        return null;
    }

    static {
        $VALUES = TargetStreamType.$values();
        allValues = TargetStreamType.values();
    }
}

