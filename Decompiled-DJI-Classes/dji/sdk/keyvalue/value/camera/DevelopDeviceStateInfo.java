/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class DevelopDeviceStateInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Boolean model;
    Integer state;
    Integer version;
    Integer count;

    public DevelopDeviceStateInfo() {
    }

    public DevelopDeviceStateInfo(Boolean bl, Integer n, Integer n2, Integer n3) {
    }

    public static DevelopDeviceStateInfo fromJson(String string) {
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

    public Boolean getModel() {
        return null;
    }

    public void setModel(Boolean bl) {
    }

    public Integer getState() {
        return null;
    }

    public void setState(Integer n) {
    }

    public Integer getVersion() {
        return null;
    }

    public void setVersion(Integer n) {
    }

    public Integer getCount() {
        return null;
    }

    public void setCount(Integer n) {
    }

    public String toString() {
        return null;
    }
}

