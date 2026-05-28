/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.collections.CollectionsKt
 *  kotlin.jvm.functions.Function1
 *  kotlin.jvm.internal.Intrinsics
 *  org.jetbrains.annotations.NotNull
 */
package com.dji.wpmzsdk.common.utils.kml.converter;

import com.dji.industry.pilot.data.cache.model.MappingCameraModelGreenDao;
import com.dji.industry.pilot.data.cache.model.MappingMissionModelGreenDao;
import com.dji.industry.pilot.data.cache.model.MappingWaylineModelGreenDao;
import com.dji.industry.pilot.data.cache.model.StripMissionModelGreenDao;
import com.dji.industry.pilot.data.cache.model.WaypointActionModelGreenDao;
import com.dji.industry.ppal.MappingMaxSpeedInfo;
import com.dji.wpmzsdk.common.utils.FileUtils;
import com.dji.wpmzsdk.common.utils.PPalGenerator;
import com.dji.wpmzsdk.common.utils.kml.converter.MissionGreenDaoTransform;
import com.dji.wpmzsdk.common.utils.kml.model.MappingCameraType;
import com.dji.wpmzsdk.common.utils.kml.model.PreciseShotInfo;
import com.dji.wpmzsdk.common.utils.kml.model.WaypointActionType;
import com.dji.wpmzsdk.common.utils.kml.model.WaypointMissionModelGreenDao;
import com.dji.wpmzsdk.common.utils.kml.model.WaypointModelGreenDao;
import com.dji.wpmzsdk.common.utils.kml.transfrom.MappingMissionEntityTransform;
import com.dji.wpmzsdk.common.utils.kml.transfrom.MissionTransformData;
import com.dji.wpmzsdk.common.utils.kml.transfrom.StripMissionEntityTransform;
import com.dji.wpmzsdk.common.utils.kml.transfrom.WaypointMissionEntityTransform;
import dji.sdk.wpmz.jni.JNIProguardKeepTag;
import dji.sdk.wpmz.value.mission.WaylineExecuteMissionConfig;
import dji.sdk.wpmz.value.mission.WaylineMission;
import dji.sdk.wpmz.value.mission.WaylineMissionConfig;
import dji.sdk.wpmz.value.mission.WaylineTemplate;
import java.io.File;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 6, 0}, k=1, xi=48, d1={"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0001J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\nH\u0002J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\fH\u0002J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002\u00a8\u0006\u0011"}, d2={"Lcom/dji/wpmzsdk/common/utils/kml/converter/MissionGreenDaoTransform;", "", "()V", "generateGreenDaoMissionWayline", "Lcom/dji/wpmzsdk/common/utils/kml/transfrom/MissionTransformData;", "entity", "generateMappingKMLWayline", "model", "Lcom/dji/industry/pilot/data/cache/model/MappingMissionModelGreenDao;", "generateStripKMLWayline", "Lcom/dji/industry/pilot/data/cache/model/StripMissionModelGreenDao;", "generateWaypointKMLWayline", "Lcom/dji/wpmzsdk/common/utils/kml/model/WaypointMissionModelGreenDao;", "kmlPreciseInfoConvert", "", "waypointModel", "Lcom/dji/wpmzsdk/common/utils/kml/model/WaypointModelGreenDao;", "wpmzsdk_release"})
public final class MissionGreenDaoTransform {
    @NotNull
    public final MissionTransformData generateGreenDaoMissionWayline(@NotNull Object entity) {
        Intrinsics.checkNotNullParameter((Object)entity, (String)"entity");
        Object object = entity;
        return object instanceof MappingMissionModelGreenDao ? this.generateMappingKMLWayline((MappingMissionModelGreenDao)entity) : (object instanceof StripMissionModelGreenDao ? this.generateStripKMLWayline((StripMissionModelGreenDao)entity) : (object instanceof WaypointMissionModelGreenDao ? this.generateWaypointKMLWayline((WaypointMissionModelGreenDao)entity) : new MissionTransformData()));
    }

    private final MissionTransformData generateMappingKMLWayline(MappingMissionModelGreenDao model) {
        Collection collection;
        MappingWaylineModelGreenDao mappingWaylineModelGreenDao = model.getMappingWayline();
        Intrinsics.checkNotNull((Object)mappingWaylineModelGreenDao);
        MappingWaylineModelGreenDao mappingWayline = mappingWaylineModelGreenDao;
        MappingCameraModelGreenDao mappingCameraModelGreenDao = mappingWayline.getCamera();
        Intrinsics.checkNotNull((Object)mappingCameraModelGreenDao);
        if (MappingCameraType.find(mappingCameraModelGreenDao.getName()) != MappingCameraType.EP800_LIDAR) {
            mappingWayline.setEnableCalibrate(false);
        }
        if (mappingWayline.getEnableDsm() && ((collection = (Collection)mappingWayline.getDsmPath()) == null || collection.isEmpty())) {
            mappingWayline.setEnableDsm(false);
        }
        if (mappingWayline.getEnableDsm()) {
            mappingWayline.setAltitudeMode(1);
        }
        MissionTransformData transformData = new MappingMissionEntityTransform().transFrom(model);
        PPalGenerator generator = new PPalGenerator();
        JNIProguardKeepTag jNIProguardKeepTag = transformData.getMissionConfig();
        Intrinsics.checkNotNullExpressionValue((Object)jNIProguardKeepTag, (String)"transformData.missionConfig");
        WaylineMissionConfig waylineMissionConfig = jNIProguardKeepTag;
        jNIProguardKeepTag = transformData.getTemplates().get(0);
        Intrinsics.checkNotNullExpressionValue((Object)jNIProguardKeepTag, (String)"transformData.templates[0]");
        MappingMaxSpeedInfo speedInfo = generator.calMaxSpeed(waylineMissionConfig, (WaylineTemplate)jNIProguardKeepTag);
        float speed = Math.max(1.0f, speedInfo.getOrthoMaxSpeed());
        if (mappingWayline.getSpeed() >= speed || mappingWayline.getFiveWayPose()) {
            WaylineTemplate waylineTemplate = transformData.getTemplates().get(0);
            waylineTemplate.setAutoFlightSpeed(Double.valueOf(speed));
        }
        Object object = transformData.getMission();
        Intrinsics.checkNotNullExpressionValue((Object)object, (String)"transformData.mission");
        WaylineMission waylineMission = object;
        object = transformData.getMissionConfig();
        Intrinsics.checkNotNullExpressionValue((Object)object, (String)"transformData.missionConfig");
        JNIProguardKeepTag jNIProguardKeepTag2 = object;
        object = transformData.getExecuteMissionConfig();
        Intrinsics.checkNotNullExpressionValue((Object)object, (String)"transformData.executeMissionConfig");
        JNIProguardKeepTag jNIProguardKeepTag3 = object;
        object = transformData.getTemplates();
        Intrinsics.checkNotNullExpressionValue((Object)object, (String)"transformData.templates");
        PPalGenerator.PPALParam ppalParam = new PPalGenerator.PPALParam(waylineMission, (WaylineMissionConfig)jNIProguardKeepTag2, (WaylineExecuteMissionConfig)jNIProguardKeepTag3, (List<? extends WaylineTemplate>)object);
        transformData.setWayline(generator.getWaylines(ppalParam));
        return transformData;
    }

    private final MissionTransformData generateStripKMLWayline(StripMissionModelGreenDao model) {
        MissionTransformData transformData = new StripMissionEntityTransform().transFrom(model);
        Object object = transformData.getMission();
        Intrinsics.checkNotNullExpressionValue((Object)object, (String)"transformData.mission");
        WaylineMission waylineMission = object;
        object = transformData.getMissionConfig();
        Intrinsics.checkNotNullExpressionValue((Object)object, (String)"transformData.missionConfig");
        JNIProguardKeepTag jNIProguardKeepTag = object;
        object = transformData.getExecuteMissionConfig();
        Intrinsics.checkNotNullExpressionValue((Object)object, (String)"transformData.executeMissionConfig");
        JNIProguardKeepTag jNIProguardKeepTag2 = object;
        object = transformData.getTemplates();
        Intrinsics.checkNotNullExpressionValue((Object)object, (String)"transformData.templates");
        PPalGenerator.PPALParam ppalParam = new PPalGenerator.PPALParam(waylineMission, (WaylineMissionConfig)jNIProguardKeepTag, (WaylineExecuteMissionConfig)jNIProguardKeepTag2, (List<? extends WaylineTemplate>)object);
        transformData.setWayline(new PPalGenerator().getWaylines(ppalParam));
        return transformData;
    }

    private final MissionTransformData generateWaypointKMLWayline(WaypointMissionModelGreenDao model) {
        Iterable $this$forEach$iv = model.getWaypoints();
        boolean $i$f$forEach = false;
        for (Object element$iv : $this$forEach$iv) {
            WaypointModelGreenDao it = (WaypointModelGreenDao)element$iv;
            boolean bl = false;
            this.kmlPreciseInfoConvert(it);
        }
        MissionTransformData transformData = new WaypointMissionEntityTransform().trans(model);
        List<WaylineTemplate> list = transformData.getMission();
        Intrinsics.checkNotNullExpressionValue((Object)list, (String)"transformData.mission");
        List<WaylineTemplate> list2 = list;
        list = transformData.getMissionConfig();
        Intrinsics.checkNotNullExpressionValue((Object)list, (String)"transformData.missionConfig");
        List<WaylineTemplate> list3 = list;
        list = transformData.getExecuteMissionConfig();
        Intrinsics.checkNotNullExpressionValue((Object)list, (String)"transformData.executeMissionConfig");
        List<WaylineTemplate> list4 = list;
        list = transformData.getTemplates();
        Intrinsics.checkNotNullExpressionValue(list, (String)"transformData.templates");
        PPalGenerator.PPALParam ppalParam = new PPalGenerator.PPALParam((WaylineMission)((Object)list2), (WaylineMissionConfig)((Object)list3), (WaylineExecuteMissionConfig)((Object)list4), (List<? extends WaylineTemplate>)list);
        transformData.setWayline(new PPalGenerator().getWaylines(ppalParam));
        return transformData;
    }

    private final void kmlPreciseInfoConvert(WaypointModelGreenDao waypointModel) {
        Collection collection = waypointModel.getPreciseShotInfo();
        if (!(collection == null || collection.isEmpty())) {
            CollectionsKt.removeAll(waypointModel.getActions(), (Function1)kmlPreciseInfoConvert.1.INSTANCE);
            Iterable $this$forEach$iv = waypointModel.getPreciseShotInfo();
            boolean $i$f$forEach = false;
            for (Object element$iv : $this$forEach$iv) {
                PreciseShotInfo item = (PreciseShotInfo)element$iv;
                boolean bl = false;
                File file = new File(item.getCacheFilePath(), item.getCacheFileName());
                String md5 = FileUtils.getFileMD5(file);
                if (md5 != null) {
                    String string = md5.substring(8, 24);
                    Intrinsics.checkNotNullExpressionValue((Object)string, (String)"this as java.lang.String\u2026ing(startIndex, endIndex)");
                    md5 = string;
                }
                item.setFileMD5(md5);
                WaypointActionModelGreenDao preciseAction = new WaypointActionModelGreenDao();
                preciseAction.setCameraIndex(item.getCameraIndex());
                preciseAction.setPreciseInfoName(item.getCacheFileName());
                if (item.getCropWidth() > 0.0f && item.getFileMD5() != null) {
                    preciseAction.setActionType(WaypointActionType.PRECISE_SHOT);
                } else {
                    preciseAction.setActionType(WaypointActionType.NORMAL_PRECISE_SHOT);
                }
                waypointModel.getActions().add(preciseAction);
            }
        }
    }
}

