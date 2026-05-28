/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  kotlin.text.StringsKt
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package com.dji.wpmzsdk.common.utils.kml;

import com.dji.industry.pilot.data.cache.model.MappingCameraModelGreenDao;
import com.dji.industry.pilot.data.cache.model.StripMissionModelGreenDao;
import com.dji.industry.pilot.data.cache.model.StripWaylineModelGreenDao;
import com.dji.wpmzsdk.common.utils.kml.data.MissionType;
import com.dji.wpmzsdk.common.utils.kml.mission.WaypointMissionFinishedAction;
import com.dji.wpmzsdk.common.utils.kml.model.MissionInfoModelGreenDao;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 6, 0}, k=2, xi=48, d1={"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a \u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\t\u001a\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0002\u00a8\u0006\f"}, d2={"createMissionInfoMode", "Lcom/dji/wpmzsdk/common/utils/kml/model/MissionInfoModelGreenDao;", "name", "", "type", "Lcom/dji/wpmzsdk/common/utils/kml/data/MissionType;", "createStripModel", "Lcom/dji/industry/pilot/data/cache/model/StripMissionModelGreenDao;", "cameraModel", "Lcom/dji/industry/pilot/data/cache/model/MappingCameraModelGreenDao;", "createStripWaylineModel", "Lcom/dji/industry/pilot/data/cache/model/StripWaylineModelGreenDao;", "wpmzsdk_release"})
public final class KMLStripGreenDaoCreateUtilKt {
    @NotNull
    public static final StripMissionModelGreenDao createStripModel(@NotNull String name, @NotNull MissionType type, @Nullable MappingCameraModelGreenDao cameraModel) {
        Intrinsics.checkNotNullParameter((Object)name, (String)"name");
        Intrinsics.checkNotNullParameter((Object)((Object)type), (String)"type");
        StripMissionModelGreenDao stripModel = new StripMissionModelGreenDao();
        stripModel.setMissionInfo(KMLStripGreenDaoCreateUtilKt.createMissionInfoMode(name, type));
        stripModel.setStripWayline(KMLStripGreenDaoCreateUtilKt.createStripWaylineModel(cameraModel));
        return stripModel;
    }

    private static final MissionInfoModelGreenDao createMissionInfoMode(String name, MissionType type) {
        MissionInfoModelGreenDao info = new MissionInfoModelGreenDao();
        info.setName(name);
        info.setType(type);
        info.setCreateTime(System.currentTimeMillis());
        info.setUpdateTime(System.currentTimeMillis());
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue((Object)string, (String)"randomUUID().toString()");
        info.setUuid(StringsKt.replace$default((String)string, (String)"-", (String)"_", (boolean)false, (int)4, null));
        return info;
    }

    private static final StripWaylineModelGreenDao createStripWaylineModel(MappingCameraModelGreenDao cameraModel) {
        StripWaylineModelGreenDao waylineModel = new StripWaylineModelGreenDao();
        waylineModel.setActionOnFinish(WaypointMissionFinishedAction.GO_HOME);
        waylineModel.setAltitude(100);
        waylineModel.setTakeoffSpeed(10.0f);
        waylineModel.setSpeed(15.0f);
        waylineModel.setOverlapW(70);
        waylineModel.setOverlapH(80);
        waylineModel.setType(MissionType.Strip);
        waylineModel.setCamera(cameraModel);
        waylineModel.setHasCenterLine(false);
        waylineModel.setCutLength(500);
        waylineModel.setLeftExtend(50);
        waylineModel.setRightExtend(50);
        waylineModel.setPlanMode(0);
        waylineModel.setEnableCalibrate(false);
        waylineModel.setScanMode(1);
        waylineModel.setNeedVariegation(false);
        return waylineModel;
    }
}

