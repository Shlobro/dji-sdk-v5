/*
 * Decompiled with CFR 0.152.
 */
package com.dji.industry.mission.waypointv2.action;

import com.dji.industry.mission.waypointv2.action.WaypointActuator;
import com.dji.industry.mission.waypointv2.action.WaypointTrigger;

public class WaypointV2Action {
    private final int actionID;
    private final WaypointTrigger trigger;
    private final WaypointActuator actuator;

    private WaypointV2Action(Builder builder) {
    }

    public int getActionID() {
        return 0;
    }

    public WaypointTrigger getTrigger() {
        return null;
    }

    public WaypointActuator getActuator() {
        return null;
    }

    public String toString() {
        return null;
    }

    /* synthetic */ WaypointV2Action(Builder builder, 1 var2_2) {
    }

    public static final class Builder {
        private int actionID;
        private WaypointTrigger trigger;
        private WaypointActuator actuator;

        public Builder setActionID(int n) {
            return null;
        }

        public Builder setTrigger(WaypointTrigger waypointTrigger) {
            return null;
        }

        public Builder setActuator(WaypointActuator waypointActuator) {
            return null;
        }

        public WaypointV2Action build() {
            return null;
        }

        static /* synthetic */ int access$000(Builder builder) {
            return 0;
        }

        static /* synthetic */ WaypointTrigger access$100(Builder builder) {
            return null;
        }

        static /* synthetic */ WaypointActuator access$200(Builder builder) {
            return null;
        }
    }
}

