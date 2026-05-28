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
import dji.sdk.keyvalue.value.remotecontroller.AirConditionerState;
import org.json.JSONObject;

public class DroneNestTECRemainTimeInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    AirConditionerState value;
    Long remainSwitchTime;

    public DroneNestTECRemainTimeInfo() {
    }

    public DroneNestTECRemainTimeInfo(AirConditionerState airConditionerState, Long l2) {
    }

    public static DroneNestTECRemainTimeInfo fromJson(String string) {
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

    public AirConditionerState getValue() {
        return null;
    }

    public void setValue(AirConditionerState airConditionerState) {
    }

    public Long getRemainSwitchTime() {
        return null;
    }

    public void setRemainSwitchTime(Long l2) {
    }

    public String toString() {
        return null;
    }
}

