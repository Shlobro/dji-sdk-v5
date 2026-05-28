/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.hms;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.hms.HMSMaintainType;
import org.json.JSONObject;

public class HMSMaintainInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    HMSMaintainType type;
    Long maintainUtcTime;

    public HMSMaintainInfo() {
    }

    public HMSMaintainInfo(HMSMaintainType hMSMaintainType, Long l2) {
    }

    public static HMSMaintainInfo fromJson(String string) {
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

    public HMSMaintainType getType() {
        return null;
    }

    public void setType(HMSMaintainType hMSMaintainType) {
    }

    public Long getMaintainUtcTime() {
        return null;
    }

    public void setMaintainUtcTime(Long l2) {
    }

    public String toString() {
        return null;
    }
}

