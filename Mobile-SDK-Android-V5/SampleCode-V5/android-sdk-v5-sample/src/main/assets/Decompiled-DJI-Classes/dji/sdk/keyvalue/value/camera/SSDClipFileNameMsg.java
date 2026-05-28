/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class SSDClipFileNameMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer equipmentLabel;
    Integer reelID;
    Integer clipID;

    public SSDClipFileNameMsg() {
    }

    public SSDClipFileNameMsg(Integer n, Integer n2, Integer n3) {
    }

    public static SSDClipFileNameMsg fromJson(String string) {
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

    public Integer getEquipmentLabel() {
        return null;
    }

    public void setEquipmentLabel(Integer n) {
    }

    public Integer getReelID() {
        return null;
    }

    public void setReelID(Integer n) {
    }

    public Integer getClipID() {
        return null;
    }

    public void setClipID(Integer n) {
    }

    public String toString() {
        return null;
    }
}

