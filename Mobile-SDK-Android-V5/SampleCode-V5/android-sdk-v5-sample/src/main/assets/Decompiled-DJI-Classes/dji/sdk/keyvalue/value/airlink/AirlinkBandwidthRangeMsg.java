/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.airlink;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.airlink.Bandwidth;
import dji.sdk.keyvalue.value.base.DJIValue;
import java.util.List;
import org.json.JSONObject;

public class AirlinkBandwidthRangeMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    List<Bandwidth> value;

    public AirlinkBandwidthRangeMsg() {
    }

    public AirlinkBandwidthRangeMsg(List<Bandwidth> list) {
    }

    public static AirlinkBandwidthRangeMsg fromJson(String string) {
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

    public List<Bandwidth> getValue() {
        return null;
    }

    public void setValue(List<Bandwidth> list) {
    }

    public String toString() {
        return null;
    }
}

