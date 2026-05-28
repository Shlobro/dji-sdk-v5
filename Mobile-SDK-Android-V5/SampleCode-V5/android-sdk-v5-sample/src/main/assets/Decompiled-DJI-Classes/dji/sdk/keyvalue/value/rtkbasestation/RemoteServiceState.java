/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.rtkbasestation;

import dji.jni.JNIProguardKeepTag;

public final class RemoteServiceState
extends Enum<RemoteServiceState>
implements JNIProguardKeepTag {
    public static final /* enum */ RemoteServiceState DISABLED = new RemoteServiceState(0);
    public static final /* enum */ RemoteServiceState NETWORK_NOT_REACHABLE = new RemoteServiceState(1);
    public static final /* enum */ RemoteServiceState SERVER_NOT_REACHABLE = new RemoteServiceState(2);
    public static final /* enum */ RemoteServiceState SERVER_CONNECT = new RemoteServiceState(3);
    public static final /* enum */ RemoteServiceState AIRCRAFT_DISCONNECTED = new RemoteServiceState(4);
    public static final /* enum */ RemoteServiceState ILLEGAL_CONFIG_INFORMATION = new RemoteServiceState(5);
    public static final /* enum */ RemoteServiceState LOGIN_FAILURE = new RemoteServiceState(6);
    public static final /* enum */ RemoteServiceState READY_TO_CONNECT = new RemoteServiceState(7);
    public static final /* enum */ RemoteServiceState TRANSIMISSION_TO_FC = new RemoteServiceState(8);
    public static final /* enum */ RemoteServiceState TRANSIMISSION = new RemoteServiceState(9);
    public static final /* enum */ RemoteServiceState REQUEST_GGA = new RemoteServiceState(10);
    public static final /* enum */ RemoteServiceState BROKEN = new RemoteServiceState(11);
    public static final /* enum */ RemoteServiceState ACCOUNT_PAUSE = new RemoteServiceState(12);
    public static final /* enum */ RemoteServiceState ILLEGAL_GGA_DATA = new RemoteServiceState(13);
    public static final /* enum */ RemoteServiceState SEND_GGA_TIMEOUT = new RemoteServiceState(14);
    public static final /* enum */ RemoteServiceState SERVER_CONNECTING = new RemoteServiceState(15);
    public static final /* enum */ RemoteServiceState ACCOUNT_EXPIRED = new RemoteServiceState(16);
    public static final /* enum */ RemoteServiceState ACCOUNT_NOT_EXIST = new RemoteServiceState(17);
    public static final /* enum */ RemoteServiceState ACCOUNT_UNACTIVATED = new RemoteServiceState(18);
    public static final /* enum */ RemoteServiceState ACCOUNT_ERROR = new RemoteServiceState(19);
    public static final /* enum */ RemoteServiceState RTCM_USE_DEFAULT_MOUNT_POINT = new RemoteServiceState(20);
    public static final /* enum */ RemoteServiceState RTCM_USER_NOT_ACTIVATED = new RemoteServiceState(21);
    public static final /* enum */ RemoteServiceState RTCM_USER_HAS_ACTIVATED = new RemoteServiceState(22);
    public static final /* enum */ RemoteServiceState RTCM_USER_NOT_BOUND = new RemoteServiceState(23);
    public static final /* enum */ RemoteServiceState RTCM_USER_ACCOUNT_EXPIRED = new RemoteServiceState(24);
    public static final /* enum */ RemoteServiceState RTCM_USER_ACCOUNT_EXPIRES_SOON = new RemoteServiceState(25);
    public static final /* enum */ RemoteServiceState RTCM_ILLEGAL_UTC_TIME = new RemoteServiceState(26);
    public static final /* enum */ RemoteServiceState RTCM_CONNECTING = new RemoteServiceState(27);
    public static final /* enum */ RemoteServiceState RTCM_NORMAL = new RemoteServiceState(28);
    public static final /* enum */ RemoteServiceState RTCM_SET_COORDINATE_FAILURE = new RemoteServiceState(29);
    public static final /* enum */ RemoteServiceState RTCM_ACTIVATED_FAILED = new RemoteServiceState(31);
    public static final /* enum */ RemoteServiceState RTCM_GET_REMOTECONTROLLER_SERIAL_NUMBER_FAILED = new RemoteServiceState(32);
    public static final /* enum */ RemoteServiceState RTK_IN_START_PROCESS = new RemoteServiceState(33);
    public static final /* enum */ RemoteServiceState SEND_GGA_NO_VALID_BASE = new RemoteServiceState(34);
    public static final /* enum */ RemoteServiceState UNKNOWN = new RemoteServiceState(65535);
    private int value;
    private static final RemoteServiceState[] allValues;
    private static final /* synthetic */ RemoteServiceState[] $VALUES;

    public static RemoteServiceState[] values() {
        return null;
    }

    public static RemoteServiceState valueOf(String string) {
        return null;
    }

    private RemoteServiceState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static RemoteServiceState find(int n) {
        return null;
    }

    private static /* synthetic */ RemoteServiceState[] $values() {
        return null;
    }

    static {
        $VALUES = RemoteServiceState.$values();
        allValues = RemoteServiceState.values();
    }
}

