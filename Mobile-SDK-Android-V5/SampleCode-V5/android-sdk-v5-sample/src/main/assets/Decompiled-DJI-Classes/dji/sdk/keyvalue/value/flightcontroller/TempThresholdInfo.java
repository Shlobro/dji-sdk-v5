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

public class TempThresholdInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer groupId;
    Integer warningTemp;
    Integer exceptionTemp;

    public TempThresholdInfo() {
    }

    public TempThresholdInfo(Integer n, Integer n2, Integer n3) {
    }

    public static TempThresholdInfo fromJson(String string) {
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

    public Integer getGroupId() {
        return null;
    }

    public void setGroupId(Integer n) {
    }

    public Integer getWarningTemp() {
        return null;
    }

    public void setWarningTemp(Integer n) {
    }

    public Integer getExceptionTemp() {
        return null;
    }

    public void setExceptionTemp(Integer n) {
    }

    public String toString() {
        return null;
    }
}

