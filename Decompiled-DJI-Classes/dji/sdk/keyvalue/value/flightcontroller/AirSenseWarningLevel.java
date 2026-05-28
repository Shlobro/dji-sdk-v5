/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class AirSenseWarningLevel
extends Enum<AirSenseWarningLevel>
implements JNIProguardKeepTag {
    public static final /* enum */ AirSenseWarningLevel LEVEL_0 = new AirSenseWarningLevel(0);
    public static final /* enum */ AirSenseWarningLevel LEVEL_1 = new AirSenseWarningLevel(1);
    public static final /* enum */ AirSenseWarningLevel LEVEL_2 = new AirSenseWarningLevel(2);
    public static final /* enum */ AirSenseWarningLevel LEVEL_3 = new AirSenseWarningLevel(3);
    public static final /* enum */ AirSenseWarningLevel LEVEL_4 = new AirSenseWarningLevel(4);
    public static final /* enum */ AirSenseWarningLevel UNKNOWN = new AirSenseWarningLevel(65535);
    private int value;
    private static final AirSenseWarningLevel[] allValues;
    private static final /* synthetic */ AirSenseWarningLevel[] $VALUES;

    public static AirSenseWarningLevel[] values() {
        return null;
    }

    public static AirSenseWarningLevel valueOf(String string) {
        return null;
    }

    private AirSenseWarningLevel(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static AirSenseWarningLevel find(int n) {
        return null;
    }

    private static /* synthetic */ AirSenseWarningLevel[] $values() {
        return null;
    }

    static {
        $VALUES = AirSenseWarningLevel.$values();
        allValues = AirSenseWarningLevel.values();
    }
}

