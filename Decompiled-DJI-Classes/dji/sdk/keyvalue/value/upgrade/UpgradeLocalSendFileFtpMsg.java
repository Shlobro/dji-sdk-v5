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

public class UpgradeLocalSendFileFtpMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    UpgradeStage stage;
    String ip;
    Integer port;
    String path;

    public UpgradeLocalSendFileFtpMsg() {
    }

    public UpgradeLocalSendFileFtpMsg(UpgradeStage upgradeStage, String string, Integer n, String string2) {
    }

    public static UpgradeLocalSendFileFtpMsg fromJson(String string) {
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

    public String getIp() {
        return null;
    }

    public void setIp(String string) {
    }

    public Integer getPort() {
        return null;
    }

    public void setPort(Integer n) {
    }

    public String getPath() {
        return null;
    }

    public void setPath(String string) {
    }

    public String toString() {
        return null;
    }
}

