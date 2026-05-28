/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  androidx.annotation.NonNull
 */
package dji.v5.manager.datacenter.media;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import dji.media.album.MediaFileDataTask;
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
import dji.sdk.keyvalue.value.file.FileDataType;
import dji.sdk.keyvalue.value.media.FileExifInfo;
import dji.sdk.keyvalue.value.media.MediaFileStarTag;
import dji.sdk.keyvalue.value.media.MediaVideoEncodeType;
import dji.v5.common.callback.CommonCallbacks;
import dji.v5.common.utils.FetchCompleteCallback;
import dji.v5.manager.datacenter.media.MediaFileDownloadListener;
import dji.v5.utils.common.XMLUtil;
import java.io.ByteArrayOutputStream;
import java.io.Serializable;
import java.util.List;

public class MediaFile
implements Serializable {
    private final String TAG;
    private static final int ERROR_FILE_ALREADY_DOWNLOAD = -4116;
    private static final int ERROR_FILE_OFFSET_OUT_LIMIT = -7;
    private transient Bitmap thumbNail;
    private transient XMLUtil.MutablePair<String, String> XMPInfo;
    private boolean valid;
    private boolean isManualGroupFile;
    private int fileIndex;
    private MediaFileType fileType;
    private String fileName;
    private long fileSize;
    private transient DateTime date;
    private MediaFileStarTag starTag;
    private boolean isCloudDownload;
    private Long duration;
    CameraOrientation orientation;
    private VideoFrameRate frameRate;
    private VideoResolution resolution;
    private MediaVideoType videoType;
    private MediaPhotoType photoType;
    private CameraPanoType panoType;
    private MediaVideoEncodeType videoEncodeType;
    private int videoSpeedRatio;
    private int panoCount;
    private boolean hasOriginalFile;
    private long guid;
    private int fileGroupIndex;
    private int subIndex;
    private int segSubIndex;
    private int timeLapseInterval;
    private transient FileExifInfo EXIFInfo;
    private PhotoRatio photoRatio;
    private List<MediaFile> subMediaFile;
    private transient DCFInfo dcfInfo;
    private boolean isDcfSupported;
    private boolean isPageLastFile;
    private int dirIndex;
    private transient MediaFileDataTask downloadPreview;
    private transient MediaFileDataTask downloadThumbNail;
    private transient MediaFileDataTask downloadXMPCustomInfo;
    private transient MediaFileDataTask downloadFileTask;

    public boolean isValid() {
        return false;
    }

    public void setValid(boolean bl) {
    }

    public boolean isManualGroupFile() {
        return false;
    }

    public void setManualGroupFile(boolean bl) {
    }

    public int getFileIndex() {
        return 0;
    }

    public void setFileIndex(int n) {
    }

    public MediaFileType getFileType() {
        return null;
    }

    public void setFileType(MediaFileType mediaFileType) {
    }

    public String getFileName() {
        return null;
    }

    public void setFileName(String string2) {
    }

    public long getFileSize() {
        return 0L;
    }

    public void setFileSize(long l2) {
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

    public boolean isCloudDownload() {
        return false;
    }

    public void setCloudDownload(boolean bl) {
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

    public int getVideoSpeedRatio() {
        return 0;
    }

    public void setVideoSpeedRatio(int n) {
    }

    public int getPanoCount() {
        return 0;
    }

    public void setPanoCount(int n) {
    }

    public boolean isHasOriginalFile() {
        return false;
    }

    public void setHasOriginalFile(boolean bl) {
    }

    public long getGuid() {
        return 0L;
    }

    public void setGuid(long l2) {
    }

    public int getFileGroupIndex() {
        return 0;
    }

    public void setFileGroupIndex(int n) {
    }

    public int getSubIndex() {
        return 0;
    }

    public void setSubIndex(int n) {
    }

    public int getSegSubIndex() {
        return 0;
    }

    public void setSegSubIndex(int n) {
    }

    public int getTimeLapseInterval() {
        return 0;
    }

    public void setTimeLapseInterval(int n) {
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

    public boolean isDcfSupported() {
        return false;
    }

    public void setDcfSupported(boolean bl) {
    }

    public boolean isPageLastFile() {
        return false;
    }

    public void setPageLastFile(boolean bl) {
    }

    public int getDirIndex() {
        return 0;
    }

    public void setDirIndex(int n) {
    }

    public Bitmap getThumbNail() {
        return null;
    }

    public void setThumbNail(Bitmap bitmap) {
    }

    public void pullThumbnailFromCamera(CommonCallbacks.CompletionCallbackWithParam<Bitmap> completionCallbackWithParam) {
    }

    public void pullXMPFileDataFromCamera(CommonCallbacks.CompletionCallbackWithParam<String> completionCallbackWithParam) {
    }

    public String getXMPFileData() {
        return null;
    }

    public void pullXMPCustomInfoFromCamera(CommonCallbacks.CompletionCallbackWithParam<String> completionCallbackWithParam) {
    }

    public String getXMPCustomInfo() {
        return null;
    }

    public void pullPreviewFromCamera(@NonNull CommonCallbacks.CompletionCallbackWithParam<Bitmap> completionCallbackWithParam) {
    }

    public void stopPullPreviewFromCamera(@NonNull CommonCallbacks.CompletionCallback completionCallback) {
    }

    public void pullOriginalMediaFileFromCamera(long l2, @NonNull MediaFileDownloadListener mediaFileDownloadListener) {
    }

    public void stopPullOriginalMediaFileFromCamera(CommonCallbacks.CompletionCallback completionCallback) {
    }

    private void generatePost(FileDataType fileDataType, FetchCompleteCallback fetchCompleteCallback, CommonCallbacks.CompletionCallbackWithParam<ByteArrayOutputStream> completionCallbackWithParam) {
    }

    private MediaFileDataTask.IFileDataTaskHolder getDefaultDataHolder(FetchCompleteCallback fetchCompleteCallback, CommonCallbacks.CompletionCallbackWithParam<ByteArrayOutputStream> completionCallbackWithParam) {
        return null;
    }

    private void taskTransferAction(ByteArrayOutputStream byteArrayOutputStream, byte[] byArray) {
    }

    private void getFileData(long l2, MediaFileDownloadListener mediaFileDownloadListener) {
    }

    public boolean equals(Object object) {
        return false;
    }

    public int hashCode() {
        return 0;
    }

    protected MediaFileDataTask getDownloadPreview() {
        return null;
    }

    protected MediaFileDataTask getDownloadThumbNail() {
        return null;
    }

    protected MediaFileDataTask getDownloadXMPCustomInfo() {
        return null;
    }

    protected MediaFileDataTask getDownloadFileTask() {
        return null;
    }

    public void release() {
    }

    private static /* synthetic */ void lambda$stopPullOriginalMediaFileFromCamera$4(CommonCallbacks.CompletionCallback completionCallback, int n) {
    }

    private static /* synthetic */ void lambda$stopPullPreviewFromCamera$3(CommonCallbacks.CompletionCallback completionCallback, int n) {
    }

    private static /* synthetic */ void lambda$pullPreviewFromCamera$2() {
    }

    private static /* synthetic */ void lambda$pullXMPFileDataFromCamera$1() {
    }

    private static /* synthetic */ void lambda$pullThumbnailFromCamera$0() {
    }

    static /* synthetic */ Bitmap access$002(MediaFile mediaFile, Bitmap bitmap) {
        return null;
    }

    static /* synthetic */ XMLUtil.MutablePair access$102(MediaFile mediaFile, XMLUtil.MutablePair mutablePair) {
        return null;
    }

    static /* synthetic */ XMLUtil.MutablePair access$100(MediaFile mediaFile) {
        return null;
    }

    static /* synthetic */ String access$200(MediaFile mediaFile) {
        return null;
    }

    static /* synthetic */ void access$300(MediaFile mediaFile, ByteArrayOutputStream byteArrayOutputStream, byte[] byArray) {
    }
}

