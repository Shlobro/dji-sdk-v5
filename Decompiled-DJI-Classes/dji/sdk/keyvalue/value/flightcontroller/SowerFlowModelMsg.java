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
import dji.sdk.keyvalue.value.flightcontroller.FlowInterpolationType;
import java.util.List;
import org.json.JSONObject;

public class SowerFlowModelMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer modelId;
    FlowInterpolationType modelType;
    List<Double> hatchFlow;

    public SowerFlowModelMsg() {
    }

    public SowerFlowModelMsg(Integer n, FlowInterpolationType flowInterpolationType, List<Double> list) {
    }

    public static SowerFlowModelMsg fromJson(String string) {
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

    public Integer getModelId() {
        return null;
    }

    public void setModelId(Integer n) {
    }

    public FlowInterpolationType getModelType() {
        return null;
    }

    public void setModelType(FlowInterpolationType flowInterpolationType) {
    }

    public List<Double> getHatchFlow() {
        return null;
    }

    public void setHatchFlow(List<Double> list) {
    }

    public String toString() {
        return null;
    }
}

