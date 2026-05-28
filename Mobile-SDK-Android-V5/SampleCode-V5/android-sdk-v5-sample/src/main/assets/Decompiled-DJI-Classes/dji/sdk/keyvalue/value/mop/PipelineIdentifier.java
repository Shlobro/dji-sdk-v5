/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.mop;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.mop.PipelineDeviceType;
import org.json.JSONObject;

public class PipelineIdentifier
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer productId;
    Integer deviceId;
    PipelineDeviceType deviceType;
    Integer identifier;
    Integer receiverSeq;

    public PipelineIdentifier() {
    }

    public PipelineIdentifier(Integer n, Integer n2, PipelineDeviceType pipelineDeviceType, Integer n3, Integer n4) {
    }

    public static PipelineIdentifier fromJson(String string) {
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

    public Integer getProductId() {
        return null;
    }

    public void setProductId(Integer n) {
    }

    public Integer getDeviceId() {
        return null;
    }

    public void setDeviceId(Integer n) {
    }

    public PipelineDeviceType getDeviceType() {
        return null;
    }

    public void setDeviceType(PipelineDeviceType pipelineDeviceType) {
    }

    public Integer getIdentifier() {
        return null;
    }

    public void setIdentifier(Integer n) {
    }

    public Integer getReceiverSeq() {
        return null;
    }

    public void setReceiverSeq(Integer n) {
    }

    public String toString() {
        return null;
    }
}

