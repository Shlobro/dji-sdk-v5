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

public class CommonCareSupportedInfoMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Boolean isDeviceTypeSupportCare;
    Boolean isAssociatedDeviceFirmwareSupportCare;
    Boolean isDeviceFirmwareSupportCare;

    public CommonCareSupportedInfoMsg() {
    }

    public CommonCareSupportedInfoMsg(Boolean bl, Boolean bl2, Boolean bl3) {
    }

    public static CommonCareSupportedInfoMsg fromJson(String string) {
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

    public Boolean getIsDeviceTypeSupportCare() {
        return null;
    }

    public void setIsDeviceTypeSupportCare(Boolean bl) {
    }

    public Boolean getIsAssociatedDeviceFirmwareSupportCare() {
        return null;
    }

    public void setIsAssociatedDeviceFirmwareSupportCare(Boolean bl) {
    }

    public Boolean getIsDeviceFirmwareSupportCare() {
        return null;
    }

    public void setIsDeviceFirmwareSupportCare(Boolean bl) {
    }

    public String toString() {
        return null;
    }
}

