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
import org.json.JSONObject;

public class RadarTerrainInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Boolean isHeightValid;
    Integer fusionHeight;
    Integer slope;
    Integer slopeTrust;
    Integer flatness;

    public RadarTerrainInfo() {
    }

    public RadarTerrainInfo(Boolean bl, Integer n, Integer n2, Integer n3, Integer n4) {
    }

    public static RadarTerrainInfo fromJson(String string) {
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

    public Boolean getIsHeightValid() {
        return null;
    }

    public void setIsHeightValid(Boolean bl) {
    }

    public Integer getFusionHeight() {
        return null;
    }

    public void setFusionHeight(Integer n) {
    }

    public Integer getSlope() {
        return null;
    }

    public void setSlope(Integer n) {
    }

    public Integer getSlopeTrust() {
        return null;
    }

    public void setSlopeTrust(Integer n) {
    }

    public Integer getFlatness() {
        return null;
    }

    public void setFlatness(Integer n) {
    }

    public String toString() {
        return null;
    }
}

