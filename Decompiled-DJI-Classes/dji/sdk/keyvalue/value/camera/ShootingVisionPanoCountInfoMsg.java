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
import org.json.JSONObject;

public class ShootingVisionPanoCountInfoMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer totalCount;
    Integer current;

    public ShootingVisionPanoCountInfoMsg() {
    }

    public ShootingVisionPanoCountInfoMsg(Integer n, Integer n2) {
    }

    public static ShootingVisionPanoCountInfoMsg fromJson(String string) {
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

    public Integer getTotalCount() {
        return null;
    }

    public void setTotalCount(Integer n) {
    }

    public Integer getCurrent() {
        return null;
    }

    public void setCurrent(Integer n) {
    }

    public String toString() {
        return null;
    }
}

