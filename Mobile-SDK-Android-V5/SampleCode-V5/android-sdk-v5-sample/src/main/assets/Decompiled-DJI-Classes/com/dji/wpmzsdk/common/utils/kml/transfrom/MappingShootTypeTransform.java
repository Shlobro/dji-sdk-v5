/*
 * Decompiled with CFR 0.152.
 */
package com.dji.wpmzsdk.common.utils.kml.transfrom;

import com.dji.wpmzsdk.common.utils.kml.transfrom.ModelTransform;
import dji.sdk.wpmz.value.mission.WaylineTemplateShootType;

public class MappingShootTypeTransform
implements ModelTransform<Integer, WaylineTemplateShootType> {
    private static final Integer SHOOT_TYPE_TIME = 0;
    private static final Integer SHOOT_TYPE_DISTANCE = 1;

    @Override
    public WaylineTemplateShootType transFrom(Integer integer) {
        if (SHOOT_TYPE_TIME.equals(integer)) {
            return WaylineTemplateShootType.TIME;
        }
        return WaylineTemplateShootType.DISTANCE;
    }

    @Override
    public Integer transTo(WaylineTemplateShootType waylineTemplateShootType) {
        if (waylineTemplateShootType == WaylineTemplateShootType.TIME) {
            return SHOOT_TYPE_TIME;
        }
        return SHOOT_TYPE_DISTANCE;
    }
}

