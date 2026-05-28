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

import com.dji.industry.mission.waypointv2.common.waypointv2.IntervalType;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import java.io.IOException;
import okio.ByteString;

public final class WaypointActionSimpleIntervalParam
extends Message<WaypointActionSimpleIntervalParam, Builder> {
    public static final ProtoAdapter<WaypointActionSimpleIntervalParam> ADAPTER = new ProtoAdapter_WaypointActionSimpleIntervalParam();
    private static final long serialVersionUID = 0L;
    public static final Integer DEFAULT_START_INDEX = 0;
    public static final Float DEFAULT_INTERVAL_VALUE = Float.valueOf(0.0f);
    public static final IntervalType DEFAULT_INTERVAL_TYPE = IntervalType.IntervalTypeUnknown;
    @WireField(tag=1, adapter="com.squareup.wire.ProtoAdapter#UINT32")
    public final Integer start_index;
    @WireField(tag=2, adapter="com.squareup.wire.ProtoAdapter#FLOAT")
    public final Float interval_value;
    @WireField(tag=3, adapter="com.dji.industry.mission.waypointv2.common.waypointv2.IntervalType#ADAPTER")
    public final IntervalType interval_type;

    public WaypointActionSimpleIntervalParam(Integer n, Float f2, IntervalType intervalType) {
    }

    public WaypointActionSimpleIntervalParam(Integer n, Float f2, IntervalType intervalType, ByteString byteString) {
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
    extends Message.Builder<WaypointActionSimpleIntervalParam, Builder> {
        public Integer start_index;
        public Float interval_value;
        public IntervalType interval_type;

        public Builder start_index(Integer n) {
            return null;
        }

        public Builder interval_value(Float f2) {
            return null;
        }

        public Builder interval_type(IntervalType intervalType) {
            return null;
        }

        public WaypointActionSimpleIntervalParam build() {
            return null;
        }
    }

    private static final class ProtoAdapter_WaypointActionSimpleIntervalParam
    extends ProtoAdapter<WaypointActionSimpleIntervalParam> {
        ProtoAdapter_WaypointActionSimpleIntervalParam() {
        }

        public int encodedSize(WaypointActionSimpleIntervalParam waypointActionSimpleIntervalParam) {
            return 0;
        }

        public void encode(ProtoWriter protoWriter, WaypointActionSimpleIntervalParam waypointActionSimpleIntervalParam) throws IOException {
        }

        public WaypointActionSimpleIntervalParam decode(ProtoReader protoReader) throws IOException {
            return null;
        }

        public WaypointActionSimpleIntervalParam redact(WaypointActionSimpleIntervalParam waypointActionSimpleIntervalParam) {
            return null;
        }
    }
}

