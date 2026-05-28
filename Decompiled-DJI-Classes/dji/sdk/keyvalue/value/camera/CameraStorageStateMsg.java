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
import dji.sdk.keyvalue.value.camera.CameraStorageState;
import java.util.List;
import org.json.JSONObject;

public class CameraStorageStateMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer curStorageType;
    Integer setStorageType;
    List<CameraStorageState> storageInfos;

    public CameraStorageStateMsg() {
    }

    public CameraStorageStateMsg(Integer n, Integer n2, List<CameraStorageState> list) {
    }

    public static CameraStorageStateMsg fromJson(String string) {
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

    public Integer getCurStorageType() {
        return null;
    }

    public void setCurStorageType(Integer n) {
    }

    public Integer getSetStorageType() {
        return null;
    }

    public void setSetStorageType(Integer n) {
    }

    public List<CameraStorageState> getStorageInfos() {
        return null;
    }

    public void setStorageInfos(List<CameraStorageState> list) {
    }

    public String toString() {
        return null;
    }
}

