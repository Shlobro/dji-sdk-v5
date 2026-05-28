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
import dji.sdk.keyvalue.value.flightcontroller.DestinationPointType;
import org.json.JSONObject;

public class DestinationInfoBase
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    DestinationPointType type;
    Double remainedPower;
    Double remainedDistance;
    Integer remainedTime;

    public DestinationInfoBase() {
    }

    public DestinationInfoBase(DestinationPointType destinationPointType, Double d2, Double d3, Integer n) {
    }

    public static DestinationInfoBase fromJson(String string) {
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

    public DestinationPointType getType() {
        return null;
    }

    public void setType(DestinationPointType destinationPointType) {
    }

    public Double getRemainedPower() {
        return null;
    }

    public void setRemainedPower(Double d2) {
    }

    public Double getRemainedDistance() {
        return null;
    }

    public void setRemainedDistance(Double d2) {
    }

    public Integer getRemainedTime() {
        return null;
    }

    public void setRemainedTime(Integer n) {
    }

    public String toString() {
        return null;
    }
}

