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
import org.json.JSONObject;

public class DroneNestMoveMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Double timestamp;
    Boolean tiltValidFlag;
    Double titlAngle;
    Boolean moveStatus;

    public DroneNestMoveMsg() {
    }

    public DroneNestMoveMsg(Double d2, Boolean bl, Double d3, Boolean bl2) {
    }

    public static DroneNestMoveMsg fromJson(String string) {
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

    public Double getTimestamp() {
        return null;
    }

    public void setTimestamp(Double d2) {
    }

    public Boolean getTiltValidFlag() {
        return null;
    }

    public void setTiltValidFlag(Boolean bl) {
    }

    public Double getTitlAngle() {
        return null;
    }

    public void setTitlAngle(Double d2) {
    }

    public Boolean getMoveStatus() {
        return null;
    }

    public void setMoveStatus(Boolean bl) {
    }

    public String toString() {
        return null;
    }
}

