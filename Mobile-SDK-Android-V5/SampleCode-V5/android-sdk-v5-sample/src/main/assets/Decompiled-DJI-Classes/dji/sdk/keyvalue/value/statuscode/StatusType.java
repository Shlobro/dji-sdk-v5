/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.statuscode;

import dji.jni.JNIProguardKeepTag;

public final class StatusType
extends Enum<StatusType>
implements JNIProguardKeepTag {
    public static final /* enum */ StatusType PLANE_ACTION = new StatusType(0);
    public static final /* enum */ StatusType PLANE_GEAR = new StatusType(1);
    public static final /* enum */ StatusType DRONE_NEST_CABIN = new StatusType(2);
    public static final /* enum */ StatusType MAX = new StatusType(3);
    public static final /* enum */ StatusType UNKNOWN = new StatusType(65535);
    private int value;
    private static final StatusType[] allValues;
    private static final /* synthetic */ StatusType[] $VALUES;

    public static StatusType[] values() {
        return null;
    }

    public static StatusType valueOf(String string) {
        return null;
    }

    private StatusType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static StatusType find(int n) {
        return null;
    }

    private static /* synthetic */ StatusType[] $values() {
        return null;
    }

    static {
        $VALUES = StatusType.$values();
        allValues = StatusType.values();
    }
}

