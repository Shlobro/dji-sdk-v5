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
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 6, 0}, k=1, xi=48, d1={"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b \n\u0002\u0010\u0007\n\u0002\b&\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\f\"\u0004\b\u001d\u0010\u000eR\u001a\u0010\u001e\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\f\"\u0004\b \u0010\u000eR\"\u0010!\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\"X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001a\u0010(\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\f\"\u0004\b*\u0010\u000eR\u001a\u0010+\u001a\u00020,X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001a\u00101\u001a\u00020,X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u0010.\"\u0004\b3\u00100R\u001a\u00104\u001a\u00020,X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u0010.\"\u0004\b6\u00100R\u001a\u00107\u001a\u00020,X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b8\u0010.\"\u0004\b9\u00100R\u001a\u0010:\u001a\u00020,X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b;\u0010.\"\u0004\b<\u00100R\u001a\u0010=\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b>\u0010\f\"\u0004\b?\u0010\u000eR\u001a\u0010@\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bA\u0010\f\"\u0004\bB\u0010\u000eR\u001a\u0010C\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bD\u0010\f\"\u0004\bE\u0010\u000eR\u001a\u0010F\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bG\u0010\f\"\u0004\bH\u0010\u000eR\u001a\u0010I\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010\f\"\u0004\bK\u0010\u000eR\u001a\u0010L\u001a\u00020MX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\u001a\u0010R\u001a\u00020MX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bS\u0010O\"\u0004\bT\u0010QR\u001a\u0010U\u001a\u00020,X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bV\u0010.\"\u0004\bW\u00100R\u001a\u0010X\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bY\u0010\f\"\u0004\bZ\u0010\u000eR\u001a\u0010[\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\\\u0010\f\"\u0004\b]\u0010\u000eR\u001a\u0010^\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b_\u0010\f\"\u0004\b`\u0010\u000eR\u001a\u0010a\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bb\u0010\f\"\u0004\bc\u0010\u000eR\u001a\u0010d\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\be\u0010\f\"\u0004\bf\u0010\u000eR\u001a\u0010g\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bh\u0010\f\"\u0004\bi\u0010\u000eR\u001a\u0010j\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bk\u0010\f\"\u0004\bl\u0010\u000eR\u001a\u0010m\u001a\u00020MX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bn\u0010O\"\u0004\bo\u0010QR\u001a\u0010p\u001a\u00020MX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bq\u0010O\"\u0004\br\u0010QR\u001c\u0010s\u001a\u0004\u0018\u00010tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bu\u0010v\"\u0004\bw\u0010x\u00a8\u0006y"}, d2={"Lcom/dji/industry/pilot/data/cache/model/MappingWaylineModelGreenDao;", "", "()V", "actionOnFinish", "Lcom/dji/wpmzsdk/common/utils/kml/mission/WaypointMissionFinishedAction;", "getActionOnFinish", "()Lcom/dji/wpmzsdk/common/utils/kml/mission/WaypointMissionFinishedAction;", "setActionOnFinish", "(Lcom/dji/wpmzsdk/common/utils/kml/mission/WaypointMissionFinishedAction;)V", "altitude", "", "getAltitude", "()I", "setAltitude", "(I)V", "altitudeMode", "getAltitudeMode", "setAltitudeMode", "breakIndex", "getBreakIndex", "setBreakIndex", "camera", "Lcom/dji/industry/pilot/data/cache/model/MappingCameraModelGreenDao;", "getCamera", "()Lcom/dji/industry/pilot/data/cache/model/MappingCameraModelGreenDao;", "setCamera", "(Lcom/dji/industry/pilot/data/cache/model/MappingCameraModelGreenDao;)V", "direction", "getDirection", "setDirection", "dsmAltitude", "getDsmAltitude", "setDsmAltitude", "dsmPath", "", "", "getDsmPath", "()Ljava/util/List;", "setDsmPath", "(Ljava/util/List;)V", "echoMode", "getEchoMode", "setEchoMode", "elevationOptimize", "", "getElevationOptimize", "()Z", "setElevationOptimize", "(Z)V", "enableCalibrate", "getEnableCalibrate", "setEnableCalibrate", "enableDewarping", "getEnableDewarping", "setEnableDewarping", "enableDsm", "getEnableDsm", "setEnableDsm", "fiveWayPose", "getFiveWayPose", "setFiveWayPose", "fiveWayPoseWithGimbalPitch", "getFiveWayPoseWithGimbalPitch", "setFiveWayPoseWithGimbalPitch", "focusMode", "getFocusMode", "setFocusMode", "gimbalPitch", "getGimbalPitch", "setGimbalPitch", "inclineOverlapH", "getInclineOverlapH", "setInclineOverlapH", "inclineOverlapW", "getInclineOverlapW", "setInclineOverlapW", "inclineSpeed", "", "getInclineSpeed", "()F", "setInclineSpeed", "(F)V", "margin", "getMargin", "setMargin", "needVariegation", "getNeedVariegation", "setNeedVariegation", "overlapH", "getOverlapH", "setOverlapH", "overlapW", "getOverlapW", "setOverlapW", "photoFormat", "getPhotoFormat", "setPhotoFormat", "photoMode", "getPhotoMode", "setPhotoMode", "relativeDistance", "getRelativeDistance", "setRelativeDistance", "sampleRate", "getSampleRate", "setSampleRate", "scanMode", "getScanMode", "setScanMode", "speed", "getSpeed", "setSpeed", "takeoffSpeed", "getTakeoffSpeed", "setTakeoffSpeed", "type", "Lcom/dji/wpmzsdk/common/utils/kml/data/MissionType;", "getType", "()Lcom/dji/wpmzsdk/common/utils/kml/data/MissionType;", "setType", "(Lcom/dji/wpmzsdk/common/utils/kml/data/MissionType;)V", "wpmzsdk_release"})
public final class MappingWaylineModelGreenDao {
    private int direction;
    private int altitude;
    private float takeoffSpeed;
    private float speed;
    private float margin;
    private int overlapH;
    private int overlapW;
    private int breakIndex;
    @Nullable
    private WaypointMissionFinishedAction actionOnFinish;
    @Nullable
    private MissionType type;
    @Nullable
    private MappingCameraModelGreenDao camera;
    private boolean elevationOptimize;
    private int photoMode;
    private int photoFormat;
    private int focusMode;
    private boolean enableDewarping;
    private boolean fiveWayPose;
    private int fiveWayPoseWithGimbalPitch;
    private int echoMode;
    private int sampleRate;
    private int scanMode;
    private boolean needVariegation;
    private boolean enableDsm;
    private int dsmAltitude;
    @Nullable
    private List<String> dsmPath;
    private int altitudeMode;
    private int relativeDistance;
    private boolean enableCalibrate;
    private float inclineSpeed;
    private int gimbalPitch;
    private int inclineOverlapH;
    private int inclineOverlapW;

    public final int getDirection() {
        return this.direction;
    }

    public final void setDirection(int n) {
        this.direction = n;
    }

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

    public final float getMargin() {
        return this.margin;
    }

    public final void setMargin(float f) {
        this.margin = f;
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

    public final boolean getElevationOptimize() {
        return this.elevationOptimize;
    }

    public final void setElevationOptimize(boolean bl) {
        this.elevationOptimize = bl;
    }

    public final int getPhotoMode() {
        return this.photoMode;
    }

    public final void setPhotoMode(int n) {
        this.photoMode = n;
    }

    public final int getPhotoFormat() {
        return this.photoFormat;
    }

    public final void setPhotoFormat(int n) {
        this.photoFormat = n;
    }

    public final int getFocusMode() {
        return this.focusMode;
    }

    public final void setFocusMode(int n) {
        this.focusMode = n;
    }

    public final boolean getEnableDewarping() {
        return this.enableDewarping;
    }

    public final void setEnableDewarping(boolean bl) {
        this.enableDewarping = bl;
    }

    public final boolean getFiveWayPose() {
        return this.fiveWayPose;
    }

    public final void setFiveWayPose(boolean bl) {
        this.fiveWayPose = bl;
    }

    public final int getFiveWayPoseWithGimbalPitch() {
        return this.fiveWayPoseWithGimbalPitch;
    }

    public final void setFiveWayPoseWithGimbalPitch(int n) {
        this.fiveWayPoseWithGimbalPitch = n;
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

    public final boolean getEnableDsm() {
        return this.enableDsm;
    }

    public final void setEnableDsm(boolean bl) {
        this.enableDsm = bl;
    }

    public final int getDsmAltitude() {
        return this.dsmAltitude;
    }

    public final void setDsmAltitude(int n) {
        this.dsmAltitude = n;
    }

    @Nullable
    public final List<String> getDsmPath() {
        return this.dsmPath;
    }

    public final void setDsmPath(@Nullable List<String> list) {
        this.dsmPath = list;
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

    public final boolean getEnableCalibrate() {
        return this.enableCalibrate;
    }

    public final void setEnableCalibrate(boolean bl) {
        this.enableCalibrate = bl;
    }

    public final float getInclineSpeed() {
        return this.inclineSpeed;
    }

    public final void setInclineSpeed(float f) {
        this.inclineSpeed = f;
    }

    public final int getGimbalPitch() {
        return this.gimbalPitch;
    }

    public final void setGimbalPitch(int n) {
        this.gimbalPitch = n;
    }

    public final int getInclineOverlapH() {
        return this.inclineOverlapH;
    }

    public final void setInclineOverlapH(int n) {
        this.inclineOverlapH = n;
    }

    public final int getInclineOverlapW() {
        return this.inclineOverlapW;
    }

    public final void setInclineOverlapW(int n) {
        this.inclineOverlapW = n;
    }
}

