/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.relay;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.relay.RelaySdrRoleType;
import org.json.JSONObject;

public class SDRBlockingInfoKey
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer startDeviceId;
    RelaySdrRoleType startRoleType;
    Integer endDeviceId;
    RelaySdrRoleType endRoleType;

    public SDRBlockingInfoKey() {
    }

    public SDRBlockingInfoKey(Integer n, RelaySdrRoleType relaySdrRoleType, Integer n2, RelaySdrRoleType relaySdrRoleType2) {
    }

    public static SDRBlockingInfoKey fromJson(String string) {
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

    public Integer getStartDeviceId() {
        return null;
    }

    public void setStartDeviceId(Integer n) {
    }

    public RelaySdrRoleType getStartRoleType() {
        return null;
    }

    public void setStartRoleType(RelaySdrRoleType relaySdrRoleType) {
    }

    public Integer getEndDeviceId() {
        return null;
    }

    public void setEndDeviceId(Integer n) {
    }

    public RelaySdrRoleType getEndRoleType() {
        return null;
    }

    public void setEndRoleType(RelaySdrRoleType relaySdrRoleType) {
    }

    public String toString() {
        return null;
    }
}

