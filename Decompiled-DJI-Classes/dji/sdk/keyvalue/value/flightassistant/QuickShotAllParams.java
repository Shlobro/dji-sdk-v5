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
import dji.sdk.keyvalue.value.flightassistant.QuickShotParams;
import org.json.JSONObject;

public class QuickShotAllParams
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    QuickShotParams params;
    Boolean isStarted;
    Double circluNum;

    public QuickShotAllParams() {
    }

    public QuickShotAllParams(QuickShotParams quickShotParams, Boolean bl, Double d2) {
    }

    public static QuickShotAllParams fromJson(String string) {
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

    public QuickShotParams getParams() {
        return null;
    }

    public void setParams(QuickShotParams quickShotParams) {
    }

    public Boolean getIsStarted() {
        return null;
    }

    public void setIsStarted(Boolean bl) {
    }

    public Double getCircluNum() {
        return null;
    }

    public void setCircluNum(Double d2) {
    }

    public String toString() {
        return null;
    }
}

