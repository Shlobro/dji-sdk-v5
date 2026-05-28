/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.payload;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.payload.MegaphonePlayMode;
import dji.sdk.keyvalue.value.payload.MegaphoneSystemState;
import dji.sdk.keyvalue.value.payload.MegaphoneWorkMode;
import org.json.JSONObject;

public class MegaphonePlayStateMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    String uuid;
    String fileName;
    Integer volume;
    MegaphoneWorkMode workMode;
    MegaphonePlayMode playMode;
    MegaphoneSystemState state;

    public MegaphonePlayStateMsg() {
    }

    public MegaphonePlayStateMsg(String string, String string2, Integer n, MegaphoneWorkMode megaphoneWorkMode, MegaphonePlayMode megaphonePlayMode, MegaphoneSystemState megaphoneSystemState) {
    }

    public static MegaphonePlayStateMsg fromJson(String string) {
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

    public String getUuid() {
        return null;
    }

    public void setUuid(String string) {
    }

    public String getFileName() {
        return null;
    }

    public void setFileName(String string) {
    }

    public Integer getVolume() {
        return null;
    }

    public void setVolume(Integer n) {
    }

    public MegaphoneWorkMode getWorkMode() {
        return null;
    }

    public void setWorkMode(MegaphoneWorkMode megaphoneWorkMode) {
    }

    public MegaphonePlayMode getPlayMode() {
        return null;
    }

    public void setPlayMode(MegaphonePlayMode megaphonePlayMode) {
    }

    public MegaphoneSystemState getState() {
        return null;
    }

    public void setState(MegaphoneSystemState megaphoneSystemState) {
    }

    public String toString() {
        return null;
    }
}

