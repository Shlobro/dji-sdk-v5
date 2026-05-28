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

import com.dji.industry.mission.waypointv2.common.waypointv2.GimbalPathCycleMode;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import java.io.IOException;
import okio.ByteString;

public final class ActuatorGimbalStopPathShootingParam
extends Message<ActuatorGimbalStopPathShootingParam, Builder> {
    public static final ProtoAdapter<ActuatorGimbalStopPathShootingParam> ADAPTER = new ProtoAdapter_ActuatorGimbalStopPathShootingParam();
    private static final long serialVersionUID = 0L;
    public static final GimbalPathCycleMode DEFAULT_MODE = GimbalPathCycleMode.Once;
    @WireField(tag=1, adapter="com.dji.industry.mission.waypointv2.common.waypointv2.GimbalPathCycleMode#ADAPTER")
    public final GimbalPathCycleMode mode;

    public ActuatorGimbalStopPathShootingParam(GimbalPathCycleMode gimbalPathCycleMode) {
    }

    public ActuatorGimbalStopPathShootingParam(GimbalPathCycleMode gimbalPathCycleMode, ByteString byteString) {
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
    extends Message.Builder<ActuatorGimbalStopPathShootingParam, Builder> {
        public GimbalPathCycleMode mode;

        public Builder mode(GimbalPathCycleMode gimbalPathCycleMode) {
            return null;
        }

        public ActuatorGimbalStopPathShootingParam build() {
            return null;
        }
    }

    private static final class ProtoAdapter_ActuatorGimbalStopPathShootingParam
    extends ProtoAdapter<ActuatorGimbalStopPathShootingParam> {
        ProtoAdapter_ActuatorGimbalStopPathShootingParam() {
        }

        public int encodedSize(ActuatorGimbalStopPathShootingParam actuatorGimbalStopPathShootingParam) {
            return 0;
        }

        public void encode(ProtoWriter protoWriter, ActuatorGimbalStopPathShootingParam actuatorGimbalStopPathShootingParam) throws IOException {
        }

        public ActuatorGimbalStopPathShootingParam decode(ProtoReader protoReader) throws IOException {
            return null;
        }

        public ActuatorGimbalStopPathShootingParam redact(ActuatorGimbalStopPathShootingParam actuatorGimbalStopPathShootingParam) {
            return null;
        }
    }
}

