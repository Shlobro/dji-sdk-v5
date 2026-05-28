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

import com.dji.wpmzsdk.common.utils.kml.model.MissionInfoModelGreenDao;
import com.dji.wpmzsdk.common.utils.kml.model.WaylineModelGreenDao;
import com.dji.wpmzsdk.common.utils.kml.model.WaypointModelGreenDao;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 6, 0}, k=1, xi=48, d1={"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u00a8\u0006\u0016"}, d2={"Lcom/dji/wpmzsdk/common/utils/kml/model/WaypointMissionModelGreenDao;", "", "()V", "missionInfo", "Lcom/dji/wpmzsdk/common/utils/kml/model/MissionInfoModelGreenDao;", "getMissionInfo", "()Lcom/dji/wpmzsdk/common/utils/kml/model/MissionInfoModelGreenDao;", "setMissionInfo", "(Lcom/dji/wpmzsdk/common/utils/kml/model/MissionInfoModelGreenDao;)V", "wayline", "Lcom/dji/wpmzsdk/common/utils/kml/model/WaylineModelGreenDao;", "getWayline", "()Lcom/dji/wpmzsdk/common/utils/kml/model/WaylineModelGreenDao;", "setWayline", "(Lcom/dji/wpmzsdk/common/utils/kml/model/WaylineModelGreenDao;)V", "waypoints", "", "Lcom/dji/wpmzsdk/common/utils/kml/model/WaypointModelGreenDao;", "getWaypoints", "()Ljava/util/List;", "setWaypoints", "(Ljava/util/List;)V", "wpmzsdk_release"})
public final class WaypointMissionModelGreenDao {
    @Nullable
    private MissionInfoModelGreenDao missionInfo;
    @Nullable
    private WaylineModelGreenDao wayline;
    @NotNull
    private List<WaypointModelGreenDao> waypoints = new ArrayList();

    @Nullable
    public final MissionInfoModelGreenDao getMissionInfo() {
        return this.missionInfo;
    }

    public final void setMissionInfo(@Nullable MissionInfoModelGreenDao missionInfoModelGreenDao) {
        this.missionInfo = missionInfoModelGreenDao;
    }

    @Nullable
    public final WaylineModelGreenDao getWayline() {
        return this.wayline;
    }

    public final void setWayline(@Nullable WaylineModelGreenDao waylineModelGreenDao) {
        this.wayline = waylineModelGreenDao;
    }

    @NotNull
    public final List<WaypointModelGreenDao> getWaypoints() {
        return this.waypoints;
    }

    public final void setWaypoints(@NotNull List<WaypointModelGreenDao> list) {
        Intrinsics.checkNotNullParameter(list, (String)"<set-?>");
        this.waypoints = list;
    }
}

