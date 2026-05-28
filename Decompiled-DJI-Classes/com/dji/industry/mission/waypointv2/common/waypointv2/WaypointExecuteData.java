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

import com.dji.industry.mission.waypointv2.common.waypointv2.ExecuteState;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import java.io.IOException;
import okio.ByteString;

public final class WaypointExecuteData
extends Message<WaypointExecuteData, Builder> {
    public static final ProtoAdapter<WaypointExecuteData> EXECUTE_DATA_PROTO_ADAPTER = new ProtoAdapter_WaypointExecuteData();
    private static final long serialVersionUID = 0L;
    public static final Integer DEFAULT_TARGET_WAYPOINT_INDEX = 0;
    public static final Boolean DEFAULT_IS_WAYPOINT_REACHED = false;
    public static final ExecuteState DEFAULT_EXEC_STATE = ExecuteState.EXECUTE_STATE_PREPAREING;
    public static final Integer DEFAULT_ERROR_CODE = 0;
    @WireField(tag=1, adapter="com.squareup.wire.ProtoAdapter#UINT32")
    public final Integer target_waypoint_index;
    @WireField(tag=2, adapter="com.squareup.wire.ProtoAdapter#BOOL")
    public final Boolean is_waypoint_reached;
    @WireField(tag=3, adapter="com.dji.industry.mission.waypointv2.common.waypointv2.ExecuteState#ADAPTER")
    public final ExecuteState exec_state;
    @WireField(tag=4, adapter="com.squareup.wire.ProtoAdapter#INT32")
    public final Integer error_code;

    public WaypointExecuteData(Integer n, Boolean bl, ExecuteState executeState, Integer n2) {
    }

    public WaypointExecuteData(Integer n, Boolean bl, ExecuteState executeState, Integer n2, ByteString byteString) {
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
    extends Message.Builder<WaypointExecuteData, Builder> {
        public Integer target_waypoint_index;
        public Boolean is_waypoint_reached;
        public ExecuteState exec_state;
        public Integer error_code;

        public Builder target_waypoint_index(Integer n) {
            return null;
        }

        public Builder is_waypoint_reached(Boolean bl) {
            return null;
        }

        public Builder exec_state(ExecuteState executeState) {
            return null;
        }

        public Builder error_code(Integer n) {
            return null;
        }

        public WaypointExecuteData build() {
            return null;
        }
    }

    private static final class ProtoAdapter_WaypointExecuteData
    extends ProtoAdapter<WaypointExecuteData> {
        ProtoAdapter_WaypointExecuteData() {
        }

        public int encodedSize(WaypointExecuteData waypointExecuteData) {
            return 0;
        }

        public void encode(ProtoWriter protoWriter, WaypointExecuteData waypointExecuteData) throws IOException {
        }

        public WaypointExecuteData decode(ProtoReader protoReader) throws IOException {
            return null;
        }

        public WaypointExecuteData redact(WaypointExecuteData waypointExecuteData) {
            return null;
        }
    }
}

