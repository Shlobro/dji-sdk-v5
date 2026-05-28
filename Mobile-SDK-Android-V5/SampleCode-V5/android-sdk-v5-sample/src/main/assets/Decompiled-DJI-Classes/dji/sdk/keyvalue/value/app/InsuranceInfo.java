/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.app;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.app.InsuranceList;
import dji.sdk.keyvalue.value.app.PurchaseInfo;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class InsuranceInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    String activeDate;
    Boolean isInDeviceCenter;
    InsuranceList items;
    PurchaseInfo firstPurchase;
    PurchaseInfo renewalPurchase;

    public InsuranceInfo() {
    }

    public InsuranceInfo(String string, Boolean bl, InsuranceList insuranceList, PurchaseInfo purchaseInfo, PurchaseInfo purchaseInfo2) {
    }

    public static InsuranceInfo fromJson(String string) {
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

    public String getActiveDate() {
        return null;
    }

    public void setActiveDate(String string) {
    }

    public Boolean getIsInDeviceCenter() {
        return null;
    }

    public void setIsInDeviceCenter(Boolean bl) {
    }

    public InsuranceList getItems() {
        return null;
    }

    public void setItems(InsuranceList insuranceList) {
    }

    public PurchaseInfo getFirstPurchase() {
        return null;
    }

    public void setFirstPurchase(PurchaseInfo purchaseInfo) {
    }

    public PurchaseInfo getRenewalPurchase() {
        return null;
    }

    public void setRenewalPurchase(PurchaseInfo purchaseInfo) {
    }

    public String toString() {
        return null;
    }
}

