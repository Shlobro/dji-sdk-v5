/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.DefaultConstructorMarker
 *  kotlin.jvm.internal.Intrinsics
 *  org.jetbrains.annotations.NotNull
 */
package com.dji.wpmzsdk.common.utils.kml.converter;

import com.dji.wpmzsdk.common.utils.PPalGenerator;
import com.dji.wpmzsdk.common.utils.kml.model.MappingMissionModel;
import com.dji.wpmzsdk.common.utils.kml.model.StripMissionModel;
import com.dji.wpmzsdk.common.utils.kml.model.WaypointMissionModel;
import com.dji.wpmzsdk.common.utils.kml.transfrom.MappingTemplateTransform;
import com.dji.wpmzsdk.common.utils.kml.transfrom.MissionTransformData;
import com.dji.wpmzsdk.common.utils.kml.transfrom.StripTemplateTransform;
import com.dji.wpmzsdk.common.utils.kml.transfrom.WaypointTemplateTransform;
import dji.sdk.wpmz.jni.JNIProguardKeepTag;
import dji.sdk.wpmz.value.mission.Wayline;
import dji.sdk.wpmz.value.mission.WaylineExecuteMissionConfig;
import dji.sdk.wpmz.value.mission.WaylineMission;
import dji.sdk.wpmz.value.mission.WaylineMissionConfig;
import dji.sdk.wpmz.value.mission.WaylineTemplate;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 6, 0}, k=1, xi=48, d1={"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0001J\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\u0004J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000bH\u0002J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\rH\u0002J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000fH\u0002\u00a8\u0006\u0011"}, d2={"Lcom/dji/wpmzsdk/common/utils/kml/converter/WaylineConverter;", "", "()V", "generateKMLWayline", "Lcom/dji/wpmzsdk/common/utils/kml/transfrom/MissionTransformData;", "model", "generateKMZTemplateWayline", "", "Ldji/sdk/wpmz/value/mission/Wayline;", "transformData", "generateMappingKMLWayline", "Lcom/dji/wpmzsdk/common/utils/kml/model/MappingMissionModel;", "generateStripKMLWayline", "Lcom/dji/wpmzsdk/common/utils/kml/model/StripMissionModel;", "generateWaypointKMLWayline", "Lcom/dji/wpmzsdk/common/utils/kml/model/WaypointMissionModel;", "Companion", "wpmzsdk_release"})
public final class WaylineConverter {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    public static final String TAG = "WaylineConverter";

    @NotNull
    public final MissionTransformData generateKMLWayline(@NotNull Object model) {
        Intrinsics.checkNotNullParameter((Object)model, (String)"model");
        Object object = model;
        return object instanceof MappingMissionModel ? this.generateMappingKMLWayline((MappingMissionModel)model) : (object instanceof StripMissionModel ? this.generateStripKMLWayline((StripMissionModel)model) : (object instanceof WaypointMissionModel ? this.generateWaypointKMLWayline((WaypointMissionModel)model) : new MissionTransformData()));
    }

    @NotNull
    public final List<Wayline> generateKMZTemplateWayline(@NotNull MissionTransformData transformData) {
        Intrinsics.checkNotNullParameter((Object)transformData, (String)"transformData");
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
        return new PPalGenerator().getWaylines(ppalParam);
    }

    private final MissionTransformData generateMappingKMLWayline(MappingMissionModel model) {
        PPalGenerator generator = new PPalGenerator();
        MappingTemplateTransform templateTransform = new MappingTemplateTransform();
        MissionTransformData transformData = templateTransform.transFrom(model);
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
        transformData.setWayline(generator.getWaylines(ppalParam));
        Intrinsics.checkNotNullExpressionValue((Object)transformData, (String)"transformData");
        return transformData;
    }

    private final MissionTransformData generateStripKMLWayline(StripMissionModel model) {
        StripTemplateTransform templateTransform = new StripTemplateTransform();
        MissionTransformData transformData = templateTransform.transFrom(model);
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
        Intrinsics.checkNotNullExpressionValue((Object)transformData, (String)"transformData");
        return transformData;
    }

    private final MissionTransformData generateWaypointKMLWayline(WaypointMissionModel model) {
        WaypointTemplateTransform templateTransform = new WaypointTemplateTransform();
        MissionTransformData transformData = templateTransform.transFrom(model);
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
        Intrinsics.checkNotNullExpressionValue((Object)transformData, (String)"transformData");
        return transformData;
    }

    @Metadata(mv={1, 6, 0}, k=1, xi=48, d1={"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2={"Lcom/dji/wpmzsdk/common/utils/kml/converter/WaylineConverter$Companion;", "", "()V", "TAG", "", "wpmzsdk_release"})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker $constructor_marker) {
            this();
        }
    }
}

