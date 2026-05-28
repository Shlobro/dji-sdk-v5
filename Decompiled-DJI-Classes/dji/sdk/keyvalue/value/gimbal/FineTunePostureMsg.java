/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.gimbal;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.gimbal.PostureFineTuneAxis;
import org.json.JSONObject;

public class FineTunePostureMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    PostureFineTuneAxis axis;
    Double value;

    public FineTunePostureMsg() {
    }

    public FineTunePostureMsg(PostureFineTuneAxis postureFineTuneAxis, Double d2) {
    }

    public static FineTunePostureMsg fromJson(String string) {
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

    public PostureFineTuneAxis getAxis() {
        return null;
    }

    public void setAxis(PostureFineTuneAxis postureFineTuneAxis) {
    }

    public Double getValue() {
        return null;
    }

    public void setValue(Double d2) {
    }

    public String toString() {
        return null;
    }
}

