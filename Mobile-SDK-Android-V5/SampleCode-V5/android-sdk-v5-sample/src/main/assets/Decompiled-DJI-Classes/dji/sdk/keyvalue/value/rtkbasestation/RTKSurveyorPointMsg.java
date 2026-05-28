/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.rtkbasestation;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.rtkbasestation.RTKSurveyorPointMode;
import dji.sdk.keyvalue.value.rtkbasestation.RTKSurveyorPointTiltMode;
import org.json.JSONObject;

public class RTKSurveyorPointMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    RTKSurveyorPointMode pointMode;
    RTKSurveyorPointTiltMode tiltMode;
    Double antennaHeight;

    public RTKSurveyorPointMsg() {
    }

    public RTKSurveyorPointMsg(RTKSurveyorPointMode rTKSurveyorPointMode, RTKSurveyorPointTiltMode rTKSurveyorPointTiltMode, Double d2) {
    }

    public static RTKSurveyorPointMsg fromJson(String string) {
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

    public RTKSurveyorPointMode getPointMode() {
        return null;
    }

    public void setPointMode(RTKSurveyorPointMode rTKSurveyorPointMode) {
    }

    public RTKSurveyorPointTiltMode getTiltMode() {
        return null;
    }

    public void setTiltMode(RTKSurveyorPointTiltMode rTKSurveyorPointTiltMode) {
    }

    public Double getAntennaHeight() {
        return null;
    }

    public void setAntennaHeight(Double d2) {
    }

    public String toString() {
        return null;
    }
}

