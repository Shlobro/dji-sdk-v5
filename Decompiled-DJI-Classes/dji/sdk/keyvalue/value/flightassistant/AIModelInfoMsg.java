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
import dji.sdk.keyvalue.value.flightassistant.AIModelLabel;
import java.util.List;
import org.json.JSONObject;

public class AIModelInfoMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer index;
    Double conf_threshold;
    List<AIModelLabel> labels;

    public AIModelInfoMsg() {
    }

    public AIModelInfoMsg(Integer n, Double d2, List<AIModelLabel> list) {
    }

    public static AIModelInfoMsg fromJson(String string) {
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

    public Integer getIndex() {
        return null;
    }

    public void setIndex(Integer n) {
    }

    public Double getConf_threshold() {
        return null;
    }

    public void setConf_threshold(Double d2) {
    }

    public List<AIModelLabel> getLabels() {
        return null;
    }

    public void setLabels(List<AIModelLabel> list) {
    }

    public String toString() {
        return null;
    }
}

