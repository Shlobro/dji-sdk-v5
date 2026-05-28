/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.mission;

import dji.jni.JNIProguardKeepTag;

public final class WaylineActionRecordPointCloudOperateType
extends Enum<WaylineActionRecordPointCloudOperateType>
implements JNIProguardKeepTag {
    public static final /* enum */ WaylineActionRecordPointCloudOperateType STOP_RECORD = new WaylineActionRecordPointCloudOperateType(0);
    public static final /* enum */ WaylineActionRecordPointCloudOperateType START_RECORD = new WaylineActionRecordPointCloudOperateType(1);
    public static final /* enum */ WaylineActionRecordPointCloudOperateType PAUSE_RECORD = new WaylineActionRecordPointCloudOperateType(2);
    public static final /* enum */ WaylineActionRecordPointCloudOperateType RESUME_RECORD = new WaylineActionRecordPointCloudOperateType(3);
    public static final /* enum */ WaylineActionRecordPointCloudOperateType UNKNOWN = new WaylineActionRecordPointCloudOperateType(65535);
    private int value;
    private static final WaylineActionRecordPointCloudOperateType[] allValues;
    private static final /* synthetic */ WaylineActionRecordPointCloudOperateType[] $VALUES;

    public static WaylineActionRecordPointCloudOperateType[] values() {
        return null;
    }

    public static WaylineActionRecordPointCloudOperateType valueOf(String string) {
        return null;
    }

    private WaylineActionRecordPointCloudOperateType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static WaylineActionRecordPointCloudOperateType find(int n) {
        return null;
    }

    private static /* synthetic */ WaylineActionRecordPointCloudOperateType[] $values() {
        return null;
    }

    static {
        $VALUES = WaylineActionRecordPointCloudOperateType.$values();
        allValues = WaylineActionRecordPointCloudOperateType.values();
    }
}

