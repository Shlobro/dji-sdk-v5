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
import dji.sdk.keyvalue.value.flightassistant.ObstacleDetectionSector;
import dji.sdk.keyvalue.value.flightassistant.VisionSensorPosition;
import dji.sdk.keyvalue.value.flightassistant.VisionSystemWarning;
import java.util.List;
import org.json.JSONObject;

public class VisionDetectionState
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Boolean isSensorBeingUsed;
    VisionSystemWarning systemWarning;
    VisionSensorPosition position;
    Double obstacleDistanceInMeters;
    List<ObstacleDetectionSector> detectionSectors;

    public VisionDetectionState() {
    }

    public VisionDetectionState(Boolean bl, VisionSystemWarning visionSystemWarning, VisionSensorPosition visionSensorPosition, Double d2, List<ObstacleDetectionSector> list) {
    }

    public static VisionDetectionState fromJson(String string) {
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

    public Boolean getIsSensorBeingUsed() {
        return null;
    }

    public void setIsSensorBeingUsed(Boolean bl) {
    }

    public VisionSystemWarning getSystemWarning() {
        return null;
    }

    public void setSystemWarning(VisionSystemWarning visionSystemWarning) {
    }

    public VisionSensorPosition getPosition() {
        return null;
    }

    public void setPosition(VisionSensorPosition visionSensorPosition) {
    }

    public Double getObstacleDistanceInMeters() {
        return null;
    }

    public void setObstacleDistanceInMeters(Double d2) {
    }

    public List<ObstacleDetectionSector> getDetectionSectors() {
        return null;
    }

    public void setDetectionSectors(List<ObstacleDetectionSector> list) {
    }

    public String toString() {
        return null;
    }
}

