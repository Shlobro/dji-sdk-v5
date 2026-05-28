/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  org.jetbrains.annotations.Nullable
 */
package com.dji.wpmzsdk.common.utils.kml.model;

import com.dji.wpmzsdk.common.utils.kml.data.DroneInfoModel;
import com.dji.wpmzsdk.common.utils.kml.mission.WaypointMissionFinishedAction;
import com.dji.wpmzsdk.common.utils.kml.mission.WaypointMissionFlightPathMode;
import com.dji.wpmzsdk.common.utils.kml.mission.WaypointMissionGotoWaypointMode;
import com.dji.wpmzsdk.common.utils.kml.mission.WaypointMissionHeadingMode;
import com.dji.wpmzsdk.common.utils.kml.mission.WaypointV2MissionTypes;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 6, 0}, k=1, xi=48, d1={"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001b\"\u0004\b \u0010\u001dR\u001c\u0010!\u001a\u0004\u0018\u00010\"X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010'\u001a\u00020\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u001b\"\u0004\b)\u0010\u001dR\u001c\u0010*\u001a\u0004\u0018\u00010+X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001c\u00100\u001a\u0004\u0018\u000101X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u001a\u00106\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\f\"\u0004\b8\u0010\u000eR\u001a\u00109\u001a\u00020:X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u001a\u0010?\u001a\u00020:X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b@\u0010<\"\u0004\bA\u0010>R\u001a\u0010B\u001a\u00020CX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\u001c\u0010H\u001a\u0004\u0018\u00010IX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010M\u00a8\u0006N"}, d2={"Lcom/dji/wpmzsdk/common/utils/kml/model/WaylineModelGreenDao;", "", "()V", "actionOnFinish", "Lcom/dji/wpmzsdk/common/utils/kml/mission/WaypointMissionFinishedAction;", "getActionOnFinish", "()Lcom/dji/wpmzsdk/common/utils/kml/mission/WaypointMissionFinishedAction;", "setActionOnFinish", "(Lcom/dji/wpmzsdk/common/utils/kml/mission/WaypointMissionFinishedAction;)V", "altitude", "", "getAltitude", "()F", "setAltitude", "(F)V", "autoFlightSpeed", "getAutoFlightSpeed", "setAutoFlightSpeed", "droneInfo", "Lcom/dji/wpmzsdk/common/utils/kml/data/DroneInfoModel;", "getDroneInfo", "()Lcom/dji/wpmzsdk/common/utils/kml/data/DroneInfoModel;", "setDroneInfo", "(Lcom/dji/wpmzsdk/common/utils/kml/data/DroneInfoModel;)V", "exitOnRCLost", "", "getExitOnRCLost", "()Z", "setExitOnRCLost", "(Z)V", "flightCali", "getFlightCali", "setFlightCali", "flightPathMode", "Lcom/dji/wpmzsdk/common/utils/kml/mission/WaypointMissionFlightPathMode;", "getFlightPathMode", "()Lcom/dji/wpmzsdk/common/utils/kml/mission/WaypointMissionFlightPathMode;", "setFlightPathMode", "(Lcom/dji/wpmzsdk/common/utils/kml/mission/WaypointMissionFlightPathMode;)V", "gimbalPitchRotationEnable", "getGimbalPitchRotationEnable", "setGimbalPitchRotationEnable", "gotoFirstPointMode", "Lcom/dji/wpmzsdk/common/utils/kml/mission/WaypointMissionGotoWaypointMode;", "getGotoFirstPointMode", "()Lcom/dji/wpmzsdk/common/utils/kml/mission/WaypointMissionGotoWaypointMode;", "setGotoFirstPointMode", "(Lcom/dji/wpmzsdk/common/utils/kml/mission/WaypointMissionGotoWaypointMode;)V", "headingMode", "Lcom/dji/wpmzsdk/common/utils/kml/mission/WaypointMissionHeadingMode;", "getHeadingMode", "()Lcom/dji/wpmzsdk/common/utils/kml/mission/WaypointMissionHeadingMode;", "setHeadingMode", "(Lcom/dji/wpmzsdk/common/utils/kml/mission/WaypointMissionHeadingMode;)V", "maxFlightSpeed", "getMaxFlightSpeed", "setMaxFlightSpeed", "poiLatitude", "", "getPoiLatitude", "()D", "setPoiLatitude", "(D)V", "poiLongitude", "getPoiLongitude", "setPoiLongitude", "repeatTimes", "", "getRepeatTimes", "()I", "setRepeatTimes", "(I)V", "waypointType", "Lcom/dji/wpmzsdk/common/utils/kml/mission/WaypointV2MissionTypes$WaypointV2FlightPathMode;", "getWaypointType", "()Lcom/dji/wpmzsdk/common/utils/kml/mission/WaypointV2MissionTypes$WaypointV2FlightPathMode;", "setWaypointType", "(Lcom/dji/wpmzsdk/common/utils/kml/mission/WaypointV2MissionTypes$WaypointV2FlightPathMode;)V", "wpmzsdk_release"})
public final class WaylineModelGreenDao {
    private float altitude;
    private float maxFlightSpeed;
    private float autoFlightSpeed;
    @Nullable
    private WaypointMissionGotoWaypointMode gotoFirstPointMode;
    @Nullable
    private WaypointMissionFinishedAction actionOnFinish;
    @Nullable
    private WaypointMissionHeadingMode headingMode;
    private double poiLatitude;
    private double poiLongitude;
    @Nullable
    private WaypointMissionFlightPathMode flightPathMode;
    private boolean exitOnRCLost;
    private boolean gimbalPitchRotationEnable;
    private int repeatTimes;
    @Nullable
    private WaypointV2MissionTypes.WaypointV2FlightPathMode waypointType;
    @Nullable
    private DroneInfoModel droneInfo;
    private boolean flightCali;

    public final float getAltitude() {
        return this.altitude;
    }

    public final void setAltitude(float f) {
        this.altitude = f;
    }

    public final float getMaxFlightSpeed() {
        return this.maxFlightSpeed;
    }

    public final void setMaxFlightSpeed(float f) {
        this.maxFlightSpeed = f;
    }

    public final float getAutoFlightSpeed() {
        return this.autoFlightSpeed;
    }

    public final void setAutoFlightSpeed(float f) {
        this.autoFlightSpeed = f;
    }

    @Nullable
    public final WaypointMissionGotoWaypointMode getGotoFirstPointMode() {
        return this.gotoFirstPointMode;
    }

    public final void setGotoFirstPointMode(@Nullable WaypointMissionGotoWaypointMode waypointMissionGotoWaypointMode) {
        this.gotoFirstPointMode = waypointMissionGotoWaypointMode;
    }

    @Nullable
    public final WaypointMissionFinishedAction getActionOnFinish() {
        return this.actionOnFinish;
    }

    public final void setActionOnFinish(@Nullable WaypointMissionFinishedAction waypointMissionFinishedAction) {
        this.actionOnFinish = waypointMissionFinishedAction;
    }

    @Nullable
    public final WaypointMissionHeadingMode getHeadingMode() {
        return this.headingMode;
    }

    public final void setHeadingMode(@Nullable WaypointMissionHeadingMode waypointMissionHeadingMode) {
        this.headingMode = waypointMissionHeadingMode;
    }

    public final double getPoiLatitude() {
        return this.poiLatitude;
    }

    public final void setPoiLatitude(double d) {
        this.poiLatitude = d;
    }

    public final double getPoiLongitude() {
        return this.poiLongitude;
    }

    public final void setPoiLongitude(double d) {
        this.poiLongitude = d;
    }

    @Nullable
    public final WaypointMissionFlightPathMode getFlightPathMode() {
        return this.flightPathMode;
    }

    public final void setFlightPathMode(@Nullable WaypointMissionFlightPathMode waypointMissionFlightPathMode) {
        this.flightPathMode = waypointMissionFlightPathMode;
    }

    public final boolean getExitOnRCLost() {
        return this.exitOnRCLost;
    }

    public final void setExitOnRCLost(boolean bl) {
        this.exitOnRCLost = bl;
    }

    public final boolean getGimbalPitchRotationEnable() {
        return this.gimbalPitchRotationEnable;
    }

    public final void setGimbalPitchRotationEnable(boolean bl) {
        this.gimbalPitchRotationEnable = bl;
    }

    public final int getRepeatTimes() {
        return this.repeatTimes;
    }

    public final void setRepeatTimes(int n) {
        this.repeatTimes = n;
    }

    @Nullable
    public final WaypointV2MissionTypes.WaypointV2FlightPathMode getWaypointType() {
        return this.waypointType;
    }

    public final void setWaypointType(@Nullable WaypointV2MissionTypes.WaypointV2FlightPathMode waypointV2FlightPathMode) {
        this.waypointType = waypointV2FlightPathMode;
    }

    @Nullable
    public final DroneInfoModel getDroneInfo() {
        return this.droneInfo;
    }

    public final void setDroneInfo(@Nullable DroneInfoModel droneInfoModel) {
        this.droneInfo = droneInfoModel;
    }

    public final boolean getFlightCali() {
        return this.flightCali;
    }

    public final void setFlightCali(boolean bl) {
        this.flightCali = bl;
    }
}

