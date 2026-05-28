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

import com.dji.industry.mission.waypointv2.common.waypointv2.RecordPointCloudOperateType;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import java.io.IOException;
import okio.ByteString;

public final class ActuatorDJISYSRecordPointCloudParam
extends Message<ActuatorDJISYSRecordPointCloudParam, Builder> {
    public static final ProtoAdapter<ActuatorDJISYSRecordPointCloudParam> ADAPTER = new ProtoAdapter_ActuatorDJISYSRecordPointCloudParam();
    private static final long serialVersionUID = 0L;
    public static final RecordPointCloudOperateType DEFAULT_OP_TYPE = RecordPointCloudOperateType.StopRecordPointCloud;
    public static final Long DEFAULT_RECORD_INFO = 0L;
    @WireField(tag=1, adapter="com.dji.industry.mission.waypointv2.common.waypointv2.RecordPointCloudOperateType#ADAPTER")
    public final RecordPointCloudOperateType op_type;
    @WireField(tag=2, adapter="com.squareup.wire.ProtoAdapter#UINT64")
    public final Long record_info;

    public ActuatorDJISYSRecordPointCloudParam(RecordPointCloudOperateType recordPointCloudOperateType, Long l2) {
    }

    public ActuatorDJISYSRecordPointCloudParam(RecordPointCloudOperateType recordPointCloudOperateType, Long l2, ByteString byteString) {
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
    extends Message.Builder<ActuatorDJISYSRecordPointCloudParam, Builder> {
        public RecordPointCloudOperateType op_type;
        public Long record_info;

        public Builder op_type(RecordPointCloudOperateType recordPointCloudOperateType) {
            return null;
        }

        public Builder record_info(Long l2) {
            return null;
        }

        public ActuatorDJISYSRecordPointCloudParam build() {
            return null;
        }
    }

    private static final class ProtoAdapter_ActuatorDJISYSRecordPointCloudParam
    extends ProtoAdapter<ActuatorDJISYSRecordPointCloudParam> {
        ProtoAdapter_ActuatorDJISYSRecordPointCloudParam() {
        }

        public int encodedSize(ActuatorDJISYSRecordPointCloudParam actuatorDJISYSRecordPointCloudParam) {
            return 0;
        }

        public void encode(ProtoWriter protoWriter, ActuatorDJISYSRecordPointCloudParam actuatorDJISYSRecordPointCloudParam) throws IOException {
        }

        public ActuatorDJISYSRecordPointCloudParam decode(ProtoReader protoReader) throws IOException {
            return null;
        }

        public ActuatorDJISYSRecordPointCloudParam redact(ActuatorDJISYSRecordPointCloudParam actuatorDJISYSRecordPointCloudParam) {
            return null;
        }
    }
}

