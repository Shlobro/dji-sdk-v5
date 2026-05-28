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

import com.dji.industry.mission.waypointv2.common.waypointv2.ActuatorDJISYSRecordPointCloudParam;
import com.dji.industry.mission.waypointv2.common.waypointv2.DJISYSActionType;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import java.io.IOException;
import okio.ByteString;

public final class WaypointActionOperatorDJISYS
extends Message<WaypointActionOperatorDJISYS, Builder> {
    public static final ProtoAdapter<WaypointActionOperatorDJISYS> ADAPTER = new ProtoAdapter_WaypointActionOperatorDJISYS();
    private static final long serialVersionUID = 0L;
    public static final DJISYSActionType DEFAULT_ACTION_TYPE = DJISYSActionType.SYSActionTypeUnknown;
    @WireField(tag=1, adapter="com.dji.industry.mission.waypointv2.common.waypointv2.DJISYSActionType#ADAPTER")
    public final DJISYSActionType action_type;
    @WireField(tag=2, adapter="com.dji.industry.mission.waypointv2.common.waypointv2.ActuatorDJISYSRecordPointCloudParam#ADAPTER")
    public final ActuatorDJISYSRecordPointCloudParam record_point_cloud_param;

    public WaypointActionOperatorDJISYS(DJISYSActionType dJISYSActionType, ActuatorDJISYSRecordPointCloudParam actuatorDJISYSRecordPointCloudParam) {
    }

    public WaypointActionOperatorDJISYS(DJISYSActionType dJISYSActionType, ActuatorDJISYSRecordPointCloudParam actuatorDJISYSRecordPointCloudParam, ByteString byteString) {
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
    extends Message.Builder<WaypointActionOperatorDJISYS, Builder> {
        public DJISYSActionType action_type;
        public ActuatorDJISYSRecordPointCloudParam record_point_cloud_param;

        public Builder action_type(DJISYSActionType dJISYSActionType) {
            return null;
        }

        public Builder record_point_cloud_param(ActuatorDJISYSRecordPointCloudParam actuatorDJISYSRecordPointCloudParam) {
            return null;
        }

        public WaypointActionOperatorDJISYS build() {
            return null;
        }
    }

    private static final class ProtoAdapter_WaypointActionOperatorDJISYS
    extends ProtoAdapter<WaypointActionOperatorDJISYS> {
        ProtoAdapter_WaypointActionOperatorDJISYS() {
        }

        public int encodedSize(WaypointActionOperatorDJISYS waypointActionOperatorDJISYS) {
            return 0;
        }

        public void encode(ProtoWriter protoWriter, WaypointActionOperatorDJISYS waypointActionOperatorDJISYS) throws IOException {
        }

        public WaypointActionOperatorDJISYS decode(ProtoReader protoReader) throws IOException {
            return null;
        }

        public WaypointActionOperatorDJISYS redact(WaypointActionOperatorDJISYS waypointActionOperatorDJISYS) {
            return null;
        }
    }
}

