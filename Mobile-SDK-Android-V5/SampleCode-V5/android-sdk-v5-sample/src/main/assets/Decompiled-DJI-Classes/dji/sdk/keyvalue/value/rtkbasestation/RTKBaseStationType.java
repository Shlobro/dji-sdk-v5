/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.rtkbasestation;

import dji.jni.JNIProguardKeepTag;

public final class RTKBaseStationType
extends Enum<RTKBaseStationType>
implements JNIProguardKeepTag {
    public static final /* enum */ RTKBaseStationType RC_OR_DOCK = new RTKBaseStationType(0);
    public static final /* enum */ RTKBaseStationType RELAY = new RTKBaseStationType(1);
    public static final /* enum */ RTKBaseStationType UNKNOWN = new RTKBaseStationType(65535);
    private int value;
    private static final RTKBaseStationType[] allValues;
    private static final /* synthetic */ RTKBaseStationType[] $VALUES;

    public static RTKBaseStationType[] values() {
        return null;
    }

    public static RTKBaseStationType valueOf(String string) {
        return null;
    }

    private RTKBaseStationType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static RTKBaseStationType find(int n) {
        return null;
    }

    private static /* synthetic */ RTKBaseStationType[] $values() {
        return null;
    }

    static {
        $VALUES = RTKBaseStationType.$values();
        allValues = RTKBaseStationType.values();
    }
}

