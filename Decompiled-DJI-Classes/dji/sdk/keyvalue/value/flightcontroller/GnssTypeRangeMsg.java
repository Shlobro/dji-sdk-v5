/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.flightcontroller.GnssType;
import java.util.List;
import org.json.JSONObject;

public class GnssTypeRangeMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    List<GnssType> range;

    public GnssTypeRangeMsg() {
    }

    public GnssTypeRangeMsg(List<GnssType> list) {
    }

    public static GnssTypeRangeMsg fromJson(String string) {
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

    public List<GnssType> getRange() {
        return null;
    }

    public void setRange(List<GnssType> list) {
    }

    public String toString() {
        return null;
    }
}

