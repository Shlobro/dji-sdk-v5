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
import dji.sdk.keyvalue.value.file.FileListRequestFilter;
import dji.sdk.keyvalue.value.file.FileLocation;
import dji.sdk.keyvalue.value.media.MediaRequestType;
import java.util.List;
import org.json.JSONObject;

public class MediaFileListRequest
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer index;
    Integer count;
    FileLocation location;
    MediaRequestType subType;
    Boolean isAllList;
    List<FileListRequestFilter> filterlist;

    public MediaFileListRequest() {
    }

    public MediaFileListRequest(Integer n, Integer n2, FileLocation fileLocation, MediaRequestType mediaRequestType, Boolean bl, List<FileListRequestFilter> list) {
    }

    public static MediaFileListRequest fromJson(String string) {
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

    public FileLocation getLocation() {
        return null;
    }

    public void setLocation(FileLocation fileLocation) {
    }

    public MediaRequestType getSubType() {
        return null;
    }

    public void setSubType(MediaRequestType mediaRequestType) {
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

    public String toString() {
        return null;
    }
}

