/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.common.BoolMsg;
import java.util.List;
import org.json.JSONObject;

public class MGSowerParamInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer version;
    Integer cnt;
    Integer deviceType;
    Integer ctrlMode;
    Integer sprayMode;
    Integer flyState;
    Double velocity;
    List<BoolMsg> sprayMagneticEnable;
    Integer flowSpeed;
    Boolean centrifugeEnable;

    public MGSowerParamInfo() {
    }

    public MGSowerParamInfo(Integer n, Integer n2, Integer n3, Integer n4, Integer n5, Integer n6, Double d2, List<BoolMsg> list, Integer n7, Boolean bl) {
    }

    public static MGSowerParamInfo fromJson(String string) {
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

    public Integer getVersion() {
        return null;
    }

    public void setVersion(Integer n) {
    }

    public Integer getCnt() {
        return null;
    }

    public void setCnt(Integer n) {
    }

    public Integer getDeviceType() {
        return null;
    }

    public void setDeviceType(Integer n) {
    }

    public Integer getCtrlMode() {
        return null;
    }

    public void setCtrlMode(Integer n) {
    }

    public Integer getSprayMode() {
        return null;
    }

    public void setSprayMode(Integer n) {
    }

    public Integer getFlyState() {
        return null;
    }

    public void setFlyState(Integer n) {
    }

    public Double getVelocity() {
        return null;
    }

    public void setVelocity(Double d2) {
    }

    public List<BoolMsg> getSprayMagneticEnable() {
        return null;
    }

    public void setSprayMagneticEnable(List<BoolMsg> list) {
    }

    public Integer getFlowSpeed() {
        return null;
    }

    public void setFlowSpeed(Integer n) {
    }

    public Boolean getCentrifugeEnable() {
        return null;
    }

    public void setCentrifugeEnable(Boolean bl) {
    }

    public String toString() {
        return null;
    }
}

