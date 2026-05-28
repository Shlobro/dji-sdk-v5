/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class GPSSpoofingState
extends Enum<GPSSpoofingState>
implements JNIProguardKeepTag {
    public static final /* enum */ GPSSpoofingState INVALID = new GPSSpoofingState(0);
    public static final /* enum */ GPSSpoofingState OK = new GPSSpoofingState(1);
    public static final /* enum */ GPSSpoofingState WARNING = new GPSSpoofingState(2);
    public static final /* enum */ GPSSpoofingState CRITICAL = new GPSSpoofingState(3);
    public static final /* enum */ GPSSpoofingState UNKNOWN = new GPSSpoofingState(65535);
    private int value;
    private static final GPSSpoofingState[] allValues;
    private static final /* synthetic */ GPSSpoofingState[] $VALUES;

    public static GPSSpoofingState[] values() {
        return null;
    }

    public static GPSSpoofingState valueOf(String string) {
        return null;
    }

    private GPSSpoofingState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static GPSSpoofingState find(int n) {
        return null;
    }

    private static /* synthetic */ GPSSpoofingState[] $values() {
        return null;
    }

    static {
        $VALUES = GPSSpoofingState.$values();
        allValues = GPSSpoofingState.values();
    }
}

