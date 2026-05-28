/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.flightassistant;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.flightassistant.CableInspectionCmd;
import dji.sdk.keyvalue.value.flightassistant.CableInspectionDir;
import org.json.JSONObject;

public class CableInspectionConfigMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer cid;
    CableInspectionCmd cmd;
    Integer cable_id;
    Double distance;
    Double cruise_vel;
    CableInspectionDir follow_dir;
    Integer shot_interval_ms;
    Boolean is_cam_calibration;
    Boolean is_user_ctrl_gim;
    String custom_dir;

    public CableInspectionConfigMsg() {
    }

    public CableInspectionConfigMsg(Integer n, CableInspectionCmd cableInspectionCmd, Integer n2, Double d2, Double d3, CableInspectionDir cableInspectionDir, Integer n3, Boolean bl, Boolean bl2, String string) {
    }

    public static CableInspectionConfigMsg fromJson(String string) {
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

    public Integer getCid() {
        return null;
    }

    public void setCid(Integer n) {
    }

    public CableInspectionCmd getCmd() {
        return null;
    }

    public void setCmd(CableInspectionCmd cableInspectionCmd) {
    }

    public Integer getCable_id() {
        return null;
    }

    public void setCable_id(Integer n) {
    }

    public Double getDistance() {
        return null;
    }

    public void setDistance(Double d2) {
    }

    public Double getCruise_vel() {
        return null;
    }

    public void setCruise_vel(Double d2) {
    }

    public CableInspectionDir getFollow_dir() {
        return null;
    }

    public void setFollow_dir(CableInspectionDir cableInspectionDir) {
    }

    public Integer getShot_interval_ms() {
        return null;
    }

    public void setShot_interval_ms(Integer n) {
    }

    public Boolean getIs_cam_calibration() {
        return null;
    }

    public void setIs_cam_calibration(Boolean bl) {
    }

    public Boolean getIs_user_ctrl_gim() {
        return null;
    }

    public void setIs_user_ctrl_gim(Boolean bl) {
    }

    public String getCustom_dir() {
        return null;
    }

    public void setCustom_dir(String string) {
    }

    public String toString() {
        return null;
    }
}

