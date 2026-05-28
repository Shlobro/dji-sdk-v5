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
import dji.sdk.keyvalue.value.mission.TrackingDetectedFace;
import java.util.List;
import org.json.JSONObject;

public class TrackingDetectingFaceInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Boolean starting;
    List<TrackingDetectedFace> faces;

    public TrackingDetectingFaceInfo() {
    }

    public TrackingDetectingFaceInfo(Boolean bl, List<TrackingDetectedFace> list) {
    }

    public static TrackingDetectingFaceInfo fromJson(String string) {
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

    public Boolean getStarting() {
        return null;
    }

    public void setStarting(Boolean bl) {
    }

    public List<TrackingDetectedFace> getFaces() {
        return null;
    }

    public void setFaces(List<TrackingDetectedFace> list) {
    }

    public String toString() {
        return null;
    }
}

