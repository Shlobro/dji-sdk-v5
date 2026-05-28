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
import dji.sdk.keyvalue.value.gimbal.BalanceDetectionProgressStatus;
import dji.sdk.keyvalue.value.gimbal.DetectionResultOnAxis;
import dji.sdk.keyvalue.value.gimbal.DirectionState;
import org.json.JSONObject;

public class GimbalBalanceDetectionState
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    BalanceDetectionProgressStatus status;
    DetectionResultOnAxis resultOnPitch;
    DetectionResultOnAxis resultOnRoll;
    DetectionResultOnAxis resultOnYaw;
    DirectionState directionAdjustmentStateOnPitch;
    DirectionState directionAdjustmentStateOnRoll;
    DirectionState directionAdjustmentStateOnYaw;
    Integer process;
    Boolean isAircraftStabilitySatisfied;
    Boolean isAircraftMotorOn;
    Boolean isGimbalMotorOverloaded;

    public GimbalBalanceDetectionState() {
    }

    public GimbalBalanceDetectionState(BalanceDetectionProgressStatus balanceDetectionProgressStatus, DetectionResultOnAxis detectionResultOnAxis, DetectionResultOnAxis detectionResultOnAxis2, DetectionResultOnAxis detectionResultOnAxis3, DirectionState directionState, DirectionState directionState2, DirectionState directionState3, Integer n, Boolean bl, Boolean bl2, Boolean bl3) {
    }

    public static GimbalBalanceDetectionState fromJson(String string) {
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

    public BalanceDetectionProgressStatus getStatus() {
        return null;
    }

    public void setStatus(BalanceDetectionProgressStatus balanceDetectionProgressStatus) {
    }

    public DetectionResultOnAxis getResultOnPitch() {
        return null;
    }

    public void setResultOnPitch(DetectionResultOnAxis detectionResultOnAxis) {
    }

    public DetectionResultOnAxis getResultOnRoll() {
        return null;
    }

    public void setResultOnRoll(DetectionResultOnAxis detectionResultOnAxis) {
    }

    public DetectionResultOnAxis getResultOnYaw() {
        return null;
    }

    public void setResultOnYaw(DetectionResultOnAxis detectionResultOnAxis) {
    }

    public DirectionState getDirectionAdjustmentStateOnPitch() {
        return null;
    }

    public void setDirectionAdjustmentStateOnPitch(DirectionState directionState) {
    }

    public DirectionState getDirectionAdjustmentStateOnRoll() {
        return null;
    }

    public void setDirectionAdjustmentStateOnRoll(DirectionState directionState) {
    }

    public DirectionState getDirectionAdjustmentStateOnYaw() {
        return null;
    }

    public void setDirectionAdjustmentStateOnYaw(DirectionState directionState) {
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

