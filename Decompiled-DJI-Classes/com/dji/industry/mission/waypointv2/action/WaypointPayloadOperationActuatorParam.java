/*
 * Decompiled with CFR 0.152.
 */
package com.dji.industry.mission.waypointv2.action;

import com.dji.industry.mission.waypointv2.action.WaypointPayloadOperationParam;

public class WaypointPayloadOperationActuatorParam {
    private final int operation;
    private final WaypointPayloadOperationParam operationParam;

    private WaypointPayloadOperationActuatorParam(Builder builder) {
    }

    public int getOperation() {
        return 0;
    }

    public WaypointPayloadOperationParam getOperationParam() {
        return null;
    }

    /* synthetic */ WaypointPayloadOperationActuatorParam(Builder builder, 1 var2_2) {
    }

    public static final class Builder {
        private int operationType;
        private WaypointPayloadOperationParam operationParam;

        public Builder setOperationType(int n) {
            return null;
        }

        public Builder setOperationParam(WaypointPayloadOperationParam waypointPayloadOperationParam) {
            return null;
        }

        public WaypointPayloadOperationActuatorParam build() {
            return null;
        }

        static /* synthetic */ int access$000(Builder builder) {
            return 0;
        }

        static /* synthetic */ WaypointPayloadOperationParam access$100(Builder builder) {
            return null;
        }
    }
}

