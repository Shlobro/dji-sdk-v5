/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  kotlin.text.StringsKt
 *  org.jetbrains.annotations.NotNull
 */
package com.dji.wpmzsdk.common.utils.kml;

import com.dji.wpmzsdk.common.utils.kml.data.DroneInfoModel;
import com.dji.wpmzsdk.common.utils.kml.data.MissionType;
import com.dji.wpmzsdk.common.utils.kml.mission.MissionCreateType;
import com.dji.wpmzsdk.common.utils.kml.mission.WaypointMissionFinishedAction;
import com.dji.wpmzsdk.common.utils.kml.mission.WaypointMissionGotoWaypointMode;
import com.dji.wpmzsdk.common.utils.kml.mission.WaypointMissionHeadingMode;
import com.dji.wpmzsdk.common.utils.kml.mission.WaypointV2MissionTypes;
import com.dji.wpmzsdk.common.utils.kml.model.MissionInfoExtModel;
import com.dji.wpmzsdk.common.utils.kml.model.MissionInfoModelGreenDao;
import com.dji.wpmzsdk.common.utils.kml.model.PointTurnMode;
import com.dji.wpmzsdk.common.utils.kml.model.WaylineModelGreenDao;
import com.dji.wpmzsdk.common.utils.kml.model.WaypointDroneType;
import com.dji.wpmzsdk.common.utils.kml.model.WaypointMissionModelGreenDao;
import com.dji.wpmzsdk.common.utils.kml.model.WaypointModelGreenDao;
import java.util.ArrayList;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 6, 0}, k=2, xi=48, d1={"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0006\u0010\u0000\u001a\u00020\u0001\u001a\u000e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u0006\u0010\u0006\u001a\u00020\u0007\u001a\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u0006\u0010\n\u001a\u00020\u000b\u00a8\u0006\f"}, d2={"createDroneInfoModel", "Lcom/dji/wpmzsdk/common/utils/kml/data/DroneInfoModel;", "createMissionInfoModel", "Lcom/dji/wpmzsdk/common/utils/kml/model/MissionInfoModelGreenDao;", "name", "", "createWaylineModel", "Lcom/dji/wpmzsdk/common/utils/kml/model/WaylineModelGreenDao;", "createWaypointMissionModel", "Lcom/dji/wpmzsdk/common/utils/kml/model/WaypointMissionModelGreenDao;", "createWaypointModel", "Lcom/dji/wpmzsdk/common/utils/kml/model/WaypointModelGreenDao;", "wpmzsdk_release"})
public final class KMLWaypointEntityCreateUtilKt {
    @NotNull
    public static final WaypointMissionModelGreenDao createWaypointMissionModel(@NotNull String name) {
        Intrinsics.checkNotNullParameter((Object)name, (String)"name");
        WaypointMissionModelGreenDao mission = new WaypointMissionModelGreenDao();
        mission.setMissionInfo(KMLWaypointEntityCreateUtilKt.createMissionInfoModel(name));
        mission.setWayline(KMLWaypointEntityCreateUtilKt.createWaylineModel());
        mission.setWaypoints(new ArrayList());
        return mission;
    }

    @NotNull
    public static final MissionInfoModelGreenDao createMissionInfoModel(@NotNull String name) {
        Intrinsics.checkNotNullParameter((Object)name, (String)"name");
        MissionInfoModelGreenDao model = new MissionInfoModelGreenDao();
        model.setId(0L);
        model.setName(name);
        model.setType(MissionType.Waypoint);
        model.setCreateTime(System.currentTimeMillis());
        model.setUpdateTime(System.currentTimeMillis());
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue((Object)string, (String)"randomUUID().toString()");
        model.setUuid(StringsKt.replace$default((String)string, (String)"-", (String)"_", (boolean)false, (int)4, null));
        MissionInfoExtModel extInfo = new MissionInfoExtModel();
        extInfo.setCreateType(MissionCreateType.MAP);
        model.setExtInfo(extInfo);
        return model;
    }

    @NotNull
    public static final WaylineModelGreenDao createWaylineModel() {
        WaylineModelGreenDao model = new WaylineModelGreenDao();
        model.setAltitude(100.0f);
        model.setAutoFlightSpeed(5.0f);
        model.setGotoFirstPointMode(WaypointMissionGotoWaypointMode.GotoWaypointSafely);
        model.setActionOnFinish(WaypointMissionFinishedAction.GO_HOME);
        model.setHeadingMode(WaypointMissionHeadingMode.AUTO);
        model.setExitOnRCLost(true);
        model.setGimbalPitchRotationEnable(false);
        model.setDroneInfo(KMLWaypointEntityCreateUtilKt.createDroneInfoModel());
        model.setWaypointType(WaypointV2MissionTypes.WaypointV2FlightPathMode.GOTO_POINT_STRAIGHT_LINE_AND_STOP);
        return model;
    }

    @NotNull
    public static final DroneInfoModel createDroneInfoModel() {
        DroneInfoModel model = new DroneInfoModel();
        model.setDroneType(WaypointDroneType.PM430);
        return model;
    }

    @NotNull
    public static final WaypointModelGreenDao createWaypointModel() {
        WaypointModelGreenDao waypointModel = new WaypointModelGreenDao();
        waypointModel.setAltitude(100.0f);
        waypointModel.setSpeed(-1.0f);
        waypointModel.setUseWaylineAltitude(true);
        waypointModel.setUseWaylineSpeed(true);
        waypointModel.setHeading(0);
        waypointModel.setCornerRadius(0.2f);
        waypointModel.setGimbalPitch(0.0f);
        waypointModel.setTurnMode(PointTurnMode.AUTO);
        waypointModel.setUseWaylineHeadMode(true);
        waypointModel.setUseWaylinePointType(true);
        waypointModel.setActions(new ArrayList());
        return waypointModel;
    }
}

