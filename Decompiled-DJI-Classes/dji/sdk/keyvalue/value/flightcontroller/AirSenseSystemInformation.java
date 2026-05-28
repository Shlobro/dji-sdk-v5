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
import dji.sdk.keyvalue.value.flightcontroller.AirSenseAirplaneState;
import dji.sdk.keyvalue.value.flightcontroller.AirSenseWarningLevel;
import dji.sdk.keyvalue.value.flightcontroller.EscapeDirection;
import java.util.List;
import org.json.JSONObject;

public class AirSenseSystemInformation
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer version;
    AirSenseWarningLevel warningLevel;
    EscapeDirection escapeDirection;
    List<AirSenseAirplaneState> airplaneStates;

    public AirSenseSystemInformation() {
    }

    public AirSenseSystemInformation(Integer n, AirSenseWarningLevel airSenseWarningLevel, EscapeDirection escapeDirection, List<AirSenseAirplaneState> list) {
    }

    public static AirSenseSystemInformation fromJson(String string) {
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

    public Integer getVersion() {
        return null;
    }

    public void setVersion(Integer n) {
    }

    public AirSenseWarningLevel getWarningLevel() {
        return null;
    }

    public void setWarningLevel(AirSenseWarningLevel airSenseWarningLevel) {
    }

    public EscapeDirection getEscapeDirection() {
        return null;
    }

    public void setEscapeDirection(EscapeDirection escapeDirection) {
    }

    public List<AirSenseAirplaneState> getAirplaneStates() {
        return null;
    }

    public void setAirplaneStates(List<AirSenseAirplaneState> list) {
    }

    public String toString() {
        return null;
    }
}

