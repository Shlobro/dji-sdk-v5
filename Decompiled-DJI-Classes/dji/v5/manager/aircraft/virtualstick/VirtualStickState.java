/*
 * Decompiled with CFR 0.152.
 */
package dji.v5.manager.aircraft.virtualstick;

import dji.sdk.keyvalue.value.flightcontroller.FlightControlAuthority;

public class VirtualStickState {
    boolean isVirtualStickEnable;
    boolean isVirtualStickAdvancedModeEnabled;
    FlightControlAuthority currentFlightControlAuthorityOwner;

    public VirtualStickState(boolean bl, FlightControlAuthority flightControlAuthority, boolean bl2) {
    }

    public boolean isVirtualStickEnable() {
        return false;
    }

    public boolean isVirtualStickAdvancedModeEnabled() {
        return false;
    }

    public FlightControlAuthority getCurrentFlightControlAuthorityOwner() {
        return null;
    }
}

