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
import dji.sdk.keyvalue.value.camera.CameraCType;
import dji.sdk.keyvalue.value.camera.DateTime;
import dji.sdk.keyvalue.value.camera.MediaFileType;
import dji.sdk.keyvalue.value.cloudaccess.CloudMediaUploadState;
import dji.sdk.keyvalue.value.cloudaccess.FileUploadActionType;
import dji.sdk.keyvalue.value.common.ComponentIndexType;
import dji.sdk.keyvalue.value.file.FileDataType;
import dji.sdk.keyvalue.value.file.FileTaskPriority;
import dji.sdk.keyvalue.value.payload.PayloadCameraType;
import dji.sdk.keyvalue.value.product.ProductType;
import org.json.JSONObject;

public class FileUploadRequest
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    FileTaskPriority priority;
    FileDataType type;
    MediaFileType mediaFileType;
    String storage_path;
    String file_name;
    Long media_index;
    CloudMediaUploadState upload_state;
    Double latitude;
    Double longitude;
    String task_name;
    String line_name;
    ComponentIndexType camera_index;
    String prj_uuid;
    String folder_name;
    String cloudFileName;
    DateTime createTime;
    Long fileSize;
    String tag;
    ProductType productType;
    CameraCType cameraType;
    PayloadCameraType payloadCameraType;
    Integer folderIndex;
    Boolean hasTag;
    String postParamsJson;
    String flight_id;
    FileUploadActionType action_type;

    public FileUploadRequest() {
    }

    public FileUploadRequest(FileTaskPriority fileTaskPriority, FileDataType fileDataType, MediaFileType mediaFileType, String string, String string2, Long l2, CloudMediaUploadState cloudMediaUploadState, Double d2, Double d3, String string3, String string4, ComponentIndexType componentIndexType, String string5, String string6, String string7, DateTime dateTime, Long l3, String string8, ProductType productType, CameraCType cameraCType, PayloadCameraType payloadCameraType, Integer n, Boolean bl, String string9, String string10, FileUploadActionType fileUploadActionType) {
    }

    public static FileUploadRequest fromJson(String string) {
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

    public FileTaskPriority getPriority() {
        return null;
    }

    public void setPriority(FileTaskPriority fileTaskPriority) {
    }

    public FileDataType getType() {
        return null;
    }

    public void setType(FileDataType fileDataType) {
    }

    public MediaFileType getMediaFileType() {
        return null;
    }

    public void setMediaFileType(MediaFileType mediaFileType) {
    }

    public String getStorage_path() {
        return null;
    }

    public void setStorage_path(String string) {
    }

    public String getFile_name() {
        return null;
    }

    public void setFile_name(String string) {
    }

    public Long getMedia_index() {
        return null;
    }

    public void setMedia_index(Long l2) {
    }

    public CloudMediaUploadState getUpload_state() {
        return null;
    }

    public void setUpload_state(CloudMediaUploadState cloudMediaUploadState) {
    }

    public Double getLatitude() {
        return null;
    }

    public void setLatitude(Double d2) {
    }

    public Double getLongitude() {
        return null;
    }

    public void setLongitude(Double d2) {
    }

    public String getTask_name() {
        return null;
    }

    public void setTask_name(String string) {
    }

    public String getLine_name() {
        return null;
    }

    public void setLine_name(String string) {
    }

    public ComponentIndexType getCamera_index() {
        return null;
    }

    public void setCamera_index(ComponentIndexType componentIndexType) {
    }

    public String getPrj_uuid() {
        return null;
    }

    public void setPrj_uuid(String string) {
    }

    public String getFolder_name() {
        return null;
    }

    public void setFolder_name(String string) {
    }

    public String getCloudFileName() {
        return null;
    }

    public void setCloudFileName(String string) {
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

    public String getTag() {
        return null;
    }

    public void setTag(String string) {
    }

    public ProductType getProductType() {
        return null;
    }

    public void setProductType(ProductType productType) {
    }

    public CameraCType getCameraType() {
        return null;
    }

    public void setCameraType(CameraCType cameraCType) {
    }

    public PayloadCameraType getPayloadCameraType() {
        return null;
    }

    public void setPayloadCameraType(PayloadCameraType payloadCameraType) {
    }

    public Integer getFolderIndex() {
        return null;
    }

    public void setFolderIndex(Integer n) {
    }

    public Boolean getHasTag() {
        return null;
    }

    public void setHasTag(Boolean bl) {
    }

    public String getPostParamsJson() {
        return null;
    }

    public void setPostParamsJson(String string) {
    }

    public String getFlight_id() {
        return null;
    }

    public void setFlight_id(String string) {
    }

    public FileUploadActionType getAction_type() {
        return null;
    }

    public void setAction_type(FileUploadActionType fileUploadActionType) {
    }

    public String toString() {
        return null;
    }
}

