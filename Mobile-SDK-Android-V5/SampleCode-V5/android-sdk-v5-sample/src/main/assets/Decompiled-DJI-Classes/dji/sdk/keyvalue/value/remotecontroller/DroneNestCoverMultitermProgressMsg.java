/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.remotecontroller;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.remotecontroller.DroneNestCommonErrorCode;
import dji.sdk.keyvalue.value.remotecontroller.DroneNestCoverControl;
import org.json.JSONObject;

public class DroneNestCoverMultitermProgressMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    DroneNestCoverControl cmd;
    DroneNestCommonErrorCode errCode;
    Integer precent;
    Integer step;

    public DroneNestCoverMultitermProgressMsg() {
    }

    public DroneNestCoverMultitermProgressMsg(DroneNestCoverControl droneNestCoverControl, DroneNestCommonErrorCode droneNestCommonErrorCode, Integer n, Integer n2) {
    }

    public static DroneNestCoverMultitermProgressMsg fromJson(String string) {
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

    public DroneNestCoverControl getCmd() {
        return null;
    }

    public void setCmd(DroneNestCoverControl droneNestCoverControl) {
    }

    public DroneNestCommonErrorCode getErrCode() {
        return null;
    }

    public void setErrCode(DroneNestCommonErrorCode droneNestCommonErrorCode) {
    }

    public Integer getPrecent() {
        return null;
    }

    public void setPrecent(Integer n) {
    }

    public Integer getStep() {
        return null;
    }

    public void setStep(Integer n) {
    }

    public String toString() {
        return null;
    }
}

