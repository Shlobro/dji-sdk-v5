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
import org.json.JSONObject;

public class MasterShotProgressInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer totalProgress;
    Integer currentSegProgress;

    public MasterShotProgressInfo() {
    }

    public MasterShotProgressInfo(Integer n, Integer n2) {
    }

    public static MasterShotProgressInfo fromJson(String string) {
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

    public Integer getTotalProgress() {
        return null;
    }

    public void setTotalProgress(Integer n) {
    }

    public Integer getCurrentSegProgress() {
        return null;
    }

    public void setCurrentSegProgress(Integer n) {
    }

    public String toString() {
        return null;
    }
}

