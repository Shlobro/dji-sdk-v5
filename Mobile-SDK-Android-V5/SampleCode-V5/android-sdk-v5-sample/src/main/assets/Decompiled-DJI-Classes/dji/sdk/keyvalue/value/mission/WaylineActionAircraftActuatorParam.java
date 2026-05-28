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
import dji.sdk.keyvalue.value.mission.WaylineAircraftActuatorActionType;
import dji.sdk.keyvalue.value.mission.WaylineWaypointYawPathMode;
import org.json.JSONObject;

public class WaylineActionAircraftActuatorParam
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    WaylineAircraftActuatorActionType aircraftActionType;
    Double heading;
    WaylineWaypointYawPathMode pathMode;
    Integer startStopMode;
    Double hoverTime;

    public WaylineActionAircraftActuatorParam() {
    }

    public WaylineActionAircraftActuatorParam(WaylineAircraftActuatorActionType waylineAircraftActuatorActionType, Double d2, WaylineWaypointYawPathMode waylineWaypointYawPathMode, Integer n, Double d3) {
    }

    public static WaylineActionAircraftActuatorParam fromJson(String string) {
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

    public WaylineAircraftActuatorActionType getAircraftActionType() {
        return null;
    }

    public void setAircraftActionType(WaylineAircraftActuatorActionType waylineAircraftActuatorActionType) {
    }

    public Double getHeading() {
        return null;
    }

    public void setHeading(Double d2) {
    }

    public WaylineWaypointYawPathMode getPathMode() {
        return null;
    }

    public void setPathMode(WaylineWaypointYawPathMode waylineWaypointYawPathMode) {
    }

    public Integer getStartStopMode() {
        return null;
    }

    public void setStartStopMode(Integer n) {
    }

    public Double getHoverTime() {
        return null;
    }

    public void setHoverTime(Double d2) {
    }

    public String toString() {
        return null;
    }
}

