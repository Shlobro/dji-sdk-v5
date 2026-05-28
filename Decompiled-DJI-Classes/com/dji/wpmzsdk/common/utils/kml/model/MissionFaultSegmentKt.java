/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.collections.CollectionsKt
 *  kotlin.jvm.internal.Intrinsics
 *  kotlin.text.StringsKt
 *  org.jetbrains.annotations.NotNull
 */
package com.dji.wpmzsdk.common.utils.kml.model;

import com.dji.wpmzsdk.common.utils.kml.model.ActionAircraftYawSeg;
import com.dji.wpmzsdk.common.utils.kml.model.ActionGimbalEvenlyRotateSeg;
import com.dji.wpmzsdk.common.utils.kml.model.ActionGimbalRotatePitchSeg;
import com.dji.wpmzsdk.common.utils.kml.model.ActionGimbalRotateYawSeg;
import com.dji.wpmzsdk.common.utils.kml.model.ActionGroupSeg;
import com.dji.wpmzsdk.common.utils.kml.model.ActionSeg;
import com.dji.wpmzsdk.common.utils.kml.model.ActionZoomSeg;
import com.dji.wpmzsdk.common.utils.kml.model.IgnoreSeg;
import com.dji.wpmzsdk.common.utils.kml.model.MissionFaultSegment;
import com.dji.wpmzsdk.common.utils.kml.model.TemplateSeg;
import com.dji.wpmzsdk.common.utils.kml.model.WaypointTemplateSeg;
import dji.sdk.wpmz.value.mission.WaylineActionGroup;
import dji.sdk.wpmz.value.mission.WaylineTemplate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 6, 0}, k=2, xi=48, d1={"\u0000\u001a\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a$\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007\u00a8\u0006\b"}, d2={"parseSeg", "", "Lcom/dji/wpmzsdk/common/utils/kml/model/MissionFaultSegment;", "tag", "", "value", "template", "Ldji/sdk/wpmz/value/mission/WaylineTemplate;", "wpmzsdk_release"})
public final class MissionFaultSegmentKt {
    /*
     * WARNING - void declaration
     */
    @NotNull
    public static final List<MissionFaultSegment> parseSeg(@NotNull String tag, @NotNull String value, @NotNull WaylineTemplate template) {
        void $this$mapTo$iv$iv;
        Intrinsics.checkNotNullParameter((Object)tag, (String)"tag");
        Intrinsics.checkNotNullParameter((Object)value, (String)"value");
        Intrinsics.checkNotNullParameter((Object)template, (String)"template");
        String[] stringArray = new String[]{"."};
        Iterable $this$map$iv = StringsKt.split$default((CharSequence)tag, (String[])stringArray, (boolean)false, (int)0, (int)6, null);
        boolean $i$f$map = false;
        Iterable iterable = $this$map$iv;
        Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault((Iterable)$this$map$iv, (int)10));
        boolean $i$f$mapTo = false;
        for (Object item$iv$iv : $this$mapTo$iv$iv) {
            MissionFaultSegment missionFaultSegment;
            void it;
            String string = (String)item$iv$iv;
            Collection collection = destination$iv$iv;
            boolean bl = false;
            if (StringsKt.startsWith$default((String)it, (String)"template", (boolean)false, (int)2, null)) {
                missionFaultSegment = new TemplateSeg();
            } else if (StringsKt.startsWith$default((String)it, (String)"waypointInfo", (boolean)false, (int)2, null)) {
                missionFaultSegment = new WaypointTemplateSeg();
            } else if (StringsKt.startsWith$default((String)it, (String)"actionGroups", (boolean)false, (int)2, null)) {
                List<WaylineActionGroup> list = template.getWaypointInfo().getActionGroups();
                Intrinsics.checkNotNullExpressionValue(list, (String)"template.waypointInfo.actionGroups");
                missionFaultSegment = new ActionGroupSeg((String)it, list);
            } else {
                missionFaultSegment = StringsKt.startsWith$default((String)it, (String)"actions", (boolean)false, (int)2, null) ? (MissionFaultSegment)new ActionSeg((String)it) : (StringsKt.startsWith$default((String)it, (String)"yaw", (boolean)false, (int)2, null) && StringsKt.contains$default((CharSequence)tag, (CharSequence)"gimbalRotateParam", (boolean)false, (int)2, null) ? (MissionFaultSegment)new ActionGimbalRotateYawSeg(value) : (StringsKt.startsWith$default((String)it, (String)"pitch", (boolean)false, (int)2, null) && StringsKt.contains$default((CharSequence)tag, (CharSequence)"gimbalRotateParam", (boolean)false, (int)2, null) ? (MissionFaultSegment)new ActionGimbalRotatePitchSeg(value) : (StringsKt.startsWith$default((String)it, (String)"aircraftRotateYawParam", (boolean)false, (int)2, null) ? (MissionFaultSegment)new ActionAircraftYawSeg(value) : (StringsKt.startsWith$default((String)it, (String)"zoomParam", (boolean)false, (int)2, null) ? (MissionFaultSegment)new ActionZoomSeg(value) : (StringsKt.startsWith$default((String)it, (String)"gimbalEvenlyRotateParam", (boolean)false, (int)2, null) ? (MissionFaultSegment)new ActionGimbalEvenlyRotateSeg(value) : (MissionFaultSegment)new IgnoreSeg((String)it))))));
            }
            collection.add(missionFaultSegment);
        }
        List segList = (List)destination$iv$iv;
        return segList;
    }
}

