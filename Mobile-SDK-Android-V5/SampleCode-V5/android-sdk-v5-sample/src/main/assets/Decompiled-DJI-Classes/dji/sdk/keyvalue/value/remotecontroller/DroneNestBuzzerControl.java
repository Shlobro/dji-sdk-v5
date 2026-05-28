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
import dji.sdk.keyvalue.value.remotecontroller.BuzzerActionType;
import org.json.JSONObject;

public class DroneNestBuzzerControl
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Boolean openState;
    BuzzerActionType action;

    public DroneNestBuzzerControl() {
    }

    public DroneNestBuzzerControl(Boolean bl, BuzzerActionType buzzerActionType) {
    }

    public static DroneNestBuzzerControl fromJson(String string) {
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

    public Boolean getOpenState() {
        return null;
    }

    public void setOpenState(Boolean bl) {
    }

    public BuzzerActionType getAction() {
        return null;
    }

    public void setAction(BuzzerActionType buzzerActionType) {
    }

    public String toString() {
        return null;
    }
}

