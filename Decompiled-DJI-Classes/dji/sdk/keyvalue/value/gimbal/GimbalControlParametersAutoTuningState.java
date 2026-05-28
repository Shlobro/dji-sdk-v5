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
import dji.sdk.keyvalue.value.gimbal.AxialStiffnessState;
import dji.sdk.keyvalue.value.gimbal.ControlParametersAutoTuningStatus;
import dji.sdk.keyvalue.value.gimbal.RotationalInertiaState;
import org.json.JSONObject;

public class GimbalControlParametersAutoTuningState
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    ControlParametersAutoTuningStatus status;
    Integer process;
    Boolean isLoadInstalled;
    Boolean isBaseAttitudeNormal;
    Boolean isGyroDriftNormal;
    Boolean isJointAngleDeviationNormal;
    RotationalInertiaState rotationalInertiaOnRoll;
    RotationalInertiaState rotationalInertiaOnPitch;
    RotationalInertiaState rotationalInertiaOnYaw;
    AxialStiffnessState stiffnessOnRoll;
    AxialStiffnessState stiffnessOnPitch;
    AxialStiffnessState stiffnessOnYaw;
    Boolean isRollLocked;
    Boolean isPitchLocked;
    Boolean isYawLocked;
    Boolean isProtectingGimbalMotorLockedRotor;
    Boolean isAircraftMotorOn;

    public GimbalControlParametersAutoTuningState() {
    }

    public GimbalControlParametersAutoTuningState(ControlParametersAutoTuningStatus controlParametersAutoTuningStatus, Integer n, Boolean bl, Boolean bl2, Boolean bl3, Boolean bl4, RotationalInertiaState rotationalInertiaState, RotationalInertiaState rotationalInertiaState2, RotationalInertiaState rotationalInertiaState3, AxialStiffnessState axialStiffnessState, AxialStiffnessState axialStiffnessState2, AxialStiffnessState axialStiffnessState3, Boolean bl5, Boolean bl6, Boolean bl7, Boolean bl8, Boolean bl9) {
    }

    public static GimbalControlParametersAutoTuningState fromJson(String string) {
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

    public ControlParametersAutoTuningStatus getStatus() {
        return null;
    }

    public void setStatus(ControlParametersAutoTuningStatus controlParametersAutoTuningStatus) {
    }

    public Integer getProcess() {
        return null;
    }

    public void setProcess(Integer n) {
    }

    public Boolean getIsLoadInstalled() {
        return null;
    }

    public void setIsLoadInstalled(Boolean bl) {
    }

    public Boolean getIsBaseAttitudeNormal() {
        return null;
    }

    public void setIsBaseAttitudeNormal(Boolean bl) {
    }

    public Boolean getIsGyroDriftNormal() {
        return null;
    }

    public void setIsGyroDriftNormal(Boolean bl) {
    }

    public Boolean getIsJointAngleDeviationNormal() {
        return null;
    }

    public void setIsJointAngleDeviationNormal(Boolean bl) {
    }

    public RotationalInertiaState getRotationalInertiaOnRoll() {
        return null;
    }

    public void setRotationalInertiaOnRoll(RotationalInertiaState rotationalInertiaState) {
    }

    public RotationalInertiaState getRotationalInertiaOnPitch() {
        return null;
    }

    public void setRotationalInertiaOnPitch(RotationalInertiaState rotationalInertiaState) {
    }

    public RotationalInertiaState getRotationalInertiaOnYaw() {
        return null;
    }

    public void setRotationalInertiaOnYaw(RotationalInertiaState rotationalInertiaState) {
    }

    public AxialStiffnessState getStiffnessOnRoll() {
        return null;
    }

    public void setStiffnessOnRoll(AxialStiffnessState axialStiffnessState) {
    }

    public AxialStiffnessState getStiffnessOnPitch() {
        return null;
    }

    public void setStiffnessOnPitch(AxialStiffnessState axialStiffnessState) {
    }

    public AxialStiffnessState getStiffnessOnYaw() {
        return null;
    }

    public void setStiffnessOnYaw(AxialStiffnessState axialStiffnessState) {
    }

    public Boolean getIsRollLocked() {
        return null;
    }

    public void setIsRollLocked(Boolean bl) {
    }

    public Boolean getIsPitchLocked() {
        return null;
    }

    public void setIsPitchLocked(Boolean bl) {
    }

    public Boolean getIsYawLocked() {
        return null;
    }

    public void setIsYawLocked(Boolean bl) {
    }

    public Boolean getIsProtectingGimbalMotorLockedRotor() {
        return null;
    }

    public void setIsProtectingGimbalMotorLockedRotor(Boolean bl) {
    }

    public Boolean getIsAircraftMotorOn() {
        return null;
    }

    public void setIsAircraftMotorOn(Boolean bl) {
    }

    public String toString() {
        return null;
    }
}

