/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.rtkmobilestation;

import dji.jni.JNIProguardKeepTag;

public final class RTKPositioningSolution
extends Enum<RTKPositioningSolution>
implements JNIProguardKeepTag {
    public static final /* enum */ RTKPositioningSolution NONE = new RTKPositioningSolution(15);
    public static final /* enum */ RTKPositioningSolution SINGLE_POINT = new RTKPositioningSolution(16);
    public static final /* enum */ RTKPositioningSolution FLOAT = new RTKPositioningSolution(34);
    public static final /* enum */ RTKPositioningSolution FIXED_POINT = new RTKPositioningSolution(50);
    public static final /* enum */ RTKPositioningSolution GNSS_ABOVE = new RTKPositioningSolution(52);
    public static final /* enum */ RTKPositioningSolution UNKNOWN = new RTKPositioningSolution(65535);
    private int value;
    private static final RTKPositioningSolution[] allValues;
    private static final /* synthetic */ RTKPositioningSolution[] $VALUES;

    public static RTKPositioningSolution[] values() {
        return null;
    }

    public static RTKPositioningSolution valueOf(String string) {
        return null;
    }

    private RTKPositioningSolution(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static RTKPositioningSolution find(int n) {
        return null;
    }

    private static /* synthetic */ RTKPositioningSolution[] $values() {
        return null;
    }

    static {
        $VALUES = RTKPositioningSolution.$values();
        allValues = RTKPositioningSolution.values();
    }
}

