/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class EIType
extends Enum<EIType>
implements JNIProguardKeepTag {
    public static final /* enum */ EIType EI_100 = new EIType(0);
    public static final /* enum */ EIType EI_200 = new EIType(1);
    public static final /* enum */ EIType EI_400 = new EIType(2);
    public static final /* enum */ EIType EI_800 = new EIType(3);
    public static final /* enum */ EIType EI_1600 = new EIType(4);
    public static final /* enum */ EIType EI_3200 = new EIType(5);
    public static final /* enum */ EIType EI_6400 = new EIType(6);
    public static final /* enum */ EIType UNKNOWN = new EIType(65535);
    private int value;
    private static final EIType[] allValues;
    private static final /* synthetic */ EIType[] $VALUES;

    public static EIType[] values() {
        return null;
    }

    public static EIType valueOf(String string) {
        return null;
    }

    private EIType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static EIType find(int n) {
        return null;
    }

    private static /* synthetic */ EIType[] $values() {
        return null;
    }

    static {
        $VALUES = EIType.$values();
        allValues = EIType.values();
    }
}

