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
import dji.sdk.keyvalue.value.camera.DCFCameraType;
import dji.sdk.keyvalue.value.camera.DateTime;
import dji.sdk.keyvalue.value.camera.MediaFileType;
import org.json.JSONObject;

public class GeneratedMediaFileInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    MediaFileType type;
    Integer index;
    Integer FileSize;
    Integer dir_no;
    Integer file_no;
    Integer screen_offset;
    Integer screen_size;
    Integer video_time_ms;
    Integer seg_sub_idx;
    Integer end_of_sub_video;
    Integer file_source;
    DCFCameraType dcf_type;
    DateTime createTime;
    Double shutterTime;
    Integer aperture;
    Integer iso;
    Integer evBias;
    Integer luminance;
    Integer objectFocusDistance;

    public GeneratedMediaFileInfo() {
    }

    public GeneratedMediaFileInfo(MediaFileType mediaFileType, Integer n, Integer n2, Integer n3, Integer n4, Integer n5, Integer n6, Integer n7, Integer n8, Integer n9, Integer n10, DCFCameraType dCFCameraType, DateTime dateTime, Double d2, Integer n11, Integer n12, Integer n13, Integer n14, Integer n15) {
    }

    public static GeneratedMediaFileInfo fromJson(String string) {
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

    public MediaFileType getType() {
        return null;
    }

    public void setType(MediaFileType mediaFileType) {
    }

    public Integer getIndex() {
        return null;
    }

    public void setIndex(Integer n) {
    }

    public Integer getFileSize() {
        return null;
    }

    public void setFileSize(Integer n) {
    }

    public Integer getDir_no() {
        return null;
    }

    public void setDir_no(Integer n) {
    }

    public Integer getFile_no() {
        return null;
    }

    public void setFile_no(Integer n) {
    }

    public Integer getScreen_offset() {
        return null;
    }

    public void setScreen_offset(Integer n) {
    }

    public Integer getScreen_size() {
        return null;
    }

    public void setScreen_size(Integer n) {
    }

    public Integer getVideo_time_ms() {
        return null;
    }

    public void setVideo_time_ms(Integer n) {
    }

    public Integer getSeg_sub_idx() {
        return null;
    }

    public void setSeg_sub_idx(Integer n) {
    }

    public Integer getEnd_of_sub_video() {
        return null;
    }

    public void setEnd_of_sub_video(Integer n) {
    }

    public Integer getFile_source() {
        return null;
    }

    public void setFile_source(Integer n) {
    }

    public DCFCameraType getDcf_type() {
        return null;
    }

    public void setDcf_type(DCFCameraType dCFCameraType) {
    }

    public DateTime getCreateTime() {
        return null;
    }

    public void setCreateTime(DateTime dateTime) {
    }

    public Double getShutterTime() {
        return null;
    }

    public void setShutterTime(Double d2) {
    }

    public Integer getAperture() {
        return null;
    }

    public void setAperture(Integer n) {
    }

    public Integer getIso() {
        return null;
    }

    public void setIso(Integer n) {
    }

    public Integer getEvBias() {
        return null;
    }

    public void setEvBias(Integer n) {
    }

    public Integer getLuminance() {
        return null;
    }

    public void setLuminance(Integer n) {
    }

    public Integer getObjectFocusDistance() {
        return null;
    }

    public void setObjectFocusDistance(Integer n) {
    }

    public String toString() {
        return null;
    }
}

