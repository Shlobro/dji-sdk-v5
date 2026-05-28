/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
package dji.v5.manager.aircraft.rtk;

import dji.sdk.keyvalue.value.rtkbasestation.RTKReferenceStationSource;
import dji.sdk.keyvalue.value.rtkmobilestation.RTKError;
import dji.sdk.keyvalue.value.rtkmobilestation.RTKSatelliteInfo;
import org.jetbrains.annotations.Nullable;

public class RTKSystemState {
    public static final String TAG = "RTKSystemState";
    private boolean isRTKConnected;
    private boolean isRTKEnabled;
    private boolean isRTKHealthy;
    private boolean isRTKMaintainAccuracyEnabled;
    @Nullable
    private RTKSatelliteInfo satelliteInfo;
    @Nullable
    private RTKError error;
    private RTKReferenceStationSource rtkReferenceStationSource;

    public boolean getRTKConnected() {
        return false;
    }

    public boolean getRTKHealthy() {
        return false;
    }

    public RTKSatelliteInfo getSatelliteInfo() {
        return null;
    }

    public RTKError getError() {
        return null;
    }

    public RTKReferenceStationSource getRtkReferenceStationSource() {
        return null;
    }

    public boolean getIsRTKEnabled() {
        return false;
    }

    public boolean getRTKMaintainAccuracyEnabled() {
        return false;
    }

    public String toString() {
        return null;
    }
}

