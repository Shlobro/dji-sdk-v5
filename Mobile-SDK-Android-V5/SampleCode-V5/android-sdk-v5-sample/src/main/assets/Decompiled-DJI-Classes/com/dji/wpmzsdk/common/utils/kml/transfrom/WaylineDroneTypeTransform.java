/*
 * Decompiled with CFR 0.152.
 */
package com.dji.wpmzsdk.common.utils.kml.transfrom;

import com.dji.wpmzsdk.common.utils.kml.model.WaypointDroneType;
import com.dji.wpmzsdk.common.utils.kml.transfrom.ModelTransform;
import dji.sdk.wpmz.value.mission.WaylineDroneInfo;
import dji.sdk.wpmz.value.mission.WaylineDroneType;

public class WaylineDroneTypeTransform
implements ModelTransform<WaypointDroneType, WaylineDroneInfo> {
    @Override
    public WaylineDroneInfo transFrom(WaypointDroneType waypointDroneType) {
        WaylineDroneInfo droneInfo = new WaylineDroneInfo();
        switch (waypointDroneType) {
            case PM430: {
                droneInfo.setDroneType(WaylineDroneType.PM430);
                break;
            }
            case PM431: {
                droneInfo.setDroneType(WaylineDroneType.PM431);
                break;
            }
            case PM320: {
                droneInfo.setDroneType(WaylineDroneType.PM320);
                break;
            }
            case PM320_T_RTK: {
                droneInfo.setDroneType(WaylineDroneType.PM320);
                droneInfo.setDroneSubType(1);
                break;
            }
            case WM265_E: {
                droneInfo.setDroneSubType(0);
                droneInfo.setDroneType(WaylineDroneType.WM265);
                break;
            }
            case WM265_T: {
                droneInfo.setDroneSubType(1);
                droneInfo.setDroneType(WaylineDroneType.WM265);
                break;
            }
            case WM265_M: {
                droneInfo.setDroneSubType(2);
                droneInfo.setDroneType(WaylineDroneType.WM265);
                break;
            }
            case P4R: {
                droneInfo.setDroneType(WaylineDroneType.Phantom4RTK);
                break;
            }
        }
        return droneInfo;
    }

    @Override
    public WaypointDroneType transTo(WaylineDroneInfo droneInfo) {
        switch (droneInfo.getDroneType()) {
            case PM430: {
                return WaypointDroneType.PM430;
            }
            case PM431: {
                return WaypointDroneType.PM431;
            }
            case PM320: {
                if (droneInfo.getDroneSubType() == 1) {
                    return WaypointDroneType.PM320_T_RTK;
                }
                return WaypointDroneType.PM320;
            }
            case WM265: {
                if (droneInfo.getDroneSubType() == 1) {
                    return WaypointDroneType.WM265_T;
                }
                if (droneInfo.getDroneSubType() == 2) {
                    return WaypointDroneType.WM265_M;
                }
                return WaypointDroneType.WM265_E;
            }
            case Phantom4RTK: {
                return WaypointDroneType.P4R;
            }
        }
        return WaypointDroneType.COMMON;
    }
}

