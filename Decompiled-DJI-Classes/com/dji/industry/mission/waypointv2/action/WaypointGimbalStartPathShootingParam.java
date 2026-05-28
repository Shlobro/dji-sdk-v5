/*
 * Decompiled with CFR 0.152.
 */
package com.dji.industry.mission.waypointv2.action;

import com.dji.industry.mission.waypointv2.action.ActionTypes;
import com.dji.industry.mission.waypointv2.action.WaypointGimbalPathPointInfo;
import java.util.List;

public class WaypointGimbalStartPathShootingParam {
    private final ActionTypes.GimbalPathCycleMode mode;
    private final int pointNum;
    private final List<WaypointGimbalPathPointInfo> pointInfo;

    public WaypointGimbalStartPathShootingParam(Builder builder) {
    }

    public ActionTypes.GimbalPathCycleMode getMode() {
        return null;
    }

    public int getPointNum() {
        return 0;
    }

    public List<WaypointGimbalPathPointInfo> getPointInfo() {
        return null;
    }

    public static class Builder {
        private ActionTypes.GimbalPathCycleMode mode;
        private int pointNum;
        private List<WaypointGimbalPathPointInfo> pointInfo;

        public Builder mode(ActionTypes.GimbalPathCycleMode gimbalPathCycleMode) {
            return null;
        }

        public Builder pointNum(int n) {
            return null;
        }

        public Builder pointInfo(List<WaypointGimbalPathPointInfo> list) {
            return null;
        }

        public WaypointGimbalStartPathShootingParam build() {
            return null;
        }

        static /* synthetic */ ActionTypes.GimbalPathCycleMode access$000(Builder builder) {
            return null;
        }

        static /* synthetic */ int access$100(Builder builder) {
            return 0;
        }

        static /* synthetic */ List access$200(Builder builder) {
            return null;
        }
    }
}

