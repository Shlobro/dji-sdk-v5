/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.innertool;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class V1PackHeader
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer version;
    Integer senderIndex;
    Integer senderType;
    Integer receiverType;
    Integer receiverIndex;
    Integer senderMid;
    Integer receiverMid;
    Boolean isNeedRes;
    Boolean isResponse;
    Integer sequenceNum;
    Integer cmdType;
    Integer cmdSet;
    Integer cmdId;
    Integer retryTimes;
    Integer retryInterval;

    public V1PackHeader() {
    }

    public V1PackHeader(Integer n, Integer n2, Integer n3, Integer n4, Integer n5, Integer n6, Integer n7, Boolean bl, Boolean bl2, Integer n8, Integer n9, Integer n10, Integer n11, Integer n12, Integer n13) {
    }

    public static V1PackHeader fromJson(String string) {
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

    public Integer getVersion() {
        return null;
    }

    public void setVersion(Integer n) {
    }

    public Integer getSenderIndex() {
        return null;
    }

    public void setSenderIndex(Integer n) {
    }

    public Integer getSenderType() {
        return null;
    }

    public void setSenderType(Integer n) {
    }

    public Integer getReceiverType() {
        return null;
    }

    public void setReceiverType(Integer n) {
    }

    public Integer getReceiverIndex() {
        return null;
    }

    public void setReceiverIndex(Integer n) {
    }

    public Integer getSenderMid() {
        return null;
    }

    public void setSenderMid(Integer n) {
    }

    public Integer getReceiverMid() {
        return null;
    }

    public void setReceiverMid(Integer n) {
    }

    public Boolean getIsNeedRes() {
        return null;
    }

    public void setIsNeedRes(Boolean bl) {
    }

    public Boolean getIsResponse() {
        return null;
    }

    public void setIsResponse(Boolean bl) {
    }

    public Integer getSequenceNum() {
        return null;
    }

    public void setSequenceNum(Integer n) {
    }

    public Integer getCmdType() {
        return null;
    }

    public void setCmdType(Integer n) {
    }

    public Integer getCmdSet() {
        return null;
    }

    public void setCmdSet(Integer n) {
    }

    public Integer getCmdId() {
        return null;
    }

    public void setCmdId(Integer n) {
    }

    public Integer getRetryTimes() {
        return null;
    }

    public void setRetryTimes(Integer n) {
    }

    public Integer getRetryInterval() {
        return null;
    }

    public void setRetryInterval(Integer n) {
    }

    public String toString() {
        return null;
    }
}

