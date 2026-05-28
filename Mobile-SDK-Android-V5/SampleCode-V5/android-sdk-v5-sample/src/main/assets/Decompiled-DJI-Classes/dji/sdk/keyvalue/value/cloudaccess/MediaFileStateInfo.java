/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.cloudaccess;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.camera.DateTime;
import dji.sdk.keyvalue.value.cloudaccess.MediaFileState;
import dji.sdk.keyvalue.value.common.ComponentIndexType;
import org.json.JSONObject;

public class MediaFileStateInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    ComponentIndexType cameraIndex;
    String uuid;
    String tag;
    Long fileIndex;
    Long folderIndex;
    DateTime createTime;
    Long fileSize;
    MediaFileState state;

    public MediaFileStateInfo() {
    }

    public MediaFileStateInfo(ComponentIndexType componentIndexType, String string, String string2, Long l2, Long l3, DateTime dateTime, Long l4, MediaFileState mediaFileState) {
    }

    public static MediaFileStateInfo fromJson(String string) {
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

    public ComponentIndexType getCameraIndex() {
        return null;
    }

    public void setCameraIndex(ComponentIndexType componentIndexType) {
    }

    public String getUuid() {
        return null;
    }

    public void setUuid(String string) {
    }

    public String getTag() {
        return null;
    }

    public void setTag(String string) {
    }

    public Long getFileIndex() {
        return null;
    }

    public void setFileIndex(Long l2) {
    }

    public Long getFolderIndex() {
        return null;
    }

    public void setFolderIndex(Long l2) {
    }

    public DateTime getCreateTime() {
        return null;
    }

    public void setCreateTime(DateTime dateTime) {
    }

    public Long getFileSize() {
        return null;
    }

    public void setFileSize(Long l2) {
    }

    public MediaFileState getState() {
        return null;
    }

    public void setState(MediaFileState mediaFileState) {
    }

    public String toString() {
        return null;
    }
}

