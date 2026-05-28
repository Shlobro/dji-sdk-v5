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
import dji.sdk.keyvalue.value.flightassistant.SmartTrackState;
import dji.sdk.keyvalue.value.flightassistant.SmartTrackSubMode;
import dji.sdk.keyvalue.value.flightassistant.SpotlightZoomStatusTipMsg;
import dji.sdk.keyvalue.value.flightassistant.SpotlightZoomSurroundStateMsg;
import org.json.JSONObject;

public class SmartTrackInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    SmartTrackState state;
    SmartTrackSubMode mode;
    Boolean isHandlingCommand;
    Boolean isControllingDrone;
    Boolean isControllingPayload0;
    Boolean isControllingPayload1;
    Boolean isControllingPayload2;
    Integer maxEquivalentFocalLength;
    Integer minEquivalentFocalLength;
    Double desiredCircleRadius;
    Double maxCircleRadius;
    Double minCircleRadius;
    Double desiredCircleVelocity;
    Double maxCircleVelocity;
    Double stickCirleVelocity;
    SpotlightZoomStatusTipMsg spotlightZoomStatusTip;
    SpotlightZoomSurroundStateMsg surroundState;
    Boolean isRollStick;
    Boolean isGimbalPitchLocked;
    Integer camPosition;

    public SmartTrackInfo() {
    }

    public SmartTrackInfo(SmartTrackState smartTrackState, SmartTrackSubMode smartTrackSubMode, Boolean bl, Boolean bl2, Boolean bl3, Boolean bl4, Boolean bl5, Integer n, Integer n2, Double d2, Double d3, Double d4, Double d5, Double d6, Double d7, SpotlightZoomStatusTipMsg spotlightZoomStatusTipMsg, SpotlightZoomSurroundStateMsg spotlightZoomSurroundStateMsg, Boolean bl6, Boolean bl7, Integer n3) {
    }

    public static SmartTrackInfo fromJson(String string) {
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

    public SmartTrackState getState() {
        return null;
    }

    public void setState(SmartTrackState smartTrackState) {
    }

    public SmartTrackSubMode getMode() {
        return null;
    }

    public void setMode(SmartTrackSubMode smartTrackSubMode) {
    }

    public Boolean getIsHandlingCommand() {
        return null;
    }

    public void setIsHandlingCommand(Boolean bl) {
    }

    public Boolean getIsControllingDrone() {
        return null;
    }

    public void setIsControllingDrone(Boolean bl) {
    }

    public Boolean getIsControllingPayload0() {
        return null;
    }

    public void setIsControllingPayload0(Boolean bl) {
    }

    public Boolean getIsControllingPayload1() {
        return null;
    }

    public void setIsControllingPayload1(Boolean bl) {
    }

    public Boolean getIsControllingPayload2() {
        return null;
    }

    public void setIsControllingPayload2(Boolean bl) {
    }

    public Integer getMaxEquivalentFocalLength() {
        return null;
    }

    public void setMaxEquivalentFocalLength(Integer n) {
    }

    public Integer getMinEquivalentFocalLength() {
        return null;
    }

    public void setMinEquivalentFocalLength(Integer n) {
    }

    public Double getDesiredCircleRadius() {
        return null;
    }

    public void setDesiredCircleRadius(Double d2) {
    }

    public Double getMaxCircleRadius() {
        return null;
    }

    public void setMaxCircleRadius(Double d2) {
    }

    public Double getMinCircleRadius() {
        return null;
    }

    public void setMinCircleRadius(Double d2) {
    }

    public Double getDesiredCircleVelocity() {
        return null;
    }

    public void setDesiredCircleVelocity(Double d2) {
    }

    public Double getMaxCircleVelocity() {
        return null;
    }

    public void setMaxCircleVelocity(Double d2) {
    }

    public Double getStickCirleVelocity() {
        return null;
    }

    public void setStickCirleVelocity(Double d2) {
    }

    public SpotlightZoomStatusTipMsg getSpotlightZoomStatusTip() {
        return null;
    }

    public void setSpotlightZoomStatusTip(SpotlightZoomStatusTipMsg spotlightZoomStatusTipMsg) {
    }

    public SpotlightZoomSurroundStateMsg getSurroundState() {
        return null;
    }

    public void setSurroundState(SpotlightZoomSurroundStateMsg spotlightZoomSurroundStateMsg) {
    }

    public Boolean getIsRollStick() {
        return null;
    }

    public void setIsRollStick(Boolean bl) {
    }

    public Boolean getIsGimbalPitchLocked() {
        return null;
    }

    public void setIsGimbalPitchLocked(Boolean bl) {
    }

    public Integer getCamPosition() {
        return null;
    }

    public void setCamPosition(Integer n) {
    }

    public String toString() {
        return null;
    }
}

