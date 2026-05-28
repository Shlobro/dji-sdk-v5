/*
 * Decompiled with CFR 0.152.
 */
package com.dji.industry.mission.waypointv2.action;

import com.dji.industry.mission.waypointv2.action.ActionTypes;
import com.dji.industry.mission.waypointv2.action.WaypointComplexReachPointTriggerParam;
import com.dji.industry.mission.waypointv2.action.WaypointIntervalTriggerParam;
import com.dji.industry.mission.waypointv2.action.WaypointReachPointTriggerParam;
import com.dji.industry.mission.waypointv2.action.WaypointTrajectoryTriggerParam;
import com.dji.industry.mission.waypointv2.action.WaypointV2AssociateTriggerParam;

public class WaypointTrigger {
    private final ActionTypes.ActionTriggerType triggerType;
    private final WaypointComplexReachPointTriggerParam complexReachPointTriggerParam;
    private final WaypointV2AssociateTriggerParam associateParam;
    private final WaypointTrajectoryTriggerParam trajectoryParam;
    private final WaypointReachPointTriggerParam reachPointParam;
    private final WaypointIntervalTriggerParam intervalTriggerParam;

    private WaypointTrigger(Builder builder) {
    }

    public ActionTypes.ActionTriggerType getTriggerType() {
        return null;
    }

    public WaypointComplexReachPointTriggerParam getComplexReachPointParam() {
        return null;
    }

    public WaypointV2AssociateTriggerParam getAssociateParam() {
        return null;
    }

    public WaypointTrajectoryTriggerParam getTrajectoryParam() {
        return null;
    }

    public WaypointReachPointTriggerParam getReachPointParam() {
        return null;
    }

    public WaypointIntervalTriggerParam getIntervalTriggerParam() {
        return null;
    }

    public String toString() {
        return null;
    }

    /* synthetic */ WaypointTrigger(Builder builder, 1 var2_2) {
    }

    public static final class Builder {
        private ActionTypes.ActionTriggerType triggerType;
        private WaypointComplexReachPointTriggerParam complexReachPointParam;
        private WaypointV2AssociateTriggerParam associateParam;
        private WaypointTrajectoryTriggerParam trajectoryParam;
        private WaypointReachPointTriggerParam simpleReachPointParam;
        private WaypointIntervalTriggerParam intervalTriggerParam;

        public Builder setTriggerType(ActionTypes.ActionTriggerType actionTriggerType) {
            return null;
        }

        public Builder setComplexReachPointParam(WaypointComplexReachPointTriggerParam waypointComplexReachPointTriggerParam) {
            return null;
        }

        public Builder setAssociateParam(WaypointV2AssociateTriggerParam waypointV2AssociateTriggerParam) {
            return null;
        }

        public Builder setTrajectoryParam(WaypointTrajectoryTriggerParam waypointTrajectoryTriggerParam) {
            return null;
        }

        public Builder setReachPointParam(WaypointReachPointTriggerParam waypointReachPointTriggerParam) {
            return null;
        }

        public Builder setIntervalTriggerParam(WaypointIntervalTriggerParam waypointIntervalTriggerParam) {
            return null;
        }

        public WaypointTrigger build() {
            return null;
        }

        static /* synthetic */ ActionTypes.ActionTriggerType access$000(Builder builder) {
            return null;
        }

        static /* synthetic */ WaypointComplexReachPointTriggerParam access$100(Builder builder) {
            return null;
        }

        static /* synthetic */ WaypointV2AssociateTriggerParam access$200(Builder builder) {
            return null;
        }

        static /* synthetic */ WaypointTrajectoryTriggerParam access$300(Builder builder) {
            return null;
        }

        static /* synthetic */ WaypointReachPointTriggerParam access$400(Builder builder) {
            return null;
        }

        static /* synthetic */ WaypointIntervalTriggerParam access$500(Builder builder) {
            return null;
        }
    }
}

