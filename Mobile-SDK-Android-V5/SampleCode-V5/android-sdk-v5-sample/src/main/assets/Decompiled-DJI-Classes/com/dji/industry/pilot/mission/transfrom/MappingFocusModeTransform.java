/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  org.jetbrains.annotations.NotNull
 */
package com.dji.industry.pilot.mission.transfrom;

import com.dji.wpmzsdk.common.utils.kml.transfrom.ModelTransform;
import dji.sdk.wpmz.value.mission.WaylinePayloadFocusMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 6, 0}, k=1, xi=48, d1={"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0002H\u0016J\u0015\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016\u00a2\u0006\u0002\u0010\rR\u0014\u0010\u0005\u001a\u00020\u0002X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0002X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007\u00a8\u0006\u000e"}, d2={"Lcom/dji/industry/pilot/mission/transfrom/MappingFocusModeTransform;", "Lcom/dji/wpmzsdk/common/utils/kml/transfrom/ModelTransform;", "", "Ldji/sdk/wpmz/value/mission/WaylinePayloadFocusMode;", "()V", "AUTO_FOCUS", "getAUTO_FOCUS", "()I", "CALI_FOCUS", "getCALI_FOCUS", "transFrom", "focusMode", "transTo", "(Ldji/sdk/wpmz/value/mission/WaylinePayloadFocusMode;)Ljava/lang/Integer;", "wpmzsdk_release"})
public final class MappingFocusModeTransform
implements ModelTransform<Integer, WaylinePayloadFocusMode> {
    private final int AUTO_FOCUS;
    private final int CALI_FOCUS;

    public MappingFocusModeTransform() {
        this.CALI_FOCUS = 1;
    }

    public final int getAUTO_FOCUS() {
        return this.AUTO_FOCUS;
    }

    public final int getCALI_FOCUS() {
        return this.CALI_FOCUS;
    }

    @Override
    @NotNull
    public WaylinePayloadFocusMode transFrom(int focusMode) {
        return focusMode == this.AUTO_FOCUS ? WaylinePayloadFocusMode.FIRST_POINT : WaylinePayloadFocusMode.CUSTOM;
    }

    @Override
    @NotNull
    public Integer transTo(@NotNull WaylinePayloadFocusMode focusMode) {
        Intrinsics.checkNotNullParameter((Object)focusMode, (String)"focusMode");
        return focusMode == WaylinePayloadFocusMode.FIRST_POINT ? this.AUTO_FOCUS : this.CALI_FOCUS;
    }
}

