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
import org.json.JSONObject;

public class AirlinkBandwidthMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Bandwidth value;

    public AirlinkBandwidthMsg() {
    }

    public AirlinkBandwidthMsg(Bandwidth bandwidth) {
    }

    public static AirlinkBandwidthMsg fromJson(String string) {
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

    public Bandwidth getValue() {
        return null;
    }

    public void setValue(Bandwidth bandwidth) {
    }

    public String toString() {
        return null;
    }
}

