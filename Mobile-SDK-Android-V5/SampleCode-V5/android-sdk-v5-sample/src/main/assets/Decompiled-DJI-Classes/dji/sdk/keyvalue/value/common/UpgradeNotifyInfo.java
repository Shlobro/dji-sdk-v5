/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.common;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class UpgradeNotifyInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer startOrStopUpgrade;
    Integer upgradeFailOrSuccess;

    public UpgradeNotifyInfo() {
    }

    public UpgradeNotifyInfo(Integer n, Integer n2) {
    }

    public static UpgradeNotifyInfo fromJson(String string) {
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

    public Integer getStartOrStopUpgrade() {
        return null;
    }

    public void setStartOrStopUpgrade(Integer n) {
    }

    public Integer getUpgradeFailOrSuccess() {
        return null;
    }

    public void setUpgradeFailOrSuccess(Integer n) {
    }

    public String toString() {
        return null;
    }
}

