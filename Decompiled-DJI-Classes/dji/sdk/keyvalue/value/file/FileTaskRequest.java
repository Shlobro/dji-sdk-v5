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
import dji.sdk.keyvalue.value.common.ComponentIndexType;
import dji.sdk.keyvalue.value.file.FileDataRequest;
import dji.sdk.keyvalue.value.file.FileListRequest;
import dji.sdk.keyvalue.value.file.FileTaskDefer;
import dji.sdk.keyvalue.value.file.FileTaskDuplicate;
import dji.sdk.keyvalue.value.file.FileTaskPriority;
import dji.sdk.keyvalue.value.file.FileTaskType;
import java.util.List;
import org.json.JSONObject;

public class FileTaskRequest
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    FileTaskType type;
    FileTaskDuplicate duplicateType;
    FileTaskDefer deferType;
    FileTaskPriority priority;
    List<FileDataRequest> dataReq;
    List<FileListRequest> listReq;
    Integer taskId;
    ComponentIndexType cameraIndex;

    public FileTaskRequest() {
    }

    public FileTaskRequest(FileTaskType fileTaskType, FileTaskDuplicate fileTaskDuplicate, FileTaskDefer fileTaskDefer, FileTaskPriority fileTaskPriority, List<FileDataRequest> list, List<FileListRequest> list2, Integer n, ComponentIndexType componentIndexType) {
    }

    public static FileTaskRequest fromJson(String string) {
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

    public FileTaskType getType() {
        return null;
    }

    public void setType(FileTaskType fileTaskType) {
    }

    public FileTaskDuplicate getDuplicateType() {
        return null;
    }

    public void setDuplicateType(FileTaskDuplicate fileTaskDuplicate) {
    }

    public FileTaskDefer getDeferType() {
        return null;
    }

    public void setDeferType(FileTaskDefer fileTaskDefer) {
    }

    public FileTaskPriority getPriority() {
        return null;
    }

    public void setPriority(FileTaskPriority fileTaskPriority) {
    }

    public List<FileDataRequest> getDataReq() {
        return null;
    }

    public void setDataReq(List<FileDataRequest> list) {
    }

    public List<FileListRequest> getListReq() {
        return null;
    }

    public void setListReq(List<FileListRequest> list) {
    }

    public Integer getTaskId() {
        return null;
    }

    public void setTaskId(Integer n) {
    }

    public ComponentIndexType getCameraIndex() {
        return null;
    }

    public void setCameraIndex(ComponentIndexType componentIndexType) {
    }

    public String toString() {
        return null;
    }
}

