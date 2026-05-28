/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.flightassistant;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import java.util.List;
import org.json.JSONObject;

public class PerceptionPushOmnidirectionalRadarStatus
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    List<Integer> dists;
    Integer upDist;
    Integer downDist;
    Boolean isExistObstacle;

    public PerceptionPushOmnidirectionalRadarStatus() {
    }

    public PerceptionPushOmnidirectionalRadarStatus(List<Integer> list, Integer n, Integer n2, Boolean bl) {
    }

    public static PerceptionPushOmnidirectionalRadarStatus fromJson(String string) {
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

    public List<Integer> getDists() {
        return null;
    }

    public void setDists(List<Integer> list) {
    }

    public Integer getUpDist() {
        return null;
    }

    public void setUpDist(Integer n) {
    }

    public Integer getDownDist() {
        return null;
    }

    public void setDownDist(Integer n) {
    }

    public Boolean getIsExistObstacle() {
        return null;
    }

    public void setIsExistObstacle(Boolean bl) {
    }

    public String toString() {
        return null;
    }
}

