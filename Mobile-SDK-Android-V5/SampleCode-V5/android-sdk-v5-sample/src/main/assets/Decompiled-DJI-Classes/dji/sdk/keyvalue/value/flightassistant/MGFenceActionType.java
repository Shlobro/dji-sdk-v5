/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightassistant;

import dji.jni.JNIProguardKeepTag;

public final class MGFenceActionType
extends Enum<MGFenceActionType>
implements JNIProguardKeepTag {
    public static final /* enum */ MGFenceActionType FENCE_FILE_CLOSE = new MGFenceActionType(0);
    public static final /* enum */ MGFenceActionType FENCE_FILE_OPEN = new MGFenceActionType(1);
    public static final /* enum */ MGFenceActionType UNKNOWN = new MGFenceActionType(65535);
    private int value;
    private static final MGFenceActionType[] allValues;
    private static final /* synthetic */ MGFenceActionType[] $VALUES;

    public static MGFenceActionType[] values() {
        return null;
    }

    public static MGFenceActionType valueOf(String string) {
        return null;
    }

    private MGFenceActionType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static MGFenceActionType find(int n) {
        return null;
    }

    private static /* synthetic */ MGFenceActionType[] $values() {
        return null;
    }

    static {
        $VALUES = MGFenceActionType.$values();
        allValues = MGFenceActionType.values();
    }
}

