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
import dji.sdk.keyvalue.value.camera.DJIFixedFocusLensType;
import dji.sdk.keyvalue.value.payload.PayloadCameraType;
import org.json.JSONObject;

public class DJIFixedFocusLensTypeMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Boolean isMounted;
    PayloadCameraType payloadType;
    DJIFixedFocusLensType focusLensValue;

    public DJIFixedFocusLensTypeMsg() {
    }

    public DJIFixedFocusLensTypeMsg(Boolean bl, PayloadCameraType payloadCameraType, DJIFixedFocusLensType dJIFixedFocusLensType) {
    }

    public static DJIFixedFocusLensTypeMsg fromJson(String string) {
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

    public Boolean getIsMounted() {
        return null;
    }

    public void setIsMounted(Boolean bl) {
    }

    public PayloadCameraType getPayloadType() {
        return null;
    }

    public void setPayloadType(PayloadCameraType payloadCameraType) {
    }

    public DJIFixedFocusLensType getFocusLensValue() {
        return null;
    }

    public void setFocusLensValue(DJIFixedFocusLensType dJIFixedFocusLensType) {
    }

    public String toString() {
        return null;
    }
}

