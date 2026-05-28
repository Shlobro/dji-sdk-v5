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
import dji.sdk.keyvalue.value.camera.CameraAdvanceModeType;
import org.json.JSONObject;

public class CameraAdvanceModeLiveviewReversalMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    CameraAdvanceModeType advanceModeType;
    Boolean liveViewReversed;

    public CameraAdvanceModeLiveviewReversalMsg() {
    }

    public CameraAdvanceModeLiveviewReversalMsg(CameraAdvanceModeType cameraAdvanceModeType, Boolean bl) {
    }

    public static CameraAdvanceModeLiveviewReversalMsg fromJson(String string) {
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

    public CameraAdvanceModeType getAdvanceModeType() {
        return null;
    }

    public void setAdvanceModeType(CameraAdvanceModeType cameraAdvanceModeType) {
    }

    public Boolean getLiveViewReversed() {
        return null;
    }

    public void setLiveViewReversed(Boolean bl) {
    }

    public String toString() {
        return null;
    }
}

