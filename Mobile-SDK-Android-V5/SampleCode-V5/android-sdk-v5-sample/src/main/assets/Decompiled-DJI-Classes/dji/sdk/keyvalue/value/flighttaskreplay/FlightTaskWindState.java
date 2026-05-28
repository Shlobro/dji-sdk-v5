/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.flighttaskreplay;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.flightcontroller.WindDirection;
import dji.sdk.keyvalue.value.flightcontroller.WindWarning;
import org.json.JSONObject;

public class FlightTaskWindState
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    WindWarning wind_warning;
    WindDirection wind_direction;
    Integer wind_speed;

    public FlightTaskWindState() {
    }

    public FlightTaskWindState(WindWarning windWarning, WindDirection windDirection, Integer n) {
    }

    public static FlightTaskWindState fromJson(String string) {
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

    public WindWarning getWind_warning() {
        return null;
    }

    public void setWind_warning(WindWarning windWarning) {
    }

    public WindDirection getWind_direction() {
        return null;
    }

    public void setWind_direction(WindDirection windDirection) {
    }

    public Integer getWind_speed() {
        return null;
    }

    public void setWind_speed(Integer n) {
    }

    public String toString() {
        return null;
    }
}

