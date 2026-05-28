/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package com.dji.wpmzsdk.common.utils.kml.model;

import com.dji.industry.pilot.data.cache.model.WaypointActionModelGreenDao;
import com.dji.wpmzsdk.common.utils.kml.mission.WaypointMissionHeadingMode;
import com.dji.wpmzsdk.common.utils.kml.mission.WaypointV2MissionTypes;
import com.dji.wpmzsdk.common.utils.kml.model.PointTurnMode;
import com.dji.wpmzsdk.common.utils.kml.model.PreciseShotInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 6, 0}, k=1, xi=48, d1={"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R\u001a\u0010\u0019\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0013\"\u0004\b\u001b\u0010\u0015R\u001a\u0010\u001c\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0006\"\u0004\b\u001e\u0010\bR\u001c\u0010\u001f\u001a\u0004\u0018\u00010 X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010%\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0006\"\u0004\b'\u0010\bR\u001a\u0010(\u001a\u00020)X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001a\u0010.\u001a\u00020)X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u0010+\"\u0004\b0\u0010-R \u00101\u001a\b\u0012\u0004\u0012\u0002020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\r\"\u0004\b4\u0010\u000fR\u001a\u00105\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\u0013\"\u0004\b7\u0010\u0015R\u001c\u00108\u001a\u0004\u0018\u000109X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u001a\u0010>\u001a\u00020?X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\u001a\u0010D\u001a\u00020?X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bE\u0010A\"\u0004\bF\u0010CR\u001a\u0010G\u001a\u00020?X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bH\u0010A\"\u0004\bI\u0010CR\u001a\u0010J\u001a\u00020?X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bK\u0010A\"\u0004\bL\u0010CR\u001c\u0010M\u001a\u0004\u0018\u00010NX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010R\u00a8\u0006S"}, d2={"Lcom/dji/wpmzsdk/common/utils/kml/model/WaypointModelGreenDao;", "", "()V", "actionTimeLimit", "", "getActionTimeLimit", "()I", "setActionTimeLimit", "(I)V", "actions", "", "Lcom/dji/industry/pilot/data/cache/model/WaypointActionModelGreenDao;", "getActions", "()Ljava/util/List;", "setActions", "(Ljava/util/List;)V", "altitude", "", "getAltitude", "()F", "setAltitude", "(F)V", "cornerRadius", "getCornerRadius", "setCornerRadius", "gimbalPitch", "getGimbalPitch", "setGimbalPitch", "heading", "getHeading", "setHeading", "headingMode", "Lcom/dji/wpmzsdk/common/utils/kml/mission/WaypointMissionHeadingMode;", "getHeadingMode", "()Lcom/dji/wpmzsdk/common/utils/kml/mission/WaypointMissionHeadingMode;", "setHeadingMode", "(Lcom/dji/wpmzsdk/common/utils/kml/mission/WaypointMissionHeadingMode;)V", "index", "getIndex", "setIndex", "latitude", "", "getLatitude", "()D", "setLatitude", "(D)V", "longitude", "getLongitude", "setLongitude", "preciseShotInfo", "Lcom/dji/wpmzsdk/common/utils/kml/model/PreciseShotInfo;", "getPreciseShotInfo", "setPreciseShotInfo", "speed", "getSpeed", "setSpeed", "turnMode", "Lcom/dji/wpmzsdk/common/utils/kml/model/PointTurnMode;", "getTurnMode", "()Lcom/dji/wpmzsdk/common/utils/kml/model/PointTurnMode;", "setTurnMode", "(Lcom/dji/wpmzsdk/common/utils/kml/model/PointTurnMode;)V", "useWaylineAltitude", "", "getUseWaylineAltitude", "()Z", "setUseWaylineAltitude", "(Z)V", "useWaylineHeadMode", "getUseWaylineHeadMode", "setUseWaylineHeadMode", "useWaylinePointType", "getUseWaylinePointType", "setUseWaylinePointType", "useWaylineSpeed", "getUseWaylineSpeed", "setUseWaylineSpeed", "waypointType", "Lcom/dji/wpmzsdk/common/utils/kml/mission/WaypointV2MissionTypes$WaypointV2FlightPathMode;", "getWaypointType", "()Lcom/dji/wpmzsdk/common/utils/kml/mission/WaypointV2MissionTypes$WaypointV2FlightPathMode;", "setWaypointType", "(Lcom/dji/wpmzsdk/common/utils/kml/mission/WaypointV2MissionTypes$WaypointV2FlightPathMode;)V", "wpmzsdk_release"})
public final class WaypointModelGreenDao {
    private double latitude;
    private double longitude;
    private float altitude;
    private int heading;
    private float cornerRadius;
    private int actionTimeLimit;
    private float speed;
    private float gimbalPitch;
    @Nullable
    private PointTurnMode turnMode;
    @NotNull
    private List<WaypointActionModelGreenDao> actions = new ArrayList();
    private int index;
    private boolean useWaylineAltitude = true;
    private boolean useWaylineSpeed = true;
    private boolean useWaylineHeadMode;
    private boolean useWaylinePointType;
    @Nullable
    private WaypointV2MissionTypes.WaypointV2FlightPathMode waypointType;
    @Nullable
    private WaypointMissionHeadingMode headingMode;
    @NotNull
    private List<PreciseShotInfo> preciseShotInfo = new ArrayList();

    public final double getLatitude() {
        return this.latitude;
    }

    public final void setLatitude(double d) {
        this.latitude = d;
    }

    public final double getLongitude() {
        return this.longitude;
    }

    public final void setLongitude(double d) {
        this.longitude = d;
    }

    public final float getAltitude() {
        return this.altitude;
    }

    public final void setAltitude(float f) {
        this.altitude = f;
    }

    public final int getHeading() {
        return this.heading;
    }

    public final void setHeading(int n) {
        this.heading = n;
    }

    public final float getCornerRadius() {
        return this.cornerRadius;
    }

    public final void setCornerRadius(float f) {
        this.cornerRadius = f;
    }

    public final int getActionTimeLimit() {
        return this.actionTimeLimit;
    }

    public final void setActionTimeLimit(int n) {
        this.actionTimeLimit = n;
    }

    public final float getSpeed() {
        return this.speed;
    }

    public final void setSpeed(float f) {
        this.speed = f;
    }

    public final float getGimbalPitch() {
        return this.gimbalPitch;
    }

    public final void setGimbalPitch(float f) {
        this.gimbalPitch = f;
    }

    @Nullable
    public final PointTurnMode getTurnMode() {
        return this.turnMode;
    }

    public final void setTurnMode(@Nullable PointTurnMode pointTurnMode) {
        this.turnMode = pointTurnMode;
    }

    @NotNull
    public final List<WaypointActionModelGreenDao> getActions() {
        return this.actions;
    }

    public final void setActions(@NotNull List<WaypointActionModelGreenDao> list) {
        Intrinsics.checkNotNullParameter(list, (String)"<set-?>");
        this.actions = list;
    }

    public final int getIndex() {
        return this.index;
    }

    public final void setIndex(int n) {
        this.index = n;
    }

    public final boolean getUseWaylineAltitude() {
        return this.useWaylineAltitude;
    }

    public final void setUseWaylineAltitude(boolean bl) {
        this.useWaylineAltitude = bl;
    }

    public final boolean getUseWaylineSpeed() {
        return this.useWaylineSpeed;
    }

    public final void setUseWaylineSpeed(boolean bl) {
        this.useWaylineSpeed = bl;
    }

    public final boolean getUseWaylineHeadMode() {
        return this.useWaylineHeadMode;
    }

    public final void setUseWaylineHeadMode(boolean bl) {
        this.useWaylineHeadMode = bl;
    }

    public final boolean getUseWaylinePointType() {
        return this.useWaylinePointType;
    }

    public final void setUseWaylinePointType(boolean bl) {
        this.useWaylinePointType = bl;
    }

    @Nullable
    public final WaypointV2MissionTypes.WaypointV2FlightPathMode getWaypointType() {
        return this.waypointType;
    }

    public final void setWaypointType(@Nullable WaypointV2MissionTypes.WaypointV2FlightPathMode waypointV2FlightPathMode) {
        this.waypointType = waypointV2FlightPathMode;
    }

    @Nullable
    public final WaypointMissionHeadingMode getHeadingMode() {
        return this.headingMode;
    }

    public final void setHeadingMode(@Nullable WaypointMissionHeadingMode waypointMissionHeadingMode) {
        this.headingMode = waypointMissionHeadingMode;
    }

    @NotNull
    public final List<PreciseShotInfo> getPreciseShotInfo() {
        return this.preciseShotInfo;
    }

    public final void setPreciseShotInfo(@NotNull List<PreciseShotInfo> list) {
        Intrinsics.checkNotNullParameter(list, (String)"<set-?>");
        this.preciseShotInfo = list;
    }
}

