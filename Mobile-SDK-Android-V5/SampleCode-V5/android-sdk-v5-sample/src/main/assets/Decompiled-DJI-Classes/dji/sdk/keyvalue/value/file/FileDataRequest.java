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
import dji.sdk.keyvalue.value.camera.MediaFileType;
import dji.sdk.keyvalue.value.common.ComponentIndexType;
import dji.sdk.keyvalue.value.file.FileDataType;
import dji.sdk.keyvalue.value.file.FileLocation;
import dji.sdk.keyvalue.value.media.PhysicalPathInfo;
import java.util.List;
import org.json.JSONObject;

public class FileDataRequest
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer index;
    Integer count;
    FileDataType type;
    FileLocation location;
    Long offSet;
    Integer dataSize;
    Integer subIndex;
    Integer segSubIndex;
    Integer receiver_type;
    Integer receiver_index;
    MediaFileType mediaFileType;
    Boolean callbackOnce;
    Boolean isSize64File;
    Long uuid;
    List<PhysicalPathInfo> physicalPathInfo;
    ComponentIndexType cameraIndex;

    public FileDataRequest() {
    }

    public FileDataRequest(Integer n, Integer n2, FileDataType fileDataType, FileLocation fileLocation, Long l2, Integer n3, Integer n4, Integer n5, Integer n6, Integer n7, MediaFileType mediaFileType, Boolean bl, Boolean bl2, Long l3, List<PhysicalPathInfo> list, ComponentIndexType componentIndexType) {
    }

    public static FileDataRequest fromJson(String string) {
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

    public FileDataType getType() {
        return null;
    }

    public void setType(FileDataType fileDataType) {
    }

    public FileLocation getLocation() {
        return null;
    }

    public void setLocation(FileLocation fileLocation) {
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

    public MediaFileType getMediaFileType() {
        return null;
    }

    public void setMediaFileType(MediaFileType mediaFileType) {
    }

    public Boolean getCallbackOnce() {
        return null;
    }

    public void setCallbackOnce(Boolean bl) {
    }

    public Boolean getIsSize64File() {
        return null;
    }

    public void setIsSize64File(Boolean bl) {
    }

    public Long getUuid() {
        return null;
    }

    public void setUuid(Long l2) {
    }

    public List<PhysicalPathInfo> getPhysicalPathInfo() {
        return null;
    }

    public void setPhysicalPathInfo(List<PhysicalPathInfo> list) {
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

