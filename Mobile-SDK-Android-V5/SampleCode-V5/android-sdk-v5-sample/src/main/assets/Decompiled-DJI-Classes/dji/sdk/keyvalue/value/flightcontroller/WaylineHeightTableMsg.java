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
import dji.sdk.keyvalue.value.common.CommonCoordinate2D;
import java.util.List;
import org.json.JSONObject;

public class WaylineHeightTableMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer num;
    List<CommonCoordinate2D> trackPoints;

    public WaylineHeightTableMsg() {
    }

    public WaylineHeightTableMsg(Integer n, List<CommonCoordinate2D> list) {
    }

    public static WaylineHeightTableMsg fromJson(String string) {
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

    public List<CommonCoordinate2D> getTrackPoints() {
        return null;
    }

    public void setTrackPoints(List<CommonCoordinate2D> list) {
    }

    public String toString() {
        return null;
    }
}

