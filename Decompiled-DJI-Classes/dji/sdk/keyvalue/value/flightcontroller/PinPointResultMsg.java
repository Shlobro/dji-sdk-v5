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
import dji.sdk.keyvalue.value.common.DoublePoint2D;
import dji.sdk.keyvalue.value.flightcontroller.PinPointResult;
import java.util.List;
import org.json.JSONObject;

public class PinPointResultMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    PinPointResult result;
    Double pointDirection;
    List<DoublePoint2D> liveviewPos;

    public PinPointResultMsg() {
    }

    public PinPointResultMsg(PinPointResult pinPointResult, Double d2, List<DoublePoint2D> list) {
    }

    public static PinPointResultMsg fromJson(String string) {
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

    public PinPointResult getResult() {
        return null;
    }

    public void setResult(PinPointResult pinPointResult) {
    }

    public Double getPointDirection() {
        return null;
    }

    public void setPointDirection(Double d2) {
    }

    public List<DoublePoint2D> getLiveviewPos() {
        return null;
    }

    public void setLiveviewPos(List<DoublePoint2D> list) {
    }

    public String toString() {
        return null;
    }
}

