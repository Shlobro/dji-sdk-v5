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

import com.dji.industry.mission.waypointv2.common.waypointv2.AssociateType;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import java.io.IOException;
import okio.ByteString;

public final class WaypointActionAssociateTriggerParam
extends Message<WaypointActionAssociateTriggerParam, Builder> {
    public static final ProtoAdapter<WaypointActionAssociateTriggerParam> ADAPTER = new ProtoAdapter_WaypointActionAssociateTriggerParam();
    private static final long serialVersionUID = 0L;
    public static final AssociateType DEFAULT_ASSOCIATE_TYPE = AssociateType.AssociateTypeUnknown;
    public static final Float DEFAULT_WAITING_TIME = Float.valueOf(0.0f);
    public static final Integer DEFAULT_ASSOCIATE_ACTION_ID = 0;
    @WireField(tag=1, adapter="com.dji.industry.mission.waypointv2.common.waypointv2.AssociateType#ADAPTER")
    public final AssociateType associate_type;
    @WireField(tag=2, adapter="com.squareup.wire.ProtoAdapter#FLOAT")
    public final Float waiting_time;
    @WireField(tag=3, adapter="com.squareup.wire.ProtoAdapter#UINT32")
    public final Integer associate_action_id;

    public WaypointActionAssociateTriggerParam(AssociateType associateType, Float f2, Integer n) {
    }

    public WaypointActionAssociateTriggerParam(AssociateType associateType, Float f2, Integer n, ByteString byteString) {
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
    extends Message.Builder<WaypointActionAssociateTriggerParam, Builder> {
        public AssociateType associate_type;
        public Float waiting_time;
        public Integer associate_action_id;

        public Builder associate_type(AssociateType associateType) {
            return null;
        }

        public Builder waiting_time(Float f2) {
            return null;
        }

        public Builder associate_action_id(Integer n) {
            return null;
        }

        public WaypointActionAssociateTriggerParam build() {
            return null;
        }
    }

    private static final class ProtoAdapter_WaypointActionAssociateTriggerParam
    extends ProtoAdapter<WaypointActionAssociateTriggerParam> {
        ProtoAdapter_WaypointActionAssociateTriggerParam() {
        }

        public int encodedSize(WaypointActionAssociateTriggerParam waypointActionAssociateTriggerParam) {
            return 0;
        }

        public void encode(ProtoWriter protoWriter, WaypointActionAssociateTriggerParam waypointActionAssociateTriggerParam) throws IOException {
        }

        public WaypointActionAssociateTriggerParam decode(ProtoReader protoReader) throws IOException {
            return null;
        }

        public WaypointActionAssociateTriggerParam redact(WaypointActionAssociateTriggerParam waypointActionAssociateTriggerParam) {
            return null;
        }
    }
}

