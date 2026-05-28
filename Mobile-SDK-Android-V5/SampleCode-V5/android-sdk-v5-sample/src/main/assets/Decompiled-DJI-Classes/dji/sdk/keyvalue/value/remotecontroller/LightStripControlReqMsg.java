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
import dji.sdk.keyvalue.value.remotecontroller.LightStripActionType;
import dji.sdk.keyvalue.value.remotecontroller.SwitchType;
import org.json.JSONObject;

public class LightStripControlReqMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    SwitchType powerSwitch;
    LightStripActionType action;

    public LightStripControlReqMsg() {
    }

    public LightStripControlReqMsg(SwitchType switchType, LightStripActionType lightStripActionType) {
    }

    public static LightStripControlReqMsg fromJson(String string) {
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

    public SwitchType getPowerSwitch() {
        return null;
    }

    public void setPowerSwitch(SwitchType switchType) {
    }

    public LightStripActionType getAction() {
        return null;
    }

    public void setAction(LightStripActionType lightStripActionType) {
    }

    public String toString() {
        return null;
    }
}

