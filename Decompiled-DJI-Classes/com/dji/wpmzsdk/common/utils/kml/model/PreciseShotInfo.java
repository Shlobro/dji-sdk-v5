/*
 * Decompiled with CFR 0.152.
 */
package com.dji.wpmzsdk.common.utils.kml.model;

public class PreciseShotInfo {
    private int imageWidth;
    private int imageHeight;
    private float cropPosX;
    private float cropPosY;
    private float cropWidth;
    private float cropHeight;
    private float cropAngle;
    private double focalDistance;
    private int afPosition;
    private float gimbalPitch;
    private float gimbalRoll;
    private float gimbalYaw;
    private int cameraType;
    private int cameraIndex;
    private int gimbalPort;
    private long fileSize;
    private String cacheFilePath;
    private String cacheFileName;
    private float droneYaw;
    private int fileIndex;
    private String fileMD5;
    private String uuid;
    private Integer apertureSize;
    private Double shutterSpeed;
    private Integer isoParam;
    private Integer exposureCompensation;
    private Integer luminance;
    private Integer objectFocusDistance;
    private PhotoMode photoMode;

    public float getDroneYaw() {
        return this.droneYaw;
    }

    public void setDroneYaw(float droneYaw) {
        this.droneYaw = droneYaw;
    }

    public String getCacheFilePath() {
        return this.cacheFilePath;
    }

    public void setCacheFilePath(String cacheFilePath) {
        this.cacheFilePath = cacheFilePath;
    }

    public String getCacheFileName() {
        return this.cacheFileName;
    }

    public void setCacheFileName(String cacheFileName) {
        this.cacheFileName = cacheFileName;
    }

    public int getImageWidth() {
        return this.imageWidth;
    }

    public void setImageWidth(int imageWidth) {
        this.imageWidth = imageWidth;
    }

    public int getImageHeight() {
        return this.imageHeight;
    }

    public void setImageHeight(int imageHeight) {
        this.imageHeight = imageHeight;
    }

    public float getCropPosX() {
        return this.cropPosX;
    }

    public void setCropPosX(float cropPosX) {
        this.cropPosX = cropPosX;
    }

    public float getCropPosY() {
        return this.cropPosY;
    }

    public void setCropPosY(float cropPosY) {
        this.cropPosY = cropPosY;
    }

    public float getCropWidth() {
        return this.cropWidth;
    }

    public void setCropWidth(float cropWidth) {
        this.cropWidth = cropWidth;
    }

    public float getCropHeight() {
        return this.cropHeight;
    }

    public void setCropHeight(float cropHeight) {
        this.cropHeight = cropHeight;
    }

    public double getFocalDistance() {
        return this.focalDistance;
    }

    public void setFocalDistance(double focalDistance) {
        this.focalDistance = focalDistance;
    }

    public int getAfPosition() {
        return this.afPosition;
    }

    public void setAfPosition(int afPosition) {
        this.afPosition = afPosition;
    }

    public float getGimbalPitch() {
        return this.gimbalPitch;
    }

    public void setGimbalPitch(float gimbalPitch) {
        this.gimbalPitch = gimbalPitch;
    }

    public float getGimbalRoll() {
        return this.gimbalRoll;
    }

    public void setGimbalRoll(float gimbalRoll) {
        this.gimbalRoll = gimbalRoll;
    }

    public float getGimbalYaw() {
        return this.gimbalYaw;
    }

    public void setGimbalYaw(float gimbalYaw) {
        this.gimbalYaw = gimbalYaw;
    }

    public int getCameraType() {
        return this.cameraType;
    }

    public void setCameraType(int cameraType) {
        this.cameraType = cameraType;
    }

    public int getGimbalPort() {
        return this.gimbalPort;
    }

    public void setGimbalPort(int gimbalPort) {
        this.gimbalPort = gimbalPort;
    }

    public long getFileSize() {
        return this.fileSize;
    }

    public void setFileSize(long fileSize) {
        this.fileSize = fileSize;
    }

    public int getCameraIndex() {
        return this.cameraIndex;
    }

    public void setCameraIndex(int cameraIndex) {
        this.cameraIndex = cameraIndex;
    }

    public float getCropAngle() {
        return this.cropAngle;
    }

    public void setCropAngle(float cropAngle) {
        this.cropAngle = cropAngle;
    }

    public int getFileIndex() {
        return this.fileIndex;
    }

    public void setFileIndex(int fileIndex) {
        this.fileIndex = fileIndex;
    }

    public String getFileMD5() {
        return this.fileMD5;
    }

    public void setFileMD5(String fileMD5) {
        this.fileMD5 = fileMD5;
    }

    public String getUuid() {
        return this.uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Integer getApertureSize() {
        return this.apertureSize;
    }

    public void setApertureSize(Integer apertureSize) {
        this.apertureSize = apertureSize;
    }

    public Double getShutterSpeed() {
        return this.shutterSpeed;
    }

    public void setShutterSpeed(Double shutterSpeed) {
        this.shutterSpeed = shutterSpeed;
    }

    public Integer getIsoParam() {
        return this.isoParam;
    }

    public void setIsoParam(Integer isoParam) {
        this.isoParam = isoParam;
    }

    public Integer getExposureCompensation() {
        return this.exposureCompensation;
    }

    public void setExposureCompensation(Integer exposureCompensation) {
        this.exposureCompensation = exposureCompensation;
    }

    public Integer getLuminance() {
        return this.luminance;
    }

    public void setLuminance(Integer luminance) {
        this.luminance = luminance;
    }

    public Integer getObjectFocusDistance() {
        return this.objectFocusDistance;
    }

    public void setObjectFocusDistance(Integer objectFocusDistance) {
        this.objectFocusDistance = objectFocusDistance;
    }

    public PhotoMode getPhotoMode() {
        return this.photoMode;
    }

    public void setPhotoMode(PhotoMode photoMode) {
        this.photoMode = photoMode;
    }

    public boolean isFrameValid() {
        return this.cropWidth > 0.0f && this.cropHeight > 0.0f;
    }

    public static enum PhotoMode {
        NORMAL,
        LOW_LIGHT_SMART;

    }
}

