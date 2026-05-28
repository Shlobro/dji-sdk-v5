/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.flightassistant;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.flightassistant.MasterShotIndexType;
import org.json.JSONObject;

public class MasterShotParam
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    MasterShotIndexType index;
    Integer value;

    public MasterShotParam() {
    }

    public MasterShotParam(MasterShotIndexType masterShotIndexType, Integer n) {
    }

    public static MasterShotParam fromJson(String string) {
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

    public MasterShotIndexType getIndex() {
        return null;
    }

    public void setIndex(MasterShotIndexType masterShotIndexType) {
    }

    public Integer getValue() {
        return null;
    }

    public void setValue(Integer n) {
    }

    public String toString() {
        return null;
    }
}

