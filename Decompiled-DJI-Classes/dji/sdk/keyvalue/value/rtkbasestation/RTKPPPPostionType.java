/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.rtkbasestation;

import dji.jni.JNIProguardKeepTag;

public final class RTKPPPPostionType
extends Enum<RTKPPPPostionType>
implements JNIProguardKeepTag {
    public static final /* enum */ RTKPPPPostionType INVALID = new RTKPPPPostionType(0);
    public static final /* enum */ RTKPPPPostionType WORKING = new RTKPPPPostionType(1);
    public static final /* enum */ RTKPPPPostionType COMPLETE = new RTKPPPPostionType(2);
    public static final /* enum */ RTKPPPPostionType LONG_TIME_NOT_COMPLETE = new RTKPPPPostionType(3);
    public static final /* enum */ RTKPPPPostionType FIXED = new RTKPPPPostionType(4);
    public static final /* enum */ RTKPPPPostionType UNKNOWN = new RTKPPPPostionType(65535);
    private int value;
    private static final RTKPPPPostionType[] allValues;
    private static final /* synthetic */ RTKPPPPostionType[] $VALUES;

    public static RTKPPPPostionType[] values() {
        return null;
    }

    public static RTKPPPPostionType valueOf(String string) {
        return null;
    }

    private RTKPPPPostionType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static RTKPPPPostionType find(int n) {
        return null;
    }

    private static /* synthetic */ RTKPPPPostionType[] $values() {
        return null;
    }

    static {
        $VALUES = RTKPPPPostionType.$values();
        allValues = RTKPPPPostionType.values();
    }
}

