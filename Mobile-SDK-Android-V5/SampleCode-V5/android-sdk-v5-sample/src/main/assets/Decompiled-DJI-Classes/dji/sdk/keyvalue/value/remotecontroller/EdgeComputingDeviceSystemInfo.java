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

public class EdgeComputingDeviceSystemInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    String firmwareVersion;
    String vendorName;
    String productName;
    String sn;
    String uuid;
    String appID;
    String sdkVersion;

    public EdgeComputingDeviceSystemInfo() {
    }

    public EdgeComputingDeviceSystemInfo(String string, String string2, String string3, String string4, String string5, String string6, String string7) {
    }

    public static EdgeComputingDeviceSystemInfo fromJson(String string) {
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

    public String getFirmwareVersion() {
        return null;
    }

    public void setFirmwareVersion(String string) {
    }

    public String getVendorName() {
        return null;
    }

    public void setVendorName(String string) {
    }

    public String getProductName() {
        return null;
    }

    public void setProductName(String string) {
    }

    public String getSn() {
        return null;
    }

    public void setSn(String string) {
    }

    public String getUuid() {
        return null;
    }

    public void setUuid(String string) {
    }

    public String getAppID() {
        return null;
    }

    public void setAppID(String string) {
    }

    public String getSdkVersion() {
        return null;
    }

    public void setSdkVersion(String string) {
    }

    public String toString() {
        return null;
    }
}

