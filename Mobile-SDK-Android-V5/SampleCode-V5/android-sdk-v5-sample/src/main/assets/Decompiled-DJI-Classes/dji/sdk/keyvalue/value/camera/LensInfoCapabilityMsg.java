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

public class LensInfoCapabilityMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer infoNDFilter;
    Boolean mechShutterSupported;

    public LensInfoCapabilityMsg() {
    }

    public LensInfoCapabilityMsg(Integer n, Boolean bl) {
    }

    public static LensInfoCapabilityMsg fromJson(String string) {
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

    public Integer getInfoNDFilter() {
        return null;
    }

    public void setInfoNDFilter(Integer n) {
    }

    public Boolean getMechShutterSupported() {
        return null;
    }

    public void setMechShutterSupported(Boolean bl) {
    }

    public String toString() {
        return null;
    }
}

