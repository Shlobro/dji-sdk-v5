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

import com.dji.industry.mission.waypointv2.common.waypointv2.SprayActionType;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import java.io.IOException;
import okio.ByteString;

public final class WaypointActionOperatorSpray
extends Message<WaypointActionOperatorSpray, Builder> {
    public static final ProtoAdapter<WaypointActionOperatorSpray> ADAPTER = new ProtoAdapter_WaypointActionOperatorSpray();
    private static final long serialVersionUID = 0L;
    public static final SprayActionType DEFAULT_ACTION_TYPE = SprayActionType.SprayActionTypeUnknown;
    public static final Integer DEFAULT_SPRAY_MODE = 0;
    public static final Integer DEFAULT_FLOW_SPEED_VALID_FLOAT = 0;
    public static final Float DEFAULT_FLOW_SPEED = Float.valueOf(0.0f);
    public static final Float DEFAULT_FLOW_SPEED_PER_MU = Float.valueOf(0.0f);
    @WireField(tag=1, adapter="com.dji.industry.mission.waypointv2.common.waypointv2.SprayActionType#ADAPTER")
    public final SprayActionType action_type;
    @WireField(tag=2, adapter="com.squareup.wire.ProtoAdapter#UINT32")
    public final Integer spray_mode;
    @WireField(tag=3, adapter="com.squareup.wire.ProtoAdapter#UINT32")
    public final Integer flow_speed_valid_float;
    @WireField(tag=4, adapter="com.squareup.wire.ProtoAdapter#FLOAT")
    public final Float flow_speed;
    @WireField(tag=5, adapter="com.squareup.wire.ProtoAdapter#FLOAT")
    public final Float flow_speed_per_mu;

    public WaypointActionOperatorSpray(SprayActionType sprayActionType, Integer n, Integer n2, Float f2, Float f3) {
    }

    public WaypointActionOperatorSpray(SprayActionType sprayActionType, Integer n, Integer n2, Float f2, Float f3, ByteString byteString) {
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
    extends Message.Builder<WaypointActionOperatorSpray, Builder> {
        public SprayActionType action_type;
        public Integer spray_mode;
        public Integer flow_speed_valid_float;
        public Float flow_speed;
        public Float flow_speed_per_mu;

        public Builder action_type(SprayActionType sprayActionType) {
            return null;
        }

        public Builder spray_mode(Integer n) {
            return null;
        }

        public Builder flow_speed_valid_float(Integer n) {
            return null;
        }

        public Builder flow_speed(Float f2) {
            return null;
        }

        public Builder flow_speed_per_mu(Float f2) {
            return null;
        }

        public WaypointActionOperatorSpray build() {
            return null;
        }
    }

    private static final class ProtoAdapter_WaypointActionOperatorSpray
    extends ProtoAdapter<WaypointActionOperatorSpray> {
        ProtoAdapter_WaypointActionOperatorSpray() {
        }

        public int encodedSize(WaypointActionOperatorSpray waypointActionOperatorSpray) {
            return 0;
        }

        public void encode(ProtoWriter protoWriter, WaypointActionOperatorSpray waypointActionOperatorSpray) throws IOException {
        }

        public WaypointActionOperatorSpray decode(ProtoReader protoReader) throws IOException {
            return null;
        }

        public WaypointActionOperatorSpray redact(WaypointActionOperatorSpray waypointActionOperatorSpray) {
            return null;
        }
    }
}

