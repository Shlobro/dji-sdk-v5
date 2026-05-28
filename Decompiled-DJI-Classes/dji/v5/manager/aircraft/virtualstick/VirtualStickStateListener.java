/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package dji.v5.manager.aircraft.virtualstick;

import androidx.annotation.NonNull;
import dji.sdk.keyvalue.value.flightcontroller.FlightControlAuthorityChangeReason;
import dji.v5.manager.aircraft.virtualstick.VirtualStickState;

public interface VirtualStickStateListener {
    public void onVirtualStickStateUpdate(@NonNull VirtualStickState var1);

    public void onChangeReasonUpdate(@NonNull FlightControlAuthorityChangeReason var1);
}

