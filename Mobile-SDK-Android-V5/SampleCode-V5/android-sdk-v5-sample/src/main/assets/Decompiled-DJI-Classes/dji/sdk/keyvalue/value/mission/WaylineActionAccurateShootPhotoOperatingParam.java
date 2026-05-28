/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.mission;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.mission.WaylineActionAccurateShootPhotoCameraStateInformation;
import dji.sdk.keyvalue.value.mission.WaylineActionAccurateShootPhotoDeviceInformation;
import dji.sdk.keyvalue.value.mission.WaylineActionAccurateShootPhotoFileInformation;
import dji.sdk.keyvalue.value.mission.WaylineActionAccurateShootPhotoGimbalStateInformation;
import dji.sdk.keyvalue.value.mission.WaylineActionAccurateShootPhotoTargetRect;
import dji.sdk.keyvalue.value.mission.WaylineActionAccurateShootSize;
import dji.sdk.keyvalue.value.mission.WaylineWaypointYawPathMode;
import org.json.JSONObject;

public class WaylineActionAccurateShootPhotoOperatingParam
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Boolean isFrameValid;
    WaylineActionAccurateShootPhotoTargetRect target_rect;
    WaylineActionAccurateShootSize image_size;
    WaylineActionAccurateShootPhotoCameraStateInformation camera_infos;
    WaylineActionAccurateShootPhotoGimbalStateInformation gimbal_infos;
    WaylineActionAccurateShootPhotoDeviceInformation device_infos;
    WaylineActionAccurateShootPhotoFileInformation file_infos;
    Double heading;
    WaylineWaypointYawPathMode pathMode;

    public WaylineActionAccurateShootPhotoOperatingParam() {
    }

    public WaylineActionAccurateShootPhotoOperatingParam(Boolean bl, WaylineActionAccurateShootPhotoTargetRect waylineActionAccurateShootPhotoTargetRect, WaylineActionAccurateShootSize waylineActionAccurateShootSize, WaylineActionAccurateShootPhotoCameraStateInformation waylineActionAccurateShootPhotoCameraStateInformation, WaylineActionAccurateShootPhotoGimbalStateInformation waylineActionAccurateShootPhotoGimbalStateInformation, WaylineActionAccurateShootPhotoDeviceInformation waylineActionAccurateShootPhotoDeviceInformation, WaylineActionAccurateShootPhotoFileInformation waylineActionAccurateShootPhotoFileInformation, Double d2, WaylineWaypointYawPathMode waylineWaypointYawPathMode) {
    }

    public static WaylineActionAccurateShootPhotoOperatingParam fromJson(String string) {
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

    public Boolean getIsFrameValid() {
        return null;
    }

    public void setIsFrameValid(Boolean bl) {
    }

    public WaylineActionAccurateShootPhotoTargetRect getTarget_rect() {
        return null;
    }

    public void setTarget_rect(WaylineActionAccurateShootPhotoTargetRect waylineActionAccurateShootPhotoTargetRect) {
    }

    public WaylineActionAccurateShootSize getImage_size() {
        return null;
    }

    public void setImage_size(WaylineActionAccurateShootSize waylineActionAccurateShootSize) {
    }

    public WaylineActionAccurateShootPhotoCameraStateInformation getCamera_infos() {
        return null;
    }

    public void setCamera_infos(WaylineActionAccurateShootPhotoCameraStateInformation waylineActionAccurateShootPhotoCameraStateInformation) {
    }

    public WaylineActionAccurateShootPhotoGimbalStateInformation getGimbal_infos() {
        return null;
    }

    public void setGimbal_infos(WaylineActionAccurateShootPhotoGimbalStateInformation waylineActionAccurateShootPhotoGimbalStateInformation) {
    }

    public WaylineActionAccurateShootPhotoDeviceInformation getDevice_infos() {
        return null;
    }

    public void setDevice_infos(WaylineActionAccurateShootPhotoDeviceInformation waylineActionAccurateShootPhotoDeviceInformation) {
    }

    public WaylineActionAccurateShootPhotoFileInformation getFile_infos() {
        return null;
    }

    public void setFile_infos(WaylineActionAccurateShootPhotoFileInformation waylineActionAccurateShootPhotoFileInformation) {
    }

    public Double getHeading() {
        return null;
    }

    public void setHeading(Double d2) {
    }

    public WaylineWaypointYawPathMode getPathMode() {
        return null;
    }

    public void setPathMode(WaylineWaypointYawPathMode waylineWaypointYawPathMode) {
    }

    public String toString() {
        return null;
    }
}

