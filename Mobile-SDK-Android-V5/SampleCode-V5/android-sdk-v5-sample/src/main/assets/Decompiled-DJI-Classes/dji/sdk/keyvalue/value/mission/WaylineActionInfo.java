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
import dji.sdk.keyvalue.value.mission.WaylineActionActuatorType;
import dji.sdk.keyvalue.value.mission.WaylineActionAircraftActuatorParam;
import dji.sdk.keyvalue.value.mission.WaylineActionCameraActuatorParam;
import dji.sdk.keyvalue.value.mission.WaylineActionDelegateActuatorParam;
import dji.sdk.keyvalue.value.mission.WaylineActionGimbalActuatorParam;
import dji.sdk.keyvalue.value.mission.WaylineActionNavigationActuatorParam;
import dji.sdk.keyvalue.value.mission.WaylineActionPSDKActuatorParam;
import org.json.JSONObject;

public class WaylineActionInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer actionId;
    WaylineActionActuatorType actuatorType;
    Integer actuatorIndex;
    WaylineActionCameraActuatorParam cameraActionParam;
    WaylineActionGimbalActuatorParam gimbalActionParam;
    WaylineActionAircraftActuatorParam aircraftActionParam;
    WaylineActionPSDKActuatorParam psdkActionParam;
    WaylineActionNavigationActuatorParam naviActionParam;
    WaylineActionDelegateActuatorParam deleActionParam;

    public WaylineActionInfo() {
    }

    public WaylineActionInfo(Integer n, WaylineActionActuatorType waylineActionActuatorType, Integer n2, WaylineActionCameraActuatorParam waylineActionCameraActuatorParam, WaylineActionGimbalActuatorParam waylineActionGimbalActuatorParam, WaylineActionAircraftActuatorParam waylineActionAircraftActuatorParam, WaylineActionPSDKActuatorParam waylineActionPSDKActuatorParam, WaylineActionNavigationActuatorParam waylineActionNavigationActuatorParam, WaylineActionDelegateActuatorParam waylineActionDelegateActuatorParam) {
    }

    public static WaylineActionInfo fromJson(String string) {
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

    public Integer getActionId() {
        return null;
    }

    public void setActionId(Integer n) {
    }

    public WaylineActionActuatorType getActuatorType() {
        return null;
    }

    public void setActuatorType(WaylineActionActuatorType waylineActionActuatorType) {
    }

    public Integer getActuatorIndex() {
        return null;
    }

    public void setActuatorIndex(Integer n) {
    }

    public WaylineActionCameraActuatorParam getCameraActionParam() {
        return null;
    }

    public void setCameraActionParam(WaylineActionCameraActuatorParam waylineActionCameraActuatorParam) {
    }

    public WaylineActionGimbalActuatorParam getGimbalActionParam() {
        return null;
    }

    public void setGimbalActionParam(WaylineActionGimbalActuatorParam waylineActionGimbalActuatorParam) {
    }

    public WaylineActionAircraftActuatorParam getAircraftActionParam() {
        return null;
    }

    public void setAircraftActionParam(WaylineActionAircraftActuatorParam waylineActionAircraftActuatorParam) {
    }

    public WaylineActionPSDKActuatorParam getPsdkActionParam() {
        return null;
    }

    public void setPsdkActionParam(WaylineActionPSDKActuatorParam waylineActionPSDKActuatorParam) {
    }

    public WaylineActionNavigationActuatorParam getNaviActionParam() {
        return null;
    }

    public void setNaviActionParam(WaylineActionNavigationActuatorParam waylineActionNavigationActuatorParam) {
    }

    public WaylineActionDelegateActuatorParam getDeleActionParam() {
        return null;
    }

    public void setDeleActionParam(WaylineActionDelegateActuatorParam waylineActionDelegateActuatorParam) {
    }

    public String toString() {
        return null;
    }
}

