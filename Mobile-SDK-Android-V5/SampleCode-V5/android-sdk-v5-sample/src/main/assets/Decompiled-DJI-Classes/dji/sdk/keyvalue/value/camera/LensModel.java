/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class LensModel
extends Enum<LensModel>
implements JNIProguardKeepTag {
    public static final /* enum */ LensModel RESERVED = new LensModel(0);
    public static final /* enum */ LensModel DJI_FF_LENS_35MM = new LensModel(1);
    public static final /* enum */ LensModel DJI_FF_LENS_50MM = new LensModel(2);
    public static final /* enum */ LensModel DJI_FF_LENS_24MM = new LensModel(3);
    public static final /* enum */ LensModel DJI_FF_LENS_16MM = new LensModel(4);
    public static final /* enum */ LensModel DJI_FF_LENS_17_28MM = new LensModel(6);
    public static final /* enum */ LensModel DJI_FF_LENS_18MM = new LensModel(7);
    public static final /* enum */ LensModel L_MOUNT_LENS = new LensModel(12);
    public static final /* enum */ LensModel E_MOUNT_LENS = new LensModel(192);
    public static final /* enum */ LensModel MANUAL_LENS = new LensModel(254);
    public static final /* enum */ LensModel UNKNOWN = new LensModel(65535);
    private int value;
    private static final LensModel[] allValues;
    private static final /* synthetic */ LensModel[] $VALUES;

    public static LensModel[] values() {
        return null;
    }

    public static LensModel valueOf(String string) {
        return null;
    }

    private LensModel(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static LensModel find(int n) {
        return null;
    }

    private static /* synthetic */ LensModel[] $values() {
        return null;
    }

    static {
        $VALUES = LensModel.$values();
        allValues = LensModel.values();
    }
}

