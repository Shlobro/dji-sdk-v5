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
import dji.sdk.keyvalue.value.flightcontroller.EscStateInfo;
import java.util.List;
import org.json.JSONObject;

public class AllEscSpeedMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    List<EscStateInfo> value;

    public AllEscSpeedMsg() {
    }

    public AllEscSpeedMsg(List<EscStateInfo> list) {
    }

    public static AllEscSpeedMsg fromJson(String string) {
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

    public List<EscStateInfo> getValue() {
        return null;
    }

    public void setValue(List<EscStateInfo> list) {
    }

    public String toString() {
        return null;
    }
}

