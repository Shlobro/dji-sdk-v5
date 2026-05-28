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
import dji.sdk.keyvalue.value.common.BufferMsg;
import java.util.List;
import org.json.JSONObject;

public class SyncDataInRelayNetMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    List<Integer> rcTargets;
    BufferMsg value;

    public SyncDataInRelayNetMsg() {
    }

    public SyncDataInRelayNetMsg(List<Integer> list, BufferMsg bufferMsg) {
    }

    public static SyncDataInRelayNetMsg fromJson(String string) {
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

    public List<Integer> getRcTargets() {
        return null;
    }

    public void setRcTargets(List<Integer> list) {
    }

    public BufferMsg getValue() {
        return null;
    }

    public void setValue(BufferMsg bufferMsg) {
    }

    public String toString() {
        return null;
    }
}

