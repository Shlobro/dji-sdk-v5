/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.battery;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.battery.BatterySOHState;
import dji.sdk.keyvalue.value.battery.BatterySelfCheckState;
import org.json.JSONObject;

public class BatteryException
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Boolean communicationException;
    Boolean firstLevelOverCurrent;
    Boolean secondLevelOverCurrent;
    Boolean firstLevelLowTemperature;
    Boolean secondLevelLowTemperature;
    Boolean firstLevelOverHeating;
    Boolean secondLevelOverHeating;
    Boolean watchDogAbnormalReset;
    Boolean shortCircuited;
    Boolean hasBrokenCell;
    Integer brokenCellIndex;
    Boolean hasLowVoltageCell;
    Integer lowVoltageCellIndex;
    BatterySOHState sohState;
    BatterySelfCheckState selfCheckState;
    Integer cycleLimit;

    public BatteryException() {
    }

    public BatteryException(Boolean bl, Boolean bl2, Boolean bl3, Boolean bl4, Boolean bl5, Boolean bl6, Boolean bl7, Boolean bl8, Boolean bl9, Boolean bl10, Integer n, Boolean bl11, Integer n2, BatterySOHState batterySOHState, BatterySelfCheckState batterySelfCheckState, Integer n3) {
    }

    public static BatteryException fromJson(String string) {
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

    public Boolean getCommunicationException() {
        return null;
    }

    public void setCommunicationException(Boolean bl) {
    }

    public Boolean getFirstLevelOverCurrent() {
        return null;
    }

    public void setFirstLevelOverCurrent(Boolean bl) {
    }

    public Boolean getSecondLevelOverCurrent() {
        return null;
    }

    public void setSecondLevelOverCurrent(Boolean bl) {
    }

    public Boolean getFirstLevelLowTemperature() {
        return null;
    }

    public void setFirstLevelLowTemperature(Boolean bl) {
    }

    public Boolean getSecondLevelLowTemperature() {
        return null;
    }

    public void setSecondLevelLowTemperature(Boolean bl) {
    }

    public Boolean getFirstLevelOverHeating() {
        return null;
    }

    public void setFirstLevelOverHeating(Boolean bl) {
    }

    public Boolean getSecondLevelOverHeating() {
        return null;
    }

    public void setSecondLevelOverHeating(Boolean bl) {
    }

    public Boolean getWatchDogAbnormalReset() {
        return null;
    }

    public void setWatchDogAbnormalReset(Boolean bl) {
    }

    public Boolean getShortCircuited() {
        return null;
    }

    public void setShortCircuited(Boolean bl) {
    }

    public Boolean getHasBrokenCell() {
        return null;
    }

    public void setHasBrokenCell(Boolean bl) {
    }

    public Integer getBrokenCellIndex() {
        return null;
    }

    public void setBrokenCellIndex(Integer n) {
    }

    public Boolean getHasLowVoltageCell() {
        return null;
    }

    public void setHasLowVoltageCell(Boolean bl) {
    }

    public Integer getLowVoltageCellIndex() {
        return null;
    }

    public void setLowVoltageCellIndex(Integer n) {
    }

    public BatterySOHState getSohState() {
        return null;
    }

    public void setSohState(BatterySOHState batterySOHState) {
    }

    public BatterySelfCheckState getSelfCheckState() {
        return null;
    }

    public void setSelfCheckState(BatterySelfCheckState batterySelfCheckState) {
    }

    public Integer getCycleLimit() {
        return null;
    }

    public void setCycleLimit(Integer n) {
    }

    public String toString() {
        return null;
    }
}

