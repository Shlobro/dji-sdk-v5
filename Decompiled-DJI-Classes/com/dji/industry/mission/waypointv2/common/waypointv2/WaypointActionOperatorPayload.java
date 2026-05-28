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

import com.dji.industry.mission.waypointv2.common.waypointv2.ActuatorPayloadControlOperatingParam;
import com.dji.industry.mission.waypointv2.common.waypointv2.PayloadControlActionType;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import java.io.IOException;
import okio.ByteString;

public final class WaypointActionOperatorPayload
extends Message<WaypointActionOperatorPayload, Builder> {
    public static final ProtoAdapter<WaypointActionOperatorPayload> ADAPTER = new ProtoAdapter_WaypointActionOperatorPayload();
    private static final long serialVersionUID = 0L;
    public static final PayloadControlActionType DEFAULT_ACTION_TYPE = PayloadControlActionType.PayloadControlActionTypeUnknown;
    @WireField(tag=1, adapter="com.dji.industry.mission.waypointv2.common.waypointv2.PayloadControlActionType#ADAPTER")
    public final PayloadControlActionType action_type;
    @WireField(tag=2, adapter="com.dji.industry.mission.waypointv2.common.waypointv2.ActuatorPayloadControlOperatingParam#ADAPTER")
    public final ActuatorPayloadControlOperatingParam operating_param;

    public WaypointActionOperatorPayload(PayloadControlActionType payloadControlActionType, ActuatorPayloadControlOperatingParam actuatorPayloadControlOperatingParam) {
    }

    public WaypointActionOperatorPayload(PayloadControlActionType payloadControlActionType, ActuatorPayloadControlOperatingParam actuatorPayloadControlOperatingParam, ByteString byteString) {
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
    extends Message.Builder<WaypointActionOperatorPayload, Builder> {
        public PayloadControlActionType action_type;
        public ActuatorPayloadControlOperatingParam operating_param;

        public Builder action_type(PayloadControlActionType payloadControlActionType) {
            return null;
        }

        public Builder operating_param(ActuatorPayloadControlOperatingParam actuatorPayloadControlOperatingParam) {
            return null;
        }

        public WaypointActionOperatorPayload build() {
            return null;
        }
    }

    private static final class ProtoAdapter_WaypointActionOperatorPayload
    extends ProtoAdapter<WaypointActionOperatorPayload> {
        ProtoAdapter_WaypointActionOperatorPayload() {
        }

        public int encodedSize(WaypointActionOperatorPayload waypointActionOperatorPayload) {
            return 0;
        }

        public void encode(ProtoWriter protoWriter, WaypointActionOperatorPayload waypointActionOperatorPayload) throws IOException {
        }

        public WaypointActionOperatorPayload decode(ProtoReader protoReader) throws IOException {
            return null;
        }

        public WaypointActionOperatorPayload redact(WaypointActionOperatorPayload waypointActionOperatorPayload) {
            return null;
        }
    }
}

