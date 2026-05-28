/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.payload;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.payload.ArCircleInfo;
import java.util.List;
import org.json.JSONObject;

public class ArCirclesMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Long group_id;
    List<ArCircleInfo> circles;

    public ArCirclesMsg() {
    }

    public ArCirclesMsg(Long l2, List<ArCircleInfo> list) {
    }

    public static ArCirclesMsg fromJson(String string) {
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

    public Long getGroup_id() {
        return null;
    }

    public void setGroup_id(Long l2) {
    }

    public List<ArCircleInfo> getCircles() {
        return null;
    }

    public void setCircles(List<ArCircleInfo> list) {
    }

    public String toString() {
        return null;
    }
}

