/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.rtkmobilestation;

import dji.jni.JNIProguardKeepTag;

public final class GNSSType
extends Enum<GNSSType>
implements JNIProguardKeepTag {
    public static final /* enum */ GNSSType GPS = new GNSSType(0);
    public static final /* enum */ GNSSType GLONASS = new GNSSType(1);
    public static final /* enum */ GNSSType GALILEO = new GNSSType(2);
    public static final /* enum */ GNSSType BEIDOU = new GNSSType(3);
    public static final /* enum */ GNSSType QZSS = new GNSSType(4);
    public static final /* enum */ GNSSType UNKNOWN = new GNSSType(65535);
    private int value;
    private static final GNSSType[] allValues;
    private static final /* synthetic */ GNSSType[] $VALUES;

    public static GNSSType[] values() {
        return null;
    }

    public static GNSSType valueOf(String string) {
        return null;
    }

    private GNSSType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static GNSSType find(int n) {
        return null;
    }

    private static /* synthetic */ GNSSType[] $values() {
        return null;
    }

    static {
        $VALUES = GNSSType.$values();
        allValues = GNSSType.values();
    }
}

