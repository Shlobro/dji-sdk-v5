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
import dji.sdk.keyvalue.value.camera.BatchActionState;
import org.json.JSONObject;

public class BatchActionStateMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    BatchActionState state;
    Integer percentage;

    public BatchActionStateMsg() {
    }

    public BatchActionStateMsg(BatchActionState batchActionState, Integer n) {
    }

    public static BatchActionStateMsg fromJson(String string) {
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

    public BatchActionState getState() {
        return null;
    }

    public void setState(BatchActionState batchActionState) {
    }

    public Integer getPercentage() {
        return null;
    }

    public void setPercentage(Integer n) {
    }

    public String toString() {
        return null;
    }
}

