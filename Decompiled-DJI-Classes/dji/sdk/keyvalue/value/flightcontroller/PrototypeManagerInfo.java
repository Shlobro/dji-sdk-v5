/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.flightcontroller.PrototypeStatus;
import org.json.JSONObject;

public class PrototypeManagerInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Boolean isPrototype;
    PrototypeStatus status;
    Long remainFlyTimes;

    public PrototypeManagerInfo() {
    }

    public PrototypeManagerInfo(Boolean bl, PrototypeStatus prototypeStatus, Long l2) {
    }

    public static PrototypeManagerInfo fromJson(String string) {
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

    public Boolean getIsPrototype() {
        return null;
    }

    public void setIsPrototype(Boolean bl) {
    }

    public PrototypeStatus getStatus() {
        return null;
    }

    public void setStatus(PrototypeStatus prototypeStatus) {
    }

    public Long getRemainFlyTimes() {
        return null;
    }

    public void setRemainFlyTimes(Long l2) {
    }

    public String toString() {
        return null;
    }
}

