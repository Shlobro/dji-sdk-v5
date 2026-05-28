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
import dji.sdk.keyvalue.value.file.FileListRequestFilter;
import dji.sdk.keyvalue.value.file.FileListRequestOrder;
import dji.sdk.keyvalue.value.file.FileLocation;
import dji.sdk.keyvalue.value.file.FileType;
import java.util.List;
import org.json.JSONObject;

public class FileListRequest
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer index;
    Integer count;
    Integer folderIndex;
    FileType type;
    FileLocation location;
    Integer receiver_type;
    Integer receiver_index;
    Boolean isAllList;
    List<FileListRequestFilter> filterlist;
    FileListRequestOrder orderInfo;
    ComponentIndexType cameraIndex;

    public FileListRequest() {
    }

    public FileListRequest(Integer n, Integer n2, Integer n3, FileType fileType, FileLocation fileLocation, Integer n4, Integer n5, Boolean bl, List<FileListRequestFilter> list, FileListRequestOrder fileListRequestOrder, ComponentIndexType componentIndexType) {
    }

    public static FileListRequest fromJson(String string) {
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

    public Integer getCount() {
        return null;
    }

    public void setCount(Integer n) {
    }

    public Integer getFolderIndex() {
        return null;
    }

    public void setFolderIndex(Integer n) {
    }

    public FileType getType() {
        return null;
    }

    public void setType(FileType fileType) {
    }

    public FileLocation getLocation() {
        return null;
    }

    public void setLocation(FileLocation fileLocation) {
    }

    public Integer getReceiver_type() {
        return null;
    }

    public void setReceiver_type(Integer n) {
    }

    public Integer getReceiver_index() {
        return null;
    }

    public void setReceiver_index(Integer n) {
    }

    public Boolean getIsAllList() {
        return null;
    }

    public void setIsAllList(Boolean bl) {
    }

    public List<FileListRequestFilter> getFilterlist() {
        return null;
    }

    public void setFilterlist(List<FileListRequestFilter> list) {
    }

    public FileListRequestOrder getOrderInfo() {
        return null;
    }

    public void setOrderInfo(FileListRequestOrder fileListRequestOrder) {
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

