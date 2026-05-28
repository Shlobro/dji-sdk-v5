/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.common;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.camera.PayloadNegotiateDeviceState;
import dji.sdk.keyvalue.value.camera.PayloadNegotiateDeviceType;
import org.json.JSONObject;

public class PayloadNegotiateDeviceInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    PayloadNegotiateDeviceState state;
    Integer device_position;
    Integer machine_id;
    PayloadNegotiateDeviceType device_type;
    Integer sub_device_type;

    public PayloadNegotiateDeviceInfo() {
    }

    public PayloadNegotiateDeviceInfo(PayloadNegotiateDeviceState payloadNegotiateDeviceState, Integer n, Integer n2, PayloadNegotiateDeviceType payloadNegotiateDeviceType, Integer n3) {
    }

    public static PayloadNegotiateDeviceInfo fromJson(String string) {
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

    public PayloadNegotiateDeviceState getState() {
        return null;
    }

    public void setState(PayloadNegotiateDeviceState payloadNegotiateDeviceState) {
    }

    public Integer getDevice_position() {
        return null;
    }

    public void setDevice_position(Integer n) {
    }

    public Integer getMachine_id() {
        return null;
    }

    public void setMachine_id(Integer n) {
    }

    public PayloadNegotiateDeviceType getDevice_type() {
        return null;
    }

    public void setDevice_type(PayloadNegotiateDeviceType payloadNegotiateDeviceType) {
    }

    public Integer getSub_device_type() {
        return null;
    }

    public void setSub_device_type(Integer n) {
    }

    public String toString() {
        return null;
    }
}

