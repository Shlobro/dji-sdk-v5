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

import com.dji.industry.mission.waypointv2.common.waypointv2.CameraIntervalShotType;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import java.io.IOException;
import okio.ByteString;

public final class ActuatorCameraStartIntervalShotParam
extends Message<ActuatorCameraStartIntervalShotParam, Builder> {
    public static final ProtoAdapter<ActuatorCameraStartIntervalShotParam> ADAPTER = new ProtoAdapter_ActuatorCameraStartIntervalShotParam();
    private static final long serialVersionUID = 0L;
    public static final CameraIntervalShotType DEFAULT_TIMELAPSE_TYPE = CameraIntervalShotType.Single;
    public static final Integer DEFAULT_TIMELAPSE_COUNT = 0;
    public static final Integer DEFAULT_TIMELAPSE_INTERVAL = 0;
    public static final Integer DEFAULT_TIMELAPSE_INTERVAL_MS = 0;
    @WireField(tag=1, adapter="com.dji.industry.mission.waypointv2.common.waypointv2.CameraIntervalShotType#ADAPTER")
    public final CameraIntervalShotType timelapse_type;
    @WireField(tag=2, adapter="com.squareup.wire.ProtoAdapter#UINT32")
    public final Integer timelapse_count;
    @WireField(tag=3, adapter="com.squareup.wire.ProtoAdapter#UINT32")
    public final Integer timelapse_interval;
    @WireField(tag=4, adapter="com.squareup.wire.ProtoAdapter#UINT32")
    public final Integer timelapse_interval_ms;

    public ActuatorCameraStartIntervalShotParam(CameraIntervalShotType cameraIntervalShotType, Integer n, Integer n2, Integer n3) {
    }

    public ActuatorCameraStartIntervalShotParam(CameraIntervalShotType cameraIntervalShotType, Integer n, Integer n2, Integer n3, ByteString byteString) {
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
    extends Message.Builder<ActuatorCameraStartIntervalShotParam, Builder> {
        public CameraIntervalShotType timelapse_type;
        public Integer timelapse_count;
        public Integer timelapse_interval;
        public Integer timelapse_interval_ms;

        public Builder timelapse_type(CameraIntervalShotType cameraIntervalShotType) {
            return null;
        }

        public Builder timelapse_count(Integer n) {
            return null;
        }

        public Builder timelapse_interval(Integer n) {
            return null;
        }

        public Builder timelapse_interval_ms(Integer n) {
            return null;
        }

        public ActuatorCameraStartIntervalShotParam build() {
            return null;
        }
    }

    private static final class ProtoAdapter_ActuatorCameraStartIntervalShotParam
    extends ProtoAdapter<ActuatorCameraStartIntervalShotParam> {
        ProtoAdapter_ActuatorCameraStartIntervalShotParam() {
        }

        public int encodedSize(ActuatorCameraStartIntervalShotParam actuatorCameraStartIntervalShotParam) {
            return 0;
        }

        public void encode(ProtoWriter protoWriter, ActuatorCameraStartIntervalShotParam actuatorCameraStartIntervalShotParam) throws IOException {
        }

        public ActuatorCameraStartIntervalShotParam decode(ProtoReader protoReader) throws IOException {
            return null;
        }

        public ActuatorCameraStartIntervalShotParam redact(ActuatorCameraStartIntervalShotParam actuatorCameraStartIntervalShotParam) {
            return null;
        }
    }
}

