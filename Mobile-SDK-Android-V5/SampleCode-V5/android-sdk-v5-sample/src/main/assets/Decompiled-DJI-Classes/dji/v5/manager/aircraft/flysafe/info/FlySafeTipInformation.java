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
import dji.v5.manager.aircraft.flysafe.info.FlySafeTipEvent;
import dji.v5.manager.aircraft.flysafe.info.FlyZoneInformation;
import java.util.List;

public class FlySafeTipInformation {
    private FlySafeTipEvent event;
    private int heightLimit;
    private List<FlyZoneInformation> flyZoneInformation;
    private String description;

    private FlySafeTipInformation() {
    }

    public FlySafeTipEvent getEvent() {
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

    /* synthetic */ FlySafeTipInformation(1 var1_1) {
    }

    static /* synthetic */ FlySafeTipEvent access$102(FlySafeTipInformation flySafeTipInformation, FlySafeTipEvent flySafeTipEvent) {
        return null;
    }

    static /* synthetic */ int access$202(FlySafeTipInformation flySafeTipInformation, int n) {
        return 0;
    }

    static /* synthetic */ List access$302(FlySafeTipInformation flySafeTipInformation, List list) {
        return null;
    }

    static /* synthetic */ String access$402(FlySafeTipInformation flySafeTipInformation, String string2) {
        return null;
    }

    public static final class Builder {
        private FlySafeTipEvent type;
        private int limitHeight;
        private List<FlyZoneInformation> flyZoneInformation;
        private String description;

        private Builder() {
        }

        public static Builder aFlyZoneNoticeInformation() {
            return null;
        }

        public Builder type(FlySafeTipEvent flySafeTipEvent) {
            return null;
        }

        public Builder limitHeight(int n) {
            return null;
        }

        public Builder flyZoneInformation(List<FlyZoneInformation> list) {
            return null;
        }

        public FlySafeTipInformation build(@NonNull Context context) {
            return null;
        }

        private void initDescription(Context context) {
        }
    }
}

