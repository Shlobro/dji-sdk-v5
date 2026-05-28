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
import dji.sdk.keyvalue.value.remotecontroller.SdrParameterCoreType;
import dji.sdk.keyvalue.value.remotecontroller.SdrParameterDataType;
import org.json.JSONObject;

public class SdrParameterMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Long dataAddr;
    Long value;
    SdrParameterCoreType coreType;
    SdrParameterDataType dataType;

    public SdrParameterMsg() {
    }

    public SdrParameterMsg(Long l2, Long l3, SdrParameterCoreType sdrParameterCoreType, SdrParameterDataType sdrParameterDataType) {
    }

    public static SdrParameterMsg fromJson(String string) {
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

    public Long getDataAddr() {
        return null;
    }

    public void setDataAddr(Long l2) {
    }

    public Long getValue() {
        return null;
    }

    public void setValue(Long l2) {
    }

    public SdrParameterCoreType getCoreType() {
        return null;
    }

    public void setCoreType(SdrParameterCoreType sdrParameterCoreType) {
    }

    public SdrParameterDataType getDataType() {
        return null;
    }

    public void setDataType(SdrParameterDataType sdrParameterDataType) {
    }

    public String toString() {
        return null;
    }
}

