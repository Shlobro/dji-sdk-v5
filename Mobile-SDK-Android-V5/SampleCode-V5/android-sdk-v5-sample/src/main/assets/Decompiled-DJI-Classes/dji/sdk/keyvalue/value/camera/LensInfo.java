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
import dji.sdk.keyvalue.value.camera.CameraProducter;
import dji.sdk.keyvalue.value.camera.LensModel;
import dji.sdk.keyvalue.value.camera.LensMountType;
import org.json.JSONObject;

public class LensInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    CameraProducter producter;
    LensModel model;
    LensMountType mount;
    Integer hardwareVersion;
    String name;

    public LensInfo() {
    }

    public LensInfo(CameraProducter cameraProducter, LensModel lensModel, LensMountType lensMountType, Integer n, String string) {
    }

    public static LensInfo fromJson(String string) {
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

    public CameraProducter getProducter() {
        return null;
    }

    public void setProducter(CameraProducter cameraProducter) {
    }

    public LensModel getModel() {
        return null;
    }

    public void setModel(LensModel lensModel) {
    }

    public LensMountType getMount() {
        return null;
    }

    public void setMount(LensMountType lensMountType) {
    }

    public Integer getHardwareVersion() {
        return null;
    }

    public void setHardwareVersion(Integer n) {
    }

    public String getName() {
        return null;
    }

    public void setName(String string) {
    }

    public String toString() {
        return null;
    }
}

