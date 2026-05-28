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

public class PerceptionInformation
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    List<Integer> everyAngleDistance;
    Integer upwardObstacleDistance;
    Integer downwardObstacleDistance;

    public PerceptionInformation() {
    }

    public PerceptionInformation(List<Integer> list, Integer n, Integer n2) {
    }

    public static PerceptionInformation fromJson(String string) {
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

    public List<Integer> getEveryAngleDistance() {
        return null;
    }

    public void setEveryAngleDistance(List<Integer> list) {
    }

    public Integer getUpwardObstacleDistance() {
        return null;
    }

    public void setUpwardObstacleDistance(Integer n) {
    }

    public Integer getDownwardObstacleDistance() {
        return null;
    }

    public void setDownwardObstacleDistance(Integer n) {
    }

    public String toString() {
        return null;
    }
}

