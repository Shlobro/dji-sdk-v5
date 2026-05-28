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
import dji.sdk.keyvalue.value.relay.RelayWorkModeProductSwitchError;
import org.json.JSONObject;

public class RelayWorkModeProductSwitchErrorMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    RelayWorkModeProductSwitchError value;

    public RelayWorkModeProductSwitchErrorMsg() {
    }

    public RelayWorkModeProductSwitchErrorMsg(RelayWorkModeProductSwitchError relayWorkModeProductSwitchError) {
    }

    public static RelayWorkModeProductSwitchErrorMsg fromJson(String string) {
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

    public RelayWorkModeProductSwitchError getValue() {
        return null;
    }

    public void setValue(RelayWorkModeProductSwitchError relayWorkModeProductSwitchError) {
    }

    public String toString() {
        return null;
    }
}

