/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.flightassistant;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.flightassistant.PanoControlAction;
import dji.sdk.keyvalue.value.flightassistant.PanoImageInfo;
import java.util.List;
import org.json.JSONObject;

public class PanoImageMissionInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer missionID;
    PanoControlAction panoMode;
    List<PanoImageInfo> imageInfo;

    public PanoImageMissionInfo() {
    }

    public PanoImageMissionInfo(Integer n, PanoControlAction panoControlAction, List<PanoImageInfo> list) {
    }

    public static PanoImageMissionInfo fromJson(String string) {
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

    public Integer getMissionID() {
        return null;
    }

    public void setMissionID(Integer n) {
    }

    public PanoControlAction getPanoMode() {
        return null;
    }

    public void setPanoMode(PanoControlAction panoControlAction) {
    }

    public List<PanoImageInfo> getImageInfo() {
        return null;
    }

    public void setImageInfo(List<PanoImageInfo> list) {
    }

    public String toString() {
        return null;
    }
}

