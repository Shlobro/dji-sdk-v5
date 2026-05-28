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
import org.json.JSONObject;

public class BatteryOverviewValue
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer index;
    Boolean isConnected;
    Integer chargeRemainingInPercent;
    Integer voltageInmV;
    Integer current;

    public BatteryOverviewValue() {
    }

    public BatteryOverviewValue(Integer n, Boolean bl, Integer n2, Integer n3, Integer n4) {
    }

    public static BatteryOverviewValue fromJson(String string) {
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

    public Integer getIndex() {
        return null;
    }

    public void setIndex(Integer n) {
    }

    public Boolean getIsConnected() {
        return null;
    }

    public void setIsConnected(Boolean bl) {
    }

    public Integer getChargeRemainingInPercent() {
        return null;
    }

    public void setChargeRemainingInPercent(Integer n) {
    }

    public Integer getVoltageInmV() {
        return null;
    }

    public void setVoltageInmV(Integer n) {
    }

    public Integer getCurrent() {
        return null;
    }

    public void setCurrent(Integer n) {
    }

    public String toString() {
        return null;
    }
}

