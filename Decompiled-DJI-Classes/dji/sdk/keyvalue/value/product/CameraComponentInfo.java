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
import dji.sdk.keyvalue.value.camera.CameraCType;
import dji.sdk.keyvalue.value.common.ComponentIndexType;
import dji.sdk.keyvalue.value.product.CameraLensInfo;
import java.util.List;
import org.json.JSONObject;

public class CameraComponentInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    ComponentIndexType index;
    Integer component_id;
    CameraCType cameraType;
    List<CameraLensInfo> lens;

    public CameraComponentInfo() {
    }

    public CameraComponentInfo(ComponentIndexType componentIndexType, Integer n, CameraCType cameraCType, List<CameraLensInfo> list) {
    }

    public static CameraComponentInfo fromJson(String string) {
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

    public ComponentIndexType getIndex() {
        return null;
    }

    public void setIndex(ComponentIndexType componentIndexType) {
    }

    public Integer getComponent_id() {
        return null;
    }

    public void setComponent_id(Integer n) {
    }

    public CameraCType getCameraType() {
        return null;
    }

    public void setCameraType(CameraCType cameraCType) {
    }

    public List<CameraLensInfo> getLens() {
        return null;
    }

    public void setLens(List<CameraLensInfo> list) {
    }

    public String toString() {
        return null;
    }
}

