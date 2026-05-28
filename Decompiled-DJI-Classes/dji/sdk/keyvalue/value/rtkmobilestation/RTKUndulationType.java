/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.rtkmobilestation;

import dji.jni.JNIProguardKeepTag;

public final class RTKUndulationType
extends Enum<RTKUndulationType>
implements JNIProguardKeepTag {
    public static final /* enum */ RTKUndulationType IMU_OR_BARO = new RTKUndulationType(0);
    public static final /* enum */ RTKUndulationType GPS = new RTKUndulationType(1);
    public static final /* enum */ RTKUndulationType RTK = new RTKUndulationType(2);
    public static final /* enum */ RTKUndulationType UNKNOWN = new RTKUndulationType(65535);
    private int value;
    private static final RTKUndulationType[] allValues;
    private static final /* synthetic */ RTKUndulationType[] $VALUES;

    public static RTKUndulationType[] values() {
        return null;
    }

    public static RTKUndulationType valueOf(String string) {
        return null;
    }

    private RTKUndulationType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static RTKUndulationType find(int n) {
        return null;
    }

    private static /* synthetic */ RTKUndulationType[] $values() {
        return null;
    }

    static {
        $VALUES = RTKUndulationType.$values();
        allValues = RTKUndulationType.values();
    }
}

