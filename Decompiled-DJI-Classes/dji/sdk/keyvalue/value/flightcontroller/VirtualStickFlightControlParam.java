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
import dji.sdk.keyvalue.value.flightcontroller.FlightCoordinateSystem;
import dji.sdk.keyvalue.value.flightcontroller.RollPitchControlMode;
import dji.sdk.keyvalue.value.flightcontroller.VerticalControlMode;
import dji.sdk.keyvalue.value.flightcontroller.YawControlMode;
import org.json.JSONObject;

public class VirtualStickFlightControlParam
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Double pitch;
    Double roll;
    Double yaw;
    Double verticalThrottle;
    VerticalControlMode verticalControlMode;
    RollPitchControlMode rollPitchControlMode;
    YawControlMode yawControlMode;
    FlightCoordinateSystem rollPitchCoordinateSystem;

    public VirtualStickFlightControlParam() {
    }

    public VirtualStickFlightControlParam(Double d2, Double d3, Double d4, Double d5, VerticalControlMode verticalControlMode, RollPitchControlMode rollPitchControlMode, YawControlMode yawControlMode, FlightCoordinateSystem flightCoordinateSystem) {
    }

    public static VirtualStickFlightControlParam fromJson(String string) {
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

    public Double getVerticalThrottle() {
        return null;
    }

    public void setVerticalThrottle(Double d2) {
    }

    public VerticalControlMode getVerticalControlMode() {
        return null;
    }

    public void setVerticalControlMode(VerticalControlMode verticalControlMode) {
    }

    public RollPitchControlMode getRollPitchControlMode() {
        return null;
    }

    public void setRollPitchControlMode(RollPitchControlMode rollPitchControlMode) {
    }

    public YawControlMode getYawControlMode() {
        return null;
    }

    public void setYawControlMode(YawControlMode yawControlMode) {
    }

    public FlightCoordinateSystem getRollPitchCoordinateSystem() {
        return null;
    }

    public void setRollPitchCoordinateSystem(FlightCoordinateSystem flightCoordinateSystem) {
    }

    public String toString() {
        return null;
    }
}

