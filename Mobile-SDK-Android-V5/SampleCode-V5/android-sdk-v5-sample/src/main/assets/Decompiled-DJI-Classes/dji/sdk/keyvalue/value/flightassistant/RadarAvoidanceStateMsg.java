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

public class RadarAvoidanceStateMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Boolean down_radar;
    Boolean back_radar;

    public RadarAvoidanceStateMsg() {
    }

    public RadarAvoidanceStateMsg(Boolean bl, Boolean bl2) {
    }

    public static RadarAvoidanceStateMsg fromJson(String string) {
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

    public Boolean getDown_radar() {
        return null;
    }

    public void setDown_radar(Boolean bl) {
    }

    public Boolean getBack_radar() {
        return null;
    }

    public void setBack_radar(Boolean bl) {
    }

    public String toString() {
        return null;
    }
}

