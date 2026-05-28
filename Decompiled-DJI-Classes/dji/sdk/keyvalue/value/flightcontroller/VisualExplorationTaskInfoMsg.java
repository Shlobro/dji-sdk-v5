/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.common.LocationCoordinate3D;
import dji.sdk.keyvalue.value.flightcontroller.VisualExplorationErrorCode;
import dji.sdk.keyvalue.value.flightcontroller.VisualExplorationScoreLevel;
import dji.sdk.keyvalue.value.flightcontroller.VisualExplorationStage;
import dji.sdk.keyvalue.value.flightcontroller.VisualExplorationSuggestCode;
import org.json.JSONObject;

public class VisualExplorationTaskInfoMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    String id;
    VisualExplorationStage stage;
    Integer times;
    Integer progressPercent;
    Integer scorePercent;
    VisualExplorationScoreLevel scoreLevel;
    Long durationSeconds;
    Integer errorTimes;
    VisualExplorationErrorCode errorCode;
    VisualExplorationSuggestCode suggestCode;
    Boolean isAboveGroundPointValid;
    Double aboveGroundPointHeight;
    LocationCoordinate3D departurePoint;
    LocationCoordinate3D currentDeparturePoint;

    public VisualExplorationTaskInfoMsg() {
    }

    public VisualExplorationTaskInfoMsg(String string, VisualExplorationStage visualExplorationStage, Integer n, Integer n2, Integer n3, VisualExplorationScoreLevel visualExplorationScoreLevel, Long l2, Integer n4, VisualExplorationErrorCode visualExplorationErrorCode, VisualExplorationSuggestCode visualExplorationSuggestCode, Boolean bl, Double d2, LocationCoordinate3D locationCoordinate3D, LocationCoordinate3D locationCoordinate3D2) {
    }

    public static VisualExplorationTaskInfoMsg fromJson(String string) {
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

    public String getId() {
        return null;
    }

    public void setId(String string) {
    }

    public VisualExplorationStage getStage() {
        return null;
    }

    public void setStage(VisualExplorationStage visualExplorationStage) {
    }

    public Integer getTimes() {
        return null;
    }

    public void setTimes(Integer n) {
    }

    public Integer getProgressPercent() {
        return null;
    }

    public void setProgressPercent(Integer n) {
    }

    public Integer getScorePercent() {
        return null;
    }

    public void setScorePercent(Integer n) {
    }

    public VisualExplorationScoreLevel getScoreLevel() {
        return null;
    }

    public void setScoreLevel(VisualExplorationScoreLevel visualExplorationScoreLevel) {
    }

    public Long getDurationSeconds() {
        return null;
    }

    public void setDurationSeconds(Long l2) {
    }

    public Integer getErrorTimes() {
        return null;
    }

    public void setErrorTimes(Integer n) {
    }

    public VisualExplorationErrorCode getErrorCode() {
        return null;
    }

    public void setErrorCode(VisualExplorationErrorCode visualExplorationErrorCode) {
    }

    public VisualExplorationSuggestCode getSuggestCode() {
        return null;
    }

    public void setSuggestCode(VisualExplorationSuggestCode visualExplorationSuggestCode) {
    }

    public Boolean getIsAboveGroundPointValid() {
        return null;
    }

    public void setIsAboveGroundPointValid(Boolean bl) {
    }

    public Double getAboveGroundPointHeight() {
        return null;
    }

    public void setAboveGroundPointHeight(Double d2) {
    }

    public LocationCoordinate3D getDeparturePoint() {
        return null;
    }

    public void setDeparturePoint(LocationCoordinate3D locationCoordinate3D) {
    }

    public LocationCoordinate3D getCurrentDeparturePoint() {
        return null;
    }

    public void setCurrentDeparturePoint(LocationCoordinate3D locationCoordinate3D) {
    }

    public String toString() {
        return null;
    }
}

