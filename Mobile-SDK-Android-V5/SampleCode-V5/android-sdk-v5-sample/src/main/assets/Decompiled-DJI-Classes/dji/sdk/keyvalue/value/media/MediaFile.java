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
import dji.sdk.keyvalue.value.camera.CameraOrientation;
import dji.sdk.keyvalue.value.camera.CameraPanoType;
import dji.sdk.keyvalue.value.camera.DateTime;
import dji.sdk.keyvalue.value.camera.MediaFileType;
import dji.sdk.keyvalue.value.camera.MediaPhotoType;
import dji.sdk.keyvalue.value.camera.MediaVideoType;
import dji.sdk.keyvalue.value.camera.PhotoRatio;
import dji.sdk.keyvalue.value.camera.VideoFrameRate;
import dji.sdk.keyvalue.value.camera.VideoResolution;
import dji.sdk.keyvalue.value.file.DCFInfo;
import dji.sdk.keyvalue.value.media.FileExifInfo;
import dji.sdk.keyvalue.value.media.MediaFileStarTag;
import dji.sdk.keyvalue.value.media.MediaVideoEncodeType;
import dji.sdk.keyvalue.value.media.PointCloudInfo;
import dji.sdk.keyvalue.value.media.ProxyInfo;
import dji.sdk.keyvalue.value.media.VideoBeautifySettingsInfo;
import dji.sdk.keyvalue.value.media.VideoProMeta;
import java.util.List;
import org.json.JSONObject;

public class MediaFile
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Boolean valid;
    Boolean isManualGroupFile;
    Integer fileIndex;
    MediaFileType fileType;
    String fileName;
    Long fileSize;
    DateTime date;
    MediaFileStarTag starTag;
    Boolean isCloudDownload;
    Long duration;
    CameraOrientation orientation;
    CameraOrientation cameraOrientation;
    VideoFrameRate frameRate;
    VideoResolution resolution;
    MediaVideoType videoType;
    MediaPhotoType photoType;
    CameraPanoType panoType;
    MediaVideoEncodeType videoEncodeType;
    Integer videoSpeedRatio;
    Integer panoCount;
    Boolean hasOriginalFile;
    Long guid;
    Integer fileGroupIndex;
    Integer subIndex;
    Integer segSubIndex;
    Integer timeLapseInterval;
    FileExifInfo EXIFInfo;
    PhotoRatio photoRatio;
    List<MediaFile> subMediaFile;
    DCFInfo dcfInfo;
    Boolean isDcfSupported;
    Boolean isEdcfSupported;
    Boolean isPageLastFile;
    Integer dirIndex;
    VideoBeautifySettingsInfo videoBeautifyInfo;
    Boolean hasProxy;
    ProxyInfo proxyInfo;
    Boolean isSize64File;
    VideoProMeta videoProMetaInfo;
    PointCloudInfo pointCloudInfo;
    Boolean hasAIMotInfo;
    Boolean hasWatermarkInfo;

    public MediaFile() {
    }

    public MediaFile(Boolean bl, Boolean bl2, Integer n, MediaFileType mediaFileType, String string, Long l2, DateTime dateTime, MediaFileStarTag mediaFileStarTag, Boolean bl3, Long l3, CameraOrientation cameraOrientation, CameraOrientation cameraOrientation2, VideoFrameRate videoFrameRate, VideoResolution videoResolution, MediaVideoType mediaVideoType, MediaPhotoType mediaPhotoType, CameraPanoType cameraPanoType, MediaVideoEncodeType mediaVideoEncodeType, Integer n2, Integer n3, Boolean bl4, Long l4, Integer n4, Integer n5, Integer n6, Integer n7, FileExifInfo fileExifInfo, PhotoRatio photoRatio, List<MediaFile> list, DCFInfo dCFInfo, Boolean bl5, Boolean bl6, Boolean bl7, Integer n8, VideoBeautifySettingsInfo videoBeautifySettingsInfo, Boolean bl8, ProxyInfo proxyInfo, Boolean bl9, VideoProMeta videoProMeta, PointCloudInfo pointCloudInfo, Boolean bl10, Boolean bl11) {
    }

    public static MediaFile fromJson(String string) {
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

    public Boolean getValid() {
        return null;
    }

    public void setValid(Boolean bl) {
    }

    public Boolean getIsManualGroupFile() {
        return null;
    }

    public void setIsManualGroupFile(Boolean bl) {
    }

    public Integer getFileIndex() {
        return null;
    }

    public void setFileIndex(Integer n) {
    }

    public MediaFileType getFileType() {
        return null;
    }

    public void setFileType(MediaFileType mediaFileType) {
    }

    public String getFileName() {
        return null;
    }

    public void setFileName(String string) {
    }

    public Long getFileSize() {
        return null;
    }

    public void setFileSize(Long l2) {
    }

    public DateTime getDate() {
        return null;
    }

    public void setDate(DateTime dateTime) {
    }

    public MediaFileStarTag getStarTag() {
        return null;
    }

    public void setStarTag(MediaFileStarTag mediaFileStarTag) {
    }

    public Boolean getIsCloudDownload() {
        return null;
    }

    public void setIsCloudDownload(Boolean bl) {
    }

    public Long getDuration() {
        return null;
    }

    public void setDuration(Long l2) {
    }

    public CameraOrientation getOrientation() {
        return null;
    }

    public void setOrientation(CameraOrientation cameraOrientation) {
    }

    public CameraOrientation getCameraOrientation() {
        return null;
    }

    public void setCameraOrientation(CameraOrientation cameraOrientation) {
    }

    public VideoFrameRate getFrameRate() {
        return null;
    }

    public void setFrameRate(VideoFrameRate videoFrameRate) {
    }

    public VideoResolution getResolution() {
        return null;
    }

    public void setResolution(VideoResolution videoResolution) {
    }

    public MediaVideoType getVideoType() {
        return null;
    }

    public void setVideoType(MediaVideoType mediaVideoType) {
    }

    public MediaPhotoType getPhotoType() {
        return null;
    }

    public void setPhotoType(MediaPhotoType mediaPhotoType) {
    }

    public CameraPanoType getPanoType() {
        return null;
    }

    public void setPanoType(CameraPanoType cameraPanoType) {
    }

    public MediaVideoEncodeType getVideoEncodeType() {
        return null;
    }

    public void setVideoEncodeType(MediaVideoEncodeType mediaVideoEncodeType) {
    }

    public Integer getVideoSpeedRatio() {
        return null;
    }

    public void setVideoSpeedRatio(Integer n) {
    }

    public Integer getPanoCount() {
        return null;
    }

    public void setPanoCount(Integer n) {
    }

    public Boolean getHasOriginalFile() {
        return null;
    }

    public void setHasOriginalFile(Boolean bl) {
    }

    public Long getGuid() {
        return null;
    }

    public void setGuid(Long l2) {
    }

    public Integer getFileGroupIndex() {
        return null;
    }

    public void setFileGroupIndex(Integer n) {
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

    public Integer getTimeLapseInterval() {
        return null;
    }

    public void setTimeLapseInterval(Integer n) {
    }

    public FileExifInfo getEXIFInfo() {
        return null;
    }

    public void setEXIFInfo(FileExifInfo fileExifInfo) {
    }

    public PhotoRatio getPhotoRatio() {
        return null;
    }

    public void setPhotoRatio(PhotoRatio photoRatio) {
    }

    public List<MediaFile> getSubMediaFile() {
        return null;
    }

    public void setSubMediaFile(List<MediaFile> list) {
    }

    public DCFInfo getDcfInfo() {
        return null;
    }

    public void setDcfInfo(DCFInfo dCFInfo) {
    }

    public Boolean getIsDcfSupported() {
        return null;
    }

    public void setIsDcfSupported(Boolean bl) {
    }

    public Boolean getIsEdcfSupported() {
        return null;
    }

    public void setIsEdcfSupported(Boolean bl) {
    }

    public Boolean getIsPageLastFile() {
        return null;
    }

    public void setIsPageLastFile(Boolean bl) {
    }

    public Integer getDirIndex() {
        return null;
    }

    public void setDirIndex(Integer n) {
    }

    public VideoBeautifySettingsInfo getVideoBeautifyInfo() {
        return null;
    }

    public void setVideoBeautifyInfo(VideoBeautifySettingsInfo videoBeautifySettingsInfo) {
    }

    public Boolean getHasProxy() {
        return null;
    }

    public void setHasProxy(Boolean bl) {
    }

    public ProxyInfo getProxyInfo() {
        return null;
    }

    public void setProxyInfo(ProxyInfo proxyInfo) {
    }

    public Boolean getIsSize64File() {
        return null;
    }

    public void setIsSize64File(Boolean bl) {
    }

    public VideoProMeta getVideoProMetaInfo() {
        return null;
    }

    public void setVideoProMetaInfo(VideoProMeta videoProMeta) {
    }

    public PointCloudInfo getPointCloudInfo() {
        return null;
    }

    public void setPointCloudInfo(PointCloudInfo pointCloudInfo) {
    }

    public Boolean getHasAIMotInfo() {
        return null;
    }

    public void setHasAIMotInfo(Boolean bl) {
    }

    public Boolean getHasWatermarkInfo() {
        return null;
    }

    public void setHasWatermarkInfo(Boolean bl) {
    }

    public String toString() {
        return null;
    }
}

