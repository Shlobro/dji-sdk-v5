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

public final class ActuatorAircraftControlGimbalParam
extends Message<ActuatorAircraftControlGimbalParam, Builder> {
    public static final ProtoAdapter<ActuatorAircraftControlGimbalParam> ADAPTER = new ProtoAdapter_ActuatorAircraftControlGimbalParam();
    private static final long serialVersionUID = 0L;
    public static final Float DEFAULT_GIMBAL_PITCH = Float.valueOf(0.0f);
    @WireField(tag=1, adapter="com.squareup.wire.ProtoAdapter#FLOAT")
    public final Float gimbal_pitch;

    public ActuatorAircraftControlGimbalParam(Float f2) {
    }

    public ActuatorAircraftControlGimbalParam(Float f2, ByteString byteString) {
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
    extends Message.Builder<ActuatorAircraftControlGimbalParam, Builder> {
        public Float gimbal_pitch;

        public Builder gimbal_pitch(Float f2) {
            return null;
        }

        public ActuatorAircraftControlGimbalParam build() {
            return null;
        }
    }

    private static final class ProtoAdapter_ActuatorAircraftControlGimbalParam
    extends ProtoAdapter<ActuatorAircraftControlGimbalParam> {
        ProtoAdapter_ActuatorAircraftControlGimbalParam() {
        }

        public int encodedSize(ActuatorAircraftControlGimbalParam actuatorAircraftControlGimbalParam) {
            return 0;
        }

        public void encode(ProtoWriter protoWriter, ActuatorAircraftControlGimbalParam actuatorAircraftControlGimbalParam) throws IOException {
        }

        public ActuatorAircraftControlGimbalParam decode(ProtoReader protoReader) throws IOException {
            return null;
        }

        public ActuatorAircraftControlGimbalParam redact(ActuatorAircraftControlGimbalParam actuatorAircraftControlGimbalParam) {
            return null;
        }
    }
}

