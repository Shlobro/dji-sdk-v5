/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.hmslog;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class HMSErrorInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer version;
    String date;
    String module;
    String alarmID;
    Integer index;
    Integer level;

    public HMSErrorInfo() {
    }

    public HMSErrorInfo(Integer n, String string, String string2, String string3, Integer n2, Integer n3) {
    }

    public static HMSErrorInfo fromJson(String string) {
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

    public Integer getVersion() {
        return null;
    }

    public void setVersion(Integer n) {
    }

    public String getDate() {
        return null;
    }

    public void setDate(String string) {
    }

    public String getModule() {
        return null;
    }

    public void setModule(String string) {
    }

    public String getAlarmID() {
        return null;
    }

    public void setAlarmID(String string) {
    }

    public Integer getIndex() {
        return null;
    }

    public void setIndex(Integer n) {
    }

    public Integer getLevel() {
        return null;
    }

    public void setLevel(Integer n) {
    }

    public String toString() {
        return null;
    }
}

