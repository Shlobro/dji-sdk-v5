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
import java.util.List;
import org.json.JSONObject;

public class AG50xDownRadarPerceptionData
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer fusionHeight;
    Integer slope;
    Integer slopeTrust;
    Integer flatness;
    Boolean heightValid;
    Integer downObstacleDistance;
    Boolean downObstacleValid;
    Integer sectionNum;
    List<Integer> objectsDistance;

    public AG50xDownRadarPerceptionData() {
    }

    public AG50xDownRadarPerceptionData(Integer n, Integer n2, Integer n3, Integer n4, Boolean bl, Integer n5, Boolean bl2, Integer n6, List<Integer> list) {
    }

    public static AG50xDownRadarPerceptionData fromJson(String string) {
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

    public Boolean getHeightValid() {
        return null;
    }

    public void setHeightValid(Boolean bl) {
    }

    public Integer getDownObstacleDistance() {
        return null;
    }

    public void setDownObstacleDistance(Integer n) {
    }

    public Boolean getDownObstacleValid() {
        return null;
    }

    public void setDownObstacleValid(Boolean bl) {
    }

    public Integer getSectionNum() {
        return null;
    }

    public void setSectionNum(Integer n) {
    }

    public List<Integer> getObjectsDistance() {
        return null;
    }

    public void setObjectsDistance(List<Integer> list) {
    }

    public String toString() {
        return null;
    }
}

