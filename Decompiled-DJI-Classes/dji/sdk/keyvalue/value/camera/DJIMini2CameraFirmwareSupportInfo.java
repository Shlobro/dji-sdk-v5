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
import org.json.JSONObject;

public class DJIMini2CameraFirmwareSupportInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Boolean albumCollectSupported;
    Boolean AEBAndTimingGroupSupported;
    Boolean closeAntiFlickSupported;
    Boolean trimmedDownloadSuported;
    Boolean fileListGroupFetchSupported;

    public DJIMini2CameraFirmwareSupportInfo() {
    }

    public DJIMini2CameraFirmwareSupportInfo(Boolean bl, Boolean bl2, Boolean bl3, Boolean bl4, Boolean bl5) {
    }

    public static DJIMini2CameraFirmwareSupportInfo fromJson(String string) {
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

    public Boolean getAlbumCollectSupported() {
        return null;
    }

    public void setAlbumCollectSupported(Boolean bl) {
    }

    public Boolean getAEBAndTimingGroupSupported() {
        return null;
    }

    public void setAEBAndTimingGroupSupported(Boolean bl) {
    }

    public Boolean getCloseAntiFlickSupported() {
        return null;
    }

    public void setCloseAntiFlickSupported(Boolean bl) {
    }

    public Boolean getTrimmedDownloadSuported() {
        return null;
    }

    public void setTrimmedDownloadSuported(Boolean bl) {
    }

    public Boolean getFileListGroupFetchSupported() {
        return null;
    }

    public void setFileListGroupFetchSupported(Boolean bl) {
    }

    public String toString() {
        return null;
    }
}

