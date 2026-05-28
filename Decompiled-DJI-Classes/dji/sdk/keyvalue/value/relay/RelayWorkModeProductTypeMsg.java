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
import dji.sdk.keyvalue.value.relay.RelayWorkModeProductType;
import org.json.JSONObject;

public class RelayWorkModeProductTypeMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    RelayWorkModeProductType value;

    public RelayWorkModeProductTypeMsg() {
    }

    public RelayWorkModeProductTypeMsg(RelayWorkModeProductType relayWorkModeProductType) {
    }

    public static RelayWorkModeProductTypeMsg fromJson(String string) {
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

    public RelayWorkModeProductType getValue() {
        return null;
    }

    public void setValue(RelayWorkModeProductType relayWorkModeProductType) {
    }

    public String toString() {
        return null;
    }
}

