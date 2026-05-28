/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.rtkbasestation;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.common.LocationCoordinate3D;
import dji.sdk.keyvalue.value.rtkbasestation.RTKPPPPostionType;
import java.util.List;
import org.json.JSONObject;

public class RTKPPPRealtimeInfoMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    LocationCoordinate3D location;
    RTKPPPPostionType type;
    Double horizontalAccuracy;
    Double verticalAccuracy;
    Integer pppSatelliteNum;
    List<Double> lbandErrorRate;

    public RTKPPPRealtimeInfoMsg() {
    }

    public RTKPPPRealtimeInfoMsg(LocationCoordinate3D locationCoordinate3D, RTKPPPPostionType rTKPPPPostionType, Double d2, Double d3, Integer n, List<Double> list) {
    }

    public static RTKPPPRealtimeInfoMsg fromJson(String string) {
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

    public LocationCoordinate3D getLocation() {
        return null;
    }

    public void setLocation(LocationCoordinate3D locationCoordinate3D) {
    }

    public RTKPPPPostionType getType() {
        return null;
    }

    public void setType(RTKPPPPostionType rTKPPPPostionType) {
    }

    public Double getHorizontalAccuracy() {
        return null;
    }

    public void setHorizontalAccuracy(Double d2) {
    }

    public Double getVerticalAccuracy() {
        return null;
    }

    public void setVerticalAccuracy(Double d2) {
    }

    public Integer getPppSatelliteNum() {
        return null;
    }

    public void setPppSatelliteNum(Integer n) {
    }

    public List<Double> getLbandErrorRate() {
        return null;
    }

    public void setLbandErrorRate(List<Double> list) {
    }

    public String toString() {
        return null;
    }
}

