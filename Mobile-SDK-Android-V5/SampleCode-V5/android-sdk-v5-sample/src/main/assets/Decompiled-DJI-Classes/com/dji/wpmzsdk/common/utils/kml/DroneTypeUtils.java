/*
 * Decompiled with CFR 0.152.
 */
package com.dji.wpmzsdk.common.utils.kml;

import com.dji.wpmzsdk.common.utils.kml.model.WaypointDroneType;

public class DroneTypeUtils {
    private DroneTypeUtils() {
    }

    public static boolean isPM430OrPM431(WaypointDroneType droneType) {
        return droneType == WaypointDroneType.PM430 || droneType == WaypointDroneType.PM431;
    }

    public static boolean isPM320(WaypointDroneType droneType) {
        return droneType == WaypointDroneType.PM320 || droneType == WaypointDroneType.PM320_T_RTK;
    }

    public static boolean isModernDroneSerial(WaypointDroneType droneType) {
        return droneType == WaypointDroneType.PM430 || droneType == WaypointDroneType.PM431 || droneType == WaypointDroneType.PM320 || droneType == WaypointDroneType.PM320_T_RTK || droneType == WaypointDroneType.WM265_E || droneType == WaypointDroneType.WM265_M || droneType == WaypointDroneType.WM265_T;
    }

    public static boolean isWM265(WaypointDroneType droneType) {
        return droneType == WaypointDroneType.WM265_E || droneType == WaypointDroneType.WM265_T || droneType == WaypointDroneType.WM265_M;
    }

    public static boolean isPM430(WaypointDroneType droneType) {
        return droneType == WaypointDroneType.PM430;
    }
}

