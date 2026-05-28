/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  androidx.annotation.NonNull
 */
package dji.v5.manager.aircraft.flysafe.info;

import android.content.Context;
import androidx.annotation.NonNull;
import dji.v5.manager.aircraft.flysafe.info.FlySafeReturnToHomeEvent;

public class FlySafeReturnToHomeInformation {
    private FlySafeReturnToHomeEvent event;
    private String description;

    private FlySafeReturnToHomeInformation() {
    }

    public FlySafeReturnToHomeEvent getEvent() {
        return null;
    }

    public String getDescription() {
        return null;
    }

    /* synthetic */ FlySafeReturnToHomeInformation(1 var1_1) {
    }

    static /* synthetic */ FlySafeReturnToHomeEvent access$102(FlySafeReturnToHomeInformation flySafeReturnToHomeInformation, FlySafeReturnToHomeEvent flySafeReturnToHomeEvent) {
        return null;
    }

    static /* synthetic */ String access$202(FlySafeReturnToHomeInformation flySafeReturnToHomeInformation, String string2) {
        return null;
    }

    public static final class Builder {
        private FlySafeReturnToHomeEvent type;
        private String description;

        private Builder() {
        }

        public static Builder aFlyZoneRTHInformation() {
            return null;
        }

        public Builder type(FlySafeReturnToHomeEvent flySafeReturnToHomeEvent) {
            return null;
        }

        public FlySafeReturnToHomeInformation build(@NonNull Context context) {
            return null;
        }

        private void initDescription(Context context) {
        }
    }
}

