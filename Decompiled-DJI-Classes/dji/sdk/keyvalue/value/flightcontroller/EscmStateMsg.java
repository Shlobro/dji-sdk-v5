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
import dji.sdk.keyvalue.value.flightcontroller.MotorEscmStateMsg;
import java.util.List;
import org.json.JSONObject;

public class EscmStateMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    List<MotorEscmStateMsg> value;

    public EscmStateMsg() {
    }

    public EscmStateMsg(List<MotorEscmStateMsg> list) {
    }

    public static EscmStateMsg fromJson(String string) {
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

    public List<MotorEscmStateMsg> getValue() {
        return null;
    }

    public void setValue(List<MotorEscmStateMsg> list) {
    }

    public String toString() {
        return null;
    }
}

