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

public final class ActuatorAircraftControlStartStopFlyParam
extends Message<ActuatorAircraftControlStartStopFlyParam, Builder> {
    public static final ProtoAdapter<ActuatorAircraftControlStartStopFlyParam> ADAPTER = new ProtoAdapter_ActuatorAircraftControlStartStopFlyParam();
    private static final long serialVersionUID = 0L;
    public static final Boolean DEFAULT_IS_START = false;
    @WireField(tag=1, adapter="com.squareup.wire.ProtoAdapter#BOOL")
    public final Boolean is_start;

    public ActuatorAircraftControlStartStopFlyParam(Boolean bl) {
    }

    public ActuatorAircraftControlStartStopFlyParam(Boolean bl, ByteString byteString) {
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
    extends Message.Builder<ActuatorAircraftControlStartStopFlyParam, Builder> {
        public Boolean is_start;

        public Builder is_start(Boolean bl) {
            return null;
        }

        public ActuatorAircraftControlStartStopFlyParam build() {
            return null;
        }
    }

    private static final class ProtoAdapter_ActuatorAircraftControlStartStopFlyParam
    extends ProtoAdapter<ActuatorAircraftControlStartStopFlyParam> {
        ProtoAdapter_ActuatorAircraftControlStartStopFlyParam() {
        }

        public int encodedSize(ActuatorAircraftControlStartStopFlyParam actuatorAircraftControlStartStopFlyParam) {
            return 0;
        }

        public void encode(ProtoWriter protoWriter, ActuatorAircraftControlStartStopFlyParam actuatorAircraftControlStartStopFlyParam) throws IOException {
        }

        public ActuatorAircraftControlStartStopFlyParam decode(ProtoReader protoReader) throws IOException {
            return null;
        }

        public ActuatorAircraftControlStartStopFlyParam redact(ActuatorAircraftControlStartStopFlyParam actuatorAircraftControlStartStopFlyParam) {
            return null;
        }
    }
}

