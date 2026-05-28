/*
 * Decompiled with CFR 0.152.
 */
package com.dji.wpmzsdk.common.utils.kml.transfrom;

import com.dji.wpmzsdk.common.utils.kml.transfrom.ModelTransform;
import dji.sdk.wpmz.value.mission.WaylinePayloadReturnMode;

public class WaylineEchoModeTransform
implements ModelTransform<Integer, WaylinePayloadReturnMode> {
    @Override
    public WaylinePayloadReturnMode transFrom(Integer echoMode) {
        switch (echoMode) {
            case 0: {
                return WaylinePayloadReturnMode.SINGLE_RETURN_FIRST;
            }
            case 1: {
                return WaylinePayloadReturnMode.SINGLE_RETURN_STRONGEST;
            }
            case 2: {
                return WaylinePayloadReturnMode.DUAL_RETURN;
            }
            case 3: {
                return WaylinePayloadReturnMode.TRIPLE_RETURN;
            }
        }
        return WaylinePayloadReturnMode.SINGLE_RETURN_STRONGEST;
    }

    @Override
    public Integer transTo(WaylinePayloadReturnMode waylinePayloadReturnMode) {
        switch (waylinePayloadReturnMode) {
            case SINGLE_RETURN_FIRST: {
                return 0;
            }
            case SINGLE_RETURN_STRONGEST: {
                return 1;
            }
            case DUAL_RETURN: {
                return 2;
            }
            case TRIPLE_RETURN: {
                return 3;
            }
        }
        return 1;
    }
}

