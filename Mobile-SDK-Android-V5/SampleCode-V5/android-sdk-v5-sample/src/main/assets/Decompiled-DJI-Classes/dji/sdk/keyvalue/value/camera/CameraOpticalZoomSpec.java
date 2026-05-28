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
import org.json.JSONObject;

public class CameraOpticalZoomSpec
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer maxFocalLength;
    Integer minFocalLength;
    Integer focalLengthStep;

    public CameraOpticalZoomSpec() {
    }

    public CameraOpticalZoomSpec(Integer n, Integer n2, Integer n3) {
    }

    public static CameraOpticalZoomSpec fromJson(String string) {
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

    public Integer getMaxFocalLength() {
        return null;
    }

    public void setMaxFocalLength(Integer n) {
    }

    public Integer getMinFocalLength() {
        return null;
    }

    public void setMinFocalLength(Integer n) {
    }

    public Integer getFocalLengthStep() {
        return null;
    }

    public void setFocalLengthStep(Integer n) {
    }

    public String toString() {
        return null;
    }
}

