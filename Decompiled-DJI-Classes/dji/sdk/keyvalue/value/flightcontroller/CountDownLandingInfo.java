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
import dji.sdk.keyvalue.value.flightcontroller.CountDownAppCmd;
import dji.sdk.keyvalue.value.flightcontroller.CountDownLandingType;
import org.json.JSONObject;

public class CountDownLandingInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    CountDownLandingType actionType;
    Integer countDownTime;
    CountDownAppCmd appCmd;
    Boolean canCancel;
    Boolean hideCntDown;
    Integer sessionId;

    public CountDownLandingInfo() {
    }

    public CountDownLandingInfo(CountDownLandingType countDownLandingType, Integer n, CountDownAppCmd countDownAppCmd, Boolean bl, Boolean bl2, Integer n2) {
    }

    public static CountDownLandingInfo fromJson(String string) {
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

    public CountDownLandingType getActionType() {
        return null;
    }

    public void setActionType(CountDownLandingType countDownLandingType) {
    }

    public Integer getCountDownTime() {
        return null;
    }

    public void setCountDownTime(Integer n) {
    }

    public CountDownAppCmd getAppCmd() {
        return null;
    }

    public void setAppCmd(CountDownAppCmd countDownAppCmd) {
    }

    public Boolean getCanCancel() {
        return null;
    }

    public void setCanCancel(Boolean bl) {
    }

    public Boolean getHideCntDown() {
        return null;
    }

    public void setHideCntDown(Boolean bl) {
    }

    public Integer getSessionId() {
        return null;
    }

    public void setSessionId(Integer n) {
    }

    public String toString() {
        return null;
    }
}

