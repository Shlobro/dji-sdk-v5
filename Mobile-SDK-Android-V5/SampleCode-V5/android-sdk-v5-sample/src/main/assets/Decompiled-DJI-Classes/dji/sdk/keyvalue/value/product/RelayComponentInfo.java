/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.product;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.relay.RelayType;
import org.json.JSONObject;

public class RelayComponentInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer component_id;
    RelayType relayType;

    public RelayComponentInfo() {
    }

    public RelayComponentInfo(Integer n, RelayType relayType) {
    }

    public static RelayComponentInfo fromJson(String string) {
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

    public Integer getComponent_id() {
        return null;
    }

    public void setComponent_id(Integer n) {
    }

    public RelayType getRelayType() {
        return null;
    }

    public void setRelayType(RelayType relayType) {
    }

    public String toString() {
        return null;
    }
}

