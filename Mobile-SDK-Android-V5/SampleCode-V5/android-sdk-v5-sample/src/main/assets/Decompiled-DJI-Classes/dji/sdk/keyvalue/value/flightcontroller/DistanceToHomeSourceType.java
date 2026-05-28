/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class DistanceToHomeSourceType
extends Enum<DistanceToHomeSourceType>
implements JNIProguardKeepTag {
    public static final /* enum */ DistanceToHomeSourceType NONE = new DistanceToHomeSourceType(0);
    public static final /* enum */ DistanceToHomeSourceType RELATIVE_XY = new DistanceToHomeSourceType(1);
    public static final /* enum */ DistanceToHomeSourceType LONG_LATI = new DistanceToHomeSourceType(2);
    public static final /* enum */ DistanceToHomeSourceType UNKNOWN = new DistanceToHomeSourceType(65535);
    private int value;
    private static final DistanceToHomeSourceType[] allValues;
    private static final /* synthetic */ DistanceToHomeSourceType[] $VALUES;

    public static DistanceToHomeSourceType[] values() {
        return null;
    }

    public static DistanceToHomeSourceType valueOf(String string) {
        return null;
    }

    private DistanceToHomeSourceType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static DistanceToHomeSourceType find(int n) {
        return null;
    }

    private static /* synthetic */ DistanceToHomeSourceType[] $values() {
        return null;
    }

    static {
        $VALUES = DistanceToHomeSourceType.$values();
        allValues = DistanceToHomeSourceType.values();
    }
}

