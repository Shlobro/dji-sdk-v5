/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.hms;

import dji.jni.JNIProguardKeepTag;

public final class HMSMaintainType
extends Enum<HMSMaintainType>
implements JNIProguardKeepTag {
    public static final /* enum */ HMSMaintainType AIRCRAFT_BASIC_MAINTAIN = new HMSMaintainType(1);
    public static final /* enum */ HMSMaintainType AIRCRAFT_ROUTINE_MAINTAIN = new HMSMaintainType(2);
    public static final /* enum */ HMSMaintainType AIRCRAFT_DEEP_MAINTAIN = new HMSMaintainType(3);
    public static final /* enum */ HMSMaintainType CAMERA_LENS_MENTAIN = new HMSMaintainType(16);
    public static final /* enum */ HMSMaintainType DRONE_NEST_MENTAIN = new HMSMaintainType(17);
    public static final /* enum */ HMSMaintainType DRONE_NEST_DEEP_MENTAIN = new HMSMaintainType(18);
    public static final /* enum */ HMSMaintainType UNKNOWN = new HMSMaintainType(65535);
    private int value;
    private static final HMSMaintainType[] allValues;
    private static final /* synthetic */ HMSMaintainType[] $VALUES;

    public static HMSMaintainType[] values() {
        return null;
    }

    public static HMSMaintainType valueOf(String string) {
        return null;
    }

    private HMSMaintainType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static HMSMaintainType find(int n) {
        return null;
    }

    private static /* synthetic */ HMSMaintainType[] $values() {
        return null;
    }

    static {
        $VALUES = HMSMaintainType.$values();
        allValues = HMSMaintainType.values();
    }
}

