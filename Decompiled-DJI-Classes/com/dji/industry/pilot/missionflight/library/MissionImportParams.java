/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package com.dji.industry.pilot.missionflight.library;

import com.dji.wpmzsdk.common.utils.kml.KMLFileParseInfo;
import com.dji.wpmzsdk.common.utils.kml.data.MissionImportHeightMode;
import com.dji.wpmzsdk.common.utils.kml.data.MissionType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 6, 0}, k=1, xi=48, d1={"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006\u0015"}, d2={"Lcom/dji/industry/pilot/missionflight/library/MissionImportParams;", "", "()V", "fileType", "Lcom/dji/wpmzsdk/common/utils/kml/KMLFileParseInfo$KMLFileType;", "getFileType", "()Lcom/dji/wpmzsdk/common/utils/kml/KMLFileParseInfo$KMLFileType;", "setFileType", "(Lcom/dji/wpmzsdk/common/utils/kml/KMLFileParseInfo$KMLFileType;)V", "heightMode", "Lcom/dji/wpmzsdk/common/utils/kml/data/MissionImportHeightMode;", "getHeightMode", "()Lcom/dji/wpmzsdk/common/utils/kml/data/MissionImportHeightMode;", "setHeightMode", "(Lcom/dji/wpmzsdk/common/utils/kml/data/MissionImportHeightMode;)V", "missionType", "Lcom/dji/wpmzsdk/common/utils/kml/data/MissionType;", "getMissionType", "()Lcom/dji/wpmzsdk/common/utils/kml/data/MissionType;", "setMissionType", "(Lcom/dji/wpmzsdk/common/utils/kml/data/MissionType;)V", "wpmzsdk_release"})
public final class MissionImportParams {
    @Nullable
    private MissionImportHeightMode heightMode;
    @Nullable
    private MissionType missionType;
    @NotNull
    private KMLFileParseInfo.KMLFileType fileType = KMLFileParseInfo.KMLFileType.UNKNOWN;

    @Nullable
    public final MissionImportHeightMode getHeightMode() {
        return this.heightMode;
    }

    public final void setHeightMode(@Nullable MissionImportHeightMode missionImportHeightMode) {
        this.heightMode = missionImportHeightMode;
    }

    @Nullable
    public final MissionType getMissionType() {
        return this.missionType;
    }

    public final void setMissionType(@Nullable MissionType missionType) {
        this.missionType = missionType;
    }

    @NotNull
    public final KMLFileParseInfo.KMLFileType getFileType() {
        return this.fileType;
    }

    public final void setFileType(@NotNull KMLFileParseInfo.KMLFileType kMLFileType) {
        Intrinsics.checkNotNullParameter((Object)((Object)kMLFileType), (String)"<set-?>");
        this.fileType = kMLFileType;
    }
}

