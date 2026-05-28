/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.app;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.product.BindDeviceType;
import org.json.JSONObject;

public class DroneDetailMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    String activeTime;
    Integer useDuration;
    String bindAccount;
    String associatedDeviceSN;
    BindDeviceType associatedDeviceType;

    public DroneDetailMsg() {
    }

    public DroneDetailMsg(String string, Integer n, String string2, String string3, BindDeviceType bindDeviceType) {
    }

    public static DroneDetailMsg fromJson(String string) {
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

    public String getActiveTime() {
        return null;
    }

    public void setActiveTime(String string) {
    }

    public Integer getUseDuration() {
        return null;
    }

    public void setUseDuration(Integer n) {
    }

    public String getBindAccount() {
        return null;
    }

    public void setBindAccount(String string) {
    }

    public String getAssociatedDeviceSN() {
        return null;
    }

    public void setAssociatedDeviceSN(String string) {
    }

    public BindDeviceType getAssociatedDeviceType() {
        return null;
    }

    public void setAssociatedDeviceType(BindDeviceType bindDeviceType) {
    }

    public String toString() {
        return null;
    }
}

