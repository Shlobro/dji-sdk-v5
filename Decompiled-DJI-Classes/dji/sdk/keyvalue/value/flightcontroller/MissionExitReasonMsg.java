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
import org.json.JSONObject;

public class MissionExitReasonMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer misType;
    Integer exitReason;

    public MissionExitReasonMsg() {
    }

    public MissionExitReasonMsg(Integer n, Integer n2) {
    }

    public static MissionExitReasonMsg fromJson(String string) {
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

    public Integer getMisType() {
        return null;
    }

    public void setMisType(Integer n) {
    }

    public Integer getExitReason() {
        return null;
    }

    public void setExitReason(Integer n) {
    }

    public String toString() {
        return null;
    }
}

