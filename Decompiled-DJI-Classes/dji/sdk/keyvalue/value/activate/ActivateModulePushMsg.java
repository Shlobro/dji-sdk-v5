/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.activate;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.activate.ActivateModulePushType;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class ActivateModulePushMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    ActivateModulePushType pushType;
    String boardNumber;
    Integer moduleCount;
    Integer moduleType;
    Integer moduleSeq;
    String productSN;
    Integer remainingActivateCount;
    Integer senderType;
    Integer senderIndex;

    public ActivateModulePushMsg() {
    }

    public ActivateModulePushMsg(ActivateModulePushType activateModulePushType, String string, Integer n, Integer n2, Integer n3, String string2, Integer n4, Integer n5, Integer n6) {
    }

    public static ActivateModulePushMsg fromJson(String string) {
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

    public ActivateModulePushType getPushType() {
        return null;
    }

    public void setPushType(ActivateModulePushType activateModulePushType) {
    }

    public String getBoardNumber() {
        return null;
    }

    public void setBoardNumber(String string) {
    }

    public Integer getModuleCount() {
        return null;
    }

    public void setModuleCount(Integer n) {
    }

    public Integer getModuleType() {
        return null;
    }

    public void setModuleType(Integer n) {
    }

    public Integer getModuleSeq() {
        return null;
    }

    public void setModuleSeq(Integer n) {
    }

    public String getProductSN() {
        return null;
    }

    public void setProductSN(String string) {
    }

    public Integer getRemainingActivateCount() {
        return null;
    }

    public void setRemainingActivateCount(Integer n) {
    }

    public Integer getSenderType() {
        return null;
    }

    public void setSenderType(Integer n) {
    }

    public Integer getSenderIndex() {
        return null;
    }

    public void setSenderIndex(Integer n) {
    }

    public String toString() {
        return null;
    }
}

