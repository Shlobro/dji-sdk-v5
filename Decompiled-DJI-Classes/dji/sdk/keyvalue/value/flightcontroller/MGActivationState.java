/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.activate.ActivateState;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.camera.DateTime;
import org.json.JSONObject;

public class MGActivationState
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    ActivateState state;
    DateTime activateTime;

    public MGActivationState() {
    }

    public MGActivationState(ActivateState activateState, DateTime dateTime) {
    }

    public static MGActivationState fromJson(String string) {
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

    public ActivateState getState() {
        return null;
    }

    public void setState(ActivateState activateState) {
    }

    public DateTime getActivateTime() {
        return null;
    }

    public void setActivateTime(DateTime dateTime) {
    }

    public String toString() {
        return null;
    }
}

