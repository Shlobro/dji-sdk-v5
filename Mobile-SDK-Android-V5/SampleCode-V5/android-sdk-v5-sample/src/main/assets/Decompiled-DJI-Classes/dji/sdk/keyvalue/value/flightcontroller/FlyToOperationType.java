/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class FlyToOperationType
extends Enum<FlyToOperationType>
implements JNIProguardKeepTag {
    public static final /* enum */ FlyToOperationType NEW_ORDER = new FlyToOperationType(0);
    public static final /* enum */ FlyToOperationType UPDATE_ORDER = new FlyToOperationType(1);
    public static final /* enum */ FlyToOperationType UNKNOWN = new FlyToOperationType(65535);
    private int value;
    private static final FlyToOperationType[] allValues;
    private static final /* synthetic */ FlyToOperationType[] $VALUES;

    public static FlyToOperationType[] values() {
        return null;
    }

    public static FlyToOperationType valueOf(String string) {
        return null;
    }

    private FlyToOperationType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static FlyToOperationType find(int n) {
        return null;
    }

    private static /* synthetic */ FlyToOperationType[] $values() {
        return null;
    }

    static {
        $VALUES = FlyToOperationType.$values();
        allValues = FlyToOperationType.values();
    }
}

