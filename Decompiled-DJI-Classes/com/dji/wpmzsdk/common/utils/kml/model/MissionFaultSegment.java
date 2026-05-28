/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  kotlin.Metadata
 *  kotlin.jvm.internal.DefaultConstructorMarker
 *  kotlin.jvm.internal.Intrinsics
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package com.dji.wpmzsdk.common.utils.kml.model;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 6, 0}, k=1, xi=48, d1={"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016\u0082\u0001\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u00a8\u0006\u0017"}, d2={"Lcom/dji/wpmzsdk/common/utils/kml/model/MissionFaultSegment;", "", "()V", "equals", "", "other", "getContent", "", "context", "Landroid/content/Context;", "hashCode", "", "Lcom/dji/wpmzsdk/common/utils/kml/model/TemplateSeg;", "Lcom/dji/wpmzsdk/common/utils/kml/model/WaypointTemplateSeg;", "Lcom/dji/wpmzsdk/common/utils/kml/model/WaylineWaypointSeg;", "Lcom/dji/wpmzsdk/common/utils/kml/model/ActionGroupSeg;", "Lcom/dji/wpmzsdk/common/utils/kml/model/ActionSeg;", "Lcom/dji/wpmzsdk/common/utils/kml/model/ActionGimbalRotateYawSeg;", "Lcom/dji/wpmzsdk/common/utils/kml/model/ActionGimbalRotatePitchSeg;", "Lcom/dji/wpmzsdk/common/utils/kml/model/ActionAircraftYawSeg;", "Lcom/dji/wpmzsdk/common/utils/kml/model/ActionZoomSeg;", "Lcom/dji/wpmzsdk/common/utils/kml/model/ActionGimbalEvenlyRotateSeg;", "Lcom/dji/wpmzsdk/common/utils/kml/model/IgnoreSeg;", "wpmzsdk_release"})
public abstract class MissionFaultSegment {
    private MissionFaultSegment() {
    }

    @NotNull
    public String getContent(@NotNull Context context) {
        Intrinsics.checkNotNullParameter((Object)context, (String)"context");
        return "";
    }

    public boolean equals(@Nullable Object other) {
        return this == other;
    }

    public int hashCode() {
        return System.identityHashCode(this);
    }

    public /* synthetic */ MissionFaultSegment(DefaultConstructorMarker $constructor_marker) {
        this();
    }
}

