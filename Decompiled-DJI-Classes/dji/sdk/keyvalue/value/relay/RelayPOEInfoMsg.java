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
import dji.sdk.keyvalue.value.relay.RelayPOEStatusType;
import org.json.JSONObject;

public class RelayPOEInfoMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    RelayPOEStatusType relay_poe_status;
    Integer voltage;

    public RelayPOEInfoMsg() {
    }

    public RelayPOEInfoMsg(RelayPOEStatusType relayPOEStatusType, Integer n) {
    }

    public static RelayPOEInfoMsg fromJson(String string) {
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

    public RelayPOEStatusType getRelay_poe_status() {
        return null;
    }

    public void setRelay_poe_status(RelayPOEStatusType relayPOEStatusType) {
    }

    public Integer getVoltage() {
        return null;
    }

    public void setVoltage(Integer n) {
    }

    public String toString() {
        return null;
    }
}

