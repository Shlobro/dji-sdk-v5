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
import dji.sdk.keyvalue.value.flightcontroller.RIDResultState;
import org.json.JSONObject;

public class RIDResultStateMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    RIDResultState value;

    public RIDResultStateMsg() {
    }

    public RIDResultStateMsg(RIDResultState rIDResultState) {
    }

    public static RIDResultStateMsg fromJson(String string) {
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

    public RIDResultState getValue() {
        return null;
    }

    public void setValue(RIDResultState rIDResultState) {
    }

    public String toString() {
        return null;
    }
}

