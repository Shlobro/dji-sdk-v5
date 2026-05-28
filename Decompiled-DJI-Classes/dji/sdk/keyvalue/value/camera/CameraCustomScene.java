/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class CameraCustomScene
extends Enum<CameraCustomScene>
implements JNIProguardKeepTag {
    public static final /* enum */ CameraCustomScene SCENE_NONE = new CameraCustomScene(0);
    public static final /* enum */ CameraCustomScene SCENE_1 = new CameraCustomScene(1);
    public static final /* enum */ CameraCustomScene SCENE_2 = new CameraCustomScene(2);
    public static final /* enum */ CameraCustomScene SCENE_3 = new CameraCustomScene(3);
    public static final /* enum */ CameraCustomScene UNKNOWN = new CameraCustomScene(65535);
    private int value;
    private static final CameraCustomScene[] allValues;
    private static final /* synthetic */ CameraCustomScene[] $VALUES;

    public static CameraCustomScene[] values() {
        return null;
    }

    public static CameraCustomScene valueOf(String string) {
        return null;
    }

    private CameraCustomScene(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static CameraCustomScene find(int n) {
        return null;
    }

    private static /* synthetic */ CameraCustomScene[] $values() {
        return null;
    }

    static {
        $VALUES = CameraCustomScene.$values();
        allValues = CameraCustomScene.values();
    }
}

