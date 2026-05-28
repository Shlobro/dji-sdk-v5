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
import com.dji.industry.pilot.data.cache.model.MappingMissionModelGreenDao;
import com.dji.industry.pilot.data.cache.model.MappingWaylineModelGreenDao;
import com.dji.wpmzsdk.common.utils.kml.data.MissionType;
import com.dji.wpmzsdk.common.utils.kml.mission.WaypointMissionFinishedAction;
import com.dji.wpmzsdk.common.utils.kml.model.MissionInfoExtModel;
import com.dji.wpmzsdk.common.utils.kml.model.MissionInfoModelGreenDao;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 6, 0}, k=2, xi=48, d1={"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0002\u001a\u0010\u0010\u0004\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u001a \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u001a\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002\u00a8\u0006\r"}, d2={"createMapping2DWaylineModel", "Lcom/dji/industry/pilot/data/cache/model/MappingWaylineModelGreenDao;", "cameraModel", "Lcom/dji/industry/pilot/data/cache/model/MappingCameraModelGreenDao;", "createMapping3DWaylineModel", "createMappingModel", "Lcom/dji/industry/pilot/data/cache/model/MappingMissionModelGreenDao;", "name", "", "type", "Lcom/dji/wpmzsdk/common/utils/kml/data/MissionType;", "createMissionInfoMode", "Lcom/dji/wpmzsdk/common/utils/kml/model/MissionInfoModelGreenDao;", "wpmzsdk_release"})
public final class KMLMappingGreenDaoCreateUtilKt {
    @NotNull
    public static final MappingMissionModelGreenDao createMappingModel(@NotNull String name, @NotNull MissionType type, @Nullable MappingCameraModelGreenDao cameraModel) {
        Intrinsics.checkNotNullParameter((Object)name, (String)"name");
        Intrinsics.checkNotNullParameter((Object)((Object)type), (String)"type");
        MappingMissionModelGreenDao mappingModel = new MappingMissionModelGreenDao();
        mappingModel.setMissionInfo(KMLMappingGreenDaoCreateUtilKt.createMissionInfoMode(name, type));
        mappingModel.setMappingWayline(type == MissionType.Mapping3D ? KMLMappingGreenDaoCreateUtilKt.createMapping3DWaylineModel(cameraModel) : KMLMappingGreenDaoCreateUtilKt.createMapping2DWaylineModel(cameraModel));
        return mappingModel;
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
        info.setExtInfo(new MissionInfoExtModel());
        return info;
    }

    private static final MappingWaylineModelGreenDao createMapping2DWaylineModel(MappingCameraModelGreenDao cameraModel) {
        MappingWaylineModelGreenDao waylineModel = new MappingWaylineModelGreenDao();
        waylineModel.setActionOnFinish(WaypointMissionFinishedAction.GO_HOME);
        waylineModel.setAltitude(100);
        waylineModel.setTakeoffSpeed(10.0f);
        waylineModel.setSpeed(15.0f);
        waylineModel.setMargin(0.0f);
        waylineModel.setOverlapW(70);
        waylineModel.setOverlapH(80);
        waylineModel.setDirection(0);
        waylineModel.setType(MissionType.Mapping2D);
        waylineModel.setCamera(cameraModel);
        waylineModel.setDsmAltitude(150);
        waylineModel.setFiveWayPoseWithGimbalPitch(-45);
        waylineModel.setScanMode(1);
        waylineModel.setNeedVariegation(true);
        return waylineModel;
    }

    @NotNull
    public static final MappingWaylineModelGreenDao createMapping3DWaylineModel(@Nullable MappingCameraModelGreenDao cameraModel) {
        MappingWaylineModelGreenDao waylineModel = new MappingWaylineModelGreenDao();
        waylineModel.setActionOnFinish(WaypointMissionFinishedAction.GO_HOME);
        waylineModel.setAltitude(100);
        waylineModel.setTakeoffSpeed(10.0f);
        waylineModel.setSpeed(15.0f);
        waylineModel.setMargin(0.0f);
        waylineModel.setOverlapW(70);
        waylineModel.setOverlapH(80);
        waylineModel.setDirection(0);
        waylineModel.setType(MissionType.Mapping3D);
        waylineModel.setCamera(cameraModel);
        waylineModel.setInclineOverlapH(70);
        waylineModel.setInclineOverlapW(60);
        waylineModel.setInclineSpeed(15.0f);
        waylineModel.setGimbalPitch(-45);
        waylineModel.setScanMode(1);
        waylineModel.setNeedVariegation(true);
        return waylineModel;
    }
}

