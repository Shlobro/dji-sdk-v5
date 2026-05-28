/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.collections.CollectionsKt
 *  kotlin.jvm.internal.Intrinsics
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package com.dji.wpmzsdk.common.utils;

import com.dji.industry.ppal.MappingMaxSpeedInfo;
import com.dji.industry.ppal.PPALController;
import dji.sdk.wpmz.value.mission.Wayline;
import dji.sdk.wpmz.value.mission.WaylineExecuteMissionConfig;
import dji.sdk.wpmz.value.mission.WaylineMission;
import dji.sdk.wpmz.value.mission.WaylineMissionConfig;
import dji.sdk.wpmz.value.mission.WaylineTemplate;
import dji.sdk.wpmz.value.mission.WaylineTemplateType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 6, 0}, k=1, xi=48, d1={"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u000eB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\r\u00a8\u0006\u000f"}, d2={"Lcom/dji/wpmzsdk/common/utils/PPalGenerator;", "", "()V", "calMaxSpeed", "Lcom/dji/industry/ppal/MappingMaxSpeedInfo;", "missionConfig", "Ldji/sdk/wpmz/value/mission/WaylineMissionConfig;", "missionTemplate", "Ldji/sdk/wpmz/value/mission/WaylineTemplate;", "getWaylines", "", "Ldji/sdk/wpmz/value/mission/Wayline;", "param", "Lcom/dji/wpmzsdk/common/utils/PPalGenerator$PPALParam;", "PPALParam", "wpmzsdk_release"})
public final class PPalGenerator {
    @NotNull
    public final List<Wayline> getWaylines(@NotNull PPALParam param) {
        byte[] it;
        Collection<byte[]> collection;
        Iterable $this$mapTo$iv$iv;
        Iterable $this$map$iv;
        Object element$iv2;
        Intrinsics.checkNotNullParameter((Object)param, (String)"param");
        Iterable $this$forEach$iv = param.getTemplate();
        boolean $i$f$forEach22 = false;
        for (Object element$iv2 : $this$forEach$iv) {
            WaylineTemplate it2 = (WaylineTemplate)element$iv2;
            boolean bl = false;
            if (it2.getTemplateType() == WaylineTemplateType.WAYPOINT) continue;
            throw new IllegalArgumentException();
        }
        Iterable $i$f$forEach22 = param.getTemplate();
        byte[] byArray = param.getMissionConfig().toBytes();
        Object object = param.getMission().toBytes();
        boolean $i$f$map = false;
        element$iv2 = $this$map$iv;
        Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault((Iterable)$this$map$iv, (int)10));
        boolean $i$f$mapTo = false;
        for (Object item$iv$iv : $this$mapTo$iv$iv) {
            WaylineTemplate waylineTemplate = (WaylineTemplate)item$iv$iv;
            collection = destination$iv$iv;
            boolean bl = false;
            collection.add(it.toBytes());
        }
        collection = (List)destination$iv$iv;
        List<byte[]> waylines = PPALController.generate((byte[])object, byArray, (List<byte[]>)collection).getWaylines();
        Intrinsics.checkNotNullExpressionValue(waylines, (String)"waylines");
        $this$map$iv = waylines;
        $i$f$map = false;
        $this$mapTo$iv$iv = $this$map$iv;
        destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault((Iterable)$this$map$iv, (int)10));
        $i$f$mapTo = false;
        for (Object item$iv$iv : $this$mapTo$iv$iv) {
            Wayline wayline;
            it = (byte[])item$iv$iv;
            object = destination$iv$iv;
            boolean bl = false;
            Wayline $this$getWaylines_u24lambda_u2d3_u24lambda_u2d2 = wayline = new Wayline();
            boolean bl2 = false;
            $this$getWaylines_u24lambda_u2d3_u24lambda_u2d2.fromBytes(it, 0);
            object.add(wayline);
        }
        return (List)destination$iv$iv;
    }

    @NotNull
    public final MappingMaxSpeedInfo calMaxSpeed(@NotNull WaylineMissionConfig missionConfig, @NotNull WaylineTemplate missionTemplate) {
        Intrinsics.checkNotNullParameter((Object)missionConfig, (String)"missionConfig");
        Intrinsics.checkNotNullParameter((Object)missionTemplate, (String)"missionTemplate");
        MappingMaxSpeedInfo mappingMaxSpeedInfo = PPALController.calMaxSpeed(missionConfig.toBytes(), missionTemplate.toBytes());
        Intrinsics.checkNotNullExpressionValue((Object)mappingMaxSpeedInfo, (String)"calMaxSpeed(missionConfi\u2026issionTemplate.toBytes())");
        return mappingMaxSpeedInfo;
    }

    @Metadata(mv={1, 6, 0}, k=1, xi=48, d1={"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\"\u001a\u00020\u0003H\u00c6\u0003J\t\u0010#\u001a\u00020\u0005H\u00c6\u0003J\t\u0010$\u001a\u00020\u0007H\u00c6\u0003J\u000f\u0010%\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u00c6\u0003J7\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u00c6\u0001J\u0013\u0010'\u001a\u00020\u00192\b\u0010(\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010)\u001a\u00020*H\u00d6\u0001J\t\u0010+\u001a\u00020,H\u00d6\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!\u00a8\u0006-"}, d2={"Lcom/dji/wpmzsdk/common/utils/PPalGenerator$PPALParam;", "", "mission", "Ldji/sdk/wpmz/value/mission/WaylineMission;", "missionConfig", "Ldji/sdk/wpmz/value/mission/WaylineMissionConfig;", "missionExecutionConfig", "Ldji/sdk/wpmz/value/mission/WaylineExecuteMissionConfig;", "template", "", "Ldji/sdk/wpmz/value/mission/WaylineTemplate;", "(Ldji/sdk/wpmz/value/mission/WaylineMission;Ldji/sdk/wpmz/value/mission/WaylineMissionConfig;Ldji/sdk/wpmz/value/mission/WaylineExecuteMissionConfig;Ljava/util/List;)V", "getMission", "()Ldji/sdk/wpmz/value/mission/WaylineMission;", "setMission", "(Ldji/sdk/wpmz/value/mission/WaylineMission;)V", "getMissionConfig", "()Ldji/sdk/wpmz/value/mission/WaylineMissionConfig;", "setMissionConfig", "(Ldji/sdk/wpmz/value/mission/WaylineMissionConfig;)V", "getMissionExecutionConfig", "()Ldji/sdk/wpmz/value/mission/WaylineExecuteMissionConfig;", "setMissionExecutionConfig", "(Ldji/sdk/wpmz/value/mission/WaylineExecuteMissionConfig;)V", "needDsmRender", "", "getNeedDsmRender", "()Z", "setNeedDsmRender", "(Z)V", "getTemplate", "()Ljava/util/List;", "setTemplate", "(Ljava/util/List;)V", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "wpmzsdk_release"})
    public static final class PPALParam {
        @NotNull
        private WaylineMission mission;
        @NotNull
        private WaylineMissionConfig missionConfig;
        @NotNull
        private WaylineExecuteMissionConfig missionExecutionConfig;
        @NotNull
        private List<? extends WaylineTemplate> template;
        private boolean needDsmRender;

        public PPALParam(@NotNull WaylineMission mission, @NotNull WaylineMissionConfig missionConfig, @NotNull WaylineExecuteMissionConfig missionExecutionConfig, @NotNull List<? extends WaylineTemplate> template) {
            Intrinsics.checkNotNullParameter((Object)mission, (String)"mission");
            Intrinsics.checkNotNullParameter((Object)missionConfig, (String)"missionConfig");
            Intrinsics.checkNotNullParameter((Object)missionExecutionConfig, (String)"missionExecutionConfig");
            Intrinsics.checkNotNullParameter(template, (String)"template");
            this.mission = mission;
            this.missionConfig = missionConfig;
            this.missionExecutionConfig = missionExecutionConfig;
            this.template = template;
        }

        @NotNull
        public final WaylineMission getMission() {
            return this.mission;
        }

        public final void setMission(@NotNull WaylineMission waylineMission) {
            Intrinsics.checkNotNullParameter((Object)waylineMission, (String)"<set-?>");
            this.mission = waylineMission;
        }

        @NotNull
        public final WaylineMissionConfig getMissionConfig() {
            return this.missionConfig;
        }

        public final void setMissionConfig(@NotNull WaylineMissionConfig waylineMissionConfig) {
            Intrinsics.checkNotNullParameter((Object)waylineMissionConfig, (String)"<set-?>");
            this.missionConfig = waylineMissionConfig;
        }

        @NotNull
        public final WaylineExecuteMissionConfig getMissionExecutionConfig() {
            return this.missionExecutionConfig;
        }

        public final void setMissionExecutionConfig(@NotNull WaylineExecuteMissionConfig waylineExecuteMissionConfig) {
            Intrinsics.checkNotNullParameter((Object)waylineExecuteMissionConfig, (String)"<set-?>");
            this.missionExecutionConfig = waylineExecuteMissionConfig;
        }

        @NotNull
        public final List<WaylineTemplate> getTemplate() {
            return this.template;
        }

        public final void setTemplate(@NotNull List<? extends WaylineTemplate> list) {
            Intrinsics.checkNotNullParameter(list, (String)"<set-?>");
            this.template = list;
        }

        public final boolean getNeedDsmRender() {
            return this.needDsmRender;
        }

        public final void setNeedDsmRender(boolean bl) {
            this.needDsmRender = bl;
        }

        @NotNull
        public final WaylineMission component1() {
            return this.mission;
        }

        @NotNull
        public final WaylineMissionConfig component2() {
            return this.missionConfig;
        }

        @NotNull
        public final WaylineExecuteMissionConfig component3() {
            return this.missionExecutionConfig;
        }

        @NotNull
        public final List<WaylineTemplate> component4() {
            return this.template;
        }

        @NotNull
        public final PPALParam copy(@NotNull WaylineMission mission, @NotNull WaylineMissionConfig missionConfig, @NotNull WaylineExecuteMissionConfig missionExecutionConfig, @NotNull List<? extends WaylineTemplate> template) {
            Intrinsics.checkNotNullParameter((Object)mission, (String)"mission");
            Intrinsics.checkNotNullParameter((Object)missionConfig, (String)"missionConfig");
            Intrinsics.checkNotNullParameter((Object)missionExecutionConfig, (String)"missionExecutionConfig");
            Intrinsics.checkNotNullParameter(template, (String)"template");
            return new PPALParam(mission, missionConfig, missionExecutionConfig, template);
        }

        public static /* synthetic */ PPALParam copy$default(PPALParam pPALParam, WaylineMission waylineMission, WaylineMissionConfig waylineMissionConfig, WaylineExecuteMissionConfig waylineExecuteMissionConfig, List list, int n, Object object) {
            if ((n & 1) != 0) {
                waylineMission = pPALParam.mission;
            }
            if ((n & 2) != 0) {
                waylineMissionConfig = pPALParam.missionConfig;
            }
            if ((n & 4) != 0) {
                waylineExecuteMissionConfig = pPALParam.missionExecutionConfig;
            }
            if ((n & 8) != 0) {
                list = pPALParam.template;
            }
            return pPALParam.copy(waylineMission, waylineMissionConfig, waylineExecuteMissionConfig, list);
        }

        @NotNull
        public String toString() {
            return "PPALParam(mission=" + this.mission + ", missionConfig=" + this.missionConfig + ", missionExecutionConfig=" + this.missionExecutionConfig + ", template=" + this.template + ')';
        }

        public int hashCode() {
            int result = this.mission.hashCode();
            result = result * 31 + this.missionConfig.hashCode();
            result = result * 31 + this.missionExecutionConfig.hashCode();
            result = result * 31 + ((Object)this.template).hashCode();
            return result;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PPALParam)) {
                return false;
            }
            PPALParam pPALParam = (PPALParam)other;
            if (!Intrinsics.areEqual((Object)this.mission, (Object)pPALParam.mission)) {
                return false;
            }
            if (!Intrinsics.areEqual((Object)this.missionConfig, (Object)pPALParam.missionConfig)) {
                return false;
            }
            if (!Intrinsics.areEqual((Object)this.missionExecutionConfig, (Object)pPALParam.missionExecutionConfig)) {
                return false;
            }
            return Intrinsics.areEqual(this.template, pPALParam.template);
        }
    }
}

