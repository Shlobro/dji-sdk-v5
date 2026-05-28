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

public final class WaypointActionTrajectoryTriggerParam
extends Message<WaypointActionTrajectoryTriggerParam, Builder> {
    public static final ProtoAdapter<WaypointActionTrajectoryTriggerParam> ADAPTER = new ProtoAdapter_WaypointActionTrajectoryTriggerParam();
    private static final long serialVersionUID = 0L;
    public static final Integer DEFAULT_START_INDEX = 0;
    public static final Integer DEFAULT_END_INDEX = 0;
    @WireField(tag=1, adapter="com.squareup.wire.ProtoAdapter#UINT32")
    public final Integer start_index;
    @WireField(tag=2, adapter="com.squareup.wire.ProtoAdapter#UINT32")
    public final Integer end_index;

    public WaypointActionTrajectoryTriggerParam(Integer n, Integer n2) {
    }

    public WaypointActionTrajectoryTriggerParam(Integer n, Integer n2, ByteString byteString) {
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
    extends Message.Builder<WaypointActionTrajectoryTriggerParam, Builder> {
        public Integer start_index;
        public Integer end_index;

        public Builder start_index(Integer n) {
            return null;
        }

        public Builder end_index(Integer n) {
            return null;
        }

        public WaypointActionTrajectoryTriggerParam build() {
            return null;
        }
    }

    private static final class ProtoAdapter_WaypointActionTrajectoryTriggerParam
    extends ProtoAdapter<WaypointActionTrajectoryTriggerParam> {
        ProtoAdapter_WaypointActionTrajectoryTriggerParam() {
        }

        public int encodedSize(WaypointActionTrajectoryTriggerParam waypointActionTrajectoryTriggerParam) {
            return 0;
        }

        public void encode(ProtoWriter protoWriter, WaypointActionTrajectoryTriggerParam waypointActionTrajectoryTriggerParam) throws IOException {
        }

        public WaypointActionTrajectoryTriggerParam decode(ProtoReader protoReader) throws IOException {
            return null;
        }

        public WaypointActionTrajectoryTriggerParam redact(WaypointActionTrajectoryTriggerParam waypointActionTrajectoryTriggerParam) {
            return null;
        }
    }
}

