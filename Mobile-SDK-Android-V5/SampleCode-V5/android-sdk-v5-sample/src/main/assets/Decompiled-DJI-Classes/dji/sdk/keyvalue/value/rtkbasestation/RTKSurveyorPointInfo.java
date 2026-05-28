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
import dji.sdk.keyvalue.value.common.LocationCoordinate3D;
import dji.sdk.keyvalue.value.rtkbasestation.RTKIMUAlignmentMode;
import dji.sdk.keyvalue.value.rtkbasestation.RTKSurveyorPointPostionType;
import dji.sdk.keyvalue.value.rtkbasestation.RTKSurveyorPointTiltMode;
import org.json.JSONObject;

public class RTKSurveyorPointInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    RTKSurveyorPointPostionType positionType;
    LocationCoordinate3D surveyorPoint;
    RTKIMUAlignmentMode alignmentMode;
    RTKSurveyorPointTiltMode tiltMode;

    public RTKSurveyorPointInfo() {
    }

    public RTKSurveyorPointInfo(RTKSurveyorPointPostionType rTKSurveyorPointPostionType, LocationCoordinate3D locationCoordinate3D, RTKIMUAlignmentMode rTKIMUAlignmentMode, RTKSurveyorPointTiltMode rTKSurveyorPointTiltMode) {
    }

    public static RTKSurveyorPointInfo fromJson(String string) {
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

    public RTKSurveyorPointPostionType getPositionType() {
        return null;
    }

    public void setPositionType(RTKSurveyorPointPostionType rTKSurveyorPointPostionType) {
    }

    public LocationCoordinate3D getSurveyorPoint() {
        return null;
    }

    public void setSurveyorPoint(LocationCoordinate3D locationCoordinate3D) {
    }

    public RTKIMUAlignmentMode getAlignmentMode() {
        return null;
    }

    public void setAlignmentMode(RTKIMUAlignmentMode rTKIMUAlignmentMode) {
    }

    public RTKSurveyorPointTiltMode getTiltMode() {
        return null;
    }

    public void setTiltMode(RTKSurveyorPointTiltMode rTKSurveyorPointTiltMode) {
    }

    public String toString() {
        return null;
    }
}

