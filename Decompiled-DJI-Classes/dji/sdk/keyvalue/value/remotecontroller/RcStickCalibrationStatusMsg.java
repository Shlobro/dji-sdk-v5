/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.remotecontroller;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class RcStickCalibrationStatusMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer segCount;
    Integer top;
    Integer bottom;
    Integer left;
    Integer right;

    public RcStickCalibrationStatusMsg() {
    }

    public RcStickCalibrationStatusMsg(Integer n, Integer n2, Integer n3, Integer n4, Integer n5) {
    }

    public static RcStickCalibrationStatusMsg fromJson(String string) {
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

    public Integer getSegCount() {
        return null;
    }

    public void setSegCount(Integer n) {
    }

    public Integer getTop() {
        return null;
    }

    public void setTop(Integer n) {
    }

    public Integer getBottom() {
        return null;
    }

    public void setBottom(Integer n) {
    }

    public Integer getLeft() {
        return null;
    }

    public void setLeft(Integer n) {
    }

    public Integer getRight() {
        return null;
    }

    public void setRight(Integer n) {
    }

    public String toString() {
        return null;
    }
}

