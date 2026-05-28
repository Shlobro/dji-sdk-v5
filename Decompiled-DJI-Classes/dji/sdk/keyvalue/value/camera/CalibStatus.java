/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class CalibStatus
extends Enum<CalibStatus>
implements JNIProguardKeepTag {
    public static final /* enum */ CalibStatus NORMAL = new CalibStatus(0);
    public static final /* enum */ CalibStatus IDLE = new CalibStatus(1);
    public static final /* enum */ CalibStatus CALIBRATING = new CalibStatus(2);
    public static final /* enum */ CalibStatus FINISHED = new CalibStatus(3);
    public static final /* enum */ CalibStatus UNKNOWN = new CalibStatus(65535);
    private int value;
    private static final CalibStatus[] allValues;
    private static final /* synthetic */ CalibStatus[] $VALUES;

    public static CalibStatus[] values() {
        return null;
    }

    public static CalibStatus valueOf(String string) {
        return null;
    }

    private CalibStatus(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static CalibStatus find(int n) {
        return null;
    }

    private static /* synthetic */ CalibStatus[] $values() {
        return null;
    }

    static {
        $VALUES = CalibStatus.$values();
        allValues = CalibStatus.values();
    }
}

