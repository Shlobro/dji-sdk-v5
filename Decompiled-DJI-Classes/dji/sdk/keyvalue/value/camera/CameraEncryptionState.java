/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class CameraEncryptionState
extends Enum<CameraEncryptionState>
implements JNIProguardKeepTag {
    public static final /* enum */ CameraEncryptionState NOT_ENCRYPTED = new CameraEncryptionState(0);
    public static final /* enum */ CameraEncryptionState VALIDATION_FAILED = new CameraEncryptionState(1);
    public static final /* enum */ CameraEncryptionState VALIDATION_SUCCEEDED = new CameraEncryptionState(2);
    public static final /* enum */ CameraEncryptionState UNKNOWN = new CameraEncryptionState(65535);
    private int value;
    private static final CameraEncryptionState[] allValues;
    private static final /* synthetic */ CameraEncryptionState[] $VALUES;

    public static CameraEncryptionState[] values() {
        return null;
    }

    public static CameraEncryptionState valueOf(String string) {
        return null;
    }

    private CameraEncryptionState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static CameraEncryptionState find(int n) {
        return null;
    }

    private static /* synthetic */ CameraEncryptionState[] $values() {
        return null;
    }

    static {
        $VALUES = CameraEncryptionState.$values();
        allValues = CameraEncryptionState.values();
    }
}

