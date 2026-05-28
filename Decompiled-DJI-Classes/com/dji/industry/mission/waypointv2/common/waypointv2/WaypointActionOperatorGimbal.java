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

import com.dji.industry.mission.waypointv2.common.waypointv2.ActuatorAircraftControlGimbalParam;
import com.dji.industry.mission.waypointv2.common.waypointv2.ActuatorGimbalRotateParam;
import com.dji.industry.mission.waypointv2.common.waypointv2.ActuatorGimbalStartPathShootingParam;
import com.dji.industry.mission.waypointv2.common.waypointv2.ActuatorGimbalStopPathShootingParam;
import com.dji.industry.mission.waypointv2.common.waypointv2.GimbalActionType;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import java.io.IOException;
import okio.ByteString;

public final class WaypointActionOperatorGimbal
extends Message<WaypointActionOperatorGimbal, Builder> {
    public static final ProtoAdapter<WaypointActionOperatorGimbal> ADAPTER = new ProtoAdapter_WaypointActionOperatorGimbal();
    private static final long serialVersionUID = 0L;
    public static final GimbalActionType DEFAULT_ACTION_TYPE = GimbalActionType.GimbalActionTypeUnknown;
    @WireField(tag=1, adapter="com.dji.industry.mission.waypointv2.common.waypointv2.GimbalActionType#ADAPTER")
    public final GimbalActionType action_type;
    @WireField(tag=2, adapter="com.dji.industry.mission.waypointv2.common.waypointv2.ActuatorGimbalRotateParam#ADAPTER")
    public final ActuatorGimbalRotateParam rotate_param;
    @WireField(tag=3, adapter="com.dji.industry.mission.waypointv2.common.waypointv2.ActuatorAircraftControlGimbalParam#ADAPTER")
    public final ActuatorAircraftControlGimbalParam aircraft_control_gimbal_param;
    @WireField(tag=4, adapter="com.dji.industry.mission.waypointv2.common.waypointv2.ActuatorGimbalStartPathShootingParam#ADAPTER")
    public final ActuatorGimbalStartPathShootingParam start_path_shooting_param;
    @WireField(tag=5, adapter="com.dji.industry.mission.waypointv2.common.waypointv2.ActuatorGimbalStopPathShootingParam#ADAPTER")
    public final ActuatorGimbalStopPathShootingParam stop_path_shooting_param;

    public WaypointActionOperatorGimbal(GimbalActionType gimbalActionType, ActuatorGimbalRotateParam actuatorGimbalRotateParam, ActuatorAircraftControlGimbalParam actuatorAircraftControlGimbalParam, ActuatorGimbalStartPathShootingParam actuatorGimbalStartPathShootingParam, ActuatorGimbalStopPathShootingParam actuatorGimbalStopPathShootingParam) {
    }

    public WaypointActionOperatorGimbal(GimbalActionType gimbalActionType, ActuatorGimbalRotateParam actuatorGimbalRotateParam, ActuatorAircraftControlGimbalParam actuatorAircraftControlGimbalParam, ActuatorGimbalStartPathShootingParam actuatorGimbalStartPathShootingParam, ActuatorGimbalStopPathShootingParam actuatorGimbalStopPathShootingParam, ByteString byteString) {
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
    extends Message.Builder<WaypointActionOperatorGimbal, Builder> {
        public GimbalActionType action_type;
        public ActuatorGimbalRotateParam rotate_param;
        public ActuatorAircraftControlGimbalParam aircraft_control_gimbal_param;
        public ActuatorGimbalStartPathShootingParam start_path_shooting_param;
        public ActuatorGimbalStopPathShootingParam stop_path_shooting_param;

        public Builder action_type(GimbalActionType gimbalActionType) {
            return null;
        }

        public Builder rotate_param(ActuatorGimbalRotateParam actuatorGimbalRotateParam) {
            return null;
        }

        public Builder aircraft_control_gimbal_param(ActuatorAircraftControlGimbalParam actuatorAircraftControlGimbalParam) {
            return null;
        }

        public Builder start_path_shooting_param(ActuatorGimbalStartPathShootingParam actuatorGimbalStartPathShootingParam) {
            return null;
        }

        public Builder stop_path_shooting_param(ActuatorGimbalStopPathShootingParam actuatorGimbalStopPathShootingParam) {
            return null;
        }

        public WaypointActionOperatorGimbal build() {
            return null;
        }
    }

    private static final class ProtoAdapter_WaypointActionOperatorGimbal
    extends ProtoAdapter<WaypointActionOperatorGimbal> {
        ProtoAdapter_WaypointActionOperatorGimbal() {
        }

        public int encodedSize(WaypointActionOperatorGimbal waypointActionOperatorGimbal) {
            return 0;
        }

        public void encode(ProtoWriter protoWriter, WaypointActionOperatorGimbal waypointActionOperatorGimbal) throws IOException {
        }

        public WaypointActionOperatorGimbal decode(ProtoReader protoReader) throws IOException {
            return null;
        }

        public WaypointActionOperatorGimbal redact(WaypointActionOperatorGimbal waypointActionOperatorGimbal) {
            return null;
        }
    }
}

