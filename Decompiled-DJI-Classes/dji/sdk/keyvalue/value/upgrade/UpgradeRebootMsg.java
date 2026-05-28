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

public class UpgradeRebootMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    UpgradeStage stage;
    Integer rebootTimeout;
    Integer msgValidDuration;

    public UpgradeRebootMsg() {
    }

    public UpgradeRebootMsg(UpgradeStage upgradeStage, Integer n, Integer n2) {
    }

    public static UpgradeRebootMsg fromJson(String string) {
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

    public Integer getRebootTimeout() {
        return null;
    }

    public void setRebootTimeout(Integer n) {
    }

    public Integer getMsgValidDuration() {
        return null;
    }

    public void setMsgValidDuration(Integer n) {
    }

    public String toString() {
        return null;
    }
}

