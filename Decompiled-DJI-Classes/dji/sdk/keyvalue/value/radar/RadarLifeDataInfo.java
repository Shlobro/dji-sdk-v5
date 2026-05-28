/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.radar;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.flightcontroller.LifeDataBasicInfo;
import org.json.JSONObject;

public class RadarLifeDataInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    LifeDataBasicInfo value;
    Integer totalRunCircles;

    public RadarLifeDataInfo() {
    }

    public RadarLifeDataInfo(LifeDataBasicInfo lifeDataBasicInfo, Integer n) {
    }

    public static RadarLifeDataInfo fromJson(String string) {
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

    public LifeDataBasicInfo getValue() {
        return null;
    }

    public void setValue(LifeDataBasicInfo lifeDataBasicInfo) {
    }

    public Integer getTotalRunCircles() {
        return null;
    }

    public void setTotalRunCircles(Integer n) {
    }

    public String toString() {
        return null;
    }
}

