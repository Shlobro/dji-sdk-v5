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

public final class ActuatorCameraZoomLengthParam
extends Message<ActuatorCameraZoomLengthParam, Builder> {
    public static final ProtoAdapter<ActuatorCameraZoomLengthParam> ADAPTER = new ProtoAdapter_ActuatorCameraZoomLengthParam();
    private static final long serialVersionUID = 0L;
    public static final Integer DEFAULT_FOCAL_DISTANCE = 0;
    public static final Integer DEFAULT_RETRY_TIMES = 0;
    @WireField(tag=1, adapter="com.squareup.wire.ProtoAdapter#UINT32")
    public final Integer focal_distance;
    @WireField(tag=2, adapter="com.squareup.wire.ProtoAdapter#UINT32")
    public final Integer retry_times;

    public ActuatorCameraZoomLengthParam(Integer n, Integer n2) {
    }

    public ActuatorCameraZoomLengthParam(Integer n, Integer n2, ByteString byteString) {
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
    extends Message.Builder<ActuatorCameraZoomLengthParam, Builder> {
        public Integer focal_distance;
        public Integer retry_times;

        public Builder focal_distance(Integer n) {
            return null;
        }

        public Builder retry_times(Integer n) {
            return null;
        }

        public ActuatorCameraZoomLengthParam build() {
            return null;
        }
    }

    private static final class ProtoAdapter_ActuatorCameraZoomLengthParam
    extends ProtoAdapter<ActuatorCameraZoomLengthParam> {
        ProtoAdapter_ActuatorCameraZoomLengthParam() {
        }

        public int encodedSize(ActuatorCameraZoomLengthParam actuatorCameraZoomLengthParam) {
            return 0;
        }

        public void encode(ProtoWriter protoWriter, ActuatorCameraZoomLengthParam actuatorCameraZoomLengthParam) throws IOException {
        }

        public ActuatorCameraZoomLengthParam decode(ProtoReader protoReader) throws IOException {
            return null;
        }

        public ActuatorCameraZoomLengthParam redact(ActuatorCameraZoomLengthParam actuatorCameraZoomLengthParam) {
            return null;
        }
    }
}

