/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.media;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.media.MediaFileDownloadRequest;
import dji.sdk.keyvalue.value.media.MediaFileListRequest;
import dji.sdk.keyvalue.value.media.MediaTaskDefer;
import dji.sdk.keyvalue.value.media.MediaTaskDuplicate;
import dji.sdk.keyvalue.value.media.MediaTaskPriority;
import dji.sdk.keyvalue.value.media.MediaTaskType;
import java.util.List;
import org.json.JSONObject;

public class MediaTaskRequest
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    MediaTaskType type;
    MediaTaskDuplicate duplicateType;
    MediaTaskDefer deferType;
    MediaTaskPriority priority;
    List<MediaFileDownloadRequest> dataReq;
    List<MediaFileListRequest> listReq;

    public MediaTaskRequest() {
    }

    public MediaTaskRequest(MediaTaskType mediaTaskType, MediaTaskDuplicate mediaTaskDuplicate, MediaTaskDefer mediaTaskDefer, MediaTaskPriority mediaTaskPriority, List<MediaFileDownloadRequest> list, List<MediaFileListRequest> list2) {
    }

    public static MediaTaskRequest fromJson(String string) {
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

    public MediaTaskType getType() {
        return null;
    }

    public void setType(MediaTaskType mediaTaskType) {
    }

    public MediaTaskDuplicate getDuplicateType() {
        return null;
    }

    public void setDuplicateType(MediaTaskDuplicate mediaTaskDuplicate) {
    }

    public MediaTaskDefer getDeferType() {
        return null;
    }

    public void setDeferType(MediaTaskDefer mediaTaskDefer) {
    }

    public MediaTaskPriority getPriority() {
        return null;
    }

    public void setPriority(MediaTaskPriority mediaTaskPriority) {
    }

    public List<MediaFileDownloadRequest> getDataReq() {
        return null;
    }

    public void setDataReq(List<MediaFileDownloadRequest> list) {
    }

    public List<MediaFileListRequest> getListReq() {
        return null;
    }

    public void setListReq(List<MediaFileListRequest> list) {
    }

    public String toString() {
        return null;
    }
}

