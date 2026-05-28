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
import dji.sdk.keyvalue.value.flightcontroller.ClearLogDeviceComponentParam;
import java.util.List;
import org.json.JSONObject;

public class ClearLogDeviceParam
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer deviceNum;
    List<ClearLogDeviceComponentParam> deviceParams;

    public ClearLogDeviceParam() {
    }

    public ClearLogDeviceParam(Integer n, List<ClearLogDeviceComponentParam> list) {
    }

    public static ClearLogDeviceParam fromJson(String string) {
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

    public Integer getDeviceNum() {
        return null;
    }

    public void setDeviceNum(Integer n) {
    }

    public List<ClearLogDeviceComponentParam> getDeviceParams() {
        return null;
    }

    public void setDeviceParams(List<ClearLogDeviceComponentParam> list) {
    }

    public String toString() {
        return null;
    }
}

