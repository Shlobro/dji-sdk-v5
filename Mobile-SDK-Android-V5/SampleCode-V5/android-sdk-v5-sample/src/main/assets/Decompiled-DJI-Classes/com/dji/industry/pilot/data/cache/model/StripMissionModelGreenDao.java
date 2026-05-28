/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  org.jetbrains.annotations.Nullable
 */
package com.dji.industry.pilot.data.cache.model;

import com.dji.industry.pilot.data.cache.model.EdgePointModelGreenDao;
import com.dji.industry.pilot.data.cache.model.StripWaylineModelGreenDao;
import com.dji.wpmzsdk.common.utils.kml.model.MissionInfoModelGreenDao;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 6, 0}, k=1, xi=48, d1={"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u00a8\u0006\u0016"}, d2={"Lcom/dji/industry/pilot/data/cache/model/StripMissionModelGreenDao;", "", "()V", "edgePoints", "", "Lcom/dji/industry/pilot/data/cache/model/EdgePointModelGreenDao;", "getEdgePoints", "()Ljava/util/List;", "setEdgePoints", "(Ljava/util/List;)V", "missionInfo", "Lcom/dji/wpmzsdk/common/utils/kml/model/MissionInfoModelGreenDao;", "getMissionInfo", "()Lcom/dji/wpmzsdk/common/utils/kml/model/MissionInfoModelGreenDao;", "setMissionInfo", "(Lcom/dji/wpmzsdk/common/utils/kml/model/MissionInfoModelGreenDao;)V", "stripWayline", "Lcom/dji/industry/pilot/data/cache/model/StripWaylineModelGreenDao;", "getStripWayline", "()Lcom/dji/industry/pilot/data/cache/model/StripWaylineModelGreenDao;", "setStripWayline", "(Lcom/dji/industry/pilot/data/cache/model/StripWaylineModelGreenDao;)V", "wpmzsdk_release"})
public final class StripMissionModelGreenDao {
    @Nullable
    private MissionInfoModelGreenDao missionInfo;
    @Nullable
    private StripWaylineModelGreenDao stripWayline;
    @Nullable
    private List<EdgePointModelGreenDao> edgePoints;

    @Nullable
    public final MissionInfoModelGreenDao getMissionInfo() {
        return this.missionInfo;
    }

    public final void setMissionInfo(@Nullable MissionInfoModelGreenDao missionInfoModelGreenDao) {
        this.missionInfo = missionInfoModelGreenDao;
    }

    @Nullable
    public final StripWaylineModelGreenDao getStripWayline() {
        return this.stripWayline;
    }

    public final void setStripWayline(@Nullable StripWaylineModelGreenDao stripWaylineModelGreenDao) {
        this.stripWayline = stripWaylineModelGreenDao;
    }

    @Nullable
    public final List<EdgePointModelGreenDao> getEdgePoints() {
        return this.edgePoints;
    }

    public final void setEdgePoints(@Nullable List<EdgePointModelGreenDao> list) {
        this.edgePoints = list;
    }
}

