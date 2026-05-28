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
import dji.sdk.keyvalue.value.flightcontroller.CountDownActionCMDType;
import dji.sdk.keyvalue.value.flightcontroller.CountDownActionType;
import dji.sdk.keyvalue.value.flightcontroller.CountDownAppCmd;
import org.json.JSONObject;

public class CountDownActionInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    CountDownActionCMDType cmdType;
    CountDownActionType actionType;
    Integer countDown;
    CountDownAppCmd appCmd;

    public CountDownActionInfo() {
    }

    public CountDownActionInfo(CountDownActionCMDType countDownActionCMDType, CountDownActionType countDownActionType, Integer n, CountDownAppCmd countDownAppCmd) {
    }

    public static CountDownActionInfo fromJson(String string) {
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

    public CountDownActionCMDType getCmdType() {
        return null;
    }

    public void setCmdType(CountDownActionCMDType countDownActionCMDType) {
    }

    public CountDownActionType getActionType() {
        return null;
    }

    public void setActionType(CountDownActionType countDownActionType) {
    }

    public Integer getCountDown() {
        return null;
    }

    public void setCountDown(Integer n) {
    }

    public CountDownAppCmd getAppCmd() {
        return null;
    }

    public void setAppCmd(CountDownAppCmd countDownAppCmd) {
    }

    public String toString() {
        return null;
    }
}

