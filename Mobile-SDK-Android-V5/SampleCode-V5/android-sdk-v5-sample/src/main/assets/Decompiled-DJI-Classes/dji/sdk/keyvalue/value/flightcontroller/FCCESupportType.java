/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class FCCESupportType
extends Enum<FCCESupportType>
implements JNIProguardKeepTag {
    public static final /* enum */ FCCESupportType SUPPORT_C0 = new FCCESupportType(0);
    public static final /* enum */ FCCESupportType SUPPORT_C1 = new FCCESupportType(1);
    public static final /* enum */ FCCESupportType SUPPORT_C2 = new FCCESupportType(2);
    public static final /* enum */ FCCESupportType SUPPORT_C3 = new FCCESupportType(3);
    public static final /* enum */ FCCESupportType SUPPORT_C4 = new FCCESupportType(4);
    public static final /* enum */ FCCESupportType NONE = new FCCESupportType(240);
    public static final /* enum */ FCCESupportType UNSUPPORT = new FCCESupportType(255);
    public static final /* enum */ FCCESupportType UNKNOWN = new FCCESupportType(65535);
    private int value;
    private static final FCCESupportType[] allValues;
    private static final /* synthetic */ FCCESupportType[] $VALUES;

    public static FCCESupportType[] values() {
        return null;
    }

    public static FCCESupportType valueOf(String string) {
        return null;
    }

    private FCCESupportType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static FCCESupportType find(int n) {
        return null;
    }

    private static /* synthetic */ FCCESupportType[] $values() {
        return null;
    }

    static {
        $VALUES = FCCESupportType.$values();
        allValues = FCCESupportType.values();
    }
}

