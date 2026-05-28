/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.product;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.common.RadarComponentIndexType;
import dji.sdk.keyvalue.value.radar.RadarType;
import org.json.JSONObject;

public class RadarComponentInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    RadarComponentIndexType index;
    RadarType radarType;

    public RadarComponentInfo() {
    }

    public RadarComponentInfo(RadarComponentIndexType radarComponentIndexType, RadarType radarType) {
    }

    public static RadarComponentInfo fromJson(String string) {
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

    public RadarComponentIndexType getIndex() {
        return null;
    }

    public void setIndex(RadarComponentIndexType radarComponentIndexType) {
    }

    public RadarType getRadarType() {
        return null;
    }

    public void setRadarType(RadarType radarType) {
    }

    public String toString() {
        return null;
    }
}

