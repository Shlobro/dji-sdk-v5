/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.remotecontroller;

import dji.jni.JNIProguardKeepTag;

public final class MissionCenterDeployErrorCode
extends Enum<MissionCenterDeployErrorCode>
implements JNIProguardKeepTag {
    public static final /* enum */ MissionCenterDeployErrorCode NO_ERROR = new MissionCenterDeployErrorCode(0);
    public static final /* enum */ MissionCenterDeployErrorCode LOCAL_CACHE_FAILE = new MissionCenterDeployErrorCode(1);
    public static final /* enum */ MissionCenterDeployErrorCode WLM_AIR_SET_FAILE = new MissionCenterDeployErrorCode(2);
    public static final /* enum */ MissionCenterDeployErrorCode WLM_GROUND_SET_FAILE = new MissionCenterDeployErrorCode(3);
    public static final /* enum */ MissionCenterDeployErrorCode DEPARTURE_POINT_SET_FAILE = new MissionCenterDeployErrorCode(4);
    public static final /* enum */ MissionCenterDeployErrorCode INVALID_REQUEST_IN_CURRENT_STATE = new MissionCenterDeployErrorCode(5);
    public static final /* enum */ MissionCenterDeployErrorCode INVALID_COMMAND_PARAMETER = new MissionCenterDeployErrorCode(6);
    public static final /* enum */ MissionCenterDeployErrorCode DATA_TRANFER_FAILE = new MissionCenterDeployErrorCode(7);
    public static final /* enum */ MissionCenterDeployErrorCode DATA_VERIFY_FAILE = new MissionCenterDeployErrorCode(8);
    public static final /* enum */ MissionCenterDeployErrorCode FILE_FLUSH_FAILE = new MissionCenterDeployErrorCode(9);
    public static final /* enum */ MissionCenterDeployErrorCode FILE_LOAD_FAILE = new MissionCenterDeployErrorCode(10);
    public static final /* enum */ MissionCenterDeployErrorCode FILE_PARSE_FAILE = new MissionCenterDeployErrorCode(11);
    public static final /* enum */ MissionCenterDeployErrorCode UNSUPPORT_COMMAND = new MissionCenterDeployErrorCode(255);
    public static final /* enum */ MissionCenterDeployErrorCode UNKNOWN = new MissionCenterDeployErrorCode(65535);
    private int value;
    private static final MissionCenterDeployErrorCode[] allValues;
    private static final /* synthetic */ MissionCenterDeployErrorCode[] $VALUES;

    public static MissionCenterDeployErrorCode[] values() {
        return null;
    }

    public static MissionCenterDeployErrorCode valueOf(String string) {
        return null;
    }

    private MissionCenterDeployErrorCode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static MissionCenterDeployErrorCode find(int n) {
        return null;
    }

    private static /* synthetic */ MissionCenterDeployErrorCode[] $values() {
        return null;
    }

    static {
        $VALUES = MissionCenterDeployErrorCode.$values();
        allValues = MissionCenterDeployErrorCode.values();
    }
}

