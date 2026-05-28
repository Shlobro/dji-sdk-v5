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

public class UpgradeConfirmMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    UpgradeStage stage;
    Integer leftTime;
    Integer reserve;

    public UpgradeConfirmMsg() {
    }

    public UpgradeConfirmMsg(UpgradeStage upgradeStage, Integer n, Integer n2) {
    }

    public static UpgradeConfirmMsg fromJson(String string) {
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

    public Integer getLeftTime() {
        return null;
    }

    public void setLeftTime(Integer n) {
    }

    public Integer getReserve() {
        return null;
    }

    public void setReserve(Integer n) {
    }

    public String toString() {
        return null;
    }
}

