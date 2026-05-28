/*
 * Decompiled with CFR 0.152.
 */
package dji.v5.manager.aircraft.rtk.network;

import dji.sdk.keyvalue.value.rtkbasestation.RTKServiceState;
import dji.v5.common.error.IDJIError;

public interface INetworkServiceInfoListener {
    public void onServiceStateUpdate(RTKServiceState var1);

    public void onErrorCodeUpdate(IDJIError var1);
}

