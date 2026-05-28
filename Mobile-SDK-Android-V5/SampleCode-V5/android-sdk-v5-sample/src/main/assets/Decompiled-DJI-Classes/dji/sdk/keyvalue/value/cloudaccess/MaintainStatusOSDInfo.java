/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.cloudaccess;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class MaintainStatusOSDInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer state;
    Integer last_maintain_type;
    Double last_maintain_time;
    Integer last_maintain_flight_time;
    Integer last_maintain_flight_sorties;

    public MaintainStatusOSDInfo() {
    }

    public MaintainStatusOSDInfo(Integer n, Integer n2, Double d2, Integer n3, Integer n4) {
    }

    public static MaintainStatusOSDInfo fromJson(String string) {
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

    public Integer getState() {
        return null;
    }

    public void setState(Integer n) {
    }

    public Integer getLast_maintain_type() {
        return null;
    }

    public void setLast_maintain_type(Integer n) {
    }

    public Double getLast_maintain_time() {
        return null;
    }

    public void setLast_maintain_time(Double d2) {
    }

    public Integer getLast_maintain_flight_time() {
        return null;
    }

    public void setLast_maintain_flight_time(Integer n) {
    }

    public Integer getLast_maintain_flight_sorties() {
        return null;
    }

    public void setLast_maintain_flight_sorties(Integer n) {
    }

    public String toString() {
        return null;
    }
}

