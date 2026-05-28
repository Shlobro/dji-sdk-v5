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

public class SemiAutoFlyParam
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Double hoverTimeValue;
    Double hoverTimeMax;
    Double hoverTimeMin;
    Double level1HeightValue;
    Double level1HeightMax;
    Double level1HeightMin;
    Double level2HeightValue;
    Double level2HeightMax;
    Double level2HeightMin;

    public SemiAutoFlyParam() {
    }

    public SemiAutoFlyParam(Double d2, Double d3, Double d4, Double d5, Double d6, Double d7, Double d8, Double d9, Double d10) {
    }

    public static SemiAutoFlyParam fromJson(String string) {
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

    public Double getHoverTimeValue() {
        return null;
    }

    public void setHoverTimeValue(Double d2) {
    }

    public Double getHoverTimeMax() {
        return null;
    }

    public void setHoverTimeMax(Double d2) {
    }

    public Double getHoverTimeMin() {
        return null;
    }

    public void setHoverTimeMin(Double d2) {
    }

    public Double getLevel1HeightValue() {
        return null;
    }

    public void setLevel1HeightValue(Double d2) {
    }

    public Double getLevel1HeightMax() {
        return null;
    }

    public void setLevel1HeightMax(Double d2) {
    }

    public Double getLevel1HeightMin() {
        return null;
    }

    public void setLevel1HeightMin(Double d2) {
    }

    public Double getLevel2HeightValue() {
        return null;
    }

    public void setLevel2HeightValue(Double d2) {
    }

    public Double getLevel2HeightMax() {
        return null;
    }

    public void setLevel2HeightMax(Double d2) {
    }

    public Double getLevel2HeightMin() {
        return null;
    }

    public void setLevel2HeightMin(Double d2) {
    }

    public String toString() {
        return null;
    }
}

