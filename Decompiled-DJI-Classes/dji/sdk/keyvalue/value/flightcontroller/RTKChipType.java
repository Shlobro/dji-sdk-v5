/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class RTKChipType
extends Enum<RTKChipType>
implements JNIProguardKeepTag {
    public static final /* enum */ RTKChipType UM982 = new RTKChipType(0);
    public static final /* enum */ RTKChipType UMD982 = new RTKChipType(1);
    public static final /* enum */ RTKChipType UMD982_PM320 = new RTKChipType(3);
    public static final /* enum */ RTKChipType UNKNOWN = new RTKChipType(65535);
    private int value;
    private static final RTKChipType[] allValues;
    private static final /* synthetic */ RTKChipType[] $VALUES;

    public static RTKChipType[] values() {
        return null;
    }

    public static RTKChipType valueOf(String string) {
        return null;
    }

    private RTKChipType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static RTKChipType find(int n) {
        return null;
    }

    private static /* synthetic */ RTKChipType[] $values() {
        return null;
    }

    static {
        $VALUES = RTKChipType.$values();
        allValues = RTKChipType.values();
    }
}

