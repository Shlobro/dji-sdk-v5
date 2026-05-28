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

import com.dji.wpmzsdk.common.utils.kml.data.MissionType;
import com.dji.wpmzsdk.common.utils.kml.mission.MissionInfoModel;
import com.dji.wpmzsdk.common.utils.kml.mission.RTKReferenceStationSource;
import com.dji.wpmzsdk.common.utils.kml.model.MissionInfoExtModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 6, 0}, k=1, xi=48, d1={"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010H\u001a\u00020IR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001aR\u001a\u0010\u001e\u001a\u00020\u001fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010$\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\f\"\u0004\b&\u0010\u000eR\u001a\u0010'\u001a\u00020(X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001c\u0010-\u001a\u0004\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0012\"\u0004\b/\u0010\u0014R\u001a\u00100\u001a\u00020(X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010*\"\u0004\b2\u0010,R\u001a\u00103\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u0012\"\u0004\b5\u0010\u0014R\u001a\u00106\u001a\u000207X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u001c\u0010<\u001a\u0004\u0018\u00010=X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u001a\u0010B\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\f\"\u0004\bD\u0010\u000eR\u001a\u0010E\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bF\u0010\u0012\"\u0004\bG\u0010\u0014\u00a8\u0006J"}, d2={"Lcom/dji/wpmzsdk/common/utils/kml/model/MissionInfoModelGreenDao;", "", "()V", "collected", "", "getCollected", "()Z", "setCollected", "(Z)V", "createTime", "", "getCreateTime", "()J", "setCreateTime", "(J)V", "diagram", "", "getDiagram", "()Ljava/lang/String;", "setDiagram", "(Ljava/lang/String;)V", "distance", "", "getDistance", "()F", "setDistance", "(F)V", "duration", "getDuration", "setDuration", "extInfo", "Lcom/dji/wpmzsdk/common/utils/kml/model/MissionInfoExtModel;", "getExtInfo", "()Lcom/dji/wpmzsdk/common/utils/kml/model/MissionInfoExtModel;", "setExtInfo", "(Lcom/dji/wpmzsdk/common/utils/kml/model/MissionInfoExtModel;)V", "id", "getId", "setId", "latitude", "", "getLatitude", "()D", "setLatitude", "(D)V", "locationDesc", "getLocationDesc", "setLocationDesc", "longitude", "getLongitude", "setLongitude", "name", "getName", "setName", "rtkStation", "Lcom/dji/wpmzsdk/common/utils/kml/mission/RTKReferenceStationSource;", "getRtkStation", "()Lcom/dji/wpmzsdk/common/utils/kml/mission/RTKReferenceStationSource;", "setRtkStation", "(Lcom/dji/wpmzsdk/common/utils/kml/mission/RTKReferenceStationSource;)V", "type", "Lcom/dji/wpmzsdk/common/utils/kml/data/MissionType;", "getType", "()Lcom/dji/wpmzsdk/common/utils/kml/data/MissionType;", "setType", "(Lcom/dji/wpmzsdk/common/utils/kml/data/MissionType;)V", "updateTime", "getUpdateTime", "setUpdateTime", "uuid", "getUuid", "setUuid", "getMissionInfoModel", "Lcom/dji/wpmzsdk/common/utils/kml/mission/MissionInfoModel;", "wpmzsdk_release"})
public final class MissionInfoModelGreenDao {
    private long id;
    @NotNull
    private String uuid = "";
    @NotNull
    private String name = "";
    private long createTime;
    private long updateTime;
    @Nullable
    private MissionType type;
    @Nullable
    private String diagram;
    private double latitude;
    private double longitude;
    @Nullable
    private String locationDesc;
    private float distance;
    private float duration;
    private boolean collected;
    @NotNull
    private RTKReferenceStationSource rtkStation = RTKReferenceStationSource.NONE;
    @NotNull
    private MissionInfoExtModel extInfo = new MissionInfoExtModel();

    public final long getId() {
        return this.id;
    }

    public final void setId(long l) {
        this.id = l;
    }

    @NotNull
    public final String getUuid() {
        return this.uuid;
    }

    public final void setUuid(@NotNull String string) {
        Intrinsics.checkNotNullParameter((Object)string, (String)"<set-?>");
        this.uuid = string;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final void setName(@NotNull String string) {
        Intrinsics.checkNotNullParameter((Object)string, (String)"<set-?>");
        this.name = string;
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    public final void setCreateTime(long l) {
        this.createTime = l;
    }

    public final long getUpdateTime() {
        return this.updateTime;
    }

    public final void setUpdateTime(long l) {
        this.updateTime = l;
    }

    @Nullable
    public final MissionType getType() {
        return this.type;
    }

    public final void setType(@Nullable MissionType missionType) {
        this.type = missionType;
    }

    @Nullable
    public final String getDiagram() {
        return this.diagram;
    }

    public final void setDiagram(@Nullable String string) {
        this.diagram = string;
    }

    public final double getLatitude() {
        return this.latitude;
    }

    public final void setLatitude(double d) {
        this.latitude = d;
    }

    public final double getLongitude() {
        return this.longitude;
    }

    public final void setLongitude(double d) {
        this.longitude = d;
    }

    @Nullable
    public final String getLocationDesc() {
        return this.locationDesc;
    }

    public final void setLocationDesc(@Nullable String string) {
        this.locationDesc = string;
    }

    public final float getDistance() {
        return this.distance;
    }

    public final void setDistance(float f) {
        this.distance = f;
    }

    public final float getDuration() {
        return this.duration;
    }

    public final void setDuration(float f) {
        this.duration = f;
    }

    public final boolean getCollected() {
        return this.collected;
    }

    public final void setCollected(boolean bl) {
        this.collected = bl;
    }

    @NotNull
    public final RTKReferenceStationSource getRtkStation() {
        return this.rtkStation;
    }

    public final void setRtkStation(@NotNull RTKReferenceStationSource rTKReferenceStationSource) {
        Intrinsics.checkNotNullParameter((Object)((Object)rTKReferenceStationSource), (String)"<set-?>");
        this.rtkStation = rTKReferenceStationSource;
    }

    @NotNull
    public final MissionInfoExtModel getExtInfo() {
        return this.extInfo;
    }

    public final void setExtInfo(@NotNull MissionInfoExtModel missionInfoExtModel) {
        Intrinsics.checkNotNullParameter((Object)missionInfoExtModel, (String)"<set-?>");
        this.extInfo = missionInfoExtModel;
    }

    @NotNull
    public final MissionInfoModel getMissionInfoModel() {
        MissionInfoModel infoModel = new MissionInfoModel();
        infoModel.setId(this.id);
        infoModel.setUuid(this.uuid);
        infoModel.setName(this.name);
        infoModel.setCreateTime(this.createTime);
        infoModel.setUpdateTime(this.updateTime);
        infoModel.setType(this.type);
        infoModel.setDiagram(this.diagram);
        infoModel.setLatitude(this.latitude);
        infoModel.setLongitude(this.longitude);
        infoModel.setLocationDesc(this.locationDesc);
        infoModel.setDistance(this.distance);
        infoModel.setDuration(this.duration);
        infoModel.setCollected(this.collected);
        infoModel.setRtkStation(this.rtkStation);
        infoModel.setExtInfo(this.extInfo);
        return infoModel;
    }
}

