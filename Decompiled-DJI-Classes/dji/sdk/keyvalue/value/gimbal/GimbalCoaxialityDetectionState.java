/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.gimbal;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.gimbal.CoaxialityDetectionProgressStatus;
import dji.sdk.keyvalue.value.gimbal.DetectionResultOnAxis;
import org.json.JSONObject;

public class GimbalCoaxialityDetectionState
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    CoaxialityDetectionProgressStatus status;
    DetectionResultOnAxis resultOnPitch;
    Integer process;
    Boolean isAircraftStabilitySatisfied;
    Boolean isAircraftMotorOn;
    Boolean isGimbalMotorOverloaded;

    public GimbalCoaxialityDetectionState() {
    }

    public GimbalCoaxialityDetectionState(CoaxialityDetectionProgressStatus coaxialityDetectionProgressStatus, DetectionResultOnAxis detectionResultOnAxis, Integer n, Boolean bl, Boolean bl2, Boolean bl3) {
    }

    public static GimbalCoaxialityDetectionState fromJson(String string) {
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

    public CoaxialityDetectionProgressStatus getStatus() {
        return null;
    }

    public void setStatus(CoaxialityDetectionProgressStatus coaxialityDetectionProgressStatus) {
    }

    public DetectionResultOnAxis getResultOnPitch() {
        return null;
    }

    public void setResultOnPitch(DetectionResultOnAxis detectionResultOnAxis) {
    }

    public Integer getProcess() {
        return null;
    }

    public void setProcess(Integer n) {
    }

    public Boolean getIsAircraftStabilitySatisfied() {
        return null;
    }

    public void setIsAircraftStabilitySatisfied(Boolean bl) {
    }

    public Boolean getIsAircraftMotorOn() {
        return null;
    }

    public void setIsAircraftMotorOn(Boolean bl) {
    }

    public Boolean getIsGimbalMotorOverloaded() {
        return null;
    }

    public void setIsGimbalMotorOverloaded(Boolean bl) {
    }

    public String toString() {
        return null;
    }
}

