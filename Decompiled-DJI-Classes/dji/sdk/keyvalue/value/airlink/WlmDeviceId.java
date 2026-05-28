/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.airlink;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.airlink.WlmDeviceRole;
import dji.sdk.keyvalue.value.airlink.WlmDeviceType;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class WlmDeviceId
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    WlmDeviceType deviceType;
    WlmDeviceRole deviceRole;
    Integer deviceIndex;
    String sn;

    public WlmDeviceId() {
    }

    public WlmDeviceId(WlmDeviceType wlmDeviceType, WlmDeviceRole wlmDeviceRole, Integer n, String string) {
    }

    public static WlmDeviceId fromJson(String string) {
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

    public WlmDeviceType getDeviceType() {
        return null;
    }

    public void setDeviceType(WlmDeviceType wlmDeviceType) {
    }

    public WlmDeviceRole getDeviceRole() {
        return null;
    }

    public void setDeviceRole(WlmDeviceRole wlmDeviceRole) {
    }

    public Integer getDeviceIndex() {
        return null;
    }

    public void setDeviceIndex(Integer n) {
    }

    public String getSn() {
        return null;
    }

    public void setSn(String string) {
    }

    public String toString() {
        return null;
    }
}

