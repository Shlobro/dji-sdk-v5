/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class CameraFileIndexMode
extends Enum<CameraFileIndexMode>
implements JNIProguardKeepTag {
    public static final /* enum */ CameraFileIndexMode RESET = new CameraFileIndexMode(0);
    public static final /* enum */ CameraFileIndexMode SEQUENCE = new CameraFileIndexMode(1);
    public static final /* enum */ CameraFileIndexMode UNKNOWN = new CameraFileIndexMode(65535);
    private int value;
    private static final CameraFileIndexMode[] allValues;
    private static final /* synthetic */ CameraFileIndexMode[] $VALUES;

    public static CameraFileIndexMode[] values() {
        return null;
    }

    public static CameraFileIndexMode valueOf(String string) {
        return null;
    }

    private CameraFileIndexMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static CameraFileIndexMode find(int n) {
        return null;
    }

    private static /* synthetic */ CameraFileIndexMode[] $values() {
        return null;
    }

    static {
        $VALUES = CameraFileIndexMode.$values();
        allValues = CameraFileIndexMode.values();
    }
}

