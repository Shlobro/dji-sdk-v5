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

public final class WaypointActionReachPointsTriggerParam
extends Message<WaypointActionReachPointsTriggerParam, Builder> {
    public static final ProtoAdapter<WaypointActionReachPointsTriggerParam> ADAPTER = new ProtoAdapter_WaypointActionReachPointsTriggerParam();
    private static final long serialVersionUID = 0L;
    public static final Integer DEFAULT_START_INDEX = 0;
    public static final Integer DEFAULT_END_INDEX = 0;
    public static final Integer DEFAULT_INTERVAL_COUNT = 0;
    public static final Integer DEFAULT_AUTO_EXIT_COUNT = 0;
    @WireField(tag=1, adapter="com.squareup.wire.ProtoAdapter#UINT32")
    public final Integer start_index;
    @WireField(tag=2, adapter="com.squareup.wire.ProtoAdapter#UINT32")
    public final Integer end_index;
    @WireField(tag=3, adapter="com.squareup.wire.ProtoAdapter#UINT32")
    public final Integer interval_count;
    @WireField(tag=4, adapter="com.squareup.wire.ProtoAdapter#UINT32")
    public final Integer auto_exit_count;

    public WaypointActionReachPointsTriggerParam(Integer n, Integer n2, Integer n3, Integer n4) {
    }

    public WaypointActionReachPointsTriggerParam(Integer n, Integer n2, Integer n3, Integer n4, ByteString byteString) {
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
    extends Message.Builder<WaypointActionReachPointsTriggerParam, Builder> {
        public Integer start_index;
        public Integer end_index;
        public Integer interval_count;
        public Integer auto_exit_count;

        public Builder start_index(Integer n) {
            return null;
        }

        public Builder end_index(Integer n) {
            return null;
        }

        public Builder interval_count(Integer n) {
            return null;
        }

        public Builder auto_exit_count(Integer n) {
            return null;
        }

        public WaypointActionReachPointsTriggerParam build() {
            return null;
        }
    }

    private static final class ProtoAdapter_WaypointActionReachPointsTriggerParam
    extends ProtoAdapter<WaypointActionReachPointsTriggerParam> {
        ProtoAdapter_WaypointActionReachPointsTriggerParam() {
        }

        public int encodedSize(WaypointActionReachPointsTriggerParam waypointActionReachPointsTriggerParam) {
            return 0;
        }

        public void encode(ProtoWriter protoWriter, WaypointActionReachPointsTriggerParam waypointActionReachPointsTriggerParam) throws IOException {
        }

        public WaypointActionReachPointsTriggerParam decode(ProtoReader protoReader) throws IOException {
            return null;
        }

        public WaypointActionReachPointsTriggerParam redact(WaypointActionReachPointsTriggerParam waypointActionReachPointsTriggerParam) {
            return null;
        }
    }
}

