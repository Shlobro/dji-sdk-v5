/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.flightassistant;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class TimelapseWaypoint
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Long trajId;
    Long index;
    Double px;
    Double py;
    Double pz;
    Double height;
    Double pitch;
    Double roll;
    Double yaw;
    Double longitude;
    Double latitude;
    Double altitude;

    public TimelapseWaypoint() {
    }

    public TimelapseWaypoint(Long l2, Long l3, Double d2, Double d3, Double d4, Double d5, Double d6, Double d7, Double d8, Double d9, Double d10, Double d11) {
    }

    public static TimelapseWaypoint fromJson(String string) {
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

    public Long getTrajId() {
        return null;
    }

    public void setTrajId(Long l2) {
    }

    public Long getIndex() {
        return null;
    }

    public void setIndex(Long l2) {
    }

    public Double getPx() {
        return null;
    }

    public void setPx(Double d2) {
    }

    public Double getPy() {
        return null;
    }

    public void setPy(Double d2) {
    }

    public Double getPz() {
        return null;
    }

    public void setPz(Double d2) {
    }

    public Double getHeight() {
        return null;
    }

    public void setHeight(Double d2) {
    }

    public Double getPitch() {
        return null;
    }

    public void setPitch(Double d2) {
    }

    public Double getRoll() {
        return null;
    }

    public void setRoll(Double d2) {
    }

    public Double getYaw() {
        return null;
    }

    public void setYaw(Double d2) {
    }

    public Double getLongitude() {
        return null;
    }

    public void setLongitude(Double d2) {
    }

    public Double getLatitude() {
        return null;
    }

    public void setLatitude(Double d2) {
    }

    public Double getAltitude() {
        return null;
    }

    public void setAltitude(Double d2) {
    }

    public String toString() {
        return null;
    }
}

