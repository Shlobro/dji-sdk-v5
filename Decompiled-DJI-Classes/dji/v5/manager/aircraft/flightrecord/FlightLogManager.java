/*
 * Decompiled with CFR 0.152.
 */
package dji.v5.manager.aircraft.flightrecord;

import dji.v5.manager.interfaces.IFlightLogManager;

public class FlightLogManager
implements IFlightLogManager {
    private FlightLogManager() {
    }

    public static IFlightLogManager getInstance() {
        return null;
    }

    @Override
    public String getFlightRecordPath() {
        return null;
    }

    @Override
    public String getFlyClogPath() {
        return null;
    }

    /* synthetic */ FlightLogManager(1 var1_1) {
    }

    private static class LazyHolder {
        private static final FlightLogManager INSTANCE = new FlightLogManager(null);

        private LazyHolder() {
        }

        static /* synthetic */ FlightLogManager access$100() {
            return null;
        }
    }
}

