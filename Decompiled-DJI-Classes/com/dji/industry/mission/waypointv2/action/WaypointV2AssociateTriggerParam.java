/*
 * Decompiled with CFR 0.152.
 */
package com.dji.industry.mission.waypointv2.action;

import com.dji.industry.mission.waypointv2.action.ActionTypes;

public class WaypointV2AssociateTriggerParam {
    private ActionTypes.AssociatedTimingType associateType;
    private float waitingTime;
    private int associateActionID;

    private WaypointV2AssociateTriggerParam(Builder builder) {
    }

    public ActionTypes.AssociatedTimingType getAssociateType() {
        return null;
    }

    public float getWaitingTime() {
        return 0.0f;
    }

    public int getAssociateActionId() {
        return 0;
    }

    /* synthetic */ WaypointV2AssociateTriggerParam(Builder builder, 1 var2_2) {
    }

    public static final class Builder {
        private ActionTypes.AssociatedTimingType associateType;
        private float waitingTime;
        private int associateActionID;

        public Builder setAssociateType(ActionTypes.AssociatedTimingType associatedTimingType) {
            return null;
        }

        public Builder setWaitingTime(float f2) {
            return null;
        }

        public Builder setAssociateActionID(int n) {
            return null;
        }

        public WaypointV2AssociateTriggerParam build() {
            return null;
        }

        static /* synthetic */ ActionTypes.AssociatedTimingType access$000(Builder builder) {
            return null;
        }

        static /* synthetic */ float access$100(Builder builder) {
            return 0.0f;
        }

        static /* synthetic */ int access$200(Builder builder) {
            return 0;
        }
    }
}

