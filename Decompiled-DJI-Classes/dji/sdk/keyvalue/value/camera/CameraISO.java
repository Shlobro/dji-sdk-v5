/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class CameraISO
extends Enum<CameraISO>
implements JNIProguardKeepTag {
    public static final /* enum */ CameraISO ISO_AUTO = new CameraISO(0);
    public static final /* enum */ CameraISO ISO_AUTO_HIGH_SENSE = new CameraISO(1);
    public static final /* enum */ CameraISO ISO_50 = new CameraISO(2);
    public static final /* enum */ CameraISO ISO_100 = new CameraISO(3);
    public static final /* enum */ CameraISO ISO_200 = new CameraISO(4);
    public static final /* enum */ CameraISO ISO_400 = new CameraISO(5);
    public static final /* enum */ CameraISO ISO_800 = new CameraISO(6);
    public static final /* enum */ CameraISO ISO_1600 = new CameraISO(7);
    public static final /* enum */ CameraISO ISO_3200 = new CameraISO(8);
    public static final /* enum */ CameraISO ISO_6400 = new CameraISO(9);
    public static final /* enum */ CameraISO ISO_12800 = new CameraISO(10);
    public static final /* enum */ CameraISO ISO_25600 = new CameraISO(11);
    public static final /* enum */ CameraISO ISO_51200 = new CameraISO(12);
    public static final /* enum */ CameraISO ISO_102400 = new CameraISO(13);
    public static final /* enum */ CameraISO ISO_19200 = new CameraISO(14);
    public static final /* enum */ CameraISO ISO_32000 = new CameraISO(15);
    public static final /* enum */ CameraISO ISO_9600 = new CameraISO(16);
    public static final /* enum */ CameraISO ISO_16000 = new CameraISO(17);
    public static final /* enum */ CameraISO ISO_204800 = new CameraISO(18);
    public static final /* enum */ CameraISO ISO_409600 = new CameraISO(19);
    public static final /* enum */ CameraISO ISO_819200 = new CameraISO(20);
    public static final /* enum */ CameraISO ISO_FIXED = new CameraISO(255);
    public static final /* enum */ CameraISO UNKNOWN = new CameraISO(65535);
    private int value;
    private static final CameraISO[] allValues;
    private static final /* synthetic */ CameraISO[] $VALUES;

    public static CameraISO[] values() {
        return null;
    }

    public static CameraISO valueOf(String string) {
        return null;
    }

    private CameraISO(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static CameraISO find(int n) {
        return null;
    }

    private static /* synthetic */ CameraISO[] $values() {
        return null;
    }

    static {
        $VALUES = CameraISO.$values();
        allValues = CameraISO.values();
    }
}

