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
import org.json.JSONObject;

public class ExtLedCtrlParamMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Boolean bFlightLedRedAlwaysOn;
    Boolean bFlightLedRedSlowFlash;
    Boolean bFlightLedGreenAlwaysOn;
    Boolean bFlightLedGreenSlowFlash;
    Boolean bFlightLedYellowAlwaysOn;
    Boolean bFlightLedYellowSlowFlash;
    Boolean bForearmLedRedAlwaysOn;
    Boolean bForearmLedRedSlowFlash;
    Boolean bForearmLedGreenAlwaysOn;
    Boolean bForearmLedGreenSlowFlash;
    Boolean bForearmLedYellowAlwaysOn;
    Boolean bForearmLedYellowSlowFlash;

    public ExtLedCtrlParamMsg() {
    }

    public ExtLedCtrlParamMsg(Boolean bl, Boolean bl2, Boolean bl3, Boolean bl4, Boolean bl5, Boolean bl6, Boolean bl7, Boolean bl8, Boolean bl9, Boolean bl10, Boolean bl11, Boolean bl12) {
    }

    public static ExtLedCtrlParamMsg fromJson(String string) {
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

    public Boolean getBFlightLedRedAlwaysOn() {
        return null;
    }

    public void setBFlightLedRedAlwaysOn(Boolean bl) {
    }

    public Boolean getBFlightLedRedSlowFlash() {
        return null;
    }

    public void setBFlightLedRedSlowFlash(Boolean bl) {
    }

    public Boolean getBFlightLedGreenAlwaysOn() {
        return null;
    }

    public void setBFlightLedGreenAlwaysOn(Boolean bl) {
    }

    public Boolean getBFlightLedGreenSlowFlash() {
        return null;
    }

    public void setBFlightLedGreenSlowFlash(Boolean bl) {
    }

    public Boolean getBFlightLedYellowAlwaysOn() {
        return null;
    }

    public void setBFlightLedYellowAlwaysOn(Boolean bl) {
    }

    public Boolean getBFlightLedYellowSlowFlash() {
        return null;
    }

    public void setBFlightLedYellowSlowFlash(Boolean bl) {
    }

    public Boolean getBForearmLedRedAlwaysOn() {
        return null;
    }

    public void setBForearmLedRedAlwaysOn(Boolean bl) {
    }

    public Boolean getBForearmLedRedSlowFlash() {
        return null;
    }

    public void setBForearmLedRedSlowFlash(Boolean bl) {
    }

    public Boolean getBForearmLedGreenAlwaysOn() {
        return null;
    }

    public void setBForearmLedGreenAlwaysOn(Boolean bl) {
    }

    public Boolean getBForearmLedGreenSlowFlash() {
        return null;
    }

    public void setBForearmLedGreenSlowFlash(Boolean bl) {
    }

    public Boolean getBForearmLedYellowAlwaysOn() {
        return null;
    }

    public void setBForearmLedYellowAlwaysOn(Boolean bl) {
    }

    public Boolean getBForearmLedYellowSlowFlash() {
        return null;
    }

    public void setBForearmLedYellowSlowFlash(Boolean bl) {
    }

    public String toString() {
        return null;
    }
}

