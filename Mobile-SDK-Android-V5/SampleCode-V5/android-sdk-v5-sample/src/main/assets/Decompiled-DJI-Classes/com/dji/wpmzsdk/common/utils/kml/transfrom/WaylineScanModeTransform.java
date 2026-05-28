/*
 * Decompiled with CFR 0.152.
 */
package com.dji.wpmzsdk.common.utils.kml.transfrom;

import com.dji.wpmzsdk.common.utils.kml.model.ScanMode;
import com.dji.wpmzsdk.common.utils.kml.transfrom.ModelTransform;
import dji.sdk.wpmz.value.mission.WaylinePayloadScanningMode;
import java.util.Objects;

public class WaylineScanModeTransform
implements ModelTransform<Integer, WaylinePayloadScanningMode> {
    @Override
    public WaylinePayloadScanningMode transFrom(Integer mode) {
        if (Objects.equals(mode, ScanMode.REPEAT.value())) {
            return WaylinePayloadScanningMode.REPETITIVE;
        }
        if (Objects.equals(mode, ScanMode.NON_REPEAT.value())) {
            return WaylinePayloadScanningMode.NON_REPETITIVE;
        }
        return WaylinePayloadScanningMode.REPETITIVE;
    }

    @Override
    public Integer transTo(WaylinePayloadScanningMode mode) {
        if (mode == WaylinePayloadScanningMode.REPETITIVE) {
            return ScanMode.REPEAT.value();
        }
        if (mode == WaylinePayloadScanningMode.NON_REPETITIVE) {
            return ScanMode.NON_REPEAT.value();
        }
        return ScanMode.REPEAT.value();
    }
}

