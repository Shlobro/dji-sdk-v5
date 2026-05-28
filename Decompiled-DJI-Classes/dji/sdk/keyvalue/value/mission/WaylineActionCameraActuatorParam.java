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
import dji.sdk.keyvalue.value.mission.WaylineActionCameraFocusParam;
import dji.sdk.keyvalue.value.mission.WaylineActionCameraFocusType;
import dji.sdk.keyvalue.value.mission.WaylineCameraActuatorActionType;
import org.json.JSONObject;

public class WaylineActionCameraActuatorParam
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    WaylineCameraActuatorActionType cameraActionType;
    String customName;
    WaylineActionCameraFocusParam focusParam;
    Double focalLength;
    String directoryName;
    WaylineActionCameraFocusType focusType;

    public WaylineActionCameraActuatorParam() {
    }

    public WaylineActionCameraActuatorParam(WaylineCameraActuatorActionType waylineCameraActuatorActionType, String string, WaylineActionCameraFocusParam waylineActionCameraFocusParam, Double d2, String string2, WaylineActionCameraFocusType waylineActionCameraFocusType) {
    }

    public static WaylineActionCameraActuatorParam fromJson(String string) {
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

    public WaylineCameraActuatorActionType getCameraActionType() {
        return null;
    }

    public void setCameraActionType(WaylineCameraActuatorActionType waylineCameraActuatorActionType) {
    }

    public String getCustomName() {
        return null;
    }

    public void setCustomName(String string) {
    }

    public WaylineActionCameraFocusParam getFocusParam() {
        return null;
    }

    public void setFocusParam(WaylineActionCameraFocusParam waylineActionCameraFocusParam) {
    }

    public Double getFocalLength() {
        return null;
    }

    public void setFocalLength(Double d2) {
    }

    public String getDirectoryName() {
        return null;
    }

    public void setDirectoryName(String string) {
    }

    public WaylineActionCameraFocusType getFocusType() {
        return null;
    }

    public void setFocusType(WaylineActionCameraFocusType waylineActionCameraFocusType) {
    }

    public String toString() {
        return null;
    }
}

