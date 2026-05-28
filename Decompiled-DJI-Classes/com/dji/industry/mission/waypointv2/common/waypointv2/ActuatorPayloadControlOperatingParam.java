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

public final class ActuatorPayloadControlOperatingParam
extends Message<ActuatorPayloadControlOperatingParam, Builder> {
    public static final ProtoAdapter<ActuatorPayloadControlOperatingParam> ADAPTER = new ProtoAdapter_ActuatorPayloadControlOperatingParam();
    private static final long serialVersionUID = 0L;
    public static final Integer DEFAULT_CONTROLLER_TYPE = 0;
    public static final Integer DEFAULT_CONTROLLER_INDEX = 0;
    public static final Integer DEFAULT_CONTROLLER_VALUE = 0;
    @WireField(tag=1, adapter="com.squareup.wire.ProtoAdapter#UINT32")
    public final Integer controller_type;
    @WireField(tag=2, adapter="com.squareup.wire.ProtoAdapter#UINT32")
    public final Integer controller_index;
    @WireField(tag=3, adapter="com.squareup.wire.ProtoAdapter#UINT32")
    public final Integer controller_value;

    public ActuatorPayloadControlOperatingParam(Integer n, Integer n2, Integer n3) {
    }

    public ActuatorPayloadControlOperatingParam(Integer n, Integer n2, Integer n3, ByteString byteString) {
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
    extends Message.Builder<ActuatorPayloadControlOperatingParam, Builder> {
        public Integer controller_type;
        public Integer controller_index;
        public Integer controller_value;

        public Builder controller_type(Integer n) {
            return null;
        }

        public Builder controller_index(Integer n) {
            return null;
        }

        public Builder controller_value(Integer n) {
            return null;
        }

        public ActuatorPayloadControlOperatingParam build() {
            return null;
        }
    }

    private static final class ProtoAdapter_ActuatorPayloadControlOperatingParam
    extends ProtoAdapter<ActuatorPayloadControlOperatingParam> {
        ProtoAdapter_ActuatorPayloadControlOperatingParam() {
        }

        public int encodedSize(ActuatorPayloadControlOperatingParam actuatorPayloadControlOperatingParam) {
            return 0;
        }

        public void encode(ProtoWriter protoWriter, ActuatorPayloadControlOperatingParam actuatorPayloadControlOperatingParam) throws IOException {
        }

        public ActuatorPayloadControlOperatingParam decode(ProtoReader protoReader) throws IOException {
            return null;
        }

        public ActuatorPayloadControlOperatingParam redact(ActuatorPayloadControlOperatingParam actuatorPayloadControlOperatingParam) {
            return null;
        }
    }
}

