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
import dji.sdk.keyvalue.value.product.RebootEventType;
import org.json.JSONObject;

public class DeviceRebootTimeInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    RebootEventType rebootEventType;
    Integer expiredTime;
    Integer rebootTime;

    public DeviceRebootTimeInfo() {
    }

    public DeviceRebootTimeInfo(RebootEventType rebootEventType, Integer n, Integer n2) {
    }

    public static DeviceRebootTimeInfo fromJson(String string) {
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

    public RebootEventType getRebootEventType() {
        return null;
    }

    public void setRebootEventType(RebootEventType rebootEventType) {
    }

    public Integer getExpiredTime() {
        return null;
    }

    public void setExpiredTime(Integer n) {
    }

    public Integer getRebootTime() {
        return null;
    }

    public void setRebootTime(Integer n) {
    }

    public String toString() {
        return null;
    }
}

