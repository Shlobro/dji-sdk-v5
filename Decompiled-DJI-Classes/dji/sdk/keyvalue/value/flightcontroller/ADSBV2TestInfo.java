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
import java.util.List;
import org.json.JSONObject;

public class ADSBV2TestInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer testAction;
    Integer testFlightID;
    List<Double> flightPos;
    List<Double> flightSpeed;
    Double angle;

    public ADSBV2TestInfo() {
    }

    public ADSBV2TestInfo(Integer n, Integer n2, List<Double> list, List<Double> list2, Double d2) {
    }

    public static ADSBV2TestInfo fromJson(String string) {
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

    public Integer getTestAction() {
        return null;
    }

    public void setTestAction(Integer n) {
    }

    public Integer getTestFlightID() {
        return null;
    }

    public void setTestFlightID(Integer n) {
    }

    public List<Double> getFlightPos() {
        return null;
    }

    public void setFlightPos(List<Double> list) {
    }

    public List<Double> getFlightSpeed() {
        return null;
    }

    public void setFlightSpeed(List<Double> list) {
    }

    public Double getAngle() {
        return null;
    }

    public void setAngle(Double d2) {
    }

    public String toString() {
        return null;
    }
}

