/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.product;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.common.CameraLensType;
import org.json.JSONObject;

public class CameraLensInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    CameraLensType subComponentType;
    Integer subComponentIndex;

    public CameraLensInfo() {
    }

    public CameraLensInfo(CameraLensType cameraLensType, Integer n) {
    }

    public static CameraLensInfo fromJson(String string) {
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

    public CameraLensType getSubComponentType() {
        return null;
    }

    public void setSubComponentType(CameraLensType cameraLensType) {
    }

    public Integer getSubComponentIndex() {
        return null;
    }

    public void setSubComponentIndex(Integer n) {
    }

    public String toString() {
        return null;
    }
}

