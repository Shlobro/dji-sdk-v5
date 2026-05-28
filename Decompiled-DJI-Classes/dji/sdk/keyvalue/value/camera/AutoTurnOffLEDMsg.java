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
import dji.sdk.keyvalue.value.camera.LEDCtrlMode;
import org.json.JSONObject;

public class AutoTurnOffLEDMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Boolean frontLEDAutoTurnOffEnabled;
    Boolean backLEDAutoTurnOffEnabled;
    Boolean navigationLEDAutoTurnOffEnabled;
    Boolean statusLEDAutoTurnOffEnabled;
    Boolean beaconLEDAutoTurnOffEnabled;
    LEDCtrlMode mode;

    public AutoTurnOffLEDMsg() {
    }

    public AutoTurnOffLEDMsg(Boolean bl, Boolean bl2, Boolean bl3, Boolean bl4, Boolean bl5, LEDCtrlMode lEDCtrlMode) {
    }

    public static AutoTurnOffLEDMsg fromJson(String string) {
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

    public Boolean getFrontLEDAutoTurnOffEnabled() {
        return null;
    }

    public void setFrontLEDAutoTurnOffEnabled(Boolean bl) {
    }

    public Boolean getBackLEDAutoTurnOffEnabled() {
        return null;
    }

    public void setBackLEDAutoTurnOffEnabled(Boolean bl) {
    }

    public Boolean getNavigationLEDAutoTurnOffEnabled() {
        return null;
    }

    public void setNavigationLEDAutoTurnOffEnabled(Boolean bl) {
    }

    public Boolean getStatusLEDAutoTurnOffEnabled() {
        return null;
    }

    public void setStatusLEDAutoTurnOffEnabled(Boolean bl) {
    }

    public Boolean getBeaconLEDAutoTurnOffEnabled() {
        return null;
    }

    public void setBeaconLEDAutoTurnOffEnabled(Boolean bl) {
    }

    public LEDCtrlMode getMode() {
        return null;
    }

    public void setMode(LEDCtrlMode lEDCtrlMode) {
    }

    public String toString() {
        return null;
    }
}

