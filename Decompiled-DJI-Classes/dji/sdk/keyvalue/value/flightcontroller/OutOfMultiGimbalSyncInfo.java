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
import dji.sdk.keyvalue.value.common.ComponentIndexType;
import dji.sdk.keyvalue.value.flightcontroller.OutOfMultiGimbalSyncReason;
import java.util.List;
import org.json.JSONObject;

public class OutOfMultiGimbalSyncInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    OutOfMultiGimbalSyncReason reason;
    List<ComponentIndexType> OutOfSyncGimbals;
    List<ComponentIndexType> OnSyncGimbals;

    public OutOfMultiGimbalSyncInfo() {
    }

    public OutOfMultiGimbalSyncInfo(OutOfMultiGimbalSyncReason outOfMultiGimbalSyncReason, List<ComponentIndexType> list, List<ComponentIndexType> list2) {
    }

    public static OutOfMultiGimbalSyncInfo fromJson(String string) {
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

    public OutOfMultiGimbalSyncReason getReason() {
        return null;
    }

    public void setReason(OutOfMultiGimbalSyncReason outOfMultiGimbalSyncReason) {
    }

    public List<ComponentIndexType> getOutOfSyncGimbals() {
        return null;
    }

    public void setOutOfSyncGimbals(List<ComponentIndexType> list) {
    }

    public List<ComponentIndexType> getOnSyncGimbals() {
        return null;
    }

    public void setOnSyncGimbals(List<ComponentIndexType> list) {
    }

    public String toString() {
        return null;
    }
}

