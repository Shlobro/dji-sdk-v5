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
import org.json.JSONObject;

public class OmnidirectionalObstacleAvoidanceStatus
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Boolean isUpObstacleAvoidanceWorking;
    Boolean isLeftObstacleAvoidanceWorking;
    Boolean isRightObstacleAvoidanceWorking;
    Boolean isBackObstacleAvoidanceWorking;
    Boolean isFrontObstacleAvoidanceWorking;
    Boolean isDownObstacleAvoidanceWorking;
    Boolean isVerticalObstacleAvoidanceWorking;
    Boolean isHorizontalObstacleAvoidanceWorking;
    Boolean isUpObstacleAvoidanceEnable;
    Boolean isLeftObstacleAvoidanceEnable;
    Boolean isRightObstacleAvoidanceEnable;
    Boolean isBackObstacleAvoidanceEnable;
    Boolean isFrontObstacleAvoidanceEnable;
    Boolean isDownObstacleAvoidanceEnable;
    Boolean isVerticalObstacleAvoidanceEnable;
    Boolean isHorizontalObstacleAvoidanceEnable;

    public OmnidirectionalObstacleAvoidanceStatus() {
    }

    public OmnidirectionalObstacleAvoidanceStatus(Boolean bl, Boolean bl2, Boolean bl3, Boolean bl4, Boolean bl5, Boolean bl6, Boolean bl7, Boolean bl8, Boolean bl9, Boolean bl10, Boolean bl11, Boolean bl12, Boolean bl13, Boolean bl14, Boolean bl15, Boolean bl16) {
    }

    public static OmnidirectionalObstacleAvoidanceStatus fromJson(String string) {
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

    public Boolean getIsUpObstacleAvoidanceWorking() {
        return null;
    }

    public void setIsUpObstacleAvoidanceWorking(Boolean bl) {
    }

    public Boolean getIsLeftObstacleAvoidanceWorking() {
        return null;
    }

    public void setIsLeftObstacleAvoidanceWorking(Boolean bl) {
    }

    public Boolean getIsRightObstacleAvoidanceWorking() {
        return null;
    }

    public void setIsRightObstacleAvoidanceWorking(Boolean bl) {
    }

    public Boolean getIsBackObstacleAvoidanceWorking() {
        return null;
    }

    public void setIsBackObstacleAvoidanceWorking(Boolean bl) {
    }

    public Boolean getIsFrontObstacleAvoidanceWorking() {
        return null;
    }

    public void setIsFrontObstacleAvoidanceWorking(Boolean bl) {
    }

    public Boolean getIsDownObstacleAvoidanceWorking() {
        return null;
    }

    public void setIsDownObstacleAvoidanceWorking(Boolean bl) {
    }

    public Boolean getIsVerticalObstacleAvoidanceWorking() {
        return null;
    }

    public void setIsVerticalObstacleAvoidanceWorking(Boolean bl) {
    }

    public Boolean getIsHorizontalObstacleAvoidanceWorking() {
        return null;
    }

    public void setIsHorizontalObstacleAvoidanceWorking(Boolean bl) {
    }

    public Boolean getIsUpObstacleAvoidanceEnable() {
        return null;
    }

    public void setIsUpObstacleAvoidanceEnable(Boolean bl) {
    }

    public Boolean getIsLeftObstacleAvoidanceEnable() {
        return null;
    }

    public void setIsLeftObstacleAvoidanceEnable(Boolean bl) {
    }

    public Boolean getIsRightObstacleAvoidanceEnable() {
        return null;
    }

    public void setIsRightObstacleAvoidanceEnable(Boolean bl) {
    }

    public Boolean getIsBackObstacleAvoidanceEnable() {
        return null;
    }

    public void setIsBackObstacleAvoidanceEnable(Boolean bl) {
    }

    public Boolean getIsFrontObstacleAvoidanceEnable() {
        return null;
    }

    public void setIsFrontObstacleAvoidanceEnable(Boolean bl) {
    }

    public Boolean getIsDownObstacleAvoidanceEnable() {
        return null;
    }

    public void setIsDownObstacleAvoidanceEnable(Boolean bl) {
    }

    public Boolean getIsVerticalObstacleAvoidanceEnable() {
        return null;
    }

    public void setIsVerticalObstacleAvoidanceEnable(Boolean bl) {
    }

    public Boolean getIsHorizontalObstacleAvoidanceEnable() {
        return null;
    }

    public void setIsHorizontalObstacleAvoidanceEnable(Boolean bl) {
    }

    public String toString() {
        return null;
    }
}

