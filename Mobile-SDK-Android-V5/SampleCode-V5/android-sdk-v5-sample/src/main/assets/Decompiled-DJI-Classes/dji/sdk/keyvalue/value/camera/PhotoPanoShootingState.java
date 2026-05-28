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

public class PhotoPanoShootingState
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer index;
    Integer savedPhotoNum;
    Integer currentPhotoNum;
    Integer totalPhotoNum;
    Integer subIndex;
    Integer groupSubIndex;
    Integer htmlFileLength;
    Integer htmlCameraLinuxTime;
    Integer fileLength;
    Integer cameraLinuxTime;

    public PhotoPanoShootingState() {
    }

    public PhotoPanoShootingState(Integer n, Integer n2, Integer n3, Integer n4, Integer n5, Integer n6, Integer n7, Integer n8, Integer n9, Integer n10) {
    }

    public static PhotoPanoShootingState fromJson(String string) {
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

    public Integer getIndex() {
        return null;
    }

    public void setIndex(Integer n) {
    }

    public Integer getSavedPhotoNum() {
        return null;
    }

    public void setSavedPhotoNum(Integer n) {
    }

    public Integer getCurrentPhotoNum() {
        return null;
    }

    public void setCurrentPhotoNum(Integer n) {
    }

    public Integer getTotalPhotoNum() {
        return null;
    }

    public void setTotalPhotoNum(Integer n) {
    }

    public Integer getSubIndex() {
        return null;
    }

    public void setSubIndex(Integer n) {
    }

    public Integer getGroupSubIndex() {
        return null;
    }

    public void setGroupSubIndex(Integer n) {
    }

    public Integer getHtmlFileLength() {
        return null;
    }

    public void setHtmlFileLength(Integer n) {
    }

    public Integer getHtmlCameraLinuxTime() {
        return null;
    }

    public void setHtmlCameraLinuxTime(Integer n) {
    }

    public Integer getFileLength() {
        return null;
    }

    public void setFileLength(Integer n) {
    }

    public Integer getCameraLinuxTime() {
        return null;
    }

    public void setCameraLinuxTime(Integer n) {
    }

    public String toString() {
        return null;
    }
}

