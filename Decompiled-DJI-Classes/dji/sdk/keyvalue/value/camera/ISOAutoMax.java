/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class ISOAutoMax
extends Enum<ISOAutoMax>
implements JNIProguardKeepTag {
    public static final /* enum */ ISOAutoMax ISO_AUTO_MAX_100 = new ISOAutoMax(1);
    public static final /* enum */ ISOAutoMax ISO_AUTO_MAX_200 = new ISOAutoMax(2);
    public static final /* enum */ ISOAutoMax ISO_AUTO_MAX_400 = new ISOAutoMax(3);
    public static final /* enum */ ISOAutoMax ISO_AUTO_MAX_800 = new ISOAutoMax(4);
    public static final /* enum */ ISOAutoMax ISO_AUTO_MAX_1600 = new ISOAutoMax(5);
    public static final /* enum */ ISOAutoMax ISO_AUTO_MAX_3200 = new ISOAutoMax(6);
    public static final /* enum */ ISOAutoMax ISO_AUTO_MAX_6400 = new ISOAutoMax(7);
    public static final /* enum */ ISOAutoMax ISO_AUTO_MAX_12800 = new ISOAutoMax(8);
    public static final /* enum */ ISOAutoMax ISO_AUTO_MAX_25600 = new ISOAutoMax(9);
    public static final /* enum */ ISOAutoMax UNKNOWN = new ISOAutoMax(65535);
    private int value;
    private static final ISOAutoMax[] allValues;
    private static final /* synthetic */ ISOAutoMax[] $VALUES;

    public static ISOAutoMax[] values() {
        return null;
    }

    public static ISOAutoMax valueOf(String string) {
        return null;
    }

    private ISOAutoMax(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static ISOAutoMax find(int n) {
        return null;
    }

    private static /* synthetic */ ISOAutoMax[] $values() {
        return null;
    }

    static {
        $VALUES = ISOAutoMax.$values();
        allValues = ISOAutoMax.values();
    }
}

