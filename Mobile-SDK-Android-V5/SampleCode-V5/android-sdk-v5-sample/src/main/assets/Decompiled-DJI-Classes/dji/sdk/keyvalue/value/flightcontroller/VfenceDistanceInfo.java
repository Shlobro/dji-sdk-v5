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
import dji.sdk.keyvalue.value.flightcontroller.VfenceAreaType;
import org.json.JSONObject;

public class VfenceDistanceInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    String areaId;
    VfenceAreaType areaType;
    Double distanceToArea;
    Boolean isInArea;

    public VfenceDistanceInfo() {
    }

    public VfenceDistanceInfo(String string, VfenceAreaType vfenceAreaType, Double d2, Boolean bl) {
    }

    public static VfenceDistanceInfo fromJson(String string) {
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

    public String getAreaId() {
        return null;
    }

    public void setAreaId(String string) {
    }

    public VfenceAreaType getAreaType() {
        return null;
    }

    public void setAreaType(VfenceAreaType vfenceAreaType) {
    }

    public Double getDistanceToArea() {
        return null;
    }

    public void setDistanceToArea(Double d2) {
    }

    public Boolean getIsInArea() {
        return null;
    }

    public void setIsInArea(Boolean bl) {
    }

    public String toString() {
        return null;
    }
}

