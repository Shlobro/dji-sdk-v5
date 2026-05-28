/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class CalibDate
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer year;
    Integer month;
    Integer day;

    public CalibDate() {
    }

    public CalibDate(Integer n, Integer n2, Integer n3) {
    }

    public static CalibDate fromJson(String string) {
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

    public Integer getYear() {
        return null;
    }

    public void setYear(Integer n) {
    }

    public Integer getMonth() {
        return null;
    }

    public void setMonth(Integer n) {
    }

    public Integer getDay() {
        return null;
    }

    public void setDay(Integer n) {
    }

    public String toString() {
        return null;
    }
}

