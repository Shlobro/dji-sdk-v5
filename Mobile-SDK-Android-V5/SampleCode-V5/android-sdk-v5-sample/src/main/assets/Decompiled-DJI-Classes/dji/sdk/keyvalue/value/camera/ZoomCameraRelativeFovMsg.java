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
import dji.sdk.keyvalue.value.camera.LiveViewWorldRegion;
import org.json.JSONObject;

public class ZoomCameraRelativeFovMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    LiveViewWorldRegion current;
    LiveViewWorldRegion target;

    public ZoomCameraRelativeFovMsg() {
    }

    public ZoomCameraRelativeFovMsg(LiveViewWorldRegion liveViewWorldRegion, LiveViewWorldRegion liveViewWorldRegion2) {
    }

    public static ZoomCameraRelativeFovMsg fromJson(String string) {
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

    public LiveViewWorldRegion getCurrent() {
        return null;
    }

    public void setCurrent(LiveViewWorldRegion liveViewWorldRegion) {
    }

    public LiveViewWorldRegion getTarget() {
        return null;
    }

    public void setTarget(LiveViewWorldRegion liveViewWorldRegion) {
    }

    public String toString() {
        return null;
    }
}

