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
import dji.v5.manager.aircraft.flysafe.info.FlySafeWarningEvent;
import dji.v5.manager.aircraft.flysafe.info.FlyZoneInformation;
import java.util.List;

public class FlySafeWarningInformation {
    private FlySafeWarningEvent event;
    private int heightLimit;
    private List<FlyZoneInformation> flyZoneInformation;
    private String description;

    public FlySafeWarningEvent getEvent() {
        return null;
    }

    public int getHeightLimit() {
        return 0;
    }

    public List<FlyZoneInformation> getFlyZoneInformation() {
        return null;
    }

    public String getDescription() {
        return null;
    }

    static /* synthetic */ FlySafeWarningEvent access$002(FlySafeWarningInformation flySafeWarningInformation, FlySafeWarningEvent flySafeWarningEvent) {
        return null;
    }

    static /* synthetic */ List access$102(FlySafeWarningInformation flySafeWarningInformation, List list) {
        return null;
    }

    static /* synthetic */ int access$202(FlySafeWarningInformation flySafeWarningInformation, int n) {
        return 0;
    }

    static /* synthetic */ String access$302(FlySafeWarningInformation flySafeWarningInformation, String string2) {
        return null;
    }

    public static final class Builder {
        public FlySafeWarningEvent flySafeWarningEvent;
        public int limitHeight;
        public List<FlyZoneInformation> flyZoneInformation;
        private String description;

        private Builder() {
        }

        public static Builder aFlyZoneWarningInformation() {
            return null;
        }

        public Builder type(FlySafeWarningEvent flySafeWarningEvent) {
            return null;
        }

        public Builder limitHeight(int n) {
            return null;
        }

        public Builder flyZoneInformation(List<FlyZoneInformation> list) {
            return null;
        }

        public FlySafeWarningInformation build(@NonNull Context context) {
            return null;
        }

        private void initDescription(Context context) {
        }
    }
}

