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
import org.json.JSONObject;

public class CareSNsMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    String careDeviceSN;
    String associatedDeviceSN;
    String associatedDeviceChipId;

    public CareSNsMsg() {
    }

    public CareSNsMsg(String string, String string2, String string3) {
    }

    public static CareSNsMsg fromJson(String string) {
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

    public String getCareDeviceSN() {
        return null;
    }

    public void setCareDeviceSN(String string) {
    }

    public String getAssociatedDeviceSN() {
        return null;
    }

    public void setAssociatedDeviceSN(String string) {
    }

    public String getAssociatedDeviceChipId() {
        return null;
    }

    public void setAssociatedDeviceChipId(String string) {
    }

    public String toString() {
        return null;
    }
}

