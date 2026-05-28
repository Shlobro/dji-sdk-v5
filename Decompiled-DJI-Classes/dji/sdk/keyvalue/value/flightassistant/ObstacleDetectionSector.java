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
import dji.sdk.keyvalue.value.flightassistant.ObstacleDetectionSectorWarning;
import org.json.JSONObject;

public class ObstacleDetectionSector
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    ObstacleDetectionSectorWarning warningLevel;
    Double obstacleDistanceInMeters;

    public ObstacleDetectionSector() {
    }

    public ObstacleDetectionSector(ObstacleDetectionSectorWarning obstacleDetectionSectorWarning, Double d2) {
    }

    public static ObstacleDetectionSector fromJson(String string) {
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

    public ObstacleDetectionSectorWarning getWarningLevel() {
        return null;
    }

    public void setWarningLevel(ObstacleDetectionSectorWarning obstacleDetectionSectorWarning) {
    }

    public Double getObstacleDistanceInMeters() {
        return null;
    }

    public void setObstacleDistanceInMeters(Double d2) {
    }

    public String toString() {
        return null;
    }
}

