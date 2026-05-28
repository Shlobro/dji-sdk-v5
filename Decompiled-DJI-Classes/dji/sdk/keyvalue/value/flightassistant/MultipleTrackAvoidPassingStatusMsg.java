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

public class MultipleTrackAvoidPassingStatusMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Boolean upByPassing;
    Boolean downByPassing;
    Boolean leftByPassing;
    Boolean rightByPassing;

    public MultipleTrackAvoidPassingStatusMsg() {
    }

    public MultipleTrackAvoidPassingStatusMsg(Boolean bl, Boolean bl2, Boolean bl3, Boolean bl4) {
    }

    public static MultipleTrackAvoidPassingStatusMsg fromJson(String string) {
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

    public Boolean getUpByPassing() {
        return null;
    }

    public void setUpByPassing(Boolean bl) {
    }

    public Boolean getDownByPassing() {
        return null;
    }

    public void setDownByPassing(Boolean bl) {
    }

    public Boolean getLeftByPassing() {
        return null;
    }

    public void setLeftByPassing(Boolean bl) {
    }

    public Boolean getRightByPassing() {
        return null;
    }

    public void setRightByPassing(Boolean bl) {
    }

    public String toString() {
        return null;
    }
}

