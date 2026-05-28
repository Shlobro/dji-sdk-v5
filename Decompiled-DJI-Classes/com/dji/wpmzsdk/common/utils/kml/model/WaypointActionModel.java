/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 */
package com.dji.wpmzsdk.common.utils.kml.model;

import android.os.Parcel;
import com.dji.wpmzsdk.common.utils.kml.model.PreciseShotInfo;
import com.dji.wpmzsdk.common.utils.kml.model.WaypointActionType;
import dji.sdk.wpmz.value.mission.ActionMegaphoneParam;
import dji.sdk.wpmz.value.mission.ActionSearchlightParam;
import dji.sdk.wpmz.value.mission.CameraLensType;
import java.util.Objects;
import java.util.Set;

public class WaypointActionModel
implements Cloneable {
    private Long id;
    private int index;
    private WaypointActionType actionType;
    private int param;
    private int accuracy;
    private int cameraIndex;
    private int payloadType;
    private int payloadIndex;
    private String mediaPathName;
    private boolean followPhotoType;
    private Set<CameraLensType> photoTypes;
    private PreciseShotInfo preciseShotInfo;
    private ActionMegaphoneParam megaphoneParam;
    private ActionSearchlightParam searchlightParam;

    public ActionMegaphoneParam getMegaphoneParam() {
        return this.megaphoneParam;
    }

    public void setMegaphoneParam(ActionMegaphoneParam megaphoneParam) {
        this.megaphoneParam = megaphoneParam;
    }

    public ActionSearchlightParam getSearchlightParam() {
        return this.searchlightParam;
    }

    public void setSearchlightParam(ActionSearchlightParam searchlightParam) {
        this.searchlightParam = searchlightParam;
    }

    public boolean isFollowPhotoType() {
        return this.followPhotoType;
    }

    public void setFollowPhotoType(boolean followPhotoType) {
        this.followPhotoType = followPhotoType;
    }

    public Set<CameraLensType> getPhotoTypes() {
        return this.photoTypes;
    }

    public void setPhotoTypes(Set<CameraLensType> photoTypes) {
        this.photoTypes = photoTypes;
    }

    public String getMediaPathName() {
        return this.mediaPathName;
    }

    public void setMediaPathName(String mediaPathName) {
        this.mediaPathName = mediaPathName;
    }

    public int getCameraIndex() {
        return this.cameraIndex;
    }

    public void setCameraIndex(int cameraIndex) {
        this.cameraIndex = cameraIndex;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getIndex() {
        return this.index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public WaypointActionType getActionType() {
        return this.actionType;
    }

    public void setActionType(WaypointActionType actionType) {
        this.actionType = actionType;
    }

    public int getParam() {
        return this.param;
    }

    public void setParam(int param) {
        this.param = param;
    }

    public int getPayloadType() {
        return this.payloadType;
    }

    public void setPayloadType(int payloadType) {
        this.payloadType = payloadType;
    }

    public int getPayloadIndex() {
        return this.payloadIndex;
    }

    public void setPayloadIndex(int payloadIndex) {
        this.payloadIndex = payloadIndex;
    }

    public int getAccuracy() {
        return this.accuracy;
    }

    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }

    public float getRealParam() {
        if (this.accuracy != 0) {
            return (float)((double)this.param / Math.pow(10.0, this.accuracy));
        }
        return this.param;
    }

    public boolean isPreciseShotAction() {
        return this.actionType == WaypointActionType.PRECISE_SHOT || this.actionType == WaypointActionType.NORMAL_PRECISE_SHOT || this.actionType == WaypointActionType.ORIENTED_SHOT;
    }

    public PreciseShotInfo getPreciseShotInfo() {
        return this.preciseShotInfo;
    }

    public void setPreciseShotInfo(PreciseShotInfo preciseShotInfo) {
        this.preciseShotInfo = preciseShotInfo;
    }

    public WaypointActionModel clone() {
        WaypointActionModel model = null;
        try {
            model = (WaypointActionModel)super.clone();
        }
        catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return model;
    }

    public WaypointActionModel() {
    }

    protected WaypointActionModel(Parcel in) {
        this.id = (Long)in.readValue(Long.class.getClassLoader());
        this.index = in.readInt();
        int tmpActionType = in.readInt();
        this.actionType = tmpActionType == -1 ? null : WaypointActionType.values()[tmpActionType];
        this.param = in.readInt();
        this.cameraIndex = in.readInt();
        this.payloadIndex = in.readInt();
        this.payloadType = in.readInt();
        this.accuracy = in.readInt();
        this.mediaPathName = in.readString();
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        WaypointActionModel that = (WaypointActionModel)o;
        if (this.index != that.index) {
            return false;
        }
        if (this.param != that.param) {
            return false;
        }
        if (this.id != null ? !this.id.equals(that.id) : that.id != null) {
            return false;
        }
        if (this.cameraIndex != that.cameraIndex) {
            return false;
        }
        if (this.payloadIndex != that.payloadIndex) {
            return false;
        }
        if (this.payloadType != that.payloadType) {
            return false;
        }
        if (this.accuracy != that.accuracy) {
            return false;
        }
        if (!Objects.equals(this.mediaPathName, that.mediaPathName)) {
            return false;
        }
        return this.actionType == that.actionType;
    }

    public int hashCode() {
        int result = this.id != null ? this.id.hashCode() : 0;
        result = 31 * result + this.index;
        result = 31 * result + (this.actionType != null ? this.actionType.hashCode() : 0);
        result = 31 * result + this.param;
        result = 31 * result + this.cameraIndex;
        result = 31 * result + this.payloadIndex;
        result = 31 * result + this.payloadType;
        result = 31 * result + this.accuracy;
        result = 31 * result + (this.mediaPathName != null ? this.mediaPathName.hashCode() : 0);
        return result;
    }

    public String toString() {
        return "WaypointActionModel{id=" + this.id + ", index=" + this.index + ", actionType=" + (Object)((Object)this.actionType) + ", param=" + this.param + ", accuracy=" + this.accuracy + ", cameraIndex=" + this.cameraIndex + ", payloadType=" + this.payloadType + ", payloadIndex=" + this.payloadIndex + ", mediaPathName='" + this.mediaPathName + '\'' + ", followPhotoType=" + this.followPhotoType + ", photoTypes=" + this.photoTypes + ", preciseShotInfo=" + this.preciseShotInfo + '}';
    }
}

