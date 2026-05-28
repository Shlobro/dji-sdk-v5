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
import dji.sdk.keyvalue.value.common.LocationCoordinate3D;
import java.util.List;
import org.json.JSONObject;

public class CableFollowDirection
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer cableDirectionIndex;
    Double horizRadius;
    List<LocationCoordinate3D> directionPosVec;

    public CableFollowDirection() {
    }

    public CableFollowDirection(Integer n, Double d2, List<LocationCoordinate3D> list) {
    }

    public static CableFollowDirection fromJson(String string) {
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

    public Integer getCableDirectionIndex() {
        return null;
    }

    public void setCableDirectionIndex(Integer n) {
    }

    public Double getHorizRadius() {
        return null;
    }

    public void setHorizRadius(Double d2) {
    }

    public List<LocationCoordinate3D> getDirectionPosVec() {
        return null;
    }

    public void setDirectionPosVec(List<LocationCoordinate3D> list) {
    }

    public String toString() {
        return null;
    }
}

