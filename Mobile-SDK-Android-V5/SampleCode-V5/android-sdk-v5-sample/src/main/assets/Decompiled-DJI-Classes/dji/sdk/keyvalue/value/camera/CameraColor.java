/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class CameraColor
extends Enum<CameraColor>
implements JNIProguardKeepTag {
    public static final /* enum */ CameraColor NONE = new CameraColor(0);
    public static final /* enum */ CameraColor ART = new CameraColor(1);
    public static final /* enum */ CameraColor REMINISCENCE = new CameraColor(2);
    public static final /* enum */ CameraColor D_CINE_LIKE = new CameraColor(6);
    public static final /* enum */ CameraColor BLACK_WHITE = new CameraColor(4);
    public static final /* enum */ CameraColor D_LOG = new CameraColor(23);
    public static final /* enum */ CameraColor FILM = new CameraColor(14);
    public static final /* enum */ CameraColor FILM_B = new CameraColor(15);
    public static final /* enum */ CameraColor FILM_C = new CameraColor(16);
    public static final /* enum */ CameraColor FILM_D = new CameraColor(17);
    public static final /* enum */ CameraColor FILM_E = new CameraColor(18);
    public static final /* enum */ CameraColor FILM_F = new CameraColor(19);
    public static final /* enum */ CameraColor FILM_G = new CameraColor(20);
    public static final /* enum */ CameraColor FILM_H = new CameraColor(21);
    public static final /* enum */ CameraColor FILM_I = new CameraColor(22);
    public static final /* enum */ CameraColor REC709 = new CameraColor(51);
    public static final /* enum */ CameraColor TRUE_COLOR = new CameraColor(43);
    public static final /* enum */ CameraColor CINE_LIKE = new CameraColor(52);
    public static final /* enum */ CameraColor HLG = new CameraColor(60);
    public static final /* enum */ CameraColor D_LOG_M = new CameraColor(61);
    public static final /* enum */ CameraColor UNKNOWN = new CameraColor(65535);
    private int value;
    private static final CameraColor[] allValues;
    private static final /* synthetic */ CameraColor[] $VALUES;

    public static CameraColor[] values() {
        return null;
    }

    public static CameraColor valueOf(String string) {
        return null;
    }

    private CameraColor(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static CameraColor find(int n) {
        return null;
    }

    private static /* synthetic */ CameraColor[] $values() {
        return null;
    }

    static {
        $VALUES = CameraColor.$values();
        allValues = CameraColor.values();
    }
}

