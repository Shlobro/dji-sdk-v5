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

public class PathPointInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer index;
    Boolean isValid;
    List<LocationCoordinate3D> pos;

    public PathPointInfo() {
    }

    public PathPointInfo(Integer n, Boolean bl, List<LocationCoordinate3D> list) {
    }

    public static PathPointInfo fromJson(String string) {
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

    public Integer getIndex() {
        return null;
    }

    public void setIndex(Integer n) {
    }

    public Boolean getIsValid() {
        return null;
    }

    public void setIsValid(Boolean bl) {
    }

    public List<LocationCoordinate3D> getPos() {
        return null;
    }

    public void setPos(List<LocationCoordinate3D> list) {
    }

    public String toString() {
        return null;
    }
}

