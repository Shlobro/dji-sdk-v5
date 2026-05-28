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
import dji.sdk.keyvalue.value.common.LocationCoordinate3D;
import dji.sdk.keyvalue.value.relay.RelayRtkPostionType;
import org.json.JSONObject;

public class RelayRtkCoordRealtimeMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    LocationCoordinate3D location;
    RelayRtkPostionType type;

    public RelayRtkCoordRealtimeMsg() {
    }

    public RelayRtkCoordRealtimeMsg(LocationCoordinate3D locationCoordinate3D, RelayRtkPostionType relayRtkPostionType) {
    }

    public static RelayRtkCoordRealtimeMsg fromJson(String string) {
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

    public LocationCoordinate3D getLocation() {
        return null;
    }

    public void setLocation(LocationCoordinate3D locationCoordinate3D) {
    }

    public RelayRtkPostionType getType() {
        return null;
    }

    public void setType(RelayRtkPostionType relayRtkPostionType) {
    }

    public String toString() {
        return null;
    }
}

