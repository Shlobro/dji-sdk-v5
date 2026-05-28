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

import com.dji.industry.mission.waypointv2.common.waypointv2.AbstractionEvent;
import com.dji.industry.mission.waypointv2.common.waypointv2.AbstractionState;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import java.io.IOException;
import okio.ByteString;

public final class WaypointStateChangeInformation
extends Message<WaypointStateChangeInformation, Builder> {
    public static final ProtoAdapter<WaypointStateChangeInformation> INFORMATION_PROTO_ADAPTER = new ProtoAdapter_WaypointStateChangeInformation();
    private static final long serialVersionUID = 0L;
    public static final AbstractionState DEFAULT_PRE_STATE = AbstractionState.ABSTRACTION_STATE_UNKNOWN;
    public static final AbstractionState DEFAULT_CUR_STATE = AbstractionState.ABSTRACTION_STATE_UNKNOWN;
    public static final AbstractionEvent DEFAULT_EVENT = AbstractionEvent.INITIALIZED;
    public static final ByteString DEFAULT_DATA = ByteString.EMPTY;
    @WireField(tag=1, adapter="com.dji.industry.mission.waypointv2.common.waypointv2.AbstractionState#ADAPTER")
    public final AbstractionState pre_state;
    @WireField(tag=2, adapter="com.dji.industry.mission.waypointv2.common.waypointv2.AbstractionState#ADAPTER")
    public final AbstractionState cur_state;
    @WireField(tag=3, adapter="com.dji.industry.mission.waypointv2.common.waypointv2.AbstractionEvent#ADAPTER")
    public final AbstractionEvent event;
    @WireField(tag=4, adapter="com.squareup.wire.ProtoAdapter#BYTES")
    public final ByteString data;

    public WaypointStateChangeInformation(AbstractionState abstractionState, AbstractionState abstractionState2, AbstractionEvent abstractionEvent, ByteString byteString) {
    }

    public WaypointStateChangeInformation(AbstractionState abstractionState, AbstractionState abstractionState2, AbstractionEvent abstractionEvent, ByteString byteString, ByteString byteString2) {
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
    extends Message.Builder<WaypointStateChangeInformation, Builder> {
        public AbstractionState pre_state;
        public AbstractionState cur_state;
        public AbstractionEvent event;
        public ByteString data;

        public Builder pre_state(AbstractionState abstractionState) {
            return null;
        }

        public Builder cur_state(AbstractionState abstractionState) {
            return null;
        }

        public Builder event(AbstractionEvent abstractionEvent) {
            return null;
        }

        public Builder data(ByteString byteString) {
            return null;
        }

        public WaypointStateChangeInformation build() {
            return null;
        }
    }

    private static final class ProtoAdapter_WaypointStateChangeInformation
    extends ProtoAdapter<WaypointStateChangeInformation> {
        ProtoAdapter_WaypointStateChangeInformation() {
        }

        public int encodedSize(WaypointStateChangeInformation waypointStateChangeInformation) {
            return 0;
        }

        public void encode(ProtoWriter protoWriter, WaypointStateChangeInformation waypointStateChangeInformation) throws IOException {
        }

        public WaypointStateChangeInformation decode(ProtoReader protoReader) throws IOException {
            return null;
        }

        public WaypointStateChangeInformation redact(WaypointStateChangeInformation waypointStateChangeInformation) {
            return null;
        }
    }
}

