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
import dji.sdk.keyvalue.value.remotecontroller.ControlMode;
import dji.sdk.keyvalue.value.remotecontroller.RcChannelSetting;
import org.json.JSONObject;

public class RcControllerModeMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    ControlMode rcMode;
    RcChannelSetting channel1;
    RcChannelSetting channel2;
    RcChannelSetting channel3;
    RcChannelSetting channel4;

    public RcControllerModeMsg() {
    }

    public RcControllerModeMsg(ControlMode controlMode, RcChannelSetting rcChannelSetting, RcChannelSetting rcChannelSetting2, RcChannelSetting rcChannelSetting3, RcChannelSetting rcChannelSetting4) {
    }

    public static RcControllerModeMsg fromJson(String string) {
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

    public ControlMode getRcMode() {
        return null;
    }

    public void setRcMode(ControlMode controlMode) {
    }

    public RcChannelSetting getChannel1() {
        return null;
    }

    public void setChannel1(RcChannelSetting rcChannelSetting) {
    }

    public RcChannelSetting getChannel2() {
        return null;
    }

    public void setChannel2(RcChannelSetting rcChannelSetting) {
    }

    public RcChannelSetting getChannel3() {
        return null;
    }

    public void setChannel3(RcChannelSetting rcChannelSetting) {
    }

    public RcChannelSetting getChannel4() {
        return null;
    }

    public void setChannel4(RcChannelSetting rcChannelSetting) {
    }

    public String toString() {
        return null;
    }
}

