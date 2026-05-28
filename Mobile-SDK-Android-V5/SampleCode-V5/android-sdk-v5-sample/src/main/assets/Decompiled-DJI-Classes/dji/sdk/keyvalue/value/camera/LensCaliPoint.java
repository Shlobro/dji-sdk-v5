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
import dji.sdk.keyvalue.value.camera.LensFocusCaliPositionType;
import org.json.JSONObject;

public class LensCaliPoint
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    LensFocusCaliPositionType type;
    Integer lensPosition;
    Integer focusDistance;

    public LensCaliPoint() {
    }

    public LensCaliPoint(LensFocusCaliPositionType lensFocusCaliPositionType, Integer n, Integer n2) {
    }

    public static LensCaliPoint fromJson(String string) {
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

    public LensFocusCaliPositionType getType() {
        return null;
    }

    public void setType(LensFocusCaliPositionType lensFocusCaliPositionType) {
    }

    public Integer getLensPosition() {
        return null;
    }

    public void setLensPosition(Integer n) {
    }

    public Integer getFocusDistance() {
        return null;
    }

    public void setFocusDistance(Integer n) {
    }

    public String toString() {
        return null;
    }
}

