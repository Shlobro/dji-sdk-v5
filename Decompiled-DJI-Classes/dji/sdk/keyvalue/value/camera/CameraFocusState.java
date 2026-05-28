/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class CameraFocusState
extends Enum<CameraFocusState>
implements JNIProguardKeepTag {
    public static final /* enum */ CameraFocusState IDLE = new CameraFocusState(0);
    public static final /* enum */ CameraFocusState FOCUSING = new CameraFocusState(1);
    public static final /* enum */ CameraFocusState SUCCESSFUL = new CameraFocusState(2);
    public static final /* enum */ CameraFocusState FAILED = new CameraFocusState(3);
    public static final /* enum */ CameraFocusState UNKNOWN = new CameraFocusState(65535);
    private int value;
    private static final CameraFocusState[] allValues;
    private static final /* synthetic */ CameraFocusState[] $VALUES;

    public static CameraFocusState[] values() {
        return null;
    }

    public static CameraFocusState valueOf(String string) {
        return null;
    }

    private CameraFocusState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static CameraFocusState find(int n) {
        return null;
    }

    private static /* synthetic */ CameraFocusState[] $values() {
        return null;
    }

    static {
        $VALUES = CameraFocusState.$values();
        allValues = CameraFocusState.values();
    }
}

