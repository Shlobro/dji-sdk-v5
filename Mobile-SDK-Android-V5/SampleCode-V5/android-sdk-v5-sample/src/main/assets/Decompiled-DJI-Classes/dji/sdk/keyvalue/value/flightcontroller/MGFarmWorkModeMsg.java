/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.flightcontroller.MGFarmCmd;
import dji.sdk.keyvalue.value.flightcontroller.MGFarmMode;
import org.json.JSONObject;

public class MGFarmWorkModeMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer version;
    MGFarmMode mode;
    MGFarmCmd cmd;
    Integer subCmd;

    public MGFarmWorkModeMsg() {
    }

    public MGFarmWorkModeMsg(Integer n, MGFarmMode mGFarmMode, MGFarmCmd mGFarmCmd, Integer n2) {
    }

    public static MGFarmWorkModeMsg fromJson(String string) {
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

    public MGFarmMode getMode() {
        return null;
    }

    public void setMode(MGFarmMode mGFarmMode) {
    }

    public MGFarmCmd getCmd() {
        return null;
    }

    public void setCmd(MGFarmCmd mGFarmCmd) {
    }

    public Integer getSubCmd() {
        return null;
    }

    public void setSubCmd(Integer n) {
    }

    public String toString() {
        return null;
    }
}

