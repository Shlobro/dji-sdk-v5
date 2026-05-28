/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class PhotoRatio
extends Enum<PhotoRatio>
implements JNIProguardKeepTag {
    public static final /* enum */ PhotoRatio RATIO_4COLON3 = new PhotoRatio(0);
    public static final /* enum */ PhotoRatio RATIO_16COLON9 = new PhotoRatio(1);
    public static final /* enum */ PhotoRatio RATIO_3COLON2 = new PhotoRatio(2);
    public static final /* enum */ PhotoRatio RATIO_SQUARE = new PhotoRatio(3);
    public static final /* enum */ PhotoRatio RATIO_18COLON9 = new PhotoRatio(4);
    public static final /* enum */ PhotoRatio RATIO_5COLON4 = new PhotoRatio(5);
    public static final /* enum */ PhotoRatio UNKNOWN = new PhotoRatio(65535);
    private int value;
    private static final PhotoRatio[] allValues;
    private static final /* synthetic */ PhotoRatio[] $VALUES;

    public static PhotoRatio[] values() {
        return null;
    }

    public static PhotoRatio valueOf(String string) {
        return null;
    }

    private PhotoRatio(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static PhotoRatio find(int n) {
        return null;
    }

    private static /* synthetic */ PhotoRatio[] $values() {
        return null;
    }

    static {
        $VALUES = PhotoRatio.$values();
        allValues = PhotoRatio.values();
    }
}

