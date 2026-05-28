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
import dji.sdk.keyvalue.value.common.LocationCoordinate2D;
import org.json.JSONObject;

public class SimulatorState
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Boolean areMotorsOn;
    Boolean isFlying;
    Double pitch;
    Double roll;
    Double yaw;
    Double positionX;
    Double positionY;
    Double positionZ;
    LocationCoordinate2D location;

    public SimulatorState() {
    }

    public SimulatorState(Boolean bl, Boolean bl2, Double d2, Double d3, Double d4, Double d5, Double d6, Double d7, LocationCoordinate2D locationCoordinate2D) {
    }

    public static SimulatorState fromJson(String string) {
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

    public Boolean getAreMotorsOn() {
        return null;
    }

    public void setAreMotorsOn(Boolean bl) {
    }

    public Boolean getIsFlying() {
        return null;
    }

    public void setIsFlying(Boolean bl) {
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

    public Double getPositionX() {
        return null;
    }

    public void setPositionX(Double d2) {
    }

    public Double getPositionY() {
        return null;
    }

    public void setPositionY(Double d2) {
    }

    public Double getPositionZ() {
        return null;
    }

    public void setPositionZ(Double d2) {
    }

    public LocationCoordinate2D getLocation() {
        return null;
    }

    public void setLocation(LocationCoordinate2D locationCoordinate2D) {
    }

    public String toString() {
        return null;
    }
}

