/*
 * Decompiled with CFR 0.152.
 */
package dji.rtk.callback;

import dji.sdk.errorcode.DJIErrorCode;
import dji.sdk.keyvalue.value.rtkbasestation.RTKServiceState;

public class NetworkServiceState {
    private final RTKServiceState channelState;
    private final DJIErrorCode error;

    public RTKServiceState getChannelState() {
        return null;
    }

    public DJIErrorCode getError() {
        return null;
    }

    public NetworkServiceState(RTKServiceState rTKServiceState, DJIErrorCode dJIErrorCode) {
    }

    public static interface StateCallback {
        public void onRTKServiceStateUpdate(RTKServiceState var1);

        public void onRTKErrorCodeUpdate(DJIErrorCode var1);
    }
}

