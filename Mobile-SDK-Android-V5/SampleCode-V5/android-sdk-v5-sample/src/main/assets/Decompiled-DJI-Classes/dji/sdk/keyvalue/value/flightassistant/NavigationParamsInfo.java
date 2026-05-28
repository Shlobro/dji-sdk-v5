/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.flightassistant;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.camera.CameraFlatMode;
import dji.sdk.keyvalue.value.flightassistant.NavigationMode;
import org.json.JSONObject;

public class NavigationParamsInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    NavigationMode navMode;
    CameraFlatMode cameraMode;
    Integer camPosition;

    public NavigationParamsInfo() {
    }

    public NavigationParamsInfo(NavigationMode navigationMode, CameraFlatMode cameraFlatMode, Integer n) {
    }

    public static NavigationParamsInfo fromJson(String string) {
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

    public NavigationMode getNavMode() {
        return null;
    }

    public void setNavMode(NavigationMode navigationMode) {
    }

    public CameraFlatMode getCameraMode() {
        return null;
    }

    public void setCameraMode(CameraFlatMode cameraFlatMode) {
    }

    public Integer getCamPosition() {
        return null;
    }

    public void setCamPosition(Integer n) {
    }

    public String toString() {
        return null;
    }
}

