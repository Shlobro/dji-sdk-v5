/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class DronePositionSource
extends Enum<DronePositionSource>
implements JNIProguardKeepTag {
    public static final /* enum */ DronePositionSource GPS = new DronePositionSource(0);
    public static final /* enum */ DronePositionSource VIO = new DronePositionSource(1);
    public static final /* enum */ DronePositionSource UNKNOWN = new DronePositionSource(65535);
    private int value;
    private static final DronePositionSource[] allValues;
    private static final /* synthetic */ DronePositionSource[] $VALUES;

    public static DronePositionSource[] values() {
        return null;
    }

    public static DronePositionSource valueOf(String string) {
        return null;
    }

    private DronePositionSource(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static DronePositionSource find(int n) {
        return null;
    }

    private static /* synthetic */ DronePositionSource[] $values() {
        return null;
    }

    static {
        $VALUES = DronePositionSource.$values();
        allValues = DronePositionSource.values();
    }
}

