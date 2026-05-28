/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.product;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class SNsMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    String droneSN;
    String associatedDeviceSN;
    String associatedDeviceChipId;

    public SNsMsg() {
    }

    public SNsMsg(String string, String string2, String string3) {
    }

    public static SNsMsg fromJson(String string) {
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

    public String getDroneSN() {
        return null;
    }

    public void setDroneSN(String string) {
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

