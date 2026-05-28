/*
 * Decompiled with CFR 0.152.
 */
package com.dji.wpmzsdk.common.utils.kml.transfrom;

import com.dji.wpmzsdk.common.utils.kml.mission.RTKReferenceStationSource;
import com.dji.wpmzsdk.common.utils.kml.transfrom.ModelTransform;
import dji.sdk.wpmz.value.mission.WaylinePositioningType;

public class WaylineRtkTypeTransform
implements ModelTransform<RTKReferenceStationSource, WaylinePositioningType> {
    @Override
    public WaylinePositioningType transFrom(RTKReferenceStationSource rtkReferenceStationSource) {
        if (rtkReferenceStationSource != null) {
            switch (rtkReferenceStationSource) {
                case BASE_STATION: {
                    return WaylinePositioningType.RTK_BASE_STATION;
                }
                case QX_NETWORK_SERVICE: {
                    return WaylinePositioningType.RTK_QIANXUN;
                }
                case DPS: 
                case CUSTOM_NETWORK_SERVICE: 
                case NTRIP_NETWORK_SERVICE: {
                    return WaylinePositioningType.RTK_CUSTOM;
                }
            }
            return WaylinePositioningType.GPS;
        }
        return WaylinePositioningType.GPS;
    }

    @Override
    public RTKReferenceStationSource transTo(WaylinePositioningType waylinePositioningType) {
        if (waylinePositioningType != null) {
            switch (waylinePositioningType) {
                case RTK_CUSTOM: {
                    return RTKReferenceStationSource.CUSTOM_NETWORK_SERVICE;
                }
                case RTK_QIANXUN: {
                    return RTKReferenceStationSource.QX_NETWORK_SERVICE;
                }
                case RTK_BASE_STATION: {
                    return RTKReferenceStationSource.BASE_STATION;
                }
            }
            return RTKReferenceStationSource.NONE;
        }
        return RTKReferenceStationSource.NONE;
    }
}

