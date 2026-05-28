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
 *  com.squareup.wire.WireField$Label
 *  okio.ByteString
 */
package com.dji.industry.mission.waypointv2.common.waypointv2;

import com.dji.industry.mission.waypointv2.common.waypointv2.GimbalPathCycleMode;
import com.dji.industry.mission.waypointv2.common.waypointv2.GimbalPathPointInfo;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class ActuatorGimbalStartPathShootingParam
extends Message<ActuatorGimbalStartPathShootingParam, Builder> {
    public static final ProtoAdapter<ActuatorGimbalStartPathShootingParam> ADAPTER = new ProtoAdapter_ActuatorGimbalStartPathShootingParam();
    private static final long serialVersionUID = 0L;
    public static final GimbalPathCycleMode DEFAULT_MODE = GimbalPathCycleMode.Once;
    public static final Integer DEFAULT_POINT_NUM = 0;
    @WireField(tag=1, adapter="com.dji.industry.mission.waypointv2.common.waypointv2.GimbalPathCycleMode#ADAPTER")
    public final GimbalPathCycleMode mode;
    @WireField(tag=2, adapter="com.squareup.wire.ProtoAdapter#UINT32")
    public final Integer point_num;
    @WireField(tag=3, adapter="com.dji.industry.mission.waypointv2.common.waypointv2.GimbalPathPointInfo#ADAPTER", label=WireField.Label.REPEATED)
    public final List<GimbalPathPointInfo> point_info;

    public ActuatorGimbalStartPathShootingParam(GimbalPathCycleMode gimbalPathCycleMode, Integer n, List<GimbalPathPointInfo> list) {
    }

    public ActuatorGimbalStartPathShootingParam(GimbalPathCycleMode gimbalPathCycleMode, Integer n, List<GimbalPathPointInfo> list, ByteString byteString) {
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
    extends Message.Builder<ActuatorGimbalStartPathShootingParam, Builder> {
        public GimbalPathCycleMode mode;
        public Integer point_num;
        public List<GimbalPathPointInfo> point_info;

        public Builder mode(GimbalPathCycleMode gimbalPathCycleMode) {
            return null;
        }

        public Builder point_num(Integer n) {
            return null;
        }

        public Builder point_info(List<GimbalPathPointInfo> list) {
            return null;
        }

        public ActuatorGimbalStartPathShootingParam build() {
            return null;
        }
    }

    private static final class ProtoAdapter_ActuatorGimbalStartPathShootingParam
    extends ProtoAdapter<ActuatorGimbalStartPathShootingParam> {
        ProtoAdapter_ActuatorGimbalStartPathShootingParam() {
        }

        public int encodedSize(ActuatorGimbalStartPathShootingParam actuatorGimbalStartPathShootingParam) {
            return 0;
        }

        public void encode(ProtoWriter protoWriter, ActuatorGimbalStartPathShootingParam actuatorGimbalStartPathShootingParam) throws IOException {
        }

        public ActuatorGimbalStartPathShootingParam decode(ProtoReader protoReader) throws IOException {
            return null;
        }

        public ActuatorGimbalStartPathShootingParam redact(ActuatorGimbalStartPathShootingParam actuatorGimbalStartPathShootingParam) {
            return null;
        }
    }
}

