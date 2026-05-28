/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class CameraEISCtrlMode
extends Enum<CameraEISCtrlMode>
implements JNIProguardKeepTag {
    public static final /* enum */ CameraEISCtrlMode OFF = new CameraEISCtrlMode(0);
    public static final /* enum */ CameraEISCtrlMode NORMAL = new CameraEISCtrlMode(1);
    public static final /* enum */ CameraEISCtrlMode HIGH = new CameraEISCtrlMode(2);
    public static final /* enum */ CameraEISCtrlMode STEADY = new CameraEISCtrlMode(3);
    public static final /* enum */ CameraEISCtrlMode HORIZONTAL = new CameraEISCtrlMode(4);
    public static final /* enum */ CameraEISCtrlMode UNKNOWN = new CameraEISCtrlMode(65535);
    private int value;
    private static final CameraEISCtrlMode[] allValues;
    private static final /* synthetic */ CameraEISCtrlMode[] $VALUES;

    public static CameraEISCtrlMode[] values() {
        return null;
    }

    public static CameraEISCtrlMode valueOf(String string) {
        return null;
    }

    private CameraEISCtrlMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static CameraEISCtrlMode find(int n) {
        return null;
    }

    private static /* synthetic */ CameraEISCtrlMode[] $values() {
        return null;
    }

    static {
        $VALUES = CameraEISCtrlMode.$values();
        allValues = CameraEISCtrlMode.values();
    }
}

