/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.rtkbasestation;

import dji.jni.JNIProguardKeepTag;

public final class RTKIMUAlignmentMode
extends Enum<RTKIMUAlignmentMode>
implements JNIProguardKeepTag {
    public static final /* enum */ RTKIMUAlignmentMode MISALIGNED = new RTKIMUAlignmentMode(0);
    public static final /* enum */ RTKIMUAlignmentMode ALIGNMENTLOW = new RTKIMUAlignmentMode(1);
    public static final /* enum */ RTKIMUAlignmentMode ALIGNMENTED = new RTKIMUAlignmentMode(2);
    public static final /* enum */ RTKIMUAlignmentMode UNKNOWN = new RTKIMUAlignmentMode(65535);
    private int value;
    private static final RTKIMUAlignmentMode[] allValues;
    private static final /* synthetic */ RTKIMUAlignmentMode[] $VALUES;

    public static RTKIMUAlignmentMode[] values() {
        return null;
    }

    public static RTKIMUAlignmentMode valueOf(String string) {
        return null;
    }

    private RTKIMUAlignmentMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static RTKIMUAlignmentMode find(int n) {
        return null;
    }

    private static /* synthetic */ RTKIMUAlignmentMode[] $values() {
        return null;
    }

    static {
        $VALUES = RTKIMUAlignmentMode.$values();
        allValues = RTKIMUAlignmentMode.values();
    }
}

