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
import dji.sdk.keyvalue.value.flightcontroller.MGPumpCalibrationState;
import java.util.List;
import org.json.JSONObject;

public class PumpCalibrationInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer process;
    List<MGPumpCalibrationState> states;

    public PumpCalibrationInfo() {
    }

    public PumpCalibrationInfo(Integer n, List<MGPumpCalibrationState> list) {
    }

    public static PumpCalibrationInfo fromJson(String string) {
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

    public Integer getProcess() {
        return null;
    }

    public void setProcess(Integer n) {
    }

    public List<MGPumpCalibrationState> getStates() {
        return null;
    }

    public void setStates(List<MGPumpCalibrationState> list) {
    }

    public String toString() {
        return null;
    }
}

