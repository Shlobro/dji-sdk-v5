/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.squareup.wire.Message
 *  com.squareup.wire.Message$Builder
 *  com.squareup.wire.ProtoAdapter
 *  com.squareup.wire.ProtoReader
 *  com.squareup.wire.ProtoWriter
 *  com.squareup.wire.WireField
 *  okio.ByteString
 */
package com.dji.industry.mission.waypointv2.common.waypointv2;

import com.dji.industry.mission.waypointv2.common.waypointv2.WaypointActionAssociateTriggerParam;
import com.dji.industry.mission.waypointv2.common.waypointv2.WaypointActionReachPointsTriggerParam;
import com.dji.industry.mission.waypointv2.common.waypointv2.WaypointActionSimpleIntervalParam;
import com.dji.industry.mission.waypointv2.common.waypointv2.WaypointActionSimpleReachPointParam;
import com.dji.industry.mission.waypointv2.common.waypointv2.WaypointActionTrajectoryTriggerParam;
import com.dji.industry.mission.waypointv2.common.waypointv2.WaypointActionTriggerType;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import java.io.IOException;
import okio.ByteString;

public final class WaypointActionTrigger
extends Message<WaypointActionTrigger, Builder> {
    public static final ProtoAdapter<WaypointActionTrigger> ADAPTER = new ProtoAdapter_WaypointActionTrigger();
    private static final long serialVersionUID = 0L;
    public static final WaypointActionTriggerType DEFAULT_TRIGGER_TYPE = WaypointActionTriggerType.TriggerTypeUnknown;
    @WireField(tag=1, adapter="com.dji.industry.mission.waypointv2.common.waypointv2.WaypointActionTriggerType#ADAPTER")
    public final WaypointActionTriggerType trigger_type;
    @WireField(tag=2, adapter="com.dji.industry.mission.waypointv2.common.waypointv2.WaypointActionReachPointsTriggerParam#ADAPTER")
    public final WaypointActionReachPointsTriggerParam reach_point_param;
    @WireField(tag=3, adapter="com.dji.industry.mission.waypointv2.common.waypointv2.WaypointActionAssociateTriggerParam#ADAPTER")
    public final WaypointActionAssociateTriggerParam associate_param;
    @WireField(tag=4, adapter="com.dji.industry.mission.waypointv2.common.waypointv2.WaypointActionTrajectoryTriggerParam#ADAPTER")
    public final WaypointActionTrajectoryTriggerParam trajectory_param;
    @WireField(tag=5, adapter="com.dji.industry.mission.waypointv2.common.waypointv2.WaypointActionSimpleIntervalParam#ADAPTER")
    public final WaypointActionSimpleIntervalParam simple_interval_param;
    @WireField(tag=6, adapter="com.dji.industry.mission.waypointv2.common.waypointv2.WaypointActionSimpleReachPointParam#ADAPTER")
    public final WaypointActionSimpleReachPointParam simple_reach_point_param;

    public WaypointActionTrigger(WaypointActionTriggerType waypointActionTriggerType, WaypointActionReachPointsTriggerParam waypointActionReachPointsTriggerParam, WaypointActionAssociateTriggerParam waypointActionAssociateTriggerParam, WaypointActionTrajectoryTriggerParam waypointActionTrajectoryTriggerParam, WaypointActionSimpleIntervalParam waypointActionSimpleIntervalParam, WaypointActionSimpleReachPointParam waypointActionSimpleReachPointParam) {
    }

    public WaypointActionTrigger(WaypointActionTriggerType waypointActionTriggerType, WaypointActionReachPointsTriggerParam waypointActionReachPointsTriggerParam, WaypointActionAssociateTriggerParam waypointActionAssociateTriggerParam, WaypointActionTrajectoryTriggerParam waypointActionTrajectoryTriggerParam, WaypointActionSimpleIntervalParam waypointActionSimpleIntervalParam, WaypointActionSimpleReachPointParam waypointActionSimpleReachPointParam, ByteString byteString) {
    }

    public Builder newBuilder() {
        return null;
    }

    public boolean equals(Object object) {
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        return null;
    }

    public static final class Builder
    extends Message.Builder<WaypointActionTrigger, Builder> {
        public WaypointActionTriggerType trigger_type;
        public WaypointActionReachPointsTriggerParam reach_point_param;
        public WaypointActionAssociateTriggerParam associate_param;
        public WaypointActionTrajectoryTriggerParam trajectory_param;
        public WaypointActionSimpleIntervalParam simple_interval_param;
        public WaypointActionSimpleReachPointParam simple_reach_point_param;

        public Builder trigger_type(WaypointActionTriggerType waypointActionTriggerType) {
            return null;
        }

        public Builder reach_point_param(WaypointActionReachPointsTriggerParam waypointActionReachPointsTriggerParam) {
            return null;
        }

        public Builder associate_param(WaypointActionAssociateTriggerParam waypointActionAssociateTriggerParam) {
            return null;
        }

        public Builder trajectory_param(WaypointActionTrajectoryTriggerParam waypointActionTrajectoryTriggerParam) {
            return null;
        }

        public Builder simple_interval_param(WaypointActionSimpleIntervalParam waypointActionSimpleIntervalParam) {
            return null;
        }

        public Builder simple_reach_point_param(WaypointActionSimpleReachPointParam waypointActionSimpleReachPointParam) {
            return null;
        }

        public WaypointActionTrigger build() {
            return null;
        }
    }

    private static final class ProtoAdapter_WaypointActionTrigger
    extends ProtoAdapter<WaypointActionTrigger> {
        ProtoAdapter_WaypointActionTrigger() {
        }

        public int encodedSize(WaypointActionTrigger waypointActionTrigger) {
            return 0;
        }

        public void encode(ProtoWriter protoWriter, WaypointActionTrigger waypointActionTrigger) throws IOException {
        }

        public WaypointActionTrigger decode(ProtoReader protoReader) throws IOException {
            return null;
        }

        public WaypointActionTrigger redact(WaypointActionTrigger waypointActionTrigger) {
            return null;
        }
    }
}

