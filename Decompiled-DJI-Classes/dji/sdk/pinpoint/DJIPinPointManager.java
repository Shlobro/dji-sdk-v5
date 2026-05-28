/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.pinpoint;

import dji.sdk.keyvalue.value.flightcontroller.PinPointParamMsg;
import dji.sdk.keyvalue.value.flightcontroller.PinPointResultMsg;

public class DJIPinPointManager {
    private int mDeviceID;
    private int mProductID;
    private static DJIPinPointManager instance = null;

    private DJIPinPointManager(int n, int n2) {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static DJIPinPointManager getInstance() {
        return null;
    }

    public PinPointResultMsg gpsPointToLiveview(PinPointParamMsg pinPointParamMsg) {
        return null;
    }
}

