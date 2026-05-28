/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.remotecontroller;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class RcMultiDeviceSelectTargetRsp
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer aircraftIndex;
    String deviceId;

    public RcMultiDeviceSelectTargetRsp() {
    }

    public RcMultiDeviceSelectTargetRsp(Integer n, String string) {
    }

    public static RcMultiDeviceSelectTargetRsp fromJson(String string) {
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

    public Integer getAircraftIndex() {
        return null;
    }

    public void setAircraftIndex(Integer n) {
    }

    public String getDeviceId() {
        return null;
    }

    public void setDeviceId(String string) {
    }

    public String toString() {
        return null;
    }
}

