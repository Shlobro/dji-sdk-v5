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

import com.dji.industry.mission.waypointv2.common.waypointv2.WaypointActionActuator;
import com.dji.industry.mission.waypointv2.common.waypointv2.WaypointActionTrigger;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import java.io.IOException;
import okio.ByteString;

public final class WaypointActionConfig
extends Message<WaypointActionConfig, Builder> {
    public static final ProtoAdapter<WaypointActionConfig> ADAPTER = new ProtoAdapter_WaypointActionConfig();
    private static final long serialVersionUID = 0L;
    public static final Integer DEFAULT_ACTION_ID = 0;
    @WireField(tag=1, adapter="com.squareup.wire.ProtoAdapter#UINT32")
    public final Integer action_id;
    @WireField(tag=2, adapter="com.dji.industry.mission.waypointv2.common.waypointv2.WaypointActionTrigger#ADAPTER")
    public final WaypointActionTrigger trigger;
    @WireField(tag=3, adapter="com.dji.industry.mission.waypointv2.common.waypointv2.WaypointActionActuator#ADAPTER")
    public final WaypointActionActuator actuator;

    public WaypointActionConfig(Integer n, WaypointActionTrigger waypointActionTrigger, WaypointActionActuator waypointActionActuator) {
    }

    public WaypointActionConfig(Integer n, WaypointActionTrigger waypointActionTrigger, WaypointActionActuator waypointActionActuator, ByteString byteString) {
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
    extends Message.Builder<WaypointActionConfig, Builder> {
        public Integer action_id;
        public WaypointActionTrigger trigger;
        public WaypointActionActuator actuator;

        public Builder action_id(Integer n) {
            return null;
        }

        public Builder trigger(WaypointActionTrigger waypointActionTrigger) {
            return null;
        }

        public Builder actuator(WaypointActionActuator waypointActionActuator) {
            return null;
        }

        public WaypointActionConfig build() {
            return null;
        }
    }

    private static final class ProtoAdapter_WaypointActionConfig
    extends ProtoAdapter<WaypointActionConfig> {
        ProtoAdapter_WaypointActionConfig() {
        }

        public int encodedSize(WaypointActionConfig waypointActionConfig) {
            return 0;
        }

        public void encode(ProtoWriter protoWriter, WaypointActionConfig waypointActionConfig) throws IOException {
        }

        public WaypointActionConfig decode(ProtoReader protoReader) throws IOException {
            return null;
        }

        public WaypointActionConfig redact(WaypointActionConfig waypointActionConfig) {
            return null;
        }
    }
}

