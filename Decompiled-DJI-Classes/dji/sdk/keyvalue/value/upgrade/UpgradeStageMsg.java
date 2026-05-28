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

public class UpgradeStageMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    UpgradeStage value;

    public UpgradeStageMsg() {
    }

    public UpgradeStageMsg(UpgradeStage upgradeStage) {
    }

    public static UpgradeStageMsg fromJson(String string) {
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

    public UpgradeStage getValue() {
        return null;
    }

    public void setValue(UpgradeStage upgradeStage) {
    }

    public String toString() {
        return null;
    }
}

