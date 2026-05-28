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
import dji.sdk.keyvalue.value.flightcontroller.AirSenseDirection;
import dji.sdk.keyvalue.value.flightcontroller.AirSenseWarningLevel;
import dji.sdk.keyvalue.value.flightcontroller.AltitudeSource;
import dji.sdk.keyvalue.value.flightcontroller.TrendsInRelativeHeight;
import org.json.JSONObject;

public class AirSenseAirplaneState
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    String code;
    AirSenseWarningLevel warningLevel;
    AirSenseDirection relativeDirection;
    Double heading;
    Integer distance;
    Double latitude;
    Double longitude;
    Double altitude;
    Double speed;
    Integer remainTime;
    Double absoluteAltitude;
    AltitudeSource absoluteAltitudeSource;
    TrendsInRelativeHeight trendsInRelativeHeight;

    public AirSenseAirplaneState() {
    }

    public AirSenseAirplaneState(String string, AirSenseWarningLevel airSenseWarningLevel, AirSenseDirection airSenseDirection, Double d2, Integer n, Double d3, Double d4, Double d5, Double d6, Integer n2, Double d7, AltitudeSource altitudeSource, TrendsInRelativeHeight trendsInRelativeHeight) {
    }

    public static AirSenseAirplaneState fromJson(String string) {
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

    public String getCode() {
        return null;
    }

    public void setCode(String string) {
    }

    public AirSenseWarningLevel getWarningLevel() {
        return null;
    }

    public void setWarningLevel(AirSenseWarningLevel airSenseWarningLevel) {
    }

    public AirSenseDirection getRelativeDirection() {
        return null;
    }

    public void setRelativeDirection(AirSenseDirection airSenseDirection) {
    }

    public Double getHeading() {
        return null;
    }

    public void setHeading(Double d2) {
    }

    public Integer getDistance() {
        return null;
    }

    public void setDistance(Integer n) {
    }

    public Double getLatitude() {
        return null;
    }

    public void setLatitude(Double d2) {
    }

    public Double getLongitude() {
        return null;
    }

    public void setLongitude(Double d2) {
    }

    public Double getAltitude() {
        return null;
    }

    public void setAltitude(Double d2) {
    }

    public Double getSpeed() {
        return null;
    }

    public void setSpeed(Double d2) {
    }

    public Integer getRemainTime() {
        return null;
    }

    public void setRemainTime(Integer n) {
    }

    public Double getAbsoluteAltitude() {
        return null;
    }

    public void setAbsoluteAltitude(Double d2) {
    }

    public AltitudeSource getAbsoluteAltitudeSource() {
        return null;
    }

    public void setAbsoluteAltitudeSource(AltitudeSource altitudeSource) {
    }

    public TrendsInRelativeHeight getTrendsInRelativeHeight() {
        return null;
    }

    public void setTrendsInRelativeHeight(TrendsInRelativeHeight trendsInRelativeHeight) {
    }

    public String toString() {
        return null;
    }
}

