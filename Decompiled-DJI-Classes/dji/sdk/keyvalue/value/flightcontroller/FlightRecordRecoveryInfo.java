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
import dji.sdk.keyvalue.value.flightcontroller.FlightRecordRecoveryState;
import java.util.List;
import org.json.JSONObject;

public class FlightRecordRecoveryInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    FlightRecordRecoveryState state;
    List<String> originFilePaths;
    String targetFilePath;

    public FlightRecordRecoveryInfo() {
    }

    public FlightRecordRecoveryInfo(FlightRecordRecoveryState flightRecordRecoveryState, List<String> list, String string) {
    }

    public static FlightRecordRecoveryInfo fromJson(String string) {
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

    public FlightRecordRecoveryState getState() {
        return null;
    }

    public void setState(FlightRecordRecoveryState flightRecordRecoveryState) {
    }

    public List<String> getOriginFilePaths() {
        return null;
    }

    public void setOriginFilePaths(List<String> list) {
    }

    public String getTargetFilePath() {
        return null;
    }

    public void setTargetFilePath(String string) {
    }

    public String toString() {
        return null;
    }
}

