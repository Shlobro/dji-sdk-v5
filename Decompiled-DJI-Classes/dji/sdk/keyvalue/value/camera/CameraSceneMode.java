/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class CameraSceneMode
extends Enum<CameraSceneMode>
implements JNIProguardKeepTag {
    public static final /* enum */ CameraSceneMode AUTO = new CameraSceneMode(0);
    public static final /* enum */ CameraSceneMode STANDARD = new CameraSceneMode(1);
    public static final /* enum */ CameraSceneMode PORTRAIT = new CameraSceneMode(2);
    public static final /* enum */ CameraSceneMode LANDSCAPE = new CameraSceneMode(3);
    public static final /* enum */ CameraSceneMode BLUE_SKY = new CameraSceneMode(4);
    public static final /* enum */ CameraSceneMode BEACH = new CameraSceneMode(5);
    public static final /* enum */ CameraSceneMode WATER_SURFACE = new CameraSceneMode(6);
    public static final /* enum */ CameraSceneMode DESERT_SNOW = new CameraSceneMode(7);
    public static final /* enum */ CameraSceneMode SUNSET = new CameraSceneMode(8);
    public static final /* enum */ CameraSceneMode BUILDING = new CameraSceneMode(9);
    public static final /* enum */ CameraSceneMode INDOOR = new CameraSceneMode(10);
    public static final /* enum */ CameraSceneMode BACKLIGHT = new CameraSceneMode(11);
    public static final /* enum */ CameraSceneMode BACKLIGHT_PORTRAIT = new CameraSceneMode(12);
    public static final /* enum */ CameraSceneMode NIGHT_SCENE = new CameraSceneMode(13);
    public static final /* enum */ CameraSceneMode NIGHT_SCENE_PROTRAIT = new CameraSceneMode(14);
    public static final /* enum */ CameraSceneMode SPORT = new CameraSceneMode(15);
    public static final /* enum */ CameraSceneMode MACRO_DISTANCE = new CameraSceneMode(16);
    public static final /* enum */ CameraSceneMode FLOWERS = new CameraSceneMode(17);
    public static final /* enum */ CameraSceneMode CHILD = new CameraSceneMode(18);
    public static final /* enum */ CameraSceneMode PARTY = new CameraSceneMode(19);
    public static final /* enum */ CameraSceneMode UNKNOWN = new CameraSceneMode(65535);
    private int value;
    private static final CameraSceneMode[] allValues;
    private static final /* synthetic */ CameraSceneMode[] $VALUES;

    public static CameraSceneMode[] values() {
        return null;
    }

    public static CameraSceneMode valueOf(String string) {
        return null;
    }

    private CameraSceneMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static CameraSceneMode find(int n) {
        return null;
    }

    private static /* synthetic */ CameraSceneMode[] $values() {
        return null;
    }

    static {
        $VALUES = CameraSceneMode.$values();
        allValues = CameraSceneMode.values();
    }
}

