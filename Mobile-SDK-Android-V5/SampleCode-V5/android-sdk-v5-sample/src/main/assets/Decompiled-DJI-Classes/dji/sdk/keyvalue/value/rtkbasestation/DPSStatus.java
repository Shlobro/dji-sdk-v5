/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.rtkbasestation;

import dji.jni.JNIProguardKeepTag;

public final class DPSStatus
extends Enum<DPSStatus>
implements JNIProguardKeepTag {
    public static final /* enum */ DPSStatus NETWORK_ERROR = new DPSStatus(1000);
    public static final /* enum */ DPSStatus ILLEGAL_CONFIG = new DPSStatus(1001);
    public static final /* enum */ DPSStatus ILLEGAL_DSK = new DPSStatus(1002);
    public static final /* enum */ DPSStatus ILLEGAL_DSS = new DPSStatus(1003);
    public static final /* enum */ DPSStatus ILLEGAL_DEVICE_TYPE = new DPSStatus(1004);
    public static final /* enum */ DPSStatus ILLEGAL_DEVICE_ID = new DPSStatus(1005);
    public static final /* enum */ DPSStatus ILLEGAL_GGA = new DPSStatus(1006);
    public static final /* enum */ DPSStatus GGA_SEND_TIMEOUT = new DPSStatus(1007);
    public static final /* enum */ DPSStatus NO_SETTING_INIT_FUN = new DPSStatus(1008);
    public static final /* enum */ DPSStatus OUT_OF_SERVICE_AREA = new DPSStatus(1010);
    public static final /* enum */ DPSStatus CONNECTING = new DPSStatus(1100);
    public static final /* enum */ DPSStatus CONNECTED = new DPSStatus(1101);
    public static final /* enum */ DPSStatus RECEIVING_DATA = new DPSStatus(1102);
    public static final /* enum */ DPSStatus DISCONNECTED = new DPSStatus(1103);
    public static final /* enum */ DPSStatus SERVER_DISCONNECTED = new DPSStatus(1104);
    public static final /* enum */ DPSStatus GET_COOR_SYS_SUC = new DPSStatus(1200);
    public static final /* enum */ DPSStatus GET_COOR_SYS_FAIL = new DPSStatus(1201);
    public static final /* enum */ DPSStatus SET_COOR_SYS_SUC = new DPSStatus(1202);
    public static final /* enum */ DPSStatus SET_COOR_SYS_FAIL = new DPSStatus(1203);
    public static final /* enum */ DPSStatus ACC_ACTIVE_SUCCESS = new DPSStatus(1400);
    public static final /* enum */ DPSStatus ACC_ACTIVE_FAIL = new DPSStatus(1401);
    public static final /* enum */ DPSStatus ACC_MANUAL_BIND_REQ = new DPSStatus(1402);
    public static final /* enum */ DPSStatus ACC_MISMATCH_DID_DSK = new DPSStatus(1403);
    public static final /* enum */ DPSStatus ACC_DSK_NOT_EXIST = new DPSStatus(1404);
    public static final /* enum */ DPSStatus ACC_TERM_ACT_REQ = new DPSStatus(1405);
    public static final /* enum */ DPSStatus ACC_MANUAL_ACT_REQ = new DPSStatus(1406);
    public static final /* enum */ DPSStatus ACC_NOT_EXIST = new DPSStatus(1407);
    public static final /* enum */ DPSStatus ACC_PAUSE = new DPSStatus(1408);
    public static final /* enum */ DPSStatus ACC_EXPIRED = new DPSStatus(1409);
    public static final /* enum */ DPSStatus ACC_ALREADY_ACTIVATED = new DPSStatus(1410);
    public static final /* enum */ DPSStatus ACC_TERM_ACT_NOT_ALLOWED = new DPSStatus(1411);
    public static final /* enum */ DPSStatus ACC_NOT_CAP = new DPSStatus(1412);
    public static final /* enum */ DPSStatus ACC_CAP_ERROR = new DPSStatus(1413);
    public static final /* enum */ DPSStatus ACC_DSK_BIND_FAIL = new DPSStatus(1414);
    public static final /* enum */ DPSStatus ACC_IN_SERVICE = new DPSStatus(1415);
    public static final /* enum */ DPSStatus UNKNOWN = new DPSStatus(65535);
    private int value;
    private static final DPSStatus[] allValues;
    private static final /* synthetic */ DPSStatus[] $VALUES;

    public static DPSStatus[] values() {
        return null;
    }

    public static DPSStatus valueOf(String string) {
        return null;
    }

    private DPSStatus(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static DPSStatus find(int n) {
        return null;
    }

    private static /* synthetic */ DPSStatus[] $values() {
        return null;
    }

    static {
        $VALUES = DPSStatus.$values();
        allValues = DPSStatus.values();
    }
}

