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
import dji.sdk.keyvalue.value.mission.WaylineGimbalActuatorRotateMode;
import org.json.JSONObject;

public class WaylineActionGimbalRotateParam
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    WaylineGimbalActuatorRotateMode rotateMode;
    Boolean enablePitch;
    Double pitch;
    Boolean enableRoll;
    Double roll;
    Boolean enableYaw;
    Double yaw;
    Boolean enableRotateTime;
    Double rotateTime;

    public WaylineActionGimbalRotateParam() {
    }

    public WaylineActionGimbalRotateParam(WaylineGimbalActuatorRotateMode waylineGimbalActuatorRotateMode, Boolean bl, Double d2, Boolean bl2, Double d3, Boolean bl3, Double d4, Boolean bl4, Double d5) {
    }

    public static WaylineActionGimbalRotateParam fromJson(String string) {
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

    public WaylineGimbalActuatorRotateMode getRotateMode() {
        return null;
    }

    public void setRotateMode(WaylineGimbalActuatorRotateMode waylineGimbalActuatorRotateMode) {
    }

    public Boolean getEnablePitch() {
        return null;
    }

    public void setEnablePitch(Boolean bl) {
    }

    public Double getPitch() {
        return null;
    }

    public void setPitch(Double d2) {
    }

    public Boolean getEnableRoll() {
        return null;
    }

    public void setEnableRoll(Boolean bl) {
    }

    public Double getRoll() {
        return null;
    }

    public void setRoll(Double d2) {
    }

    public Boolean getEnableYaw() {
        return null;
    }

    public void setEnableYaw(Boolean bl) {
    }

    public Double getYaw() {
        return null;
    }

    public void setYaw(Double d2) {
    }

    public Boolean getEnableRotateTime() {
        return null;
    }

    public void setEnableRotateTime(Boolean bl) {
    }

    public Double getRotateTime() {
        return null;
    }

    public void setRotateTime(Double d2) {
    }

    public String toString() {
        return null;
    }
}

