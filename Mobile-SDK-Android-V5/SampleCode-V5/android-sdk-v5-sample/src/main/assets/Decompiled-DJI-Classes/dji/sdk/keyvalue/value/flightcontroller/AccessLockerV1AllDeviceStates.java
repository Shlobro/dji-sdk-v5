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
import dji.sdk.keyvalue.value.flightcontroller.AccessLockerDeviceStatus;
import java.util.List;
import org.json.JSONObject;

public class AccessLockerV1AllDeviceStates
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    List<AccessLockerDeviceStatus> value;

    public AccessLockerV1AllDeviceStates() {
    }

    public AccessLockerV1AllDeviceStates(List<AccessLockerDeviceStatus> list) {
    }

    public static AccessLockerV1AllDeviceStates fromJson(String string) {
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

    public List<AccessLockerDeviceStatus> getValue() {
        return null;
    }

    public void setValue(List<AccessLockerDeviceStatus> list) {
    }

    public String toString() {
        return null;
    }
}

