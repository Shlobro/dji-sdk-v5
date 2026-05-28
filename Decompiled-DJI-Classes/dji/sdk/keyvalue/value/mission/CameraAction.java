/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.mission;

import dji.jni.JNIProguardKeepTag;

public final class CameraAction
extends Enum<CameraAction>
implements JNIProguardKeepTag {
    public static final /* enum */ CameraAction NONE = new CameraAction(0);
    public static final /* enum */ CameraAction FIXED_DIS = new CameraAction(1);
    public static final /* enum */ CameraAction TIMING = new CameraAction(2);
    public static final /* enum */ CameraAction UNKNOWN = new CameraAction(65535);
    private int value;
    private static final CameraAction[] allValues;
    private static final /* synthetic */ CameraAction[] $VALUES;

    public static CameraAction[] values() {
        return null;
    }

    public static CameraAction valueOf(String string) {
        return null;
    }

    private CameraAction(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static CameraAction find(int n) {
        return null;
    }

    private static /* synthetic */ CameraAction[] $values() {
        return null;
    }

    static {
        $VALUES = CameraAction.$values();
        allValues = CameraAction.values();
    }
}

