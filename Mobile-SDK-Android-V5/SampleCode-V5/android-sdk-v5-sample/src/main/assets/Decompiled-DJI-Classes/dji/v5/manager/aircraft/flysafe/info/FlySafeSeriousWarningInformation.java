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
import dji.v5.manager.aircraft.flysafe.info.FlySafeSeriousWarningEvent;
import dji.v5.manager.aircraft.flysafe.info.FlyZoneInformation;
import java.util.List;

public class FlySafeSeriousWarningInformation {
    private FlySafeSeriousWarningEvent event;
    private int heightLimit;
    private int countdown;
    private List<FlyZoneInformation> flyZoneInformation;
    private String description;

    public FlySafeSeriousWarningEvent getEvent() {
        return null;
    }

    public int getHeightLimit() {
        return 0;
    }

    public int getCountdown() {
        return 0;
    }

    public List<FlyZoneInformation> getFlyZoneInformation() {
        return null;
    }

    public String getDescription() {
        return null;
    }

    static /* synthetic */ int access$002(FlySafeSeriousWarningInformation flySafeSeriousWarningInformation, int n) {
        return 0;
    }

    static /* synthetic */ int access$102(FlySafeSeriousWarningInformation flySafeSeriousWarningInformation, int n) {
        return 0;
    }

    static /* synthetic */ FlySafeSeriousWarningEvent access$202(FlySafeSeriousWarningInformation flySafeSeriousWarningInformation, FlySafeSeriousWarningEvent flySafeSeriousWarningEvent) {
        return null;
    }

    static /* synthetic */ List access$302(FlySafeSeriousWarningInformation flySafeSeriousWarningInformation, List list) {
        return null;
    }

    static /* synthetic */ String access$402(FlySafeSeriousWarningInformation flySafeSeriousWarningInformation, String string2) {
        return null;
    }

    public static final class Builder {
        private FlySafeSeriousWarningEvent type;
        private int limitHeight;
        private int countDown;
        private List<FlyZoneInformation> flyZoneInformation;
        private String description;

        private Builder() {
        }

        public static Builder aFlyZoneSeriousWarningInformation() {
            return null;
        }

        public Builder type(FlySafeSeriousWarningEvent flySafeSeriousWarningEvent) {
            return null;
        }

        public Builder limitHeight(int n) {
            return null;
        }

        public Builder countDown(int n) {
            return null;
        }

        public Builder flyZoneInformation(List<FlyZoneInformation> list) {
            return null;
        }

        public Builder description(String string2) {
            return null;
        }

        public FlySafeSeriousWarningInformation build(@NonNull Context context) {
            return null;
        }

        private void initDescription(Context context) {
        }
    }
}

