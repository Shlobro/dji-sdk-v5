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
import dji.sdk.keyvalue.value.remotecontroller.MaintainInfoType;
import org.json.JSONObject;

public class DroneNestMaintainInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    MaintainInfoType type;
    Long maintainUtcTime;

    public DroneNestMaintainInfo() {
    }

    public DroneNestMaintainInfo(MaintainInfoType maintainInfoType, Long l2) {
    }

    public static DroneNestMaintainInfo fromJson(String string) {
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

    public MaintainInfoType getType() {
        return null;
    }

    public void setType(MaintainInfoType maintainInfoType) {
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

