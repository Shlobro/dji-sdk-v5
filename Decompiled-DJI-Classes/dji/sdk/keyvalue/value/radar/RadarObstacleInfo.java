/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.radar;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.radar.MGRaderObstacleDirection;
import org.json.JSONObject;

public class RadarObstacleInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Boolean isValid;
    MGRaderObstacleDirection direction;
    Integer yaw;
    Integer pitch;
    Integer distance;

    public RadarObstacleInfo() {
    }

    public RadarObstacleInfo(Boolean bl, MGRaderObstacleDirection mGRaderObstacleDirection, Integer n, Integer n2, Integer n3) {
    }

    public static RadarObstacleInfo fromJson(String string) {
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

    public Boolean getIsValid() {
        return null;
    }

    public void setIsValid(Boolean bl) {
    }

    public MGRaderObstacleDirection getDirection() {
        return null;
    }

    public void setDirection(MGRaderObstacleDirection mGRaderObstacleDirection) {
    }

    public Integer getYaw() {
        return null;
    }

    public void setYaw(Integer n) {
    }

    public Integer getPitch() {
        return null;
    }

    public void setPitch(Integer n) {
    }

    public Integer getDistance() {
        return null;
    }

    public void setDistance(Integer n) {
    }

    public String toString() {
        return null;
    }
}

