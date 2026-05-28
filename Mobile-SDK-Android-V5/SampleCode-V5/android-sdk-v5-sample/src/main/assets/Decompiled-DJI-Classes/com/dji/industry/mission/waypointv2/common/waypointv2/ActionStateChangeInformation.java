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

import com.dji.industry.mission.waypointv2.common.waypointv2.ActionEvent;
import com.dji.industry.mission.waypointv2.common.waypointv2.ActionState;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import java.io.IOException;
import okio.ByteString;

public final class ActionStateChangeInformation
extends Message<ActionStateChangeInformation, Builder> {
    public static final ProtoAdapter<ActionStateChangeInformation> ACTION_STATE_CHANGE_INFORMATION = new ProtoAdapter_ActionStateChangeInformation();
    private static final long serialVersionUID = 0L;
    public static final ActionState DEFAULT_PRE_STATE = ActionState.ACTION_STATE_UNKNOWN;
    public static final ActionState DEFAULT_CUR_STATE = ActionState.ACTION_STATE_UNKNOWN;
    public static final ActionEvent DEFAULT_EVENT = ActionEvent.ACTION_EVENT_INITIALIZED;
    public static final ByteString DEFAULT_DATA = ByteString.EMPTY;
    @WireField(tag=1, adapter="com.dji.industry.mission.waypointv2.common.waypointv2.ActionState#ADAPTER")
    public final ActionState pre_state;
    @WireField(tag=2, adapter="com.dji.industry.mission.waypointv2.common.waypointv2.ActionState#ADAPTER")
    public final ActionState cur_state;
    @WireField(tag=3, adapter="com.dji.industry.mission.waypointv2.common.waypointv2.ActionEvent#ADAPTER")
    public final ActionEvent event;
    @WireField(tag=4, adapter="com.squareup.wire.ProtoAdapter#BYTES")
    public final ByteString data;

    public ActionStateChangeInformation(ActionState actionState, ActionState actionState2, ActionEvent actionEvent, ByteString byteString) {
    }

    public ActionStateChangeInformation(ActionState actionState, ActionState actionState2, ActionEvent actionEvent, ByteString byteString, ByteString byteString2) {
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
    extends Message.Builder<ActionStateChangeInformation, Builder> {
        public ActionState pre_state;
        public ActionState cur_state;
        public ActionEvent event;
        public ByteString data;

        public Builder pre_state(ActionState actionState) {
            return null;
        }

        public Builder cur_state(ActionState actionState) {
            return null;
        }

        public Builder event(ActionEvent actionEvent) {
            return null;
        }

        public Builder data(ByteString byteString) {
            return null;
        }

        public ActionStateChangeInformation build() {
            return null;
        }
    }

    private static final class ProtoAdapter_ActionStateChangeInformation
    extends ProtoAdapter<ActionStateChangeInformation> {
        ProtoAdapter_ActionStateChangeInformation() {
        }

        public int encodedSize(ActionStateChangeInformation actionStateChangeInformation) {
            return 0;
        }

        public void encode(ProtoWriter protoWriter, ActionStateChangeInformation actionStateChangeInformation) throws IOException {
        }

        public ActionStateChangeInformation decode(ProtoReader protoReader) throws IOException {
            return null;
        }

        public ActionStateChangeInformation redact(ActionStateChangeInformation actionStateChangeInformation) {
            return null;
        }
    }
}

