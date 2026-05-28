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
import dji.sdk.keyvalue.value.payload.ArPointInfo;
import java.util.List;
import org.json.JSONObject;

public class ArPointsMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    List<ArPointInfo> points;

    public ArPointsMsg() {
    }

    public ArPointsMsg(List<ArPointInfo> list) {
    }

    public static ArPointsMsg fromJson(String string) {
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

    public List<ArPointInfo> getPoints() {
        return null;
    }

    public void setPoints(List<ArPointInfo> list) {
    }

    public String toString() {
        return null;
    }
}

