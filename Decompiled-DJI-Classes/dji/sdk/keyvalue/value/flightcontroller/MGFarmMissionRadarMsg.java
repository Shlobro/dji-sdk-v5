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
import dji.sdk.keyvalue.value.flightcontroller.ModuleConnectState;
import org.json.JSONObject;

public class MGFarmMissionRadarMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    ModuleConnectState topDisconnectFlag;
    ModuleConnectState omniDisconnectFlag;
    ModuleConnectState rearDisconnectFlag;
    ModuleConnectState btmDisconnectFlag;

    public MGFarmMissionRadarMsg() {
    }

    public MGFarmMissionRadarMsg(ModuleConnectState moduleConnectState, ModuleConnectState moduleConnectState2, ModuleConnectState moduleConnectState3, ModuleConnectState moduleConnectState4) {
    }

    public static MGFarmMissionRadarMsg fromJson(String string) {
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

    public ModuleConnectState getTopDisconnectFlag() {
        return null;
    }

    public void setTopDisconnectFlag(ModuleConnectState moduleConnectState) {
    }

    public ModuleConnectState getOmniDisconnectFlag() {
        return null;
    }

    public void setOmniDisconnectFlag(ModuleConnectState moduleConnectState) {
    }

    public ModuleConnectState getRearDisconnectFlag() {
        return null;
    }

    public void setRearDisconnectFlag(ModuleConnectState moduleConnectState) {
    }

    public ModuleConnectState getBtmDisconnectFlag() {
        return null;
    }

    public void setBtmDisconnectFlag(ModuleConnectState moduleConnectState) {
    }

    public String toString() {
        return null;
    }
}

