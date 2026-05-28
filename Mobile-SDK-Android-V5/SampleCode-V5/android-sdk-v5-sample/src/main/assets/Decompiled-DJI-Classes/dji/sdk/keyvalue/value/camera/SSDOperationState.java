/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class SSDOperationState
extends Enum<SSDOperationState>
implements JNIProguardKeepTag {
    public static final /* enum */ SSDOperationState NOT_FOUND = new SSDOperationState(0);
    public static final /* enum */ SSDOperationState IDLE = new SSDOperationState(1);
    public static final /* enum */ SSDOperationState SAVING = new SSDOperationState(2);
    public static final /* enum */ SSDOperationState FORMATTING = new SSDOperationState(3);
    public static final /* enum */ SSDOperationState INITIALIZING = new SSDOperationState(4);
    public static final /* enum */ SSDOperationState STATE_ERROR = new SSDOperationState(5);
    public static final /* enum */ SSDOperationState FULL = new SSDOperationState(6);
    public static final /* enum */ SSDOperationState POOR_CONNECTION = new SSDOperationState(7);
    public static final /* enum */ SSDOperationState SWITCHING_LICENSE = new SSDOperationState(8);
    public static final /* enum */ SSDOperationState FORMATTING_REQUIRED = new SSDOperationState(9);
    public static final /* enum */ SSDOperationState NOT_INITIALIZED = new SSDOperationState(10);
    public static final /* enum */ SSDOperationState INVALID_FILE_SYSTEM = new SSDOperationState(11);
    public static final /* enum */ SSDOperationState UNKNOWN = new SSDOperationState(65535);
    private int value;
    private static final SSDOperationState[] allValues;
    private static final /* synthetic */ SSDOperationState[] $VALUES;

    public static SSDOperationState[] values() {
        return null;
    }

    public static SSDOperationState valueOf(String string) {
        return null;
    }

    private SSDOperationState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static SSDOperationState find(int n) {
        return null;
    }

    private static /* synthetic */ SSDOperationState[] $values() {
        return null;
    }

    static {
        $VALUES = SSDOperationState.$values();
        allValues = SSDOperationState.values();
    }
}

