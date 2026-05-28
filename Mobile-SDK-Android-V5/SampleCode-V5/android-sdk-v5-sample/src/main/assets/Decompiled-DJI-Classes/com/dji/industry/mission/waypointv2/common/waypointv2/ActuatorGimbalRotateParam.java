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

public final class ActuatorGimbalRotateParam
extends Message<ActuatorGimbalRotateParam, Builder> {
    public static final ProtoAdapter<ActuatorGimbalRotateParam> ADAPTER = new ProtoAdapter_ActuatorGimbalRotateParam();
    private static final long serialVersionUID = 0L;
    public static final Float DEFAULT_GIMBAL_ROLL = Float.valueOf(0.0f);
    public static final Float DEFAULT_GIMBAL_PITCH = Float.valueOf(0.0f);
    public static final Float DEFAULT_GIMBAL_YAW = Float.valueOf(0.0f);
    public static final Boolean DEFAULT_IS_ABSOLUTE = false;
    public static final Boolean DEFAULT_ROLL_IGNORE = false;
    public static final Boolean DEFAULT_PITCH_IGNORE = false;
    public static final Boolean DEFAULT_YAW_IGNORE = false;
    public static final Boolean DEFAULT_IS_AIRCRAFT_HEADING_COORDINATE_SYSTEM = false;
    public static final Integer DEFAULT_DURATION_TIME = 0;
    @WireField(tag=1, adapter="com.squareup.wire.ProtoAdapter#FLOAT")
    public final Float gimbal_roll;
    @WireField(tag=2, adapter="com.squareup.wire.ProtoAdapter#FLOAT")
    public final Float gimbal_pitch;
    @WireField(tag=3, adapter="com.squareup.wire.ProtoAdapter#FLOAT")
    public final Float gimbal_yaw;
    @WireField(tag=4, adapter="com.squareup.wire.ProtoAdapter#BOOL")
    public final Boolean is_absolute;
    @WireField(tag=5, adapter="com.squareup.wire.ProtoAdapter#BOOL")
    public final Boolean roll_ignore;
    @WireField(tag=6, adapter="com.squareup.wire.ProtoAdapter#BOOL")
    public final Boolean pitch_ignore;
    @WireField(tag=7, adapter="com.squareup.wire.ProtoAdapter#BOOL")
    public final Boolean yaw_ignore;
    @WireField(tag=8, adapter="com.squareup.wire.ProtoAdapter#BOOL")
    public final Boolean is_aircraft_heading_coordinate_system;
    @WireField(tag=9, adapter="com.squareup.wire.ProtoAdapter#UINT32")
    public final Integer duration_time;

    public ActuatorGimbalRotateParam(Float f2, Float f3, Float f4, Boolean bl, Boolean bl2, Boolean bl3, Boolean bl4, Boolean bl5, Integer n) {
    }

    public ActuatorGimbalRotateParam(Float f2, Float f3, Float f4, Boolean bl, Boolean bl2, Boolean bl3, Boolean bl4, Boolean bl5, Integer n, ByteString byteString) {
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
    extends Message.Builder<ActuatorGimbalRotateParam, Builder> {
        public Float gimbal_roll;
        public Float gimbal_pitch;
        public Float gimbal_yaw;
        public Boolean is_absolute;
        public Boolean roll_ignore;
        public Boolean pitch_ignore;
        public Boolean yaw_ignore;
        public Boolean is_aircraft_heading_coordinate_system;
        public Integer duration_time;

        public Builder gimbal_roll(Float f2) {
            return null;
        }

        public Builder gimbal_pitch(Float f2) {
            return null;
        }

        public Builder gimbal_yaw(Float f2) {
            return null;
        }

        public Builder is_absolute(Boolean bl) {
            return null;
        }

        public Builder roll_ignore(Boolean bl) {
            return null;
        }

        public Builder pitch_ignore(Boolean bl) {
            return null;
        }

        public Builder yaw_ignore(Boolean bl) {
            return null;
        }

        public Builder is_aircraft_heading_coordinate_system(Boolean bl) {
            return null;
        }

        public Builder duration_time(Integer n) {
            return null;
        }

        public ActuatorGimbalRotateParam build() {
            return null;
        }
    }

    private static final class ProtoAdapter_ActuatorGimbalRotateParam
    extends ProtoAdapter<ActuatorGimbalRotateParam> {
        ProtoAdapter_ActuatorGimbalRotateParam() {
        }

        public int encodedSize(ActuatorGimbalRotateParam actuatorGimbalRotateParam) {
            return 0;
        }

        public void encode(ProtoWriter protoWriter, ActuatorGimbalRotateParam actuatorGimbalRotateParam) throws IOException {
        }

        public ActuatorGimbalRotateParam decode(ProtoReader protoReader) throws IOException {
            return null;
        }

        public ActuatorGimbalRotateParam redact(ActuatorGimbalRotateParam actuatorGimbalRotateParam) {
            return null;
        }
    }
}

