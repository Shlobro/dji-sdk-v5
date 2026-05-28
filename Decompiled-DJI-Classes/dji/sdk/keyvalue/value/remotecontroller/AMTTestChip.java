/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.remotecontroller;

import dji.jni.JNIProguardKeepTag;

public final class AMTTestChip
extends Enum<AMTTestChip>
implements JNIProguardKeepTag {
    public static final /* enum */ AMTTestChip AIR = new AMTTestChip(0);
    public static final /* enum */ AMTTestChip E2C = new AMTTestChip(1);
    public static final /* enum */ AMTTestChip UNKNOWN = new AMTTestChip(255);
    private int value;
    private static final AMTTestChip[] allValues;
    private static final /* synthetic */ AMTTestChip[] $VALUES;

    public static AMTTestChip[] values() {
        return null;
    }

    public static AMTTestChip valueOf(String string) {
        return null;
    }

    private AMTTestChip(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static AMTTestChip find(int n) {
        return null;
    }

    private static /* synthetic */ AMTTestChip[] $values() {
        return null;
    }

    static {
        $VALUES = AMTTestChip.$values();
        allValues = AMTTestChip.values();
    }
}

