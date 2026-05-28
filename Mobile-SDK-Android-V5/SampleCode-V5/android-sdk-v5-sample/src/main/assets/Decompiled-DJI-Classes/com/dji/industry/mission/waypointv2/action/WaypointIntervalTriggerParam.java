/*
 * Decompiled with CFR 0.152.
 */
package com.dji.industry.mission.waypointv2.action;

import com.dji.industry.mission.waypointv2.action.ActionTypes;

public class WaypointIntervalTriggerParam {
    private final int startIndex;
    private final ActionTypes.ActionIntervalType type;
    private final float interval;

    private WaypointIntervalTriggerParam(Builder builder) {
    }

    public int getStartIndex() {
        return 0;
    }

    public ActionTypes.ActionIntervalType getType() {
        return null;
    }

    public float getInterval() {
        return 0.0f;
    }

    /* synthetic */ WaypointIntervalTriggerParam(Builder builder, 1 var2_2) {
    }

    public static final class Builder {
        private int startIndex;
        private ActionTypes.ActionIntervalType type;
        private float interval;

        public Builder setStartIndex(int n) {
            return null;
        }

        public Builder setType(ActionTypes.ActionIntervalType actionIntervalType) {
            return null;
        }

        public Builder setInterval(float f2) {
            return null;
        }

        public WaypointIntervalTriggerParam build() {
            return null;
        }

        static /* synthetic */ int access$000(Builder builder) {
            return 0;
        }

        static /* synthetic */ ActionTypes.ActionIntervalType access$100(Builder builder) {
            return null;
        }

        static /* synthetic */ float access$200(Builder builder) {
            return 0.0f;
        }
    }
}

