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
import dji.sdk.keyvalue.value.flightcontroller.IMUState;
import java.util.List;
import org.json.JSONObject;

public class IMUStates
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    List<IMUState> value;

    public IMUStates() {
    }

    public IMUStates(List<IMUState> list) {
    }

    public static IMUStates fromJson(String string) {
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

    public List<IMUState> getValue() {
        return null;
    }

    public void setValue(List<IMUState> list) {
    }

    public String toString() {
        return null;
    }
}

