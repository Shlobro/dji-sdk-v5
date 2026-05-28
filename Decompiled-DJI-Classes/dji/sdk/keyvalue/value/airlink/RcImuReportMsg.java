/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.airlink;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class RcImuReportMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer yaw;
    Integer pitch;

    public RcImuReportMsg() {
    }

    public RcImuReportMsg(Integer n, Integer n2) {
    }

    public static RcImuReportMsg fromJson(String string) {
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

    public Integer getYaw() {
        return null;
    }

    public void setYaw(Integer n) {
    }

    public Integer getPitch() {
        return null;
    }

    public void setPitch(Integer n) {
    }

    public String toString() {
        return null;
    }
}

