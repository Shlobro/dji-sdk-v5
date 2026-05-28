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
import dji.sdk.keyvalue.value.flightcontroller.MGPumpControlMode;
import java.util.List;
import org.json.JSONObject;

public class MGPumpCtrlParm
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    MGPumpControlMode ctrlMode;
    List<Integer> values;

    public MGPumpCtrlParm() {
    }

    public MGPumpCtrlParm(MGPumpControlMode mGPumpControlMode, List<Integer> list) {
    }

    public static MGPumpCtrlParm fromJson(String string) {
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

    public MGPumpControlMode getCtrlMode() {
        return null;
    }

    public void setCtrlMode(MGPumpControlMode mGPumpControlMode) {
    }

    public List<Integer> getValues() {
        return null;
    }

    public void setValues(List<Integer> list) {
    }

    public String toString() {
        return null;
    }
}

