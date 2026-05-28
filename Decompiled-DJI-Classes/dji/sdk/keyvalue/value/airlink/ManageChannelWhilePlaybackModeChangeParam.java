/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.airlink;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.aibox.AIBoxType;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.camera.CameraCType;
import dji.sdk.keyvalue.value.common.ComponentIndexType;
import dji.sdk.keyvalue.value.payload.PayloadCameraType;
import org.json.JSONObject;

public class ManageChannelWhilePlaybackModeChangeParam
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Boolean isPlayback;
    CameraCType cameraType;
    PayloadCameraType payloadCameraType;
    ComponentIndexType cameraPosition;
    Boolean isAiBox;
    AIBoxType aiBoxType;

    public ManageChannelWhilePlaybackModeChangeParam() {
    }

    public ManageChannelWhilePlaybackModeChangeParam(Boolean bl, CameraCType cameraCType, PayloadCameraType payloadCameraType, ComponentIndexType componentIndexType, Boolean bl2, AIBoxType aIBoxType) {
    }

    public static ManageChannelWhilePlaybackModeChangeParam fromJson(String string) {
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

    public Boolean getIsPlayback() {
        return null;
    }

    public void setIsPlayback(Boolean bl) {
    }

    public CameraCType getCameraType() {
        return null;
    }

    public void setCameraType(CameraCType cameraCType) {
    }

    public PayloadCameraType getPayloadCameraType() {
        return null;
    }

    public void setPayloadCameraType(PayloadCameraType payloadCameraType) {
    }

    public ComponentIndexType getCameraPosition() {
        return null;
    }

    public void setCameraPosition(ComponentIndexType componentIndexType) {
    }

    public Boolean getIsAiBox() {
        return null;
    }

    public void setIsAiBox(Boolean bl) {
    }

    public AIBoxType getAiBoxType() {
        return null;
    }

    public void setAiBoxType(AIBoxType aIBoxType) {
    }

    public String toString() {
        return null;
    }
}

