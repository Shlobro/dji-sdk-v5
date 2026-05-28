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
import dji.sdk.keyvalue.value.flightcontroller.GnssAssessTaskInfo;
import java.util.List;
import org.json.JSONObject;

public class GnssAssessTaskInfoList
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer taskNumber;
    List<GnssAssessTaskInfo> value;

    public GnssAssessTaskInfoList() {
    }

    public GnssAssessTaskInfoList(Integer n, List<GnssAssessTaskInfo> list) {
    }

    public static GnssAssessTaskInfoList fromJson(String string) {
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

    public Integer getTaskNumber() {
        return null;
    }

    public void setTaskNumber(Integer n) {
    }

    public List<GnssAssessTaskInfo> getValue() {
        return null;
    }

    public void setValue(List<GnssAssessTaskInfo> list) {
    }

    public String toString() {
        return null;
    }
}

