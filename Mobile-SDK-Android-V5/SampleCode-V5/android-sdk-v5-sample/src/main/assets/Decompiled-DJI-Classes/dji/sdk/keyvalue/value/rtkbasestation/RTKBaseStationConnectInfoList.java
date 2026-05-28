/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.rtkbasestation;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.rtkbasestation.RTKStationInfo;
import java.util.List;
import org.json.JSONObject;

public class RTKBaseStationConnectInfoList
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    List<RTKStationInfo> value;

    public RTKBaseStationConnectInfoList() {
    }

    public RTKBaseStationConnectInfoList(List<RTKStationInfo> list) {
    }

    public static RTKBaseStationConnectInfoList fromJson(String string) {
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

    public List<RTKStationInfo> getValue() {
        return null;
    }

    public void setValue(List<RTKStationInfo> list) {
    }

    public String toString() {
        return null;
    }
}

