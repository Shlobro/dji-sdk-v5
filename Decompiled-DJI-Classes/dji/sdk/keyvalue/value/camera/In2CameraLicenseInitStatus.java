/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class In2CameraLicenseInitStatus
extends Enum<In2CameraLicenseInitStatus>
implements JNIProguardKeepTag {
    public static final /* enum */ In2CameraLicenseInitStatus INITIALIZING = new In2CameraLicenseInitStatus(0);
    public static final /* enum */ In2CameraLicenseInitStatus INITIALIZED = new In2CameraLicenseInitStatus(1);
    public static final /* enum */ In2CameraLicenseInitStatus INITIALIZE_FAILURE = new In2CameraLicenseInitStatus(2);
    public static final /* enum */ In2CameraLicenseInitStatus UNKNOWN = new In2CameraLicenseInitStatus(65535);
    private int value;
    private static final In2CameraLicenseInitStatus[] allValues;
    private static final /* synthetic */ In2CameraLicenseInitStatus[] $VALUES;

    public static In2CameraLicenseInitStatus[] values() {
        return null;
    }

    public static In2CameraLicenseInitStatus valueOf(String string) {
        return null;
    }

    private In2CameraLicenseInitStatus(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static In2CameraLicenseInitStatus find(int n) {
        return null;
    }

    private static /* synthetic */ In2CameraLicenseInitStatus[] $values() {
        return null;
    }

    static {
        $VALUES = In2CameraLicenseInitStatus.$values();
        allValues = In2CameraLicenseInitStatus.values();
    }
}

