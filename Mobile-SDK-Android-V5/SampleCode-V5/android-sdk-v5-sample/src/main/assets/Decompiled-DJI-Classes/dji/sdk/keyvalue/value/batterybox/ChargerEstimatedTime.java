/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.batterybox;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import java.util.List;
import org.json.JSONObject;

public class ChargerEstimatedTime
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer TotalEstimatedTimes;
    List<Integer> estimatedTimes;

    public ChargerEstimatedTime() {
    }

    public ChargerEstimatedTime(Integer n, List<Integer> list) {
    }

    public static ChargerEstimatedTime fromJson(String string) {
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

    public Integer getTotalEstimatedTimes() {
        return null;
    }

    public void setTotalEstimatedTimes(Integer n) {
    }

    public List<Integer> getEstimatedTimes() {
        return null;
    }

    public void setEstimatedTimes(List<Integer> list) {
    }

    public String toString() {
        return null;
    }
}

