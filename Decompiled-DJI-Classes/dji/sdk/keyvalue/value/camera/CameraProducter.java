/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class CameraProducter
extends Enum<CameraProducter>
implements JNIProguardKeepTag {
    public static final /* enum */ CameraProducter DJI = new CameraProducter(0);
    public static final /* enum */ CameraProducter ANASONIC = new CameraProducter(1);
    public static final /* enum */ CameraProducter AMRON = new CameraProducter(2);
    public static final /* enum */ CameraProducter SAMYANG = new CameraProducter(3);
    public static final /* enum */ CameraProducter SIGMA = new CameraProducter(4);
    public static final /* enum */ CameraProducter LEICA = new CameraProducter(5);
    public static final /* enum */ CameraProducter NITTOH = new CameraProducter(6);
    public static final /* enum */ CameraProducter HOYA = new CameraProducter(7);
    public static final /* enum */ CameraProducter UNKNOWN = new CameraProducter(65535);
    private int value;
    private static final CameraProducter[] allValues;
    private static final /* synthetic */ CameraProducter[] $VALUES;

    public static CameraProducter[] values() {
        return null;
    }

    public static CameraProducter valueOf(String string) {
        return null;
    }

    private CameraProducter(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static CameraProducter find(int n) {
        return null;
    }

    private static /* synthetic */ CameraProducter[] $values() {
        return null;
    }

    static {
        $VALUES = CameraProducter.$values();
        allValues = CameraProducter.values();
    }
}

