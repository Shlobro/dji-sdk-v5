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
import dji.sdk.keyvalue.value.relay.RelayType;
import org.json.JSONObject;

public class RelayTypeMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    RelayType value;

    public RelayTypeMsg() {
    }

    public RelayTypeMsg(RelayType relayType) {
    }

    public static RelayTypeMsg fromJson(String string) {
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

    public RelayType getValue() {
        return null;
    }

    public void setValue(RelayType relayType) {
    }

    public String toString() {
        return null;
    }
}

