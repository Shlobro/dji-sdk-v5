/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.airlink;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.airlink.DongleISP;
import dji.sdk.keyvalue.value.airlink.DongleMode;
import dji.sdk.keyvalue.value.airlink.WlmDeviceMsg;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class LteTriSIMModeMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    WlmDeviceMsg device;
    DongleMode switchMode;
    DongleISP ISP;

    public LteTriSIMModeMsg() {
    }

    public LteTriSIMModeMsg(WlmDeviceMsg wlmDeviceMsg, DongleMode dongleMode, DongleISP dongleISP) {
    }

    public static LteTriSIMModeMsg fromJson(String string) {
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

    public WlmDeviceMsg getDevice() {
        return null;
    }

    public void setDevice(WlmDeviceMsg wlmDeviceMsg) {
    }

    public DongleMode getSwitchMode() {
        return null;
    }

    public void setSwitchMode(DongleMode dongleMode) {
    }

    public DongleISP getISP() {
        return null;
    }

    public void setISP(DongleISP dongleISP) {
    }

    public String toString() {
        return null;
    }
}

