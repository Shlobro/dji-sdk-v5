/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.payload;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.payload.LightState;
import java.util.List;
import org.json.JSONObject;

public class LightStateMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    List<LightState> states;

    public LightStateMsg() {
    }

    public LightStateMsg(List<LightState> list) {
    }

    public static LightStateMsg fromJson(String string) {
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

    public List<LightState> getStates() {
        return null;
    }

    public void setStates(List<LightState> list) {
    }

    public String toString() {
        return null;
    }
}

