/*
 * Decompiled with CFR 0.152.
 */
package com.dji.industry.mission.waypointv2.action;

import com.dji.industry.mission.waypointv2.action.ActionTypes;

public class WaypointDJISYSRecordPointCloudParam {
    private final ActionTypes.RecordPointCloudOperateType type;
    private final long recordInfo;

    public WaypointDJISYSRecordPointCloudParam(Builder builder) {
    }

    public ActionTypes.RecordPointCloudOperateType getType() {
        return null;
    }

    public long getRecordInfo() {
        return 0L;
    }

    public static class Builder {
        private ActionTypes.RecordPointCloudOperateType type;
        private long recordInfo;

        public Builder type(ActionTypes.RecordPointCloudOperateType recordPointCloudOperateType) {
            return null;
        }

        public Builder recordInfo(long l2) {
            return null;
        }

        public WaypointDJISYSRecordPointCloudParam build() {
            return null;
        }

        static /* synthetic */ ActionTypes.RecordPointCloudOperateType access$000(Builder builder) {
            return null;
        }

        static /* synthetic */ long access$100(Builder builder) {
            return 0L;
        }
    }
}

