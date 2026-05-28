/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.airlink;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.airlink.DecodeAbilityType;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class AppDecodeAbilityInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    DecodeAbilityType type;
    Integer data;

    public AppDecodeAbilityInfo() {
    }

    public AppDecodeAbilityInfo(DecodeAbilityType decodeAbilityType, Integer n) {
    }

    public static AppDecodeAbilityInfo fromJson(String string) {
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

    public DecodeAbilityType getType() {
        return null;
    }

    public void setType(DecodeAbilityType decodeAbilityType) {
    }

    public Integer getData() {
        return null;
    }

    public void setData(Integer n) {
    }

    public String toString() {
        return null;
    }
}

