/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  org.jetbrains.annotations.NotNull
 */
package com.dji.wpmzsdk.common.utils.kml.model;

import com.dji.wpmzsdk.common.utils.kml.model.MissionFaultSegment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 6, 0}, k=1, xi=48, d1={"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2={"Lcom/dji/wpmzsdk/common/utils/kml/model/WaylineWaypointSeg;", "Lcom/dji/wpmzsdk/common/utils/kml/model/MissionFaultSegment;", "tag", "", "(Ljava/lang/String;)V", "getTag", "()Ljava/lang/String;", "wpmzsdk_release"})
public final class WaylineWaypointSeg
extends MissionFaultSegment {
    @NotNull
    private final String tag;

    public WaylineWaypointSeg(@NotNull String tag) {
        Intrinsics.checkNotNullParameter((Object)tag, (String)"tag");
        super(null);
        this.tag = tag;
    }

    @NotNull
    public final String getTag() {
        return this.tag;
    }
}

