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
import dji.sdk.keyvalue.value.relay.RelaySearchStatus;
import org.json.JSONObject;

public class RelaySearchStatusMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    RelaySearchStatus status;

    public RelaySearchStatusMsg() {
    }

    public RelaySearchStatusMsg(RelaySearchStatus relaySearchStatus) {
    }

    public static RelaySearchStatusMsg fromJson(String string) {
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

    public RelaySearchStatus getStatus() {
        return null;
    }

    public void setStatus(RelaySearchStatus relaySearchStatus) {
    }

    public String toString() {
        return null;
    }
}

