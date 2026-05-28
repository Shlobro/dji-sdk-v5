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

public class InsuranceItem
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    String index;
    String type;
    String droneSN;
    String gimbalSN;
    String startDate;
    String endDate;
    String refreshDate;
    Integer totalCount;
    Integer leftCount;
    String currencyAbbreviation;
    InsuranceState status;

    public InsuranceItem() {
    }

    public InsuranceItem(String string, String string2, String string3, String string4, String string5, String string6, String string7, Integer n, Integer n2, String string8, InsuranceState insuranceState) {
    }

    public static InsuranceItem fromJson(String string) {
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

    public String getIndex() {
        return null;
    }

    public void setIndex(String string) {
    }

    public String getType() {
        return null;
    }

    public void setType(String string) {
    }

    public String getDroneSN() {
        return null;
    }

    public void setDroneSN(String string) {
    }

    public String getGimbalSN() {
        return null;
    }

    public void setGimbalSN(String string) {
    }

    public String getStartDate() {
        return null;
    }

    public void setStartDate(String string) {
    }

    public String getEndDate() {
        return null;
    }

    public void setEndDate(String string) {
    }

    public String getRefreshDate() {
        return null;
    }

    public void setRefreshDate(String string) {
    }

    public Integer getTotalCount() {
        return null;
    }

    public void setTotalCount(Integer n) {
    }

    public Integer getLeftCount() {
        return null;
    }

    public void setLeftCount(Integer n) {
    }

    public String getCurrencyAbbreviation() {
        return null;
    }

    public void setCurrencyAbbreviation(String string) {
    }

    public InsuranceState getStatus() {
        return null;
    }

    public void setStatus(InsuranceState insuranceState) {
    }

    public String toString() {
        return null;
    }
}

