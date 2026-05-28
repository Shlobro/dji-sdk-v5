/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.rtkbasestation;

import dji.jni.JNIProguardKeepTag;

public final class RTKServiceState
extends Enum<RTKServiceState>
implements JNIProguardKeepTag {
    public static final /* enum */ RTKServiceState RTCM_CONNECTED = new RTKServiceState(0);
    public static final /* enum */ RTKServiceState RTCM_NORMAL = new RTKServiceState(1);
    public static final /* enum */ RTKServiceState RTCM_USER_HAS_ACTIVATE = new RTKServiceState(2);
    public static final /* enum */ RTKServiceState RTCM_USER_ACCOUNT_EXPIRES_SOON = new RTKServiceState(3);
    public static final /* enum */ RTKServiceState RTCM_USE_DEFAULT_MOUNT_POINT = new RTKServiceState(4);
    public static final /* enum */ RTKServiceState RTCM_AUTH_FAILED = new RTKServiceState(5);
    public static final /* enum */ RTKServiceState RTCM_USER_NOT_BOUNDED = new RTKServiceState(6);
    public static final /* enum */ RTKServiceState RTCM_USER_NOT_ACTIVATED = new RTKServiceState(7);
    public static final /* enum */ RTKServiceState ACCOUNT_EXPIRED = new RTKServiceState(8);
    public static final /* enum */ RTKServiceState RTCM_ILLEGAL_UTC_TIME = new RTKServiceState(9);
    public static final /* enum */ RTKServiceState RTCM_SET_COORDINATE_FAILURE = new RTKServiceState(10);
    public static final /* enum */ RTKServiceState RTCM_CONNECTING = new RTKServiceState(11);
    public static final /* enum */ RTKServiceState RTCM_ACTIVATED_FAILED = new RTKServiceState(12);
    public static final /* enum */ RTKServiceState DISABLED = new RTKServiceState(13);
    public static final /* enum */ RTKServiceState AIRCRAFT_DISCONNECTED = new RTKServiceState(14);
    public static final /* enum */ RTKServiceState CONNECTING = new RTKServiceState(15);
    public static final /* enum */ RTKServiceState TRANSMITTING = new RTKServiceState(16);
    public static final /* enum */ RTKServiceState LOGIN_FAILURE = new RTKServiceState(17);
    public static final /* enum */ RTKServiceState INVALID_REQUEST = new RTKServiceState(18);
    public static final /* enum */ RTKServiceState ACCOUNT_ERROR = new RTKServiceState(19);
    public static final /* enum */ RTKServiceState NETWORK_NOT_REACHABLE = new RTKServiceState(20);
    public static final /* enum */ RTKServiceState SERVER_NOT_REACHABLE = new RTKServiceState(21);
    public static final /* enum */ RTKServiceState SERVICE_SUSPENSION = new RTKServiceState(22);
    public static final /* enum */ RTKServiceState DISCONNECTED = new RTKServiceState(23);
    public static final /* enum */ RTKServiceState READY = new RTKServiceState(24);
    public static final /* enum */ RTKServiceState SEND_GGA_NO_VALID_BASE = new RTKServiceState(33);
    public static final /* enum */ RTKServiceState RTK_START_PROCESSING = new RTKServiceState(25);
    public static final /* enum */ RTKServiceState UNKNOWN = new RTKServiceState(65535);
    private int value;
    private static final RTKServiceState[] allValues;
    private static final /* synthetic */ RTKServiceState[] $VALUES;

    public static RTKServiceState[] values() {
        return null;
    }

    public static RTKServiceState valueOf(String string) {
        return null;
    }

    private RTKServiceState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static RTKServiceState find(int n) {
        return null;
    }

    private static /* synthetic */ RTKServiceState[] $values() {
        return null;
    }

    static {
        $VALUES = RTKServiceState.$values();
        allValues = RTKServiceState.values();
    }
}

