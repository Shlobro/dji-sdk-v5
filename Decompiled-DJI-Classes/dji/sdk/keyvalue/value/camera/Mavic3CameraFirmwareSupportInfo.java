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
import dji.sdk.keyvalue.value.camera.ExploreModeSupportInfo;
import org.json.JSONObject;

public class Mavic3CameraFirmwareSupportInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Boolean m43DZoomSupported;
    Boolean unlimitShootingSupported;
    Boolean timelapseInAllModeSupported;
    Boolean dollyZoomSupported;
    Boolean panoramaSupported;
    Boolean slowmotionSupported;
    Boolean AEBSupported;
    ExploreModeSupportInfo exploreModeSupportInfo;

    public Mavic3CameraFirmwareSupportInfo() {
    }

    public Mavic3CameraFirmwareSupportInfo(Boolean bl, Boolean bl2, Boolean bl3, Boolean bl4, Boolean bl5, Boolean bl6, Boolean bl7, ExploreModeSupportInfo exploreModeSupportInfo) {
    }

    public static Mavic3CameraFirmwareSupportInfo fromJson(String string) {
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

    public Boolean getM43DZoomSupported() {
        return null;
    }

    public void setM43DZoomSupported(Boolean bl) {
    }

    public Boolean getUnlimitShootingSupported() {
        return null;
    }

    public void setUnlimitShootingSupported(Boolean bl) {
    }

    public Boolean getTimelapseInAllModeSupported() {
        return null;
    }

    public void setTimelapseInAllModeSupported(Boolean bl) {
    }

    public Boolean getDollyZoomSupported() {
        return null;
    }

    public void setDollyZoomSupported(Boolean bl) {
    }

    public Boolean getPanoramaSupported() {
        return null;
    }

    public void setPanoramaSupported(Boolean bl) {
    }

    public Boolean getSlowmotionSupported() {
        return null;
    }

    public void setSlowmotionSupported(Boolean bl) {
    }

    public Boolean getAEBSupported() {
        return null;
    }

    public void setAEBSupported(Boolean bl) {
    }

    public ExploreModeSupportInfo getExploreModeSupportInfo() {
        return null;
    }

    public void setExploreModeSupportInfo(ExploreModeSupportInfo exploreModeSupportInfo) {
    }

    public String toString() {
        return null;
    }
}

