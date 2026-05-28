/*
 * Decompiled with CFR 0.152.
 */
package dji.rtk.qx;

public final class QxStatus
extends Enum<QxStatus> {
    public static final /* enum */ QxStatus SET_COORDINATE_ERROR_CODE = new QxStatus(-506);
    public static final /* enum */ QxStatus NETWORK_ERROR = new QxStatus(1000);
    public static final /* enum */ QxStatus ILLEGAL_CONFIG = new QxStatus(1001);
    public static final /* enum */ QxStatus ILLEGAL_DSK = new QxStatus(1002);
    public static final /* enum */ QxStatus ILLEGAL_DSS = new QxStatus(1003);
    public static final /* enum */ QxStatus ILLEGAL_DEVICE_TYPE = new QxStatus(1004);
    public static final /* enum */ QxStatus ILLEGAL_DEVICE_ID = new QxStatus(1005);
    public static final /* enum */ QxStatus ILLEGAL_GGA = new QxStatus(1006);
    public static final /* enum */ QxStatus GGA_SEND_TIMEOUT = new QxStatus(1007);
    public static final /* enum */ QxStatus NO_SETTING_INIT_FUN = new QxStatus(1008);
    public static final /* enum */ QxStatus NOT_ACCESS_AUTH = new QxStatus(1009);
    public static final /* enum */ QxStatus GGA_OUT_OF_SERVER = new QxStatus(1010);
    public static final /* enum */ QxStatus AUTH_FAILED = new QxStatus(1011);
    public static final /* enum */ QxStatus CONNECTING = new QxStatus(1100);
    public static final /* enum */ QxStatus CONNECTED = new QxStatus(1101);
    public static final /* enum */ QxStatus RECEIVING_DATA = new QxStatus(1102);
    public static final /* enum */ QxStatus DISCONNECTED = new QxStatus(1103);
    public static final /* enum */ QxStatus SERVER_DISCONNECTED = new QxStatus(1104);
    public static final /* enum */ QxStatus GET_COOR_SYS_SUC = new QxStatus(1200);
    public static final /* enum */ QxStatus GET_COOR_SYS_FAIL = new QxStatus(1201);
    public static final /* enum */ QxStatus SET_COOR_SYS_SUC = new QxStatus(1202);
    public static final /* enum */ QxStatus SET_COOR_SYS_FAIL = new QxStatus(1203);
    public static final /* enum */ QxStatus OPEN_API_PARAM_ERROR = new QxStatus(1300);
    public static final /* enum */ QxStatus OPEN_API_SYSTEM_ERROR = new QxStatus(1301);
    public static final /* enum */ QxStatus OPEN_API_INVALID_RESPONSE = new QxStatus(1302);
    public static final /* enum */ QxStatus ACC_ACTIVE_SUCCESS = new QxStatus(1400);
    public static final /* enum */ QxStatus ACC_ACTIVE_FAIL = new QxStatus(1401);
    public static final /* enum */ QxStatus ACC_MANUAL_BIND_REQ = new QxStatus(1402);
    public static final /* enum */ QxStatus ACC_MISMATCH_DID_DSK = new QxStatus(1403);
    public static final /* enum */ QxStatus ACC_DSK_NOT_EXIST = new QxStatus(1404);
    public static final /* enum */ QxStatus ACC_TERM_ACT_REQ = new QxStatus(1405);
    public static final /* enum */ QxStatus ACC_MANUAL_ACT_REQ = new QxStatus(1406);
    public static final /* enum */ QxStatus ACC_NOT_EXIST = new QxStatus(1407);
    public static final /* enum */ QxStatus ACC_PAUSE = new QxStatus(1408);
    public static final /* enum */ QxStatus ACC_EXPIRED = new QxStatus(1409);
    public static final /* enum */ QxStatus ACC_ALREADY_ACTIVATED = new QxStatus(1410);
    public static final /* enum */ QxStatus ACC_TERM_ACT_NOT_ALLOWED = new QxStatus(1411);
    public static final /* enum */ QxStatus ACC_NOT_CAP = new QxStatus(1412);
    public static final /* enum */ QxStatus ACC_CAP_ERROR = new QxStatus(1413);
    public static final /* enum */ QxStatus ACC_DSK_BIND_FAIL = new QxStatus(1414);
    public static final /* enum */ QxStatus ACC_IN_SERVICE = new QxStatus(1415);
    public static final /* enum */ QxStatus PLAN_QUERY_SUCCESS = new QxStatus(1500);
    public static final /* enum */ QxStatus PLAN_QUERY_FAILURE = new QxStatus(1501);
    public static final /* enum */ QxStatus PLAN_NOT_DEFINED = new QxStatus(1502);
    public static final /* enum */ QxStatus RESUME_ALREADY_ACTIVE = new QxStatus(1503);
    public static final /* enum */ QxStatus RESUME_SUCCESSFULLY = new QxStatus(1504);
    public static final /* enum */ QxStatus RESUME_FAILED = new QxStatus(1505);
    public static final /* enum */ QxStatus UNKNOWN = new QxStatus(0);
    private int code;
    private static final /* synthetic */ QxStatus[] $VALUES;

    public static QxStatus[] values() {
        return null;
    }

    public static QxStatus valueOf(String string2) {
        return null;
    }

    private QxStatus(int n2) {
    }

    public int value() {
        return 0;
    }

    public static QxStatus find(int n) {
        return null;
    }

    private static /* synthetic */ QxStatus[] $values() {
        return null;
    }

    static {
        $VALUES = QxStatus.$values();
    }
}

