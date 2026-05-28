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

public class UpgradeOnGoingMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    UpgradeStage stage;
    Integer upgradeProgress;
    Integer descriptionCount;
    Integer ongoingStepIndex;

    public UpgradeOnGoingMsg() {
    }

    public UpgradeOnGoingMsg(UpgradeStage upgradeStage, Integer n, Integer n2, Integer n3) {
    }

    public static UpgradeOnGoingMsg fromJson(String string) {
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

    public Integer getUpgradeProgress() {
        return null;
    }

    public void setUpgradeProgress(Integer n) {
    }

    public Integer getDescriptionCount() {
        return null;
    }

    public void setDescriptionCount(Integer n) {
    }

    public Integer getOngoingStepIndex() {
        return null;
    }

    public void setOngoingStepIndex(Integer n) {
    }

    public String toString() {
        return null;
    }
}

