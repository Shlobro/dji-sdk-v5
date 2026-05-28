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
import dji.sdk.keyvalue.value.gimbal.CameraPortraitStateType;
import org.json.JSONObject;

public class CameraPortraitStateMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Boolean isCameraPortrait;
    CameraPortraitStateType type;

    public CameraPortraitStateMsg() {
    }

    public CameraPortraitStateMsg(Boolean bl, CameraPortraitStateType cameraPortraitStateType) {
    }

    public static CameraPortraitStateMsg fromJson(String string) {
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

    public Boolean getIsCameraPortrait() {
        return null;
    }

    public void setIsCameraPortrait(Boolean bl) {
    }

    public CameraPortraitStateType getType() {
        return null;
    }

    public void setType(CameraPortraitStateType cameraPortraitStateType) {
    }

    public String toString() {
        return null;
    }
}

