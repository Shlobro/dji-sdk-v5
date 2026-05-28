/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.airlink;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.airlink.WlmDeviceType;
import dji.sdk.keyvalue.value.airlink.WlmDongleInfo;
import dji.sdk.keyvalue.value.base.DJIValue;
import java.util.List;
import org.json.JSONObject;

public class WlmDongleListInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Boolean bIsApnAuthSupport;
    WlmDeviceType deviceType;
    List<WlmDongleInfo> stateList;

    public WlmDongleListInfo() {
    }

    public WlmDongleListInfo(Boolean bl, WlmDeviceType wlmDeviceType, List<WlmDongleInfo> list) {
    }

    public static WlmDongleListInfo fromJson(String string) {
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

    public Boolean getBIsApnAuthSupport() {
        return null;
    }

    public void setBIsApnAuthSupport(Boolean bl) {
    }

    public WlmDeviceType getDeviceType() {
        return null;
    }

    public void setDeviceType(WlmDeviceType wlmDeviceType) {
    }

    public List<WlmDongleInfo> getStateList() {
        return null;
    }

    public void setStateList(List<WlmDongleInfo> list) {
    }

    public String toString() {
        return null;
    }
}

