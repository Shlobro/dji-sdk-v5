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

import com.dji.industry.mission.waypointv2.common.waypointv2.CameraFocusMode;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import java.io.IOException;
import okio.ByteString;

public final class ActuatorCameraFocusModeParam
extends Message<ActuatorCameraFocusModeParam, Builder> {
    public static final ProtoAdapter<ActuatorCameraFocusModeParam> ADAPTER = new ProtoAdapter_ActuatorCameraFocusModeParam();
    private static final long serialVersionUID = 0L;
    public static final CameraFocusMode DEFAULT_FOCUS_MODE = CameraFocusMode.CameraFocusModeUnknown;
    @WireField(tag=1, adapter="com.dji.industry.mission.waypointv2.common.waypointv2.CameraFocusMode#ADAPTER")
    public final CameraFocusMode focus_mode;

    public ActuatorCameraFocusModeParam(CameraFocusMode cameraFocusMode) {
    }

    public ActuatorCameraFocusModeParam(CameraFocusMode cameraFocusMode, ByteString byteString) {
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
    extends Message.Builder<ActuatorCameraFocusModeParam, Builder> {
        public CameraFocusMode focus_mode;

        public Builder focus_mode(CameraFocusMode cameraFocusMode) {
            return null;
        }

        public ActuatorCameraFocusModeParam build() {
            return null;
        }
    }

    private static final class ProtoAdapter_ActuatorCameraFocusModeParam
    extends ProtoAdapter<ActuatorCameraFocusModeParam> {
        ProtoAdapter_ActuatorCameraFocusModeParam() {
        }

        public int encodedSize(ActuatorCameraFocusModeParam actuatorCameraFocusModeParam) {
            return 0;
        }

        public void encode(ProtoWriter protoWriter, ActuatorCameraFocusModeParam actuatorCameraFocusModeParam) throws IOException {
        }

        public ActuatorCameraFocusModeParam decode(ProtoReader protoReader) throws IOException {
            return null;
        }

        public ActuatorCameraFocusModeParam redact(ActuatorCameraFocusModeParam actuatorCameraFocusModeParam) {
            return null;
        }
    }
}

