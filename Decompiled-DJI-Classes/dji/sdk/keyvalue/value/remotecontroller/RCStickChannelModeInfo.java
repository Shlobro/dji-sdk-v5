/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.remotecontroller;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.remotecontroller.RCStickChannelMode;
import org.json.JSONObject;

public class RCStickChannelModeInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    RCStickChannelMode leftVertical;
    RCStickChannelMode leftHorizontal;
    RCStickChannelMode rightVertical;
    RCStickChannelMode rightHorizontal;

    public RCStickChannelModeInfo() {
    }

    public RCStickChannelModeInfo(RCStickChannelMode rCStickChannelMode, RCStickChannelMode rCStickChannelMode2, RCStickChannelMode rCStickChannelMode3, RCStickChannelMode rCStickChannelMode4) {
    }

    public static RCStickChannelModeInfo fromJson(String string) {
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

    public RCStickChannelMode getLeftVertical() {
        return null;
    }

    public void setLeftVertical(RCStickChannelMode rCStickChannelMode) {
    }

    public RCStickChannelMode getLeftHorizontal() {
        return null;
    }

    public void setLeftHorizontal(RCStickChannelMode rCStickChannelMode) {
    }

    public RCStickChannelMode getRightVertical() {
        return null;
    }

    public void setRightVertical(RCStickChannelMode rCStickChannelMode) {
    }

    public RCStickChannelMode getRightHorizontal() {
        return null;
    }

    public void setRightHorizontal(RCStickChannelMode rCStickChannelMode) {
    }

    public String toString() {
        return null;
    }
}

