/*
 * Decompiled with CFR 0.152.
 */
package com.dji.wpmzsdk.common.utils.kml.transfrom;

import com.dji.wpmzsdk.common.utils.kml.transfrom.ModelTransform;
import dji.sdk.wpmz.value.mission.WaylinePayloadFocusMode;
import java.util.Objects;

public class WaylineMappingFocusModeTransform
implements ModelTransform<Integer, WaylinePayloadFocusMode> {
    public static final int AUTO_FOCUS = 0;
    public static final int CALI_FOCUS = 1;

    @Override
    public WaylinePayloadFocusMode transFrom(Integer mode) {
        if (Objects.equals(mode, 0)) {
            return WaylinePayloadFocusMode.FIRST_POINT;
        }
        if (Objects.equals(mode, 1)) {
            return WaylinePayloadFocusMode.CUSTOM;
        }
        return WaylinePayloadFocusMode.FIRST_POINT;
    }

    @Override
    public Integer transTo(WaylinePayloadFocusMode waylinePayloadFocusMode) {
        if (waylinePayloadFocusMode == WaylinePayloadFocusMode.FIRST_POINT) {
            return 0;
        }
        if (waylinePayloadFocusMode == WaylinePayloadFocusMode.CUSTOM) {
            return 1;
        }
        return 0;
    }
}

