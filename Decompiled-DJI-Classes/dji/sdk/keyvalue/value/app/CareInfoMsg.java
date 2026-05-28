/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.app;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.product.InsuranceState;
import org.json.JSONObject;

public class CareInfoMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Boolean inCare;
    String effectiveDate;
    String expiryDate;
    Integer exchangeRemainTimes;
    Integer flyLoseRemainTimes;
    InsuranceState state;

    public CareInfoMsg() {
    }

    public CareInfoMsg(Boolean bl, String string, String string2, Integer n, Integer n2, InsuranceState insuranceState) {
    }

    public static CareInfoMsg fromJson(String string) {
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

    public Boolean getInCare() {
        return null;
    }

    public void setInCare(Boolean bl) {
    }

    public String getEffectiveDate() {
        return null;
    }

    public void setEffectiveDate(String string) {
    }

    public String getExpiryDate() {
        return null;
    }

    public void setExpiryDate(String string) {
    }

    public Integer getExchangeRemainTimes() {
        return null;
    }

    public void setExchangeRemainTimes(Integer n) {
    }

    public Integer getFlyLoseRemainTimes() {
        return null;
    }

    public void setFlyLoseRemainTimes(Integer n) {
    }

    public InsuranceState getState() {
        return null;
    }

    public void setState(InsuranceState insuranceState) {
    }

    public String toString() {
        return null;
    }
}

