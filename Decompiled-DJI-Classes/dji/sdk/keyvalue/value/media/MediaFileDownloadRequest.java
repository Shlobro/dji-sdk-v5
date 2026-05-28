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
import dji.sdk.keyvalue.value.media.MediaRequestType;
import dji.sdk.keyvalue.value.media.PhysicalPathInfo;
import java.util.List;
import org.json.JSONObject;

public class MediaFileDownloadRequest
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer index;
    Integer count;
    Long offSet;
    Integer dataSize;
    MediaRequestType type;
    Integer subIndex;
    Integer segSubIndex;
    List<PhysicalPathInfo> physicalPathInfo;

    public MediaFileDownloadRequest() {
    }

    public MediaFileDownloadRequest(Integer n, Integer n2, Long l2, Integer n3, MediaRequestType mediaRequestType, Integer n4, Integer n5, List<PhysicalPathInfo> list) {
    }

    public static MediaFileDownloadRequest fromJson(String string) {
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

    public Long getOffSet() {
        return null;
    }

    public void setOffSet(Long l2) {
    }

    public Integer getDataSize() {
        return null;
    }

    public void setDataSize(Integer n) {
    }

    public MediaRequestType getType() {
        return null;
    }

    public void setType(MediaRequestType mediaRequestType) {
    }

    public Integer getSubIndex() {
        return null;
    }

    public void setSubIndex(Integer n) {
    }

    public Integer getSegSubIndex() {
        return null;
    }

    public void setSegSubIndex(Integer n) {
    }

    public List<PhysicalPathInfo> getPhysicalPathInfo() {
        return null;
    }

    public void setPhysicalPathInfo(List<PhysicalPathInfo> list) {
    }

    public String toString() {
        return null;
    }
}

