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

import com.dji.industry.mission.waypointv2.common.waypointv2.CalibrationType;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import java.io.IOException;
import okio.ByteString;

public final class ActuatorAircraftControlFlightCalibration
extends Message<ActuatorAircraftControlFlightCalibration, Builder> {
    public static final ProtoAdapter<ActuatorAircraftControlFlightCalibration> PROTO_ADAPTER = new ProtoAdapter_ActuatorAircraftControlFlightCalibration();
    private static final long serialVersionUID = 0L;
    public static final CalibrationType DEFAULT_CALIBRATION_TYPE = CalibrationType.SpeedUpAndSlowDown;
    public static final Integer DEFAULT_CALIBRATION_TIME = 0;
    public static final Float DEFAULT_CALIBRATION_DIS = Float.valueOf(0.0f);
    public static final Boolean DEFAULT_IS_FORWARD_CALIBRATION = false;
    @WireField(tag=1, adapter="dji.waypointv2.common.waypointv2.CalibrationType#ADAPTER")
    public final CalibrationType calibration_type;
    @WireField(tag=2, adapter="com.squareup.wire.ProtoAdapter#UINT32")
    public final Integer calibration_time;
    @WireField(tag=3, adapter="com.squareup.wire.ProtoAdapter#FLOAT")
    public final Float calibration_dis;
    @WireField(tag=4, adapter="com.squareup.wire.ProtoAdapter#BOOL")
    public final Boolean is_forward_calibration;

    public ActuatorAircraftControlFlightCalibration(CalibrationType calibrationType, Integer n, Float f2, Boolean bl) {
    }

    public ActuatorAircraftControlFlightCalibration(CalibrationType calibrationType, Integer n, Float f2, Boolean bl, ByteString byteString) {
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
    extends Message.Builder<ActuatorAircraftControlFlightCalibration, Builder> {
        public CalibrationType calibration_type;
        public Integer calibration_time;
        public Float calibration_dis;
        public Boolean is_forward_calibration;

        public Builder calibration_type(CalibrationType calibrationType) {
            return null;
        }

        public Builder calibration_time(Integer n) {
            return null;
        }

        public Builder calibration_dis(Float f2) {
            return null;
        }

        public Builder is_forward_calibration(Boolean bl) {
            return null;
        }

        public ActuatorAircraftControlFlightCalibration build() {
            return null;
        }
    }

    private static final class ProtoAdapter_ActuatorAircraftControlFlightCalibration
    extends ProtoAdapter<ActuatorAircraftControlFlightCalibration> {
        ProtoAdapter_ActuatorAircraftControlFlightCalibration() {
        }

        public int encodedSize(ActuatorAircraftControlFlightCalibration actuatorAircraftControlFlightCalibration) {
            return 0;
        }

        public void encode(ProtoWriter protoWriter, ActuatorAircraftControlFlightCalibration actuatorAircraftControlFlightCalibration) throws IOException {
        }

        public ActuatorAircraftControlFlightCalibration decode(ProtoReader protoReader) throws IOException {
            return null;
        }

        public ActuatorAircraftControlFlightCalibration redact(ActuatorAircraftControlFlightCalibration actuatorAircraftControlFlightCalibration) {
            return null;
        }
    }
}

