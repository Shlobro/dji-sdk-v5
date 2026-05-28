/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.wlm;

import dji.jni.JNIProguardKeepTag;

public final class RadioType
extends Enum<RadioType>
implements JNIProguardKeepTag {
    public static final /* enum */ RadioType RT_INVALID = new RadioType(0);
    public static final /* enum */ RadioType RT_GSM = new RadioType(1);
    public static final /* enum */ RadioType RT_CDMA = new RadioType(2);
    public static final /* enum */ RadioType RT_3G = new RadioType(3);
    public static final /* enum */ RadioType RT_4G = new RadioType(4);
    public static final /* enum */ RadioType RT_5G = new RadioType(5);
    public static final /* enum */ RadioType RT_WIFI = new RadioType(6);
    public static final /* enum */ RadioType UNKNOWN = new RadioType(65535);
    private int value;
    private static final RadioType[] allValues;
    private static final /* synthetic */ RadioType[] $VALUES;

    public static RadioType[] values() {
        return null;
    }

    public static RadioType valueOf(String string) {
        return null;
    }

    private RadioType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static RadioType find(int n) {
        return null;
    }

    private static /* synthetic */ RadioType[] $values() {
        return null;
    }

    static {
        $VALUES = RadioType.$values();
        allValues = RadioType.values();
    }
}

