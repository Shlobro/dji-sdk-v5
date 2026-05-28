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
import dji.sdk.keyvalue.value.camera.CameraStorageLocation;
import dji.sdk.keyvalue.value.camera.SDCardLoadState;
import org.json.JSONObject;

public class CameraStorageState
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    CameraStorageLocation storageType;
    SDCardLoadState storageState;
    Integer storageCapacity;
    Integer storageLeftCapacity;

    public CameraStorageState() {
    }

    public CameraStorageState(CameraStorageLocation cameraStorageLocation, SDCardLoadState sDCardLoadState, Integer n, Integer n2) {
    }

    public static CameraStorageState fromJson(String string) {
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

    public CameraStorageLocation getStorageType() {
        return null;
    }

    public void setStorageType(CameraStorageLocation cameraStorageLocation) {
    }

    public SDCardLoadState getStorageState() {
        return null;
    }

    public void setStorageState(SDCardLoadState sDCardLoadState) {
    }

    public Integer getStorageCapacity() {
        return null;
    }

    public void setStorageCapacity(Integer n) {
    }

    public Integer getStorageLeftCapacity() {
        return null;
    }

    public void setStorageLeftCapacity(Integer n) {
    }

    public String toString() {
        return null;
    }
}

