/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  org.jetbrains.annotations.Nullable
 */
package com.dji.industry.pilot.data.cache.model;

import com.dji.industry.pilot.data.cache.model.MappingCameraModelGreenDao;
import com.dji.wpmzsdk.common.utils.kml.data.MissionType;
import com.dji.wpmzsdk.common.utils.kml.mission.WaypointMissionFinishedAction;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 6, 0}, k=1, xi=48, d1={"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b5\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\f\"\u0004\b\u001d\u0010\u000eR\u001a\u0010\u001e\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\f\"\u0004\b \u0010\u000eR\u001a\u0010!\u001a\u00020\"X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010'\u001a\u00020\"X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010$\"\u0004\b)\u0010&R\u001a\u0010*\u001a\u00020\"X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010$\"\u0004\b,\u0010&R\u001a\u0010-\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\f\"\u0004\b/\u0010\u000eR\u001a\u00100\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\f\"\u0004\b2\u0010\u000eR\u001a\u00103\u001a\u00020\"X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u0010$\"\u0004\b5\u0010&R\u001a\u00106\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\f\"\u0004\b8\u0010\u000eR\u001a\u00109\u001a\u00020\"X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b:\u0010$\"\u0004\b;\u0010&R\u001a\u0010<\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\f\"\u0004\b>\u0010\u000eR\u001a\u0010?\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\f\"\u0004\bA\u0010\u000eR\u001a\u0010B\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\f\"\u0004\bD\u0010\u000eR\u001a\u0010E\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bF\u0010\f\"\u0004\bG\u0010\u000eR\u001a\u0010H\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bI\u0010\f\"\u0004\bJ\u0010\u000eR\u001a\u0010K\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bL\u0010\f\"\u0004\bM\u0010\u000eR\u001a\u0010N\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bO\u0010\f\"\u0004\bP\u0010\u000eR\u001a\u0010Q\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bR\u0010\f\"\u0004\bS\u0010\u000eR\u001a\u0010T\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bU\u0010\f\"\u0004\bV\u0010\u000eR\u001a\u0010W\u001a\u00020XX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\u001c\u0010]\u001a\u0004\u0018\u00010^X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR\u001a\u0010c\u001a\u00020XX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bd\u0010Z\"\u0004\be\u0010\\R\u001c\u0010f\u001a\u0004\u0018\u00010gX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bh\u0010i\"\u0004\bj\u0010k\u00a8\u0006l"}, d2={"Lcom/dji/industry/pilot/data/cache/model/StripWaylineModelGreenDao;", "", "()V", "actionOnFinish", "Lcom/dji/wpmzsdk/common/utils/kml/mission/WaypointMissionFinishedAction;", "getActionOnFinish", "()Lcom/dji/wpmzsdk/common/utils/kml/mission/WaypointMissionFinishedAction;", "setActionOnFinish", "(Lcom/dji/wpmzsdk/common/utils/kml/mission/WaypointMissionFinishedAction;)V", "altitude", "", "getAltitude", "()I", "setAltitude", "(I)V", "altitudeMode", "getAltitudeMode", "setAltitudeMode", "breakIndex", "getBreakIndex", "setBreakIndex", "camera", "Lcom/dji/industry/pilot/data/cache/model/MappingCameraModelGreenDao;", "getCamera", "()Lcom/dji/industry/pilot/data/cache/model/MappingCameraModelGreenDao;", "setCamera", "(Lcom/dji/industry/pilot/data/cache/model/MappingCameraModelGreenDao;)V", "cutLength", "getCutLength", "setCutLength", "echoMode", "getEchoMode", "setEchoMode", "enableCalibrate", "", "getEnableCalibrate", "()Z", "setEnableCalibrate", "(Z)V", "enableDewarping", "getEnableDewarping", "setEnableDewarping", "enableSingleLine", "getEnableSingleLine", "setEnableSingleLine", "focusMode", "getFocusMode", "setFocusMode", "gimbalPitch", "getGimbalPitch", "setGimbalPitch", "hasCenterLine", "getHasCenterLine", "setHasCenterLine", "leftExtend", "getLeftExtend", "setLeftExtend", "needVariegation", "getNeedVariegation", "setNeedVariegation", "overlapH", "getOverlapH", "setOverlapH", "overlapW", "getOverlapW", "setOverlapW", "photoFormat", "getPhotoFormat", "setPhotoFormat", "photoMode", "getPhotoMode", "setPhotoMode", "planMode", "getPlanMode", "setPlanMode", "relativeDistance", "getRelativeDistance", "setRelativeDistance", "rightExtend", "getRightExtend", "setRightExtend", "sampleRate", "getSampleRate", "setSampleRate", "scanMode", "getScanMode", "setScanMode", "speed", "", "getSpeed", "()F", "setSpeed", "(F)V", "startPoints", "", "getStartPoints", "()Ljava/lang/String;", "setStartPoints", "(Ljava/lang/String;)V", "takeoffSpeed", "getTakeoffSpeed", "setTakeoffSpeed", "type", "Lcom/dji/wpmzsdk/common/utils/kml/data/MissionType;", "getType", "()Lcom/dji/wpmzsdk/common/utils/kml/data/MissionType;", "setType", "(Lcom/dji/wpmzsdk/common/utils/kml/data/MissionType;)V", "wpmzsdk_release"})
public final class StripWaylineModelGreenDao {
    private int altitude;
    private float takeoffSpeed;
    private float speed;
    private int overlapH;
    private int overlapW;
    private int breakIndex;
    @Nullable
    private WaypointMissionFinishedAction actionOnFinish;
    @Nullable
    private MissionType type;
    @Nullable
    private MappingCameraModelGreenDao camera;
    private int photoMode;
    private int cutLength;
    private int leftExtend;
    private int rightExtend;
    private int gimbalPitch;
    private boolean hasCenterLine;
    @Nullable
    private String startPoints;
    private int photoFormat;
    private boolean enableDewarping;
    private boolean enableSingleLine;
    private int altitudeMode;
    private int relativeDistance;
    private int focusMode;
    private int planMode;
    private int echoMode;
    private int sampleRate;
    private int scanMode;
    private boolean needVariegation;
    private boolean enableCalibrate;

    public final int getAltitude() {
        return this.altitude;
    }

    public final void setAltitude(int n) {
        this.altitude = n;
    }

    public final float getTakeoffSpeed() {
        return this.takeoffSpeed;
    }

    public final void setTakeoffSpeed(float f) {
        this.takeoffSpeed = f;
    }

    public final float getSpeed() {
        return this.speed;
    }

    public final void setSpeed(float f) {
        this.speed = f;
    }

    public final int getOverlapH() {
        return this.overlapH;
    }

    public final void setOverlapH(int n) {
        this.overlapH = n;
    }

    public final int getOverlapW() {
        return this.overlapW;
    }

    public final void setOverlapW(int n) {
        this.overlapW = n;
    }

    public final int getBreakIndex() {
        return this.breakIndex;
    }

    public final void setBreakIndex(int n) {
        this.breakIndex = n;
    }

    @Nullable
    public final WaypointMissionFinishedAction getActionOnFinish() {
        return this.actionOnFinish;
    }

    public final void setActionOnFinish(@Nullable WaypointMissionFinishedAction waypointMissionFinishedAction) {
        this.actionOnFinish = waypointMissionFinishedAction;
    }

    @Nullable
    public final MissionType getType() {
        return this.type;
    }

    public final void setType(@Nullable MissionType missionType) {
        this.type = missionType;
    }

    @Nullable
    public final MappingCameraModelGreenDao getCamera() {
        return this.camera;
    }

    public final void setCamera(@Nullable MappingCameraModelGreenDao mappingCameraModelGreenDao) {
        this.camera = mappingCameraModelGreenDao;
    }

    public final int getPhotoMode() {
        return this.photoMode;
    }

    public final void setPhotoMode(int n) {
        this.photoMode = n;
    }

    public final int getCutLength() {
        return this.cutLength;
    }

    public final void setCutLength(int n) {
        this.cutLength = n;
    }

    public final int getLeftExtend() {
        return this.leftExtend;
    }

    public final void setLeftExtend(int n) {
        this.leftExtend = n;
    }

    public final int getRightExtend() {
        return this.rightExtend;
    }

    public final void setRightExtend(int n) {
        this.rightExtend = n;
    }

    public final int getGimbalPitch() {
        return this.gimbalPitch;
    }

    public final void setGimbalPitch(int n) {
        this.gimbalPitch = n;
    }

    public final boolean getHasCenterLine() {
        return this.hasCenterLine;
    }

    public final void setHasCenterLine(boolean bl) {
        this.hasCenterLine = bl;
    }

    @Nullable
    public final String getStartPoints() {
        return this.startPoints;
    }

    public final void setStartPoints(@Nullable String string) {
        this.startPoints = string;
    }

    public final int getPhotoFormat() {
        return this.photoFormat;
    }

    public final void setPhotoFormat(int n) {
        this.photoFormat = n;
    }

    public final boolean getEnableDewarping() {
        return this.enableDewarping;
    }

    public final void setEnableDewarping(boolean bl) {
        this.enableDewarping = bl;
    }

    public final boolean getEnableSingleLine() {
        return this.enableSingleLine;
    }

    public final void setEnableSingleLine(boolean bl) {
        this.enableSingleLine = bl;
    }

    public final int getAltitudeMode() {
        return this.altitudeMode;
    }

    public final void setAltitudeMode(int n) {
        this.altitudeMode = n;
    }

    public final int getRelativeDistance() {
        return this.relativeDistance;
    }

    public final void setRelativeDistance(int n) {
        this.relativeDistance = n;
    }

    public final int getFocusMode() {
        return this.focusMode;
    }

    public final void setFocusMode(int n) {
        this.focusMode = n;
    }

    public final int getPlanMode() {
        return this.planMode;
    }

    public final void setPlanMode(int n) {
        this.planMode = n;
    }

    public final int getEchoMode() {
        return this.echoMode;
    }

    public final void setEchoMode(int n) {
        this.echoMode = n;
    }

    public final int getSampleRate() {
        return this.sampleRate;
    }

    public final void setSampleRate(int n) {
        this.sampleRate = n;
    }

    public final int getScanMode() {
        return this.scanMode;
    }

    public final void setScanMode(int n) {
        this.scanMode = n;
    }

    public final boolean getNeedVariegation() {
        return this.needVariegation;
    }

    public final void setNeedVariegation(boolean bl) {
        this.needVariegation = bl;
    }

    public final boolean getEnableCalibrate() {
        return this.enableCalibrate;
    }

    public final void setEnableCalibrate(boolean bl) {
        this.enableCalibrate = bl;
    }
}

