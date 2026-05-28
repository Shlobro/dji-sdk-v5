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

import com.dji.industry.mission.waypointv2.common.waypointv2.ActuatorAircraftControlFlightCalibration;
import com.dji.industry.mission.waypointv2.common.waypointv2.ActuatorAircraftControlRotateYawParam;
import com.dji.industry.mission.waypointv2.common.waypointv2.ActuatorAircraftControlStartStopFlyParam;
import com.dji.industry.mission.waypointv2.common.waypointv2.AircraftControlActionType;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import java.io.IOException;
import okio.ByteString;

public final class WaypointActionOperatorAircraftControl
extends Message<WaypointActionOperatorAircraftControl, Builder> {
    public static final ProtoAdapter<WaypointActionOperatorAircraftControl> ADAPTER = new ProtoAdapter_WaypointActionOperatorAircraftControl();
    private static final long serialVersionUID = 0L;
    public static final AircraftControlActionType DEFAULT_ACTION_TYPE = AircraftControlActionType.AircraftControlActionTypeUnknown;
    @WireField(tag=1, adapter="dji.waypointv2.common.waypointv2.AircraftControlActionType#ADAPTER")
    public final AircraftControlActionType action_type;
    @WireField(tag=2, adapter="dji.waypointv2.common.waypointv2.ActuatorAircraftControlRotateYawParam#ADAPTER")
    public final ActuatorAircraftControlRotateYawParam rotate_yaw_param;
    @WireField(tag=3, adapter="dji.waypointv2.common.waypointv2.ActuatorAircraftControlStartStopFlyParam#ADAPTER")
    public final ActuatorAircraftControlStartStopFlyParam start_stop_fly_param;
    @WireField(tag=4, adapter="dji.waypointv2.common.waypointv2.ActuatorAircraftControlFlightCalibration#ADAPTER")
    public final ActuatorAircraftControlFlightCalibration flight_calibration_param;

    public WaypointActionOperatorAircraftControl(AircraftControlActionType aircraftControlActionType, ActuatorAircraftControlRotateYawParam actuatorAircraftControlRotateYawParam, ActuatorAircraftControlStartStopFlyParam actuatorAircraftControlStartStopFlyParam, ActuatorAircraftControlFlightCalibration actuatorAircraftControlFlightCalibration) {
    }

    public WaypointActionOperatorAircraftControl(AircraftControlActionType aircraftControlActionType, ActuatorAircraftControlRotateYawParam actuatorAircraftControlRotateYawParam, ActuatorAircraftControlStartStopFlyParam actuatorAircraftControlStartStopFlyParam, ActuatorAircraftControlFlightCalibration actuatorAircraftControlFlightCalibration, ByteString byteString) {
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
    extends Message.Builder<WaypointActionOperatorAircraftControl, Builder> {
        public AircraftControlActionType action_type;
        public ActuatorAircraftControlRotateYawParam rotate_yaw_param;
        public ActuatorAircraftControlStartStopFlyParam start_stop_fly_param;
        public ActuatorAircraftControlFlightCalibration flight_calibration_param;

        public Builder action_type(AircraftControlActionType aircraftControlActionType) {
            return null;
        }

        public Builder rotate_yaw_param(ActuatorAircraftControlRotateYawParam actuatorAircraftControlRotateYawParam) {
            return null;
        }

        public Builder start_stop_fly_param(ActuatorAircraftControlStartStopFlyParam actuatorAircraftControlStartStopFlyParam) {
            return null;
        }

        public Builder flight_calibration_param(ActuatorAircraftControlFlightCalibration actuatorAircraftControlFlightCalibration) {
            return null;
        }

        public WaypointActionOperatorAircraftControl build() {
            return null;
        }
    }

    private static final class ProtoAdapter_WaypointActionOperatorAircraftControl
    extends ProtoAdapter<WaypointActionOperatorAircraftControl> {
        ProtoAdapter_WaypointActionOperatorAircraftControl() {
        }

        public int encodedSize(WaypointActionOperatorAircraftControl waypointActionOperatorAircraftControl) {
            return 0;
        }

        public void encode(ProtoWriter protoWriter, WaypointActionOperatorAircraftControl waypointActionOperatorAircraftControl) throws IOException {
        }

        public WaypointActionOperatorAircraftControl decode(ProtoReader protoReader) throws IOException {
            return null;
        }

        public WaypointActionOperatorAircraftControl redact(WaypointActionOperatorAircraftControl waypointActionOperatorAircraftControl) {
            return null;
        }
    }
}

