/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.mission;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class WaylineActionSmartObliquePointInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Double running_time;
    Double stay_time;
    Double euler_roll;
    Double euler_pitch;
    Double euler_yaw;

    public WaylineActionSmartObliquePointInfo() {
    }

    public WaylineActionSmartObliquePointInfo(Double d2, Double d3, Double d4, Double d5, Double d6) {
    }

    public static WaylineActionSmartObliquePointInfo fromJson(String string) {
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

    public Double getRunning_time() {
        return null;
    }

    public void setRunning_time(Double d2) {
    }

    public Double getStay_time() {
        return null;
    }

    public void setStay_time(Double d2) {
    }

    public Double getEuler_roll() {
        return null;
    }

    public void setEuler_roll(Double d2) {
    }

    public Double getEuler_pitch() {
        return null;
    }

    public void setEuler_pitch(Double d2) {
    }

    public Double getEuler_yaw() {
        return null;
    }

    public void setEuler_yaw(Double d2) {
    }

    public String toString() {
        return null;
    }
}

