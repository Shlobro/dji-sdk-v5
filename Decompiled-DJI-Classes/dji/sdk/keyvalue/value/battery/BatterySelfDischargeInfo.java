/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.battery;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class BatterySelfDischargeInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer index;
    Integer dischargeInDays;

    public BatterySelfDischargeInfo() {
    }

    public BatterySelfDischargeInfo(Integer n, Integer n2) {
    }

    public static BatterySelfDischargeInfo fromJson(String string) {
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

    public Integer getIndex() {
        return null;
    }

    public void setIndex(Integer n) {
    }

    public Integer getDischargeInDays() {
        return null;
    }

    public void setDischargeInDays(Integer n) {
    }

    public String toString() {
        return null;
    }
}

