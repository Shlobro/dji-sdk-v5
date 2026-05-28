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
import dji.sdk.keyvalue.value.flightcontroller.RoutePointInfo;
import java.util.List;
import org.json.JSONObject;

public class ReturnPointInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer num;
    Integer recommendPointIndex;
    RoutePointInfo breakPointPosition;
    List<RoutePointInfo> returnPointPosition;

    public ReturnPointInfo() {
    }

    public ReturnPointInfo(Integer n, Integer n2, RoutePointInfo routePointInfo, List<RoutePointInfo> list) {
    }

    public static ReturnPointInfo fromJson(String string) {
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

    public Integer getNum() {
        return null;
    }

    public void setNum(Integer n) {
    }

    public Integer getRecommendPointIndex() {
        return null;
    }

    public void setRecommendPointIndex(Integer n) {
    }

    public RoutePointInfo getBreakPointPosition() {
        return null;
    }

    public void setBreakPointPosition(RoutePointInfo routePointInfo) {
    }

    public List<RoutePointInfo> getReturnPointPosition() {
        return null;
    }

    public void setReturnPointPosition(List<RoutePointInfo> list) {
    }

    public String toString() {
        return null;
    }
}

