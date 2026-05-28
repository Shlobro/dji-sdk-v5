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
import org.json.JSONObject;

public class UsbDeviceAttachedInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Boolean attached;
    Integer productId;
    String productName;

    public UsbDeviceAttachedInfo() {
    }

    public UsbDeviceAttachedInfo(Boolean bl, Integer n, String string) {
    }

    public static UsbDeviceAttachedInfo fromJson(String string) {
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

    public Boolean getAttached() {
        return null;
    }

    public void setAttached(Boolean bl) {
    }

    public Integer getProductId() {
        return null;
    }

    public void setProductId(Integer n) {
    }

    public String getProductName() {
        return null;
    }

    public void setProductName(String string) {
    }

    public String toString() {
        return null;
    }
}

