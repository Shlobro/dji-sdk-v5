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

public final class ActuatorCameraStopIntervalShotParam
extends Message<ActuatorCameraStopIntervalShotParam, Builder> {
    public static final ProtoAdapter<ActuatorCameraStopIntervalShotParam> ADAPTER = new ProtoAdapter_ActuatorCameraStopIntervalShotParam();
    private static final long serialVersionUID = 0L;
    public static final Integer DEFAULT_RESV = 0;
    @WireField(tag=1, adapter="com.squareup.wire.ProtoAdapter#UINT32")
    public final Integer resv;

    public ActuatorCameraStopIntervalShotParam(Integer n) {
    }

    public ActuatorCameraStopIntervalShotParam(Integer n, ByteString byteString) {
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
    extends Message.Builder<ActuatorCameraStopIntervalShotParam, Builder> {
        public Integer resv;

        public Builder resv(Integer n) {
            return null;
        }

        public ActuatorCameraStopIntervalShotParam build() {
            return null;
        }
    }

    private static final class ProtoAdapter_ActuatorCameraStopIntervalShotParam
    extends ProtoAdapter<ActuatorCameraStopIntervalShotParam> {
        ProtoAdapter_ActuatorCameraStopIntervalShotParam() {
        }

        public int encodedSize(ActuatorCameraStopIntervalShotParam actuatorCameraStopIntervalShotParam) {
            return 0;
        }

        public void encode(ProtoWriter protoWriter, ActuatorCameraStopIntervalShotParam actuatorCameraStopIntervalShotParam) throws IOException {
        }

        public ActuatorCameraStopIntervalShotParam decode(ProtoReader protoReader) throws IOException {
            return null;
        }

        public ActuatorCameraStopIntervalShotParam redact(ActuatorCameraStopIntervalShotParam actuatorCameraStopIntervalShotParam) {
            return null;
        }
    }
}

