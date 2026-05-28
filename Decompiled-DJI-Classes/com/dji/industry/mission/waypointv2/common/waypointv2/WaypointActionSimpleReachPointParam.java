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

public final class WaypointActionSimpleReachPointParam
extends Message<WaypointActionSimpleReachPointParam, Builder> {
    public static final ProtoAdapter<WaypointActionSimpleReachPointParam> ADAPTER = new ProtoAdapter_WaypointActionSimpleReachPointParam();
    private static final long serialVersionUID = 0L;
    public static final Integer DEFAULT_START_INDEX = 0;
    public static final Integer DEFAULT_AUTO_EXIT_COUNT = 0;
    @WireField(tag=1, adapter="com.squareup.wire.ProtoAdapter#UINT32")
    public final Integer start_index;
    @WireField(tag=2, adapter="com.squareup.wire.ProtoAdapter#UINT32")
    public final Integer auto_exit_count;

    public WaypointActionSimpleReachPointParam(Integer n, Integer n2) {
    }

    public WaypointActionSimpleReachPointParam(Integer n, Integer n2, ByteString byteString) {
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
    extends Message.Builder<WaypointActionSimpleReachPointParam, Builder> {
        public Integer start_index;
        public Integer auto_exit_count;

        public Builder start_index(Integer n) {
            return null;
        }

        public Builder auto_exit_count(Integer n) {
            return null;
        }

        public WaypointActionSimpleReachPointParam build() {
            return null;
        }
    }

    private static final class ProtoAdapter_WaypointActionSimpleReachPointParam
    extends ProtoAdapter<WaypointActionSimpleReachPointParam> {
        ProtoAdapter_WaypointActionSimpleReachPointParam() {
        }

        public int encodedSize(WaypointActionSimpleReachPointParam waypointActionSimpleReachPointParam) {
            return 0;
        }

        public void encode(ProtoWriter protoWriter, WaypointActionSimpleReachPointParam waypointActionSimpleReachPointParam) throws IOException {
        }

        public WaypointActionSimpleReachPointParam decode(ProtoReader protoReader) throws IOException {
            return null;
        }

        public WaypointActionSimpleReachPointParam redact(WaypointActionSimpleReachPointParam waypointActionSimpleReachPointParam) {
            return null;
        }
    }
}

