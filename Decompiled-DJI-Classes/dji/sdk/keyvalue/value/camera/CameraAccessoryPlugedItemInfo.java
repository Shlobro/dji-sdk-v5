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
import dji.sdk.keyvalue.value.camera.AccessoryControl;
import dji.sdk.keyvalue.value.camera.AccessoryProductType;
import org.json.JSONObject;

public class CameraAccessoryPlugedItemInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    AccessoryProductType productType;
    AccessoryControl control;

    public CameraAccessoryPlugedItemInfo() {
    }

    public CameraAccessoryPlugedItemInfo(AccessoryProductType accessoryProductType, AccessoryControl accessoryControl) {
    }

    public static CameraAccessoryPlugedItemInfo fromJson(String string) {
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

    public AccessoryProductType getProductType() {
        return null;
    }

    public void setProductType(AccessoryProductType accessoryProductType) {
    }

    public AccessoryControl getControl() {
        return null;
    }

    public void setControl(AccessoryControl accessoryControl) {
    }

    public String toString() {
        return null;
    }
}

