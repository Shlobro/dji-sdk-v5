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
import dji.sdk.keyvalue.value.relay.RelayWorkModeProductSwitchState;
import org.json.JSONObject;

public class RelayWorkModeProductSwitchStateMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    RelayWorkModeProductSwitchState value;

    public RelayWorkModeProductSwitchStateMsg() {
    }

    public RelayWorkModeProductSwitchStateMsg(RelayWorkModeProductSwitchState relayWorkModeProductSwitchState) {
    }

    public static RelayWorkModeProductSwitchStateMsg fromJson(String string) {
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

    public RelayWorkModeProductSwitchState getValue() {
        return null;
    }

    public void setValue(RelayWorkModeProductSwitchState relayWorkModeProductSwitchState) {
    }

    public String toString() {
        return null;
    }
}

