/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.rtkmobilestation;

import dji.jni.JNIProguardKeepTag;

public final class RTKAntennaType
extends Enum<RTKAntennaType>
implements JNIProguardKeepTag {
    public static final /* enum */ RTKAntennaType MAIN_ANTENNA = new RTKAntennaType(0);
    public static final /* enum */ RTKAntennaType SUB_ANTENNA = new RTKAntennaType(1);
    public static final /* enum */ RTKAntennaType UNKNOWN = new RTKAntennaType(65535);
    private int value;
    private static final RTKAntennaType[] allValues;
    private static final /* synthetic */ RTKAntennaType[] $VALUES;

    public static RTKAntennaType[] values() {
        return null;
    }

    public static RTKAntennaType valueOf(String string) {
        return null;
    }

    private RTKAntennaType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static RTKAntennaType find(int n) {
        return null;
    }

    private static /* synthetic */ RTKAntennaType[] $values() {
        return null;
    }

    static {
        $VALUES = RTKAntennaType.$values();
        allValues = RTKAntennaType.values();
    }
}

