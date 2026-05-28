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

public class DroneNestLTENetworkState
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Boolean isConnect;
    Integer quality;

    public DroneNestLTENetworkState() {
    }

    public DroneNestLTENetworkState(Boolean bl, Integer n) {
    }

    public static DroneNestLTENetworkState fromJson(String string) {
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

    public Boolean getIsConnect() {
        return null;
    }

    public void setIsConnect(Boolean bl) {
    }

    public Integer getQuality() {
        return null;
    }

    public void setQuality(Integer n) {
    }

    public String toString() {
        return null;
    }
}

