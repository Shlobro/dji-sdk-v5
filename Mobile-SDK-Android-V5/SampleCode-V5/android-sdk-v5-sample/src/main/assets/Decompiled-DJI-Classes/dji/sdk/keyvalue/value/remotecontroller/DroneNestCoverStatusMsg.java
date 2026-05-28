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
import dji.sdk.keyvalue.value.remotecontroller.DroneNestCoverErrorCode;
import dji.sdk.keyvalue.value.remotecontroller.DroneNestCoverStatus;
import org.json.JSONObject;

public class DroneNestCoverStatusMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    DroneNestCoverStatus leftStatus;
    DroneNestCoverStatus rightStatus;
    Integer leftLocation;
    Integer rightLocation;
    DroneNestCoverErrorCode leftError;
    DroneNestCoverErrorCode rightError;

    public DroneNestCoverStatusMsg() {
    }

    public DroneNestCoverStatusMsg(DroneNestCoverStatus droneNestCoverStatus, DroneNestCoverStatus droneNestCoverStatus2, Integer n, Integer n2, DroneNestCoverErrorCode droneNestCoverErrorCode, DroneNestCoverErrorCode droneNestCoverErrorCode2) {
    }

    public static DroneNestCoverStatusMsg fromJson(String string) {
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

    public DroneNestCoverStatus getLeftStatus() {
        return null;
    }

    public void setLeftStatus(DroneNestCoverStatus droneNestCoverStatus) {
    }

    public DroneNestCoverStatus getRightStatus() {
        return null;
    }

    public void setRightStatus(DroneNestCoverStatus droneNestCoverStatus) {
    }

    public Integer getLeftLocation() {
        return null;
    }

    public void setLeftLocation(Integer n) {
    }

    public Integer getRightLocation() {
        return null;
    }

    public void setRightLocation(Integer n) {
    }

    public DroneNestCoverErrorCode getLeftError() {
        return null;
    }

    public void setLeftError(DroneNestCoverErrorCode droneNestCoverErrorCode) {
    }

    public DroneNestCoverErrorCode getRightError() {
        return null;
    }

    public void setRightError(DroneNestCoverErrorCode droneNestCoverErrorCode) {
    }

    public String toString() {
        return null;
    }
}

