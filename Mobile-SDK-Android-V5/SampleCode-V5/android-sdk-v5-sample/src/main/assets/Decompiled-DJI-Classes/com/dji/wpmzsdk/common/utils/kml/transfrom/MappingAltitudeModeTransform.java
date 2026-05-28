/*
 * Decompiled with CFR 0.152.
 */
package com.dji.wpmzsdk.common.utils.kml.transfrom;

import com.dji.wpmzsdk.common.utils.kml.transfrom.ModelTransform;
import dji.sdk.wpmz.value.mission.WaylineAltitudeMode;
import java.util.Objects;

public class MappingAltitudeModeTransform
implements ModelTransform<Integer, WaylineAltitudeMode> {
    public static final Integer RELATIVE = 0;
    public static final Integer ABSOLUTE = 1;

    @Override
    public WaylineAltitudeMode transFrom(Integer integer) {
        if (Objects.equals(ABSOLUTE, integer)) {
            return WaylineAltitudeMode.EGM96;
        }
        return WaylineAltitudeMode.RELATIVE_TO_START_POINT;
    }

    @Override
    public Integer transTo(WaylineAltitudeMode waylineAltitudeMode) {
        if (waylineAltitudeMode == WaylineAltitudeMode.EGM96) {
            return ABSOLUTE;
        }
        return RELATIVE;
    }
}

