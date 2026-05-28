/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class FCGNSSType
extends Enum<FCGNSSType>
implements JNIProguardKeepTag {
    public static final /* enum */ FCGNSSType GPS = new FCGNSSType(0);
    public static final /* enum */ FCGNSSType SBAS = new FCGNSSType(1);
    public static final /* enum */ FCGNSSType GALILEO = new FCGNSSType(2);
    public static final /* enum */ FCGNSSType BEIDOU = new FCGNSSType(3);
    public static final /* enum */ FCGNSSType IMES = new FCGNSSType(4);
    public static final /* enum */ FCGNSSType QZSS = new FCGNSSType(5);
    public static final /* enum */ FCGNSSType GLONASS = new FCGNSSType(6);
    public static final /* enum */ FCGNSSType UNKNOWN = new FCGNSSType(255);
    private int value;
    private static final FCGNSSType[] allValues;
    private static final /* synthetic */ FCGNSSType[] $VALUES;

    public static FCGNSSType[] values() {
        return null;
    }

    public static FCGNSSType valueOf(String string) {
        return null;
    }

    private FCGNSSType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static FCGNSSType find(int n) {
        return null;
    }

    private static /* synthetic */ FCGNSSType[] $values() {
        return null;
    }

    static {
        $VALUES = FCGNSSType.$values();
        allValues = FCGNSSType.values();
    }
}

