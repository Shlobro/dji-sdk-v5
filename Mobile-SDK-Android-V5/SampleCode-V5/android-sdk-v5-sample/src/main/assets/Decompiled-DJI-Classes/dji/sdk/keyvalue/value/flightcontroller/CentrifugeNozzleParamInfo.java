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
import java.util.List;
import org.json.JSONObject;

public class CentrifugeNozzleParamInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer nozzleNum;
    List<Integer> nozzleSpeed;

    public CentrifugeNozzleParamInfo() {
    }

    public CentrifugeNozzleParamInfo(Integer n, List<Integer> list) {
    }

    public static CentrifugeNozzleParamInfo fromJson(String string) {
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

    public Integer getNozzleNum() {
        return null;
    }

    public void setNozzleNum(Integer n) {
    }

    public List<Integer> getNozzleSpeed() {
        return null;
    }

    public void setNozzleSpeed(List<Integer> list) {
    }

    public String toString() {
        return null;
    }
}

