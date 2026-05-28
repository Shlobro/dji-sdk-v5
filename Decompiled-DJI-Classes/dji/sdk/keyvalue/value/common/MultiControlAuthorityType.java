/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.common;

import dji.jni.JNIProguardKeepTag;

public final class MultiControlAuthorityType
extends Enum<MultiControlAuthorityType>
implements JNIProguardKeepTag {
    public static final /* enum */ MultiControlAuthorityType FLIGHT_CONTROL_AUTHORITY = new MultiControlAuthorityType(1);
    public static final /* enum */ MultiControlAuthorityType PAYLOAD1_CONTROL_AUTH = new MultiControlAuthorityType(2);
    public static final /* enum */ MultiControlAuthorityType PAYLOAD2_CONTROL_AUTH = new MultiControlAuthorityType(3);
    public static final /* enum */ MultiControlAuthorityType PAYLOAD3_CONTROL_AUTH = new MultiControlAuthorityType(4);
    public static final /* enum */ MultiControlAuthorityType PAYLOAD4_CONTROL_AUTH = new MultiControlAuthorityType(5);
    public static final /* enum */ MultiControlAuthorityType PAYLOAD5_CONTROL_AUTH = new MultiControlAuthorityType(6);
    public static final /* enum */ MultiControlAuthorityType PAYLOAD6_CONTROL_AUTH = new MultiControlAuthorityType(7);
    public static final /* enum */ MultiControlAuthorityType PAYLOAD7_CONTROL_AUTH = new MultiControlAuthorityType(8);
    public static final /* enum */ MultiControlAuthorityType PAYLOAD8_CONTROL_AUTH = new MultiControlAuthorityType(9);
    public static final /* enum */ MultiControlAuthorityType FPV_FC_CONTROL_AUTH = new MultiControlAuthorityType(10);
    public static final /* enum */ MultiControlAuthorityType FPV_GIM_CONTROL_AUTH = new MultiControlAuthorityType(11);
    public static final /* enum */ MultiControlAuthorityType PAYLOAD1_GIM_CONTROL_AUTH = new MultiControlAuthorityType(12);
    public static final /* enum */ MultiControlAuthorityType PAYLOAD1_DEV_CONTROL_AUTH = new MultiControlAuthorityType(13);
    public static final /* enum */ MultiControlAuthorityType PAYLOAD2_GIM_CONTROL_AUTH = new MultiControlAuthorityType(14);
    public static final /* enum */ MultiControlAuthorityType PAYLOAD2_DEV_CONTROL_AUTH = new MultiControlAuthorityType(15);
    public static final /* enum */ MultiControlAuthorityType PAYLOAD3_GIM_CONTROL_AUTH = new MultiControlAuthorityType(16);
    public static final /* enum */ MultiControlAuthorityType PAYLOAD3_DEV_CONTROL_AUTH = new MultiControlAuthorityType(17);
    public static final /* enum */ MultiControlAuthorityType UNKNOWN = new MultiControlAuthorityType(255);
    public static final /* enum */ MultiControlAuthorityType FLIGHT_CONTROL_AUTH_OLD = new MultiControlAuthorityType(1);
    public static final /* enum */ MultiControlAuthorityType GIMBAL_LEFT_CONTROL_AUTHORITY = new MultiControlAuthorityType(2);
    public static final /* enum */ MultiControlAuthorityType GIMBAL_RIGHT_CONTROL_AUTHORITY = new MultiControlAuthorityType(3);
    public static final /* enum */ MultiControlAuthorityType GIMBAL_UP_CONTROL_AUTHORITY = new MultiControlAuthorityType(4);
    private int value;
    private static final MultiControlAuthorityType[] allValues;
    private static final /* synthetic */ MultiControlAuthorityType[] $VALUES;

    public static MultiControlAuthorityType[] values() {
        return null;
    }

    public static MultiControlAuthorityType valueOf(String string) {
        return null;
    }

    private MultiControlAuthorityType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static MultiControlAuthorityType find(int n) {
        return null;
    }

    private static /* synthetic */ MultiControlAuthorityType[] $values() {
        return null;
    }

    static {
        $VALUES = MultiControlAuthorityType.$values();
        allValues = MultiControlAuthorityType.values();
    }
}

