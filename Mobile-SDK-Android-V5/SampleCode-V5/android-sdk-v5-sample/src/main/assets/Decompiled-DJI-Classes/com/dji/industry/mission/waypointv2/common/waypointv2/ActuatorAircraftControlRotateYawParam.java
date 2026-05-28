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

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import java.io.IOException;
import okio.ByteString;

public final class ActuatorAircraftControlRotateYawParam
extends Message<ActuatorAircraftControlRotateYawParam, Builder> {
    public static final ProtoAdapter<ActuatorAircraftControlRotateYawParam> ADAPTER = new ProtoAdapter_ActuatorAircraftControlRotateYawParam();
    private static final long serialVersionUID = 0L;
    public static final Boolean DEFAULT_IS_RELATIVE = false;
    public static final Boolean DEFAULT_IS_CLOCKWISE = false;
    public static final Float DEFAULT_YAW_ANGLE = Float.valueOf(0.0f);
    @WireField(tag=1, adapter="com.squareup.wire.ProtoAdapter#BOOL")
    public final Boolean is_relative;
    @WireField(tag=2, adapter="com.squareup.wire.ProtoAdapter#BOOL")
    public final Boolean is_clockwise;
    @WireField(tag=3, adapter="com.squareup.wire.ProtoAdapter#FLOAT")
    public final Float yaw_angle;

    public ActuatorAircraftControlRotateYawParam(Boolean bl, Boolean bl2, Float f2) {
    }

    public ActuatorAircraftControlRotateYawParam(Boolean bl, Boolean bl2, Float f2, ByteString byteString) {
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
    extends Message.Builder<ActuatorAircraftControlRotateYawParam, Builder> {
        public Boolean is_relative;
        public Boolean is_clockwise;
        public Float yaw_angle;

        public Builder is_relative(Boolean bl) {
            return null;
        }

        public Builder is_clockwise(Boolean bl) {
            return null;
        }

        public Builder yaw_angle(Float f2) {
            return null;
        }

        public ActuatorAircraftControlRotateYawParam build() {
            return null;
        }
    }

    private static final class ProtoAdapter_ActuatorAircraftControlRotateYawParam
    extends ProtoAdapter<ActuatorAircraftControlRotateYawParam> {
        ProtoAdapter_ActuatorAircraftControlRotateYawParam() {
        }

        public int encodedSize(ActuatorAircraftControlRotateYawParam actuatorAircraftControlRotateYawParam) {
            return 0;
        }

        public void encode(ProtoWriter protoWriter, ActuatorAircraftControlRotateYawParam actuatorAircraftControlRotateYawParam) throws IOException {
        }

        public ActuatorAircraftControlRotateYawParam decode(ProtoReader protoReader) throws IOException {
            return null;
        }

        public ActuatorAircraftControlRotateYawParam redact(ActuatorAircraftControlRotateYawParam actuatorAircraftControlRotateYawParam) {
            return null;
        }
    }
}

