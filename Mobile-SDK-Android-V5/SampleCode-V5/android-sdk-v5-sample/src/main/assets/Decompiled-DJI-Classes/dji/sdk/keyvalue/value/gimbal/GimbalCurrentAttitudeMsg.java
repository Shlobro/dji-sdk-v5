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
import dji.sdk.keyvalue.value.common.Attitude;
import dji.sdk.keyvalue.value.gimbal.GimbalMode;
import org.json.JSONObject;

public class GimbalCurrentAttitudeMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Attitude attitude;
    GimbalMode work_mode;
    Integer reset;
    Integer roll_adjust_rad;
    Integer yaw_angle_opposite_drone;
    Integer pitch_limited;
    Integer row_limited;
    Integer yaw_limited;
    Integer autoCalibration;
    Integer calibration_state;
    Integer install_direction;
    Integer gimbal_stuck;
    Integer params_version;
    Integer HVShoot;
    Integer double_click;
    Integer three_click;
    Integer one_click;
    Double timestamp;
    Integer target_yaw;
    Integer pitch_adjust_degree;

    public GimbalCurrentAttitudeMsg() {
    }

    public GimbalCurrentAttitudeMsg(Attitude attitude, GimbalMode gimbalMode, Integer n, Integer n2, Integer n3, Integer n4, Integer n5, Integer n6, Integer n7, Integer n8, Integer n9, Integer n10, Integer n11, Integer n12, Integer n13, Integer n14, Integer n15, Double d2, Integer n16, Integer n17) {
    }

    public static GimbalCurrentAttitudeMsg fromJson(String string) {
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

    public Attitude getAttitude() {
        return null;
    }

    public void setAttitude(Attitude attitude) {
    }

    public GimbalMode getWork_mode() {
        return null;
    }

    public void setWork_mode(GimbalMode gimbalMode) {
    }

    public Integer getReset() {
        return null;
    }

    public void setReset(Integer n) {
    }

    public Integer getRoll_adjust_rad() {
        return null;
    }

    public void setRoll_adjust_rad(Integer n) {
    }

    public Integer getYaw_angle_opposite_drone() {
        return null;
    }

    public void setYaw_angle_opposite_drone(Integer n) {
    }

    public Integer getPitch_limited() {
        return null;
    }

    public void setPitch_limited(Integer n) {
    }

    public Integer getRow_limited() {
        return null;
    }

    public void setRow_limited(Integer n) {
    }

    public Integer getYaw_limited() {
        return null;
    }

    public void setYaw_limited(Integer n) {
    }

    public Integer getAutoCalibration() {
        return null;
    }

    public void setAutoCalibration(Integer n) {
    }

    public Integer getCalibration_state() {
        return null;
    }

    public void setCalibration_state(Integer n) {
    }

    public Integer getInstall_direction() {
        return null;
    }

    public void setInstall_direction(Integer n) {
    }

    public Integer getGimbal_stuck() {
        return null;
    }

    public void setGimbal_stuck(Integer n) {
    }

    public Integer getParams_version() {
        return null;
    }

    public void setParams_version(Integer n) {
    }

    public Integer getHVShoot() {
        return null;
    }

    public void setHVShoot(Integer n) {
    }

    public Integer getDouble_click() {
        return null;
    }

    public void setDouble_click(Integer n) {
    }

    public Integer getThree_click() {
        return null;
    }

    public void setThree_click(Integer n) {
    }

    public Integer getOne_click() {
        return null;
    }

    public void setOne_click(Integer n) {
    }

    public Double getTimestamp() {
        return null;
    }

    public void setTimestamp(Double d2) {
    }

    public Integer getTarget_yaw() {
        return null;
    }

    public void setTarget_yaw(Integer n) {
    }

    public Integer getPitch_adjust_degree() {
        return null;
    }

    public void setPitch_adjust_degree(Integer n) {
    }

    public String toString() {
        return null;
    }
}

