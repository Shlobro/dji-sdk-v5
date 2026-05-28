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
import dji.sdk.keyvalue.value.payload.LightGroup;
import dji.sdk.keyvalue.value.payload.LightingMode;
import dji.sdk.keyvalue.value.payload.LightingType;
import org.json.JSONObject;

public class LightCtrlMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    LightingMode mode;
    LightingType type;
    LightGroup group;
    Integer brightness;

    public LightCtrlMsg() {
    }

    public LightCtrlMsg(LightingMode lightingMode, LightingType lightingType, LightGroup lightGroup, Integer n) {
    }

    public static LightCtrlMsg fromJson(String string) {
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

    public LightingMode getMode() {
        return null;
    }

    public void setMode(LightingMode lightingMode) {
    }

    public LightingType getType() {
        return null;
    }

    public void setType(LightingType lightingType) {
    }

    public LightGroup getGroup() {
        return null;
    }

    public void setGroup(LightGroup lightGroup) {
    }

    public Integer getBrightness() {
        return null;
    }

    public void setBrightness(Integer n) {
    }

    public String toString() {
        return null;
    }
}

