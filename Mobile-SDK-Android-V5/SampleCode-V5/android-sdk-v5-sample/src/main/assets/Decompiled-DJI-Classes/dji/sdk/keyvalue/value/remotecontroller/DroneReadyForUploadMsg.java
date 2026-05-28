/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.remotecontroller;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.remotecontroller.DroneRTKConvergenceState;
import dji.sdk.keyvalue.value.remotecontroller.DroneReadyForUploadErrorType;
import dji.sdk.keyvalue.value.remotecontroller.DroneStatusForUpload;
import dji.sdk.keyvalue.value.waypointv3.Waypoint3ErrorCode;
import org.json.JSONObject;

public class DroneReadyForUploadMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    DroneStatusForUpload status;
    DroneReadyForUploadErrorType errorType;
    Waypoint3ErrorCode waypointErrorCode;
    Long hmsErrorCode;
    DroneRTKConvergenceState rtkConvergenceState;

    public DroneReadyForUploadMsg() {
    }

    public DroneReadyForUploadMsg(DroneStatusForUpload droneStatusForUpload, DroneReadyForUploadErrorType droneReadyForUploadErrorType, Waypoint3ErrorCode waypoint3ErrorCode, Long l2, DroneRTKConvergenceState droneRTKConvergenceState) {
    }

    public static DroneReadyForUploadMsg fromJson(String string) {
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

    public DroneStatusForUpload getStatus() {
        return null;
    }

    public void setStatus(DroneStatusForUpload droneStatusForUpload) {
    }

    public DroneReadyForUploadErrorType getErrorType() {
        return null;
    }

    public void setErrorType(DroneReadyForUploadErrorType droneReadyForUploadErrorType) {
    }

    public Waypoint3ErrorCode getWaypointErrorCode() {
        return null;
    }

    public void setWaypointErrorCode(Waypoint3ErrorCode waypoint3ErrorCode) {
    }

    public Long getHmsErrorCode() {
        return null;
    }

    public void setHmsErrorCode(Long l2) {
    }

    public DroneRTKConvergenceState getRtkConvergenceState() {
        return null;
    }

    public void setRtkConvergenceState(DroneRTKConvergenceState droneRTKConvergenceState) {
    }

    public String toString() {
        return null;
    }
}

