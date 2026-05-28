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

import com.dji.industry.mission.waypointv2.common.waypointv2.WaypointActionActuatorType;
import com.dji.industry.mission.waypointv2.common.waypointv2.WaypointActionOperatorAircraftControl;
import com.dji.industry.mission.waypointv2.common.waypointv2.WaypointActionOperatorCamera;
import com.dji.industry.mission.waypointv2.common.waypointv2.WaypointActionOperatorDJISYS;
import com.dji.industry.mission.waypointv2.common.waypointv2.WaypointActionOperatorGimbal;
import com.dji.industry.mission.waypointv2.common.waypointv2.WaypointActionOperatorNavigation;
import com.dji.industry.mission.waypointv2.common.waypointv2.WaypointActionOperatorPayload;
import com.dji.industry.mission.waypointv2.common.waypointv2.WaypointActionOperatorSpray;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import java.io.IOException;
import okio.ByteString;

public final class WaypointActionActuator
extends Message<WaypointActionActuator, Builder> {
    public static final ProtoAdapter<WaypointActionActuator> ADAPTER = new ProtoAdapter_WaypointActionActuator();
    private static final long serialVersionUID = 0L;
    public static final WaypointActionActuatorType DEFAULT_ACTUATOR_TYPE = WaypointActionActuatorType.ActuatorTypUnknown;
    public static final Integer DEFAULT_ACTUATOR_INDEX = 0;
    public static final Integer DEFAULT_SUB_ACTUATOR_INDEX = 0;
    @WireField(tag=1, adapter="com.dji.industry.mission.waypointv2.common.waypointv2.WaypointActionActuatorType#ADAPTER")
    public final WaypointActionActuatorType actuator_type;
    @WireField(tag=2, adapter="com.squareup.wire.ProtoAdapter#UINT32")
    public final Integer actuator_index;
    @WireField(tag=3, adapter="com.squareup.wire.ProtoAdapter#UINT32")
    public final Integer sub_actuator_index;
    @WireField(tag=4, adapter="com.dji.industry.mission.waypointv2.common.waypointv2.WaypointActionOperatorSpray#ADAPTER")
    public final WaypointActionOperatorSpray spray_operator;
    @WireField(tag=5, adapter="com.dji.industry.mission.waypointv2.common.waypointv2.WaypointActionOperatorCamera#ADAPTER")
    public final WaypointActionOperatorCamera camera_operator;
    @WireField(tag=6, adapter="com.dji.industry.mission.waypointv2.common.waypointv2.WaypointActionOperatorGimbal#ADAPTER")
    public final WaypointActionOperatorGimbal gimbal_operator;
    @WireField(tag=7, adapter="com.dji.industry.mission.waypointv2.common.waypointv2.WaypointActionOperatorAircraftControl#ADAPTER")
    public final WaypointActionOperatorAircraftControl aircraft_control_operator;
    @WireField(tag=8, adapter="com.dji.industry.mission.waypointv2.common.waypointv2.WaypointActionOperatorPayload#ADAPTER")
    public final WaypointActionOperatorPayload payload_control_operator;
    @WireField(tag=9, adapter="com.dji.industry.mission.waypointv2.common.waypointv2.WaypointActionOperatorNavigation#ADAPTER")
    public final WaypointActionOperatorNavigation navigation_operator;
    @WireField(tag=10, adapter="com.dji.industry.mission.waypointv2.common.waypointv2.WaypointActionOperatorDJISYS#ADAPTER")
    public final WaypointActionOperatorDJISYS djisys_operator;

    public WaypointActionActuator(WaypointActionActuatorType waypointActionActuatorType, Integer n, Integer n2, WaypointActionOperatorSpray waypointActionOperatorSpray, WaypointActionOperatorCamera waypointActionOperatorCamera, WaypointActionOperatorGimbal waypointActionOperatorGimbal, WaypointActionOperatorAircraftControl waypointActionOperatorAircraftControl, WaypointActionOperatorPayload waypointActionOperatorPayload, WaypointActionOperatorNavigation waypointActionOperatorNavigation, WaypointActionOperatorDJISYS waypointActionOperatorDJISYS) {
    }

    public WaypointActionActuator(WaypointActionActuatorType waypointActionActuatorType, Integer n, Integer n2, WaypointActionOperatorSpray waypointActionOperatorSpray, WaypointActionOperatorCamera waypointActionOperatorCamera, WaypointActionOperatorGimbal waypointActionOperatorGimbal, WaypointActionOperatorAircraftControl waypointActionOperatorAircraftControl, WaypointActionOperatorPayload waypointActionOperatorPayload, WaypointActionOperatorNavigation waypointActionOperatorNavigation, WaypointActionOperatorDJISYS waypointActionOperatorDJISYS, ByteString byteString) {
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
    extends Message.Builder<WaypointActionActuator, Builder> {
        public WaypointActionActuatorType actuator_type;
        public Integer actuator_index;
        public Integer sub_actuator_index;
        public WaypointActionOperatorSpray spray_operator;
        public WaypointActionOperatorCamera camera_operator;
        public WaypointActionOperatorGimbal gimbal_operator;
        public WaypointActionOperatorAircraftControl aircraft_control_operator;
        public WaypointActionOperatorPayload payload_control_operator;
        public WaypointActionOperatorNavigation navigation_operator;
        public WaypointActionOperatorDJISYS djisys_operator;

        public Builder actuator_type(WaypointActionActuatorType waypointActionActuatorType) {
            return null;
        }

        public Builder actuator_index(Integer n) {
            return null;
        }

        public Builder sub_actuator_index(Integer n) {
            return null;
        }

        public Builder spray_operator(WaypointActionOperatorSpray waypointActionOperatorSpray) {
            return null;
        }

        public Builder camera_operator(WaypointActionOperatorCamera waypointActionOperatorCamera) {
            return null;
        }

        public Builder gimbal_operator(WaypointActionOperatorGimbal waypointActionOperatorGimbal) {
            return null;
        }

        public Builder aircraft_control_operator(WaypointActionOperatorAircraftControl waypointActionOperatorAircraftControl) {
            return null;
        }

        public Builder payload_control_operator(WaypointActionOperatorPayload waypointActionOperatorPayload) {
            return null;
        }

        public Builder navigation_operator(WaypointActionOperatorNavigation waypointActionOperatorNavigation) {
            return null;
        }

        public Builder djisys_operator(WaypointActionOperatorDJISYS waypointActionOperatorDJISYS) {
            return null;
        }

        public WaypointActionActuator build() {
            return null;
        }
    }

    private static final class ProtoAdapter_WaypointActionActuator
    extends ProtoAdapter<WaypointActionActuator> {
        ProtoAdapter_WaypointActionActuator() {
        }

        public int encodedSize(WaypointActionActuator waypointActionActuator) {
            return 0;
        }

        public void encode(ProtoWriter protoWriter, WaypointActionActuator waypointActionActuator) throws IOException {
        }

        public WaypointActionActuator decode(ProtoReader protoReader) throws IOException {
            return null;
        }

        public WaypointActionActuator redact(WaypointActionActuator waypointActionActuator) {
            return null;
        }
    }
}

