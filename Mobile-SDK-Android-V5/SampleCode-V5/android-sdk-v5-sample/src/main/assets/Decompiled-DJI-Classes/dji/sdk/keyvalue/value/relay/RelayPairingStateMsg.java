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
import dji.sdk.keyvalue.value.relay.RelayPairingState;
import org.json.JSONObject;

public class RelayPairingStateMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    RelayPairingState value;

    public RelayPairingStateMsg() {
    }

    public RelayPairingStateMsg(RelayPairingState relayPairingState) {
    }

    public static RelayPairingStateMsg fromJson(String string) {
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

    public RelayPairingState getValue() {
        return null;
    }

    public void setValue(RelayPairingState relayPairingState) {
    }

    public String toString() {
        return null;
    }
}

