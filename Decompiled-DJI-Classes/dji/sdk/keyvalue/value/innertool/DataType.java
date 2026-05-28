/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.innertool;

import dji.jni.JNIProguardKeepTag;

public final class DataType
extends Enum<DataType>
implements JNIProguardKeepTag {
    public static final /* enum */ DataType RAW_V1 = new DataType(0);
    public static final /* enum */ DataType RAW_VIDEO = new DataType(1);
    public static final /* enum */ DataType RAW_COMPOSITE = new DataType(2);
    public static final /* enum */ DataType V1 = new DataType(10);
    public static final /* enum */ DataType VIDEO = new DataType(11);
    public static final /* enum */ DataType V3 = new DataType(12);
    public static final /* enum */ DataType UNKNOWN = new DataType(65535);
    private int value;
    private static final DataType[] allValues;
    private static final /* synthetic */ DataType[] $VALUES;

    public static DataType[] values() {
        return null;
    }

    public static DataType valueOf(String string) {
        return null;
    }

    private DataType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static DataType find(int n) {
        return null;
    }

    private static /* synthetic */ DataType[] $values() {
        return null;
    }

    static {
        $VALUES = DataType.$values();
        allValues = DataType.values();
    }
}

