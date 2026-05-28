/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.file;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.camera.DCFCameraType;
import dji.sdk.keyvalue.value.camera.DateTime;
import org.json.JSONObject;

public class DCFInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    String customKey;
    DCFCameraType cameraType;
    Integer directoryIndex;
    Integer fileIndex;
    Integer fileSetId;
    DateTime time;

    public DCFInfo() {
    }

    public DCFInfo(String string, DCFCameraType dCFCameraType, Integer n, Integer n2, Integer n3, DateTime dateTime) {
    }

    public static DCFInfo fromJson(String string) {
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

    public String getCustomKey() {
        return null;
    }

    public void setCustomKey(String string) {
    }

    public DCFCameraType getCameraType() {
        return null;
    }

    public void setCameraType(DCFCameraType dCFCameraType) {
    }

    public Integer getDirectoryIndex() {
        return null;
    }

    public void setDirectoryIndex(Integer n) {
    }

    public Integer getFileIndex() {
        return null;
    }

    public void setFileIndex(Integer n) {
    }

    public Integer getFileSetId() {
        return null;
    }

    public void setFileSetId(Integer n) {
    }

    public DateTime getTime() {
        return null;
    }

    public void setTime(DateTime dateTime) {
    }

    public String toString() {
        return null;
    }
}

