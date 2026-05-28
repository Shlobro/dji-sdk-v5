/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.airlink;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.airlink.GroundRole;
import dji.sdk.keyvalue.value.airlink.RelayTopologyType;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class RelayRequestPeerMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    GroundRole gndRole;
    RelayTopologyType type;

    public RelayRequestPeerMsg() {
    }

    public RelayRequestPeerMsg(GroundRole groundRole, RelayTopologyType relayTopologyType) {
    }

    public static RelayRequestPeerMsg fromJson(String string) {
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

    public GroundRole getGndRole() {
        return null;
    }

    public void setGndRole(GroundRole groundRole) {
    }

    public RelayTopologyType getType() {
        return null;
    }

    public void setType(RelayTopologyType relayTopologyType) {
    }

    public String toString() {
        return null;
    }
}

