/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.innertool;

import dji.jni.JNIProguardKeepTag;

public final class DatalinkPhysicalType
extends Enum<DatalinkPhysicalType>
implements JNIProguardKeepTag {
    public static final /* enum */ DatalinkPhysicalType NONE = new DatalinkPhysicalType(0);
    public static final /* enum */ DatalinkPhysicalType AOA = new DatalinkPhysicalType(1);
    public static final /* enum */ DatalinkPhysicalType MFI = new DatalinkPhysicalType(2);
    public static final /* enum */ DatalinkPhysicalType WIFI = new DatalinkPhysicalType(3);
    public static final /* enum */ DatalinkPhysicalType BLE = new DatalinkPhysicalType(4);
    public static final /* enum */ DatalinkPhysicalType TCP = new DatalinkPhysicalType(5);
    public static final /* enum */ DatalinkPhysicalType UNKNOWN = new DatalinkPhysicalType(65535);
    private int value;
    private static final DatalinkPhysicalType[] allValues;
    private static final /* synthetic */ DatalinkPhysicalType[] $VALUES;

    public static DatalinkPhysicalType[] values() {
        return null;
    }

    public static DatalinkPhysicalType valueOf(String string) {
        return null;
    }

    private DatalinkPhysicalType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static DatalinkPhysicalType find(int n) {
        return null;
    }

    private static /* synthetic */ DatalinkPhysicalType[] $values() {
        return null;
    }

    static {
        $VALUES = DatalinkPhysicalType.$values();
        allValues = DatalinkPhysicalType.values();
    }
}

