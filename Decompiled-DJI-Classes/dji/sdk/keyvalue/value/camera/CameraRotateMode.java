/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class CameraRotateMode
extends Enum<CameraRotateMode>
implements JNIProguardKeepTag {
    public static final /* enum */ CameraRotateMode UP = new CameraRotateMode(0);
    public static final /* enum */ CameraRotateMode DOWN = new CameraRotateMode(1);
    public static final /* enum */ CameraRotateMode AUTO = new CameraRotateMode(2);
    public static final /* enum */ CameraRotateMode UNKNOWN = new CameraRotateMode(65535);
    private int value;
    private static final CameraRotateMode[] allValues;
    private static final /* synthetic */ CameraRotateMode[] $VALUES;

    public static CameraRotateMode[] values() {
        return null;
    }

    public static CameraRotateMode valueOf(String string) {
        return null;
    }

    private CameraRotateMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static CameraRotateMode find(int n) {
        return null;
    }

    private static /* synthetic */ CameraRotateMode[] $values() {
        return null;
    }

    static {
        $VALUES = CameraRotateMode.$values();
        allValues = CameraRotateMode.values();
    }
}

