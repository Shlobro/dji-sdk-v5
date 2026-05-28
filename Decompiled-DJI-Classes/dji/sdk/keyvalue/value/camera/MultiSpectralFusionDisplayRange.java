/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.camera.MultiSpectralFusionDisplayRangeType;
import org.json.JSONObject;

public class MultiSpectralFusionDisplayRange
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    MultiSpectralFusionDisplayRangeType displayRangeType;
    Integer displayMin;
    Integer displayMax;

    public MultiSpectralFusionDisplayRange() {
    }

    public MultiSpectralFusionDisplayRange(MultiSpectralFusionDisplayRangeType multiSpectralFusionDisplayRangeType, Integer n, Integer n2) {
    }

    public static MultiSpectralFusionDisplayRange fromJson(String string) {
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

    public MultiSpectralFusionDisplayRangeType getDisplayRangeType() {
        return null;
    }

    public void setDisplayRangeType(MultiSpectralFusionDisplayRangeType multiSpectralFusionDisplayRangeType) {
    }

    public Integer getDisplayMin() {
        return null;
    }

    public void setDisplayMin(Integer n) {
    }

    public Integer getDisplayMax() {
        return null;
    }

    public void setDisplayMax(Integer n) {
    }

    public String toString() {
        return null;
    }
}

