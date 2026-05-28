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
import dji.sdk.keyvalue.value.remotecontroller.ConnectedDeviceType;
import org.json.JSONObject;

public class ConnectedDeviceInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer deviceID;
    Integer deviceFirstAbstraction;
    ConnectedDeviceType type;

    public ConnectedDeviceInfo() {
    }

    public ConnectedDeviceInfo(Integer n, Integer n2, ConnectedDeviceType connectedDeviceType) {
    }

    public static ConnectedDeviceInfo fromJson(String string) {
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

    public Integer getDeviceID() {
        return null;
    }

    public void setDeviceID(Integer n) {
    }

    public Integer getDeviceFirstAbstraction() {
        return null;
    }

    public void setDeviceFirstAbstraction(Integer n) {
    }

    public ConnectedDeviceType getType() {
        return null;
    }

    public void setType(ConnectedDeviceType connectedDeviceType) {
    }

    public String toString() {
        return null;
    }
}

