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

public class MGLiftProtectorParams
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer version;
    Integer minLift;
    Integer recommendLift;
    Integer lineResistance;
    Integer baseHeight;
    Integer batteryCurrentEstimate;
    Integer resistanceCoefficientA;
    Integer resistanceCoefficientB;
    Integer resistanceCoefficientC;
    Integer escVol2KgK1;
    Integer escVol2KgK2;
    Integer liftProtectLevel1;
    Integer liftProtectLevel2;
    Integer escIntegralThreshold;

    public MGLiftProtectorParams() {
    }

    public MGLiftProtectorParams(Integer n, Integer n2, Integer n3, Integer n4, Integer n5, Integer n6, Integer n7, Integer n8, Integer n9, Integer n10, Integer n11, Integer n12, Integer n13, Integer n14) {
    }

    public static MGLiftProtectorParams fromJson(String string) {
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

    public Integer getVersion() {
        return null;
    }

    public void setVersion(Integer n) {
    }

    public Integer getMinLift() {
        return null;
    }

    public void setMinLift(Integer n) {
    }

    public Integer getRecommendLift() {
        return null;
    }

    public void setRecommendLift(Integer n) {
    }

    public Integer getLineResistance() {
        return null;
    }

    public void setLineResistance(Integer n) {
    }

    public Integer getBaseHeight() {
        return null;
    }

    public void setBaseHeight(Integer n) {
    }

    public Integer getBatteryCurrentEstimate() {
        return null;
    }

    public void setBatteryCurrentEstimate(Integer n) {
    }

    public Integer getResistanceCoefficientA() {
        return null;
    }

    public void setResistanceCoefficientA(Integer n) {
    }

    public Integer getResistanceCoefficientB() {
        return null;
    }

    public void setResistanceCoefficientB(Integer n) {
    }

    public Integer getResistanceCoefficientC() {
        return null;
    }

    public void setResistanceCoefficientC(Integer n) {
    }

    public Integer getEscVol2KgK1() {
        return null;
    }

    public void setEscVol2KgK1(Integer n) {
    }

    public Integer getEscVol2KgK2() {
        return null;
    }

    public void setEscVol2KgK2(Integer n) {
    }

    public Integer getLiftProtectLevel1() {
        return null;
    }

    public void setLiftProtectLevel1(Integer n) {
    }

    public Integer getLiftProtectLevel2() {
        return null;
    }

    public void setLiftProtectLevel2(Integer n) {
    }

    public Integer getEscIntegralThreshold() {
        return null;
    }

    public void setEscIntegralThreshold(Integer n) {
    }

    public String toString() {
        return null;
    }
}

