/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class CameraWhiteBalanceMode
extends Enum<CameraWhiteBalanceMode>
implements JNIProguardKeepTag {
    public static final /* enum */ CameraWhiteBalanceMode AUTO = new CameraWhiteBalanceMode(0);
    public static final /* enum */ CameraWhiteBalanceMode SUNNY = new CameraWhiteBalanceMode(1);
    public static final /* enum */ CameraWhiteBalanceMode CLOUDY = new CameraWhiteBalanceMode(2);
    public static final /* enum */ CameraWhiteBalanceMode WATER_SURFACE = new CameraWhiteBalanceMode(3);
    public static final /* enum */ CameraWhiteBalanceMode INDOOR_INCANDESCENT = new CameraWhiteBalanceMode(4);
    public static final /* enum */ CameraWhiteBalanceMode INDOOR_FLUORESCENT = new CameraWhiteBalanceMode(5);
    public static final /* enum */ CameraWhiteBalanceMode MANUAL = new CameraWhiteBalanceMode(6);
    public static final /* enum */ CameraWhiteBalanceMode NATURAL = new CameraWhiteBalanceMode(7);
    public static final /* enum */ CameraWhiteBalanceMode UNDERWATER = new CameraWhiteBalanceMode(8);
    public static final /* enum */ CameraWhiteBalanceMode UNKNOWN = new CameraWhiteBalanceMode(65535);
    private int value;
    private static final CameraWhiteBalanceMode[] allValues;
    private static final /* synthetic */ CameraWhiteBalanceMode[] $VALUES;

    public static CameraWhiteBalanceMode[] values() {
        return null;
    }

    public static CameraWhiteBalanceMode valueOf(String string) {
        return null;
    }

    private CameraWhiteBalanceMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static CameraWhiteBalanceMode find(int n) {
        return null;
    }

    private static /* synthetic */ CameraWhiteBalanceMode[] $values() {
        return null;
    }

    static {
        $VALUES = CameraWhiteBalanceMode.$values();
        allValues = CameraWhiteBalanceMode.values();
    }
}

