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
import dji.sdk.keyvalue.value.relay.RelayPowerSupplyType;
import org.json.JSONObject;

public class RelayPowerSupplyMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    RelayPowerSupplyType source;

    public RelayPowerSupplyMsg() {
    }

    public RelayPowerSupplyMsg(RelayPowerSupplyType relayPowerSupplyType) {
    }

    public static RelayPowerSupplyMsg fromJson(String string) {
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

    public RelayPowerSupplyType getSource() {
        return null;
    }

    public void setSource(RelayPowerSupplyType relayPowerSupplyType) {
    }

    public String toString() {
        return null;
    }
}

