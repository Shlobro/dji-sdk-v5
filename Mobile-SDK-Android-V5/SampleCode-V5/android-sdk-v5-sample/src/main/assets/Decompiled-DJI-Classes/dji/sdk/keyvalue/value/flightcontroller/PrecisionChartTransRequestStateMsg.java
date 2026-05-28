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
import dji.sdk.keyvalue.value.flightcontroller.PrecisionChartTransRequestState;
import org.json.JSONObject;

public class PrecisionChartTransRequestStateMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    PrecisionChartTransRequestState value;
    String filePath;

    public PrecisionChartTransRequestStateMsg() {
    }

    public PrecisionChartTransRequestStateMsg(PrecisionChartTransRequestState precisionChartTransRequestState, String string) {
    }

    public static PrecisionChartTransRequestStateMsg fromJson(String string) {
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

    public PrecisionChartTransRequestState getValue() {
        return null;
    }

    public void setValue(PrecisionChartTransRequestState precisionChartTransRequestState) {
    }

    public String getFilePath() {
        return null;
    }

    public void setFilePath(String string) {
    }

    public String toString() {
        return null;
    }
}

