/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.mission;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.mission.WaylineActionRecordPointCloudOperateType;
import dji.sdk.keyvalue.value.mission.WaylineDelegateActuatorActionType;
import org.json.JSONObject;

public class WaylineActionDelegateActuatorParam
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    WaylineDelegateActuatorActionType delegateActionType;
    WaylineActionRecordPointCloudOperateType pointCloudOperateType;

    public WaylineActionDelegateActuatorParam() {
    }

    public WaylineActionDelegateActuatorParam(WaylineDelegateActuatorActionType waylineDelegateActuatorActionType, WaylineActionRecordPointCloudOperateType waylineActionRecordPointCloudOperateType) {
    }

    public static WaylineActionDelegateActuatorParam fromJson(String string) {
        return null;
    }

    @Override
    public JSONObject toJson() {
        return null;
    }

    @Override
    public int serializedLength() {
        return 0;
    }

    @Override
    public int toBytes(byte[] byArray, int n) {
        return 0;
    }

    @Override
    public byte[] toBytes() {
        return null;
    }

    @Override
    public int fromBytes(byte[] byArray, int n) {
        return 0;
    }

    public WaylineDelegateActuatorActionType getDelegateActionType() {
        return null;
    }

    public void setDelegateActionType(WaylineDelegateActuatorActionType waylineDelegateActuatorActionType) {
    }

    public WaylineActionRecordPointCloudOperateType getPointCloudOperateType() {
        return null;
    }

    public void setPointCloudOperateType(WaylineActionRecordPointCloudOperateType waylineActionRecordPointCloudOperateType) {
    }

    public String toString() {
        return null;
    }
}

