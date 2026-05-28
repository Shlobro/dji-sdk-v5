/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.rtkbasestation;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class NetworkRTKParam
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    String encSn;
    Integer encVersion;
    String encData;
    String rcVersion;
    String fcVersion;

    public NetworkRTKParam() {
    }

    public NetworkRTKParam(String string, Integer n, String string2, String string3, String string4) {
    }

    public static NetworkRTKParam fromJson(String string) {
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

    public String getEncSn() {
        return null;
    }

    public void setEncSn(String string) {
    }

    public Integer getEncVersion() {
        return null;
    }

    public void setEncVersion(Integer n) {
    }

    public String getEncData() {
        return null;
    }

    public void setEncData(String string) {
    }

    public String getRcVersion() {
        return null;
    }

    public void setRcVersion(String string) {
    }

    public String getFcVersion() {
        return null;
    }

    public void setFcVersion(String string) {
    }

    public String toString() {
        return null;
    }
}

