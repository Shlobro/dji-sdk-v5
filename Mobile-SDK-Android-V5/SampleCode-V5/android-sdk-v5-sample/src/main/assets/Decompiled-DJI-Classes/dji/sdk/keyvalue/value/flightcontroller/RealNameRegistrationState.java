/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class RealNameRegistrationState
extends Enum<RealNameRegistrationState>
implements JNIProguardKeepTag {
    public static final /* enum */ RealNameRegistrationState NOT_AUTH = new RealNameRegistrationState(1);
    public static final /* enum */ RealNameRegistrationState VAILD_AUTH = new RealNameRegistrationState(2);
    public static final /* enum */ RealNameRegistrationState CANCELLED = new RealNameRegistrationState(3);
    public static final /* enum */ RealNameRegistrationState NETWORK_ERROR = new RealNameRegistrationState(4);
    public static final /* enum */ RealNameRegistrationState VERIFIED_AND_CANCLLED = new RealNameRegistrationState(5);
    public static final /* enum */ RealNameRegistrationState TMP_VALID_AUTH = new RealNameRegistrationState(6);
    public static final /* enum */ RealNameRegistrationState UNSUPPORTED = new RealNameRegistrationState(7);
    public static final /* enum */ RealNameRegistrationState NOT_ACTIVE_YET = new RealNameRegistrationState(8);
    public static final /* enum */ RealNameRegistrationState DONT_NEED_CHECK_REALNAME = new RealNameRegistrationState(9);
    public static final /* enum */ RealNameRegistrationState UNLOCKED = new RealNameRegistrationState(10);
    public static final /* enum */ RealNameRegistrationState DONT_IN_CHINA_MAINLAND = new RealNameRegistrationState(11);
    public static final /* enum */ RealNameRegistrationState UNKNOWN = new RealNameRegistrationState(65535);
    private int value;
    private static final RealNameRegistrationState[] allValues;
    private static final /* synthetic */ RealNameRegistrationState[] $VALUES;

    public static RealNameRegistrationState[] values() {
        return null;
    }

    public static RealNameRegistrationState valueOf(String string) {
        return null;
    }

    private RealNameRegistrationState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static RealNameRegistrationState find(int n) {
        return null;
    }

    private static /* synthetic */ RealNameRegistrationState[] $values() {
        return null;
    }

    static {
        $VALUES = RealNameRegistrationState.$values();
        allValues = RealNameRegistrationState.values();
    }
}

