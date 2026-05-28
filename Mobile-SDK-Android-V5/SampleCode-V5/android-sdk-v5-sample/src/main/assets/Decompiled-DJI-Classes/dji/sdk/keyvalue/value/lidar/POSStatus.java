/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.lidar;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.lidar.SolutionState;
import org.json.JSONObject;

public class POSStatus
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Boolean alignmentCompleted;
    Boolean stationary;
    SolutionState solutionState;
    Boolean indoor;
    Boolean temperatureControlCompleted;

    public POSStatus() {
    }

    public POSStatus(Boolean bl, Boolean bl2, SolutionState solutionState, Boolean bl3, Boolean bl4) {
    }

    public static POSStatus fromJson(String string) {
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

    public Boolean getAlignmentCompleted() {
        return null;
    }

    public void setAlignmentCompleted(Boolean bl) {
    }

    public Boolean getStationary() {
        return null;
    }

    public void setStationary(Boolean bl) {
    }

    public SolutionState getSolutionState() {
        return null;
    }

    public void setSolutionState(SolutionState solutionState) {
    }

    public Boolean getIndoor() {
        return null;
    }

    public void setIndoor(Boolean bl) {
    }

    public Boolean getTemperatureControlCompleted() {
        return null;
    }

    public void setTemperatureControlCompleted(Boolean bl) {
    }

    public String toString() {
        return null;
    }
}

