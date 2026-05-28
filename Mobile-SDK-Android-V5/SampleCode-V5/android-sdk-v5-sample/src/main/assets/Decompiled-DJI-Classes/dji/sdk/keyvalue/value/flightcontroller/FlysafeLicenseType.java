/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class FlysafeLicenseType
extends Enum<FlysafeLicenseType>
implements JNIProguardKeepTag {
    public static final /* enum */ FlysafeLicenseType AREA_UNLOCK = new FlysafeLicenseType(0);
    public static final /* enum */ FlysafeLicenseType CIRCLE_UNLOCK = new FlysafeLicenseType(1);
    public static final /* enum */ FlysafeLicenseType COUNTRY_UNLOCK = new FlysafeLicenseType(2);
    public static final /* enum */ FlysafeLicenseType HEIGHT_LIMIT_UNLOCK = new FlysafeLicenseType(3);
    public static final /* enum */ FlysafeLicenseType POLYGON_UNLOCK = new FlysafeLicenseType(4);
    public static final /* enum */ FlysafeLicenseType POWER_UNLOCK = new FlysafeLicenseType(5);
    public static final /* enum */ FlysafeLicenseType RID_UNLOCK = new FlysafeLicenseType(6);
    public static final /* enum */ FlysafeLicenseType UNKNOWN = new FlysafeLicenseType(65535);
    private int value;
    private static final FlysafeLicenseType[] allValues;
    private static final /* synthetic */ FlysafeLicenseType[] $VALUES;

    public static FlysafeLicenseType[] values() {
        return null;
    }

    public static FlysafeLicenseType valueOf(String string) {
        return null;
    }

    private FlysafeLicenseType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static FlysafeLicenseType find(int n) {
        return null;
    }

    private static /* synthetic */ FlysafeLicenseType[] $values() {
        return null;
    }

    static {
        $VALUES = FlysafeLicenseType.$values();
        allValues = FlysafeLicenseType.values();
    }
}

