/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class PositioningLevel
extends Enum<PositioningLevel>
implements JNIProguardKeepTag {
    public static final /* enum */ PositioningLevel NONE = new PositioningLevel(0);
    public static final /* enum */ PositioningLevel WEAK = new PositioningLevel(1);
    public static final /* enum */ PositioningLevel MEDDLE = new PositioningLevel(2);
    public static final /* enum */ PositioningLevel STRONG = new PositioningLevel(3);
    public static final /* enum */ PositioningLevel UNKNOWN = new PositioningLevel(65535);
    private int value;
    private static final PositioningLevel[] allValues;
    private static final /* synthetic */ PositioningLevel[] $VALUES;

    public static PositioningLevel[] values() {
        return null;
    }

    public static PositioningLevel valueOf(String string) {
        return null;
    }

    private PositioningLevel(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static PositioningLevel find(int n) {
        return null;
    }

    private static /* synthetic */ PositioningLevel[] $values() {
        return null;
    }

    static {
        $VALUES = PositioningLevel.$values();
        allValues = PositioningLevel.values();
    }
}

