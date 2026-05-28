/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.waypointv3;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.waypointv3.PointInfo;
import dji.sdk.keyvalue.value.waypointv3.PointStartType;
import org.json.JSONObject;

public class WaylineInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer waylineID;
    PointStartType startType;
    PointInfo startPoint;
    PointInfo endPoint;

    public WaylineInfo() {
    }

    public WaylineInfo(Integer n, PointStartType pointStartType, PointInfo pointInfo, PointInfo pointInfo2) {
    }

    public static WaylineInfo fromJson(String string) {
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

    public Integer getWaylineID() {
        return null;
    }

    public void setWaylineID(Integer n) {
    }

    public PointStartType getStartType() {
        return null;
    }

    public void setStartType(PointStartType pointStartType) {
    }

    public PointInfo getStartPoint() {
        return null;
    }

    public void setStartPoint(PointInfo pointInfo) {
    }

    public PointInfo getEndPoint() {
        return null;
    }

    public void setEndPoint(PointInfo pointInfo) {
    }

    public String toString() {
        return null;
    }
}

