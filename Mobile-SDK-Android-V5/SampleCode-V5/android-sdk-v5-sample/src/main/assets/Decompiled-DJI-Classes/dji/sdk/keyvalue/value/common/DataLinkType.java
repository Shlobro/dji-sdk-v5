/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.common;

import dji.jni.JNIProguardKeepTag;

public final class DataLinkType
extends Enum<DataLinkType>
implements JNIProguardKeepTag {
    public static final /* enum */ DataLinkType MFI = new DataLinkType(0);
    public static final /* enum */ DataLinkType AOA = new DataLinkType(1);
    public static final /* enum */ DataLinkType TCP = new DataLinkType(2);
    public static final /* enum */ DataLinkType WIFI = new DataLinkType(3);
    public static final /* enum */ DataLinkType BLE = new DataLinkType(4);
    public static final /* enum */ DataLinkType UDT = new DataLinkType(5);
    public static final /* enum */ DataLinkType COM = new DataLinkType(6);
    public static final /* enum */ DataLinkType WLM = new DataLinkType(7);
    public static final /* enum */ DataLinkType UNKNOWN = new DataLinkType(65535);
    private int value;
    private static final DataLinkType[] allValues;
    private static final /* synthetic */ DataLinkType[] $VALUES;

    public static DataLinkType[] values() {
        return null;
    }

    public static DataLinkType valueOf(String string) {
        return null;
    }

    private DataLinkType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static DataLinkType find(int n) {
        return null;
    }

    private static /* synthetic */ DataLinkType[] $values() {
        return null;
    }

    static {
        $VALUES = DataLinkType.$values();
        allValues = DataLinkType.values();
    }
}

