/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  kotlin.text.StringsKt
 *  org.jetbrains.annotations.NotNull
 */
package com.dji.wpmzsdk.common.utils.kml.model;

import android.content.Context;
import com.dji.wpmzsdk.common.utils.kml.model.MissionFaultSegment;
import dji.sdk.wpmz.value.mission.WaylineActionGroup;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 6, 0}, k=1, xi=48, d1={"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0013"}, d2={"Lcom/dji/wpmzsdk/common/utils/kml/model/ActionGroupSeg;", "Lcom/dji/wpmzsdk/common/utils/kml/model/MissionFaultSegment;", "tag", "", "actionGroups", "", "Ldji/sdk/wpmz/value/mission/WaylineActionGroup;", "(Ljava/lang/String;Ljava/util/List;)V", "pointIndex", "", "getPointIndex", "()I", "setPointIndex", "(I)V", "getTag", "()Ljava/lang/String;", "getContent", "context", "Landroid/content/Context;", "wpmzsdk_release"})
public final class ActionGroupSeg
extends MissionFaultSegment {
    @NotNull
    private final String tag;
    private int pointIndex;

    public ActionGroupSeg(@NotNull String tag, @NotNull List<? extends WaylineActionGroup> actionGroups) {
        Intrinsics.checkNotNullParameter((Object)tag, (String)"tag");
        Intrinsics.checkNotNullParameter(actionGroups, (String)"actionGroups");
        super(null);
        this.tag = tag;
        String[] stringArray = new String[]{"_"};
        List splitStrs = StringsKt.split$default((CharSequence)this.tag, (String[])stringArray, (boolean)false, (int)0, (int)6, null);
        if (splitStrs.size() > 1) {
            int index = Integer.parseInt((String)splitStrs.get(1));
            Integer n = actionGroups.get(index).getStartIndex();
            Intrinsics.checkNotNullExpressionValue((Object)n, (String)"actionGroups[index].startIndex");
            this.pointIndex = ((Number)n).intValue();
        }
    }

    @NotNull
    public final String getTag() {
        return this.tag;
    }

    public final int getPointIndex() {
        return this.pointIndex;
    }

    public final void setPointIndex(int n) {
        this.pointIndex = n;
    }

    @Override
    @NotNull
    public String getContent(@NotNull Context context) {
        Intrinsics.checkNotNullParameter((Object)context, (String)"context");
        return Intrinsics.stringPlus((String)"Waypoints", (Object)(this.pointIndex + 1));
    }
}

