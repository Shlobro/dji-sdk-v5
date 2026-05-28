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
import dji.sdk.keyvalue.value.cloudaccess.CloudMediaType;
import dji.sdk.keyvalue.value.cloudaccess.CloudMediaUploadType;
import org.json.JSONObject;

public class CloudMediaUploadConfig
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    String orgUUID;
    String prjUUID;
    String prjName;
    Boolean isAutoUploadImage;
    CloudMediaUploadType uploadType;
    Boolean isAutoUploadVideo;
    String authToken;
    String userName;
    String autoUploadStoragePath;
    Integer retryCount;
    Integer retryDelayInMillisecond;
    CloudMediaType cloudType;
    String cloudAddress;
    Boolean isCloudSpaceFull;

    public CloudMediaUploadConfig() {
    }

    public CloudMediaUploadConfig(String string, String string2, String string3, Boolean bl, CloudMediaUploadType cloudMediaUploadType, Boolean bl2, String string4, String string5, String string6, Integer n, Integer n2, CloudMediaType cloudMediaType, String string7, Boolean bl3) {
    }

    public static CloudMediaUploadConfig fromJson(String string) {
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

    public String getOrgUUID() {
        return null;
    }

    public void setOrgUUID(String string) {
    }

    public String getPrjUUID() {
        return null;
    }

    public void setPrjUUID(String string) {
    }

    public String getPrjName() {
        return null;
    }

    public void setPrjName(String string) {
    }

    public Boolean getIsAutoUploadImage() {
        return null;
    }

    public void setIsAutoUploadImage(Boolean bl) {
    }

    public CloudMediaUploadType getUploadType() {
        return null;
    }

    public void setUploadType(CloudMediaUploadType cloudMediaUploadType) {
    }

    public Boolean getIsAutoUploadVideo() {
        return null;
    }

    public void setIsAutoUploadVideo(Boolean bl) {
    }

    public String getAuthToken() {
        return null;
    }

    public void setAuthToken(String string) {
    }

    public String getUserName() {
        return null;
    }

    public void setUserName(String string) {
    }

    public String getAutoUploadStoragePath() {
        return null;
    }

    public void setAutoUploadStoragePath(String string) {
    }

    public Integer getRetryCount() {
        return null;
    }

    public void setRetryCount(Integer n) {
    }

    public Integer getRetryDelayInMillisecond() {
        return null;
    }

    public void setRetryDelayInMillisecond(Integer n) {
    }

    public CloudMediaType getCloudType() {
        return null;
    }

    public void setCloudType(CloudMediaType cloudMediaType) {
    }

    public String getCloudAddress() {
        return null;
    }

    public void setCloudAddress(String string) {
    }

    public Boolean getIsCloudSpaceFull() {
        return null;
    }

    public void setIsCloudSpaceFull(Boolean bl) {
    }

    public String toString() {
        return null;
    }
}

