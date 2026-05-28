/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.mobilenetwork;

import dji.jni.JNIProguardKeepTag;

public final class DataModule4GCardType
extends Enum<DataModule4GCardType>
implements JNIProguardKeepTag {
    public static final /* enum */ DataModule4GCardType ZTE = new DataModule4GCardType(1);
    public static final /* enum */ DataModule4GCardType NOTIO = new DataModule4GCardType(2);
    public static final /* enum */ DataModule4GCardType NOT_VAILD = new DataModule4GCardType(3);
    public static final /* enum */ DataModule4GCardType NODATA = new DataModule4GCardType(4);
    public static final /* enum */ DataModule4GCardType HUAWEI = new DataModule4GCardType(5);
    public static final /* enum */ DataModule4GCardType VERIZON = new DataModule4GCardType(6);
    public static final /* enum */ DataModule4GCardType UNKNOWN = new DataModule4GCardType(65535);
    private int value;
    private static final DataModule4GCardType[] allValues;
    private static final /* synthetic */ DataModule4GCardType[] $VALUES;

    public static DataModule4GCardType[] values() {
        return null;
    }

    public static DataModule4GCardType valueOf(String string) {
        return null;
    }

    private DataModule4GCardType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static DataModule4GCardType find(int n) {
        return null;
    }

    private static /* synthetic */ DataModule4GCardType[] $values() {
        return null;
    }

    static {
        $VALUES = DataModule4GCardType.$values();
        allValues = DataModule4GCardType.values();
    }
}

