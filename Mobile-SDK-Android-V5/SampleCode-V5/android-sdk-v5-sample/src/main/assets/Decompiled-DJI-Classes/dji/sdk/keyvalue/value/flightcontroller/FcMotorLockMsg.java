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

public class FcMotorLockMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Boolean motorDisableCmd;
    Boolean disableCmdType;

    public FcMotorLockMsg() {
    }

    public FcMotorLockMsg(Boolean bl, Boolean bl2) {
    }

    public static FcMotorLockMsg fromJson(String string) {
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

    public Boolean getMotorDisableCmd() {
        return null;
    }

    public void setMotorDisableCmd(Boolean bl) {
    }

    public Boolean getDisableCmdType() {
        return null;
    }

    public void setDisableCmdType(Boolean bl) {
    }

    public String toString() {
        return null;
    }
}

