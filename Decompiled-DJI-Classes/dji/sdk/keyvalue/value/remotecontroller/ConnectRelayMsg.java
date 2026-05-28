/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.remotecontroller;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.common.BufferMsg;
import dji.sdk.keyvalue.value.remotecontroller.RelaySSIDMsg;
import org.json.JSONObject;

public class ConnectRelayMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer uav_id;
    RelaySSIDMsg ssid;
    BufferMsg passwd;

    public ConnectRelayMsg() {
    }

    public ConnectRelayMsg(Integer n, RelaySSIDMsg relaySSIDMsg, BufferMsg bufferMsg) {
    }

    public static ConnectRelayMsg fromJson(String string) {
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

    public Integer getUav_id() {
        return null;
    }

    public void setUav_id(Integer n) {
    }

    public RelaySSIDMsg getSsid() {
        return null;
    }

    public void setSsid(RelaySSIDMsg relaySSIDMsg) {
    }

    public BufferMsg getPasswd() {
        return null;
    }

    public void setPasswd(BufferMsg bufferMsg) {
    }

    public String toString() {
        return null;
    }
}

