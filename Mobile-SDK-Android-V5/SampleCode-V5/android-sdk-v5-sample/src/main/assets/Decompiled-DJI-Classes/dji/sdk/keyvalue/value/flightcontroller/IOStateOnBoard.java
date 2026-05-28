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
import dji.sdk.keyvalue.value.flightcontroller.GPIOWorkModeOnBoard;
import dji.sdk.keyvalue.value.flightcontroller.IOMode;
import dji.sdk.keyvalue.value.flightcontroller.IOStateIndex;
import org.json.JSONObject;

public class IOStateOnBoard
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    IOStateIndex index;
    Boolean isInitiated;
    IOMode ioMode;
    GPIOWorkModeOnBoard gpioWorkModeOnBoard;
    Integer dutyRatioOfPWM;
    Integer frequencyOfPWM;
    Boolean isInHighElectricLevel;
    Boolean isOutputMode;

    public IOStateOnBoard() {
    }

    public IOStateOnBoard(IOStateIndex iOStateIndex, Boolean bl, IOMode iOMode, GPIOWorkModeOnBoard gPIOWorkModeOnBoard, Integer n, Integer n2, Boolean bl2, Boolean bl3) {
    }

    public static IOStateOnBoard fromJson(String string) {
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

    public IOStateIndex getIndex() {
        return null;
    }

    public void setIndex(IOStateIndex iOStateIndex) {
    }

    public Boolean getIsInitiated() {
        return null;
    }

    public void setIsInitiated(Boolean bl) {
    }

    public IOMode getIoMode() {
        return null;
    }

    public void setIoMode(IOMode iOMode) {
    }

    public GPIOWorkModeOnBoard getGpioWorkModeOnBoard() {
        return null;
    }

    public void setGpioWorkModeOnBoard(GPIOWorkModeOnBoard gPIOWorkModeOnBoard) {
    }

    public Integer getDutyRatioOfPWM() {
        return null;
    }

    public void setDutyRatioOfPWM(Integer n) {
    }

    public Integer getFrequencyOfPWM() {
        return null;
    }

    public void setFrequencyOfPWM(Integer n) {
    }

    public Boolean getIsInHighElectricLevel() {
        return null;
    }

    public void setIsInHighElectricLevel(Boolean bl) {
    }

    public Boolean getIsOutputMode() {
        return null;
    }

    public void setIsOutputMode(Boolean bl) {
    }

    public String toString() {
        return null;
    }
}

