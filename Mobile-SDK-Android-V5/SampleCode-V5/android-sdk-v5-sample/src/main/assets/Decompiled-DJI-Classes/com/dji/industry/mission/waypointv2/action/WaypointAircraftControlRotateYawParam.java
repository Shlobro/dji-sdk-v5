/*
 * Decompiled with CFR 0.152.
 */
package com.dji.industry.mission.waypointv2.action;

import com.dji.industry.mission.waypointv2.WaypointV2MissionTypes;

public class WaypointAircraftControlRotateYawParam {
    private final boolean isRelative;
    private WaypointV2MissionTypes.WaypointV2TurnMode direction;
    private final float yawAngle;

    private WaypointAircraftControlRotateYawParam(Builder builder) {
    }

    public boolean isRelative() {
        return false;
    }

    public WaypointV2MissionTypes.WaypointV2TurnMode getDirection() {
        return null;
    }

    public float getYawAngle() {
        return 0.0f;
    }

    /* synthetic */ WaypointAircraftControlRotateYawParam(Builder builder, 1 var2_2) {
    }

    public static final class Builder {
        private boolean isRelative;
        private WaypointV2MissionTypes.WaypointV2TurnMode direction;
        private float yawAngle;

        public Builder setRelative(boolean bl) {
            return null;
        }

        public Builder setDirection(WaypointV2MissionTypes.WaypointV2TurnMode waypointV2TurnMode) {
            return null;
        }

        public Builder setYawAngle(float f2) {
            return null;
        }

        public WaypointAircraftControlRotateYawParam build() {
            return null;
        }

        static /* synthetic */ boolean access$000(Builder builder) {
            return false;
        }

        static /* synthetic */ WaypointV2MissionTypes.WaypointV2TurnMode access$100(Builder builder) {
            return null;
        }

        static /* synthetic */ float access$200(Builder builder) {
            return 0.0f;
        }
    }
}

