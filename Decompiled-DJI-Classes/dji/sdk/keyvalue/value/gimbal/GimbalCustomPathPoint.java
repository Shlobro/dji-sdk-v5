/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.gimbal;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.common.Attitude;
import org.json.JSONObject;

public class GimbalCustomPathPoint
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Attitude position;
    Integer duration;
    Integer stayTime;

    public GimbalCustomPathPoint() {
    }

    public GimbalCustomPathPoint(Attitude attitude, Integer n, Integer n2) {
    }

    public static GimbalCustomPathPoint fromJson(String string) {
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

    public Attitude getPosition() {
        return null;
    }

    public void setPosition(Attitude attitude) {
    }

    public Integer getDuration() {
        return null;
    }

    public void setDuration(Integer n) {
    }

    public Integer getStayTime() {
        return null;
    }

    public void setStayTime(Integer n) {
    }

    public String toString() {
        return null;
    }
}

