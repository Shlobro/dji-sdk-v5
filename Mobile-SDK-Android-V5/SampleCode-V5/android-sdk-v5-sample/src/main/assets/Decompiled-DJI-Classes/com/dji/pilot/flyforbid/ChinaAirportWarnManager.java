/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.dji.pilot.flyforbid;

import android.content.Context;
import dji.component.flysafe.model.JNIWarnModelWrappers;

public class ChinaAirportWarnManager {
    private static final String KEY_AIRPORT_WARNING_STATE = "key_airport_warning_state";
    private static final String KEY_LAST_TIME_SAVED_AIRPORT_WARNING_STATE = "key_last_time_saved_airport_warning_state";
    private static final int EXPIRATE_TIME_LAST_AIRPORT_WARNING_STATE = 600000;
    private JNIWarnModelWrappers.AirportWarningAreaTakeoffState mAirportWarningAreaTakeoffState;
    private Context mContext;

    public static ChinaAirportWarnManager getInstance() {
        return null;
    }

    private ChinaAirportWarnManager() {
    }

    private void initAirportWarnState() {
    }

    public void setAirportWarningAreaTakeoffState(JNIWarnModelWrappers.AirportWarningAreaTakeoffState airportWarningAreaTakeoffState) {
    }

    /* synthetic */ ChinaAirportWarnManager(1 var1_1) {
    }

    private static final class LazyHolder {
        private static final ChinaAirportWarnManager INSTANCE = new ChinaAirportWarnManager(null);

        private LazyHolder() {
        }

        static /* synthetic */ ChinaAirportWarnManager access$100() {
            return null;
        }
    }
}

