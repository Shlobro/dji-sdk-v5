/*
 * Decompiled with CFR 0.152.
 */
package com.dji.wpmzsdk.common.utils.kml.model;

import com.dji.wpmzsdk.common.utils.kml.model.CameraType;
import com.dji.wpmzsdk.common.utils.kml.model.PayloadCameraType;
import com.dji.wpmzsdk.common.utils.kml.model.PayloadConfigInfoModel;
import com.dji.wpmzsdk.common.utils.kml.model.PayloadInfoModel;
import dji.sdk.wpmz.value.mission.CameraLensType;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class DroneCameraModel
implements Cloneable {
    private int cameraIndex;
    private int cameraType;
    private String cameraName;
    private int payloadCameraType;
    private PayloadInfoModel payloadInfo;
    private PayloadConfigInfoModel payloadConfigInfo;
    private Set<CameraLensType> photoTypes;

    public int getCameraIndex() {
        return this.cameraIndex;
    }

    public void setCameraIndex(int cameraIndex) {
        this.cameraIndex = cameraIndex;
    }

    public int getCameraType() {
        return this.cameraType;
    }

    public void setCameraType(int cameraType) {
        this.cameraType = cameraType;
    }

    public String getCameraName() {
        if (this.payloadInfo != null && this.payloadInfo.getName() != null) {
            return this.payloadInfo.getName();
        }
        return this.cameraName;
    }

    public void setCameraName(String cameraName) {
        this.cameraName = cameraName;
    }

    public PayloadInfoModel getPayloadInfo() {
        return this.payloadInfo;
    }

    public void setPayloadInfo(PayloadInfoModel payloadInfo) {
        this.payloadInfo = payloadInfo;
    }

    public int getPayloadCameraType() {
        return this.payloadCameraType;
    }

    public void setPayloadCameraType(int payloadCameraType) {
        this.payloadCameraType = payloadCameraType;
    }

    public PayloadConfigInfoModel getPayloadConfigInfo() {
        return this.payloadConfigInfo;
    }

    public void setPayloadConfigInfo(PayloadConfigInfoModel payloadConfigInfo) {
        this.payloadConfigInfo = payloadConfigInfo;
    }

    public boolean isEP800Camera() {
        return this.payloadCameraType == PayloadCameraType.EP800.value();
    }

    public boolean isPSDKCamera() {
        return this.cameraType == CameraType.Payload.value() && this.payloadCameraType == PayloadCameraType.UNKNOWN.value();
    }

    public Set<CameraLensType> getPhotoTypes() {
        return this.photoTypes;
    }

    public void setPhotoTypes(Set<CameraLensType> photoTypes) {
        this.photoTypes = photoTypes;
    }

    public DroneCameraModel clone() {
        DroneCameraModel model = null;
        try {
            model = (DroneCameraModel)super.clone();
            if (this.payloadConfigInfo != null) {
                model.payloadConfigInfo = this.payloadConfigInfo.clone();
            }
            if (this.photoTypes != null) {
                model.photoTypes = new HashSet<CameraLensType>(this.photoTypes);
            }
        }
        catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return model;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        DroneCameraModel that = (DroneCameraModel)o;
        return this.cameraIndex == that.cameraIndex && this.cameraType == that.cameraType && this.payloadCameraType == that.payloadCameraType && Objects.equals(this.cameraName, that.cameraName) && Objects.equals(this.payloadConfigInfo, that.payloadConfigInfo) && Objects.equals(this.photoTypes, that.photoTypes);
    }

    public int hashCode() {
        return Objects.hash(this.cameraIndex, this.cameraType, this.cameraName, this.payloadCameraType, this.payloadConfigInfo, this.photoTypes);
    }
}

