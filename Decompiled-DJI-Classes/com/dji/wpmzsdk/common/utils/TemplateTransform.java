/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package com.dji.wpmzsdk.common.utils;

import com.dji.wpmzsdk.common.data.Template;
import com.dji.wpmzsdk.common.data.TemplateParseInfo;
import dji.sdk.wpmz.value.mission.WaylineTemplate;
import dji.sdk.wpmz.value.mission.WaylineTemplateType;
import dji.sdk.wpmz.value.mission.WaylineTemplatesParseInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 6, 0}, k=1, xi=48, d1={"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\f\u001a\u00020\u0004\u00a8\u0006\r"}, d2={"Lcom/dji/wpmzsdk/common/utils/TemplateTransform;", "", "()V", "transFromWaylineTemplate", "Lcom/dji/wpmzsdk/common/data/Template;", "waylineTemplate", "Ldji/sdk/wpmz/value/mission/WaylineTemplate;", "transTemplateParseInfo", "Lcom/dji/wpmzsdk/common/data/TemplateParseInfo;", "WaylineTemplatesParseInfo", "Ldji/sdk/wpmz/value/mission/WaylineTemplatesParseInfo;", "transToWaylineTemplate", "template", "wpmzsdk_release"})
public final class TemplateTransform {
    @NotNull
    public static final TemplateTransform INSTANCE = new TemplateTransform();

    private TemplateTransform() {
    }

    @Nullable
    public final WaylineTemplate transToWaylineTemplate(@NotNull Template template) {
        Intrinsics.checkNotNullParameter((Object)template, (String)"template");
        WaylineTemplate waylineTemplate = new WaylineTemplate();
        waylineTemplate.setTemplateType(WaylineTemplateType.WAYPOINT);
        waylineTemplate.setTemplateId(template.getTemplateId());
        waylineTemplate.setAutoFlightSpeed(template.getAutoFlightSpeed());
        waylineTemplate.setCoordinateParam(template.getCoordinateParam());
        waylineTemplate.setTransitionalSpeed(template.getTransitionalSpeed());
        waylineTemplate.setWaypointInfo(template.getWaypointInfo());
        waylineTemplate.setPayloadParam(template.getPayloadParam());
        waylineTemplate.setUseGlobalTransitionalSpeed(template.getUseGlobalTransitionalSpeed());
        return waylineTemplate;
    }

    @Nullable
    public final Template transFromWaylineTemplate(@NotNull WaylineTemplate waylineTemplate) {
        Intrinsics.checkNotNullParameter((Object)waylineTemplate, (String)"waylineTemplate");
        Template template = new Template();
        template.setTemplateId(waylineTemplate.getTemplateId());
        template.setAutoFlightSpeed(waylineTemplate.getAutoFlightSpeed());
        template.setCoordinateParam(waylineTemplate.getCoordinateParam());
        template.setTransitionalSpeed(waylineTemplate.getTransitionalSpeed());
        template.setWaypointInfo(waylineTemplate.getWaypointInfo());
        template.setPayloadParam(waylineTemplate.getPayloadParam());
        template.setUseGlobalTransitionalSpeed(waylineTemplate.getUseGlobalTransitionalSpeed());
        return template;
    }

    @NotNull
    public final TemplateParseInfo transTemplateParseInfo(@NotNull WaylineTemplatesParseInfo WaylineTemplatesParseInfo2) {
        Intrinsics.checkNotNullParameter((Object)WaylineTemplatesParseInfo2, (String)"WaylineTemplatesParseInfo");
        TemplateParseInfo templateParseInfo = new TemplateParseInfo();
        templateParseInfo.setError(WaylineTemplatesParseInfo2.getError());
        List<WaylineTemplate> list = WaylineTemplatesParseInfo2.getTemplates();
        Intrinsics.checkNotNullExpressionValue(list, (String)"WaylineTemplatesParseInfo.templates");
        Iterable $this$forEach$iv = list;
        boolean $i$f$forEach = false;
        for (Object element$iv : $this$forEach$iv) {
            WaylineTemplate it = (WaylineTemplate)element$iv;
            boolean bl = false;
            List<Template> list2 = templateParseInfo.getTemplates();
            Intrinsics.checkNotNullExpressionValue((Object)it, (String)"it");
            list2.add(INSTANCE.transFromWaylineTemplate(it));
        }
        return templateParseInfo;
    }
}

