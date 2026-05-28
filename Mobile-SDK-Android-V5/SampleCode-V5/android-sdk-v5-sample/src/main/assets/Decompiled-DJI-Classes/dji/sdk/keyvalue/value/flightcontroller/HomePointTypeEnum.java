/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class HomePointTypeEnum
extends Enum<HomePointTypeEnum>
implements JNIProguardKeepTag {
    public static final /* enum */ HomePointTypeEnum NOT_SET = new HomePointTypeEnum(0);
    public static final /* enum */ HomePointTypeEnum SET_BY_ITSELF = new HomePointTypeEnum(1);
    public static final /* enum */ HomePointTypeEnum SET_BY_START_MOTOR = new HomePointTypeEnum(2);
    public static final /* enum */ HomePointTypeEnum SET_BY_RC = new HomePointTypeEnum(3);
    public static final /* enum */ HomePointTypeEnum SET_CUR_CRAFT_BY_APP = new HomePointTypeEnum(4);
    public static final /* enum */ HomePointTypeEnum SET_CUR_USER_BY_APP = new HomePointTypeEnum(5);
    public static final /* enum */ HomePointTypeEnum SET_BASE_STATION = new HomePointTypeEnum(6);
    public static final /* enum */ HomePointTypeEnum SET_BACKUP_POINT = new HomePointTypeEnum(7);
    public static final /* enum */ HomePointTypeEnum SET_AG_AUTOPLATFORM = new HomePointTypeEnum(8);
    public static final /* enum */ HomePointTypeEnum SET_AG_AUTOPLATFORM_BACKUP = new HomePointTypeEnum(9);
    public static final /* enum */ HomePointTypeEnum SET_BEACON_BY_APP = new HomePointTypeEnum(10);
    public static final /* enum */ HomePointTypeEnum SET_BY_DYNAMIC_BEACON = new HomePointTypeEnum(11);
    public static final /* enum */ HomePointTypeEnum SET_BY_DYNAMIC_RC = new HomePointTypeEnum(12);
    public static final /* enum */ HomePointTypeEnum SET_TAKEOFF_BY_SLAM = new HomePointTypeEnum(13);
    public static final /* enum */ HomePointTypeEnum UNKNOWN = new HomePointTypeEnum(65535);
    private int value;
    private static final HomePointTypeEnum[] allValues;
    private static final /* synthetic */ HomePointTypeEnum[] $VALUES;

    public static HomePointTypeEnum[] values() {
        return null;
    }

    public static HomePointTypeEnum valueOf(String string) {
        return null;
    }

    private HomePointTypeEnum(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static HomePointTypeEnum find(int n) {
        return null;
    }

    private static /* synthetic */ HomePointTypeEnum[] $values() {
        return null;
    }

    static {
        $VALUES = HomePointTypeEnum.$values();
        allValues = HomePointTypeEnum.values();
    }
}

