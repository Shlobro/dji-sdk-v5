/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.rtkbasestation;

import dji.jni.JNIProguardKeepTag;

public final class RTKBaseStationParamId
extends Enum<RTKBaseStationParamId>
implements JNIProguardKeepTag {
    public static final /* enum */ RTKBaseStationParamId MODE = new RTKBaseStationParamId(0);
    public static final /* enum */ RTKBaseStationParamId SDR_PAIR = new RTKBaseStationParamId(2);
    public static final /* enum */ RTKBaseStationParamId BS_SATELLITE_NUM = new RTKBaseStationParamId(22);
    public static final /* enum */ RTKBaseStationParamId WIFI_WORK_MODE = new RTKBaseStationParamId(25);
    public static final /* enum */ RTKBaseStationParamId WIFI_STATE = new RTKBaseStationParamId(26);
    public static final /* enum */ RTKBaseStationParamId WIFI_CHANNEL = new RTKBaseStationParamId(27);
    public static final /* enum */ RTKBaseStationParamId DEVICE_NAME = new RTKBaseStationParamId(28);
    public static final /* enum */ RTKBaseStationParamId DEVICE_PWD = new RTKBaseStationParamId(29);
    public static final /* enum */ RTKBaseStationParamId WIFI_PWD = new RTKBaseStationParamId(30);
    public static final /* enum */ RTKBaseStationParamId BS_GPS_LOCATION = new RTKBaseStationParamId(31);
    public static final /* enum */ RTKBaseStationParamId CORS_SERVER_ADDR = new RTKBaseStationParamId(32);
    public static final /* enum */ RTKBaseStationParamId CORS_SERVER_PORT = new RTKBaseStationParamId(33);
    public static final /* enum */ RTKBaseStationParamId CORS_LOGIN_ACCOUNT = new RTKBaseStationParamId(34);
    public static final /* enum */ RTKBaseStationParamId CORS_LOGIN_PWD = new RTKBaseStationParamId(35);
    public static final /* enum */ RTKBaseStationParamId DEVICE_BATTERY = new RTKBaseStationParamId(36);
    public static final /* enum */ RTKBaseStationParamId BS_NAME = new RTKBaseStationParamId(41);
    public static final /* enum */ RTKBaseStationParamId BS_ADMIN_LOGIN = new RTKBaseStationParamId(42);
    public static final /* enum */ RTKBaseStationParamId BS_NEW_ADMIN_PWD = new RTKBaseStationParamId(43);
    public static final /* enum */ RTKBaseStationParamId BS_NEW_GPS_LOCATION = new RTKBaseStationParamId(44);
    public static final /* enum */ RTKBaseStationParamId UNKNOWN = new RTKBaseStationParamId(65535);
    private int value;
    private static final RTKBaseStationParamId[] allValues;
    private static final /* synthetic */ RTKBaseStationParamId[] $VALUES;

    public static RTKBaseStationParamId[] values() {
        return null;
    }

    public static RTKBaseStationParamId valueOf(String string) {
        return null;
    }

    private RTKBaseStationParamId(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static RTKBaseStationParamId find(int n) {
        return null;
    }

    private static /* synthetic */ RTKBaseStationParamId[] $values() {
        return null;
    }

    static {
        $VALUES = RTKBaseStationParamId.$values();
        allValues = RTKBaseStationParamId.values();
    }
}

