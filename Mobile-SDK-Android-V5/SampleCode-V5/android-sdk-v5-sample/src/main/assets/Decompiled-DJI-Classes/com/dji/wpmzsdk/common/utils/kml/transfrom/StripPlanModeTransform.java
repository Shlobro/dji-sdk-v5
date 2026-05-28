/*
 * Decompiled with CFR 0.152.
 */
package com.dji.wpmzsdk.common.utils.kml.transfrom;

import com.dji.wpmzsdk.common.utils.kml.transfrom.ModelTransform;

public class StripPlanModeTransform
implements ModelTransform<Integer, Boolean> {
    private static final Integer PLAN_MODE_EFFICIENT = 0;
    private static final Integer PLAN_MODE_FULL = 1;

    @Override
    public Boolean transFrom(Integer integer) {
        if (PLAN_MODE_FULL.equals(integer)) {
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    @Override
    public Integer transTo(Boolean boundOptimize) {
        if (boundOptimize.booleanValue()) {
            return PLAN_MODE_FULL;
        }
        return PLAN_MODE_EFFICIENT;
    }
}

