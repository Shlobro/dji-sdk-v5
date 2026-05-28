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
import dji.sdk.keyvalue.value.flightcontroller.CountDownLandingReason;
import org.json.JSONObject;

public class CountDownLandingStatus
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    CountDownLandingReason reason;
    Integer countDown;
    Boolean canCancel;

    public CountDownLandingStatus() {
    }

    public CountDownLandingStatus(CountDownLandingReason countDownLandingReason, Integer n, Boolean bl) {
    }

    public static CountDownLandingStatus fromJson(String string) {
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

    public CountDownLandingReason getReason() {
        return null;
    }

    public void setReason(CountDownLandingReason countDownLandingReason) {
    }

    public Integer getCountDown() {
        return null;
    }

    public void setCountDown(Integer n) {
    }

    public Boolean getCanCancel() {
        return null;
    }

    public void setCanCancel(Boolean bl) {
    }

    public String toString() {
        return null;
    }
}

