/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.remotecontroller;

import dji.jni.JNIProguardKeepTag;

public final class DroneNestCoverStatus
extends Enum<DroneNestCoverStatus>
implements JNIProguardKeepTag {
    public static final /* enum */ DroneNestCoverStatus CLOSING = new DroneNestCoverStatus(0);
    public static final /* enum */ DroneNestCoverStatus OPENING = new DroneNestCoverStatus(1);
    public static final /* enum */ DroneNestCoverStatus STOP = new DroneNestCoverStatus(2);
    public static final /* enum */ DroneNestCoverStatus UNKNOWN = new DroneNestCoverStatus(65535);
    private int value;
    private static final DroneNestCoverStatus[] allValues;
    private static final /* synthetic */ DroneNestCoverStatus[] $VALUES;

    public static DroneNestCoverStatus[] values() {
        return null;
    }

    public static DroneNestCoverStatus valueOf(String string) {
        return null;
    }

    private DroneNestCoverStatus(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static DroneNestCoverStatus find(int n) {
        return null;
    }

    private static /* synthetic */ DroneNestCoverStatus[] $values() {
        return null;
    }

    static {
        $VALUES = DroneNestCoverStatus.$values();
        allValues = DroneNestCoverStatus.values();
    }
}

