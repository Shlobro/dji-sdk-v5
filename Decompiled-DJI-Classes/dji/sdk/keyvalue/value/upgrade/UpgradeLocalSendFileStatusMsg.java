/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.upgrade;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.upgrade.UpgradeStage;
import org.json.JSONObject;

public class UpgradeLocalSendFileStatusMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    UpgradeStage stage;
    Integer retCode;
    Boolean stageStatus;
    Integer sendDataProgress;

    public UpgradeLocalSendFileStatusMsg() {
    }

    public UpgradeLocalSendFileStatusMsg(UpgradeStage upgradeStage, Integer n, Boolean bl, Integer n2) {
    }

    public static UpgradeLocalSendFileStatusMsg fromJson(String string) {
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

    public UpgradeStage getStage() {
        return null;
    }

    public void setStage(UpgradeStage upgradeStage) {
    }

    public Integer getRetCode() {
        return null;
    }

    public void setRetCode(Integer n) {
    }

    public Boolean getStageStatus() {
        return null;
    }

    public void setStageStatus(Boolean bl) {
    }

    public Integer getSendDataProgress() {
        return null;
    }

    public void setSendDataProgress(Integer n) {
    }

    public String toString() {
        return null;
    }
}

