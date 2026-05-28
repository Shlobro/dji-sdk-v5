/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package com.dji.industry.mission.waypointv2.action;

import androidx.annotation.NonNull;
import com.dji.industry.mission.waypointv2.action.ActionTypes;
import com.dji.industry.mission.waypointv2.action.WaypointDJISYSRecordPointCloudParam;

public class WaypointDJISYSActuatorParam {
    private ActionTypes.DJISYSType djiSYSType;
    private WaypointDJISYSRecordPointCloudParam recordPointCloudParam;

    private WaypointDJISYSActuatorParam(Builder builder) {
    }

    @NonNull
    public ActionTypes.DJISYSType getDjiSYSType() {
        return null;
    }

    public WaypointDJISYSRecordPointCloudParam getRecordPointCloudParam() {
        return null;
    }

    /* synthetic */ WaypointDJISYSActuatorParam(Builder builder, 1 var2_2) {
    }

    public static final class Builder {
        private ActionTypes.DJISYSType djiSYSType;
        private WaypointDJISYSRecordPointCloudParam recordPointCloudParam;

        public Builder setDJISYSType(ActionTypes.DJISYSType dJISYSType) {
            return null;
        }

        public Builder setRecordPointCloudParam(WaypointDJISYSRecordPointCloudParam waypointDJISYSRecordPointCloudParam) {
            return null;
        }

        public WaypointDJISYSActuatorParam build() {
            return null;
        }

        static /* synthetic */ ActionTypes.DJISYSType access$000(Builder builder) {
            return null;
        }

        static /* synthetic */ WaypointDJISYSRecordPointCloudParam access$100(Builder builder) {
            return null;
        }
    }
}

