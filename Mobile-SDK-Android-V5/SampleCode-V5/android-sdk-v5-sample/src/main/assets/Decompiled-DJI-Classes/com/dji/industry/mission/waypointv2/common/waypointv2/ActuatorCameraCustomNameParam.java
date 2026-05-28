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

import com.dji.industry.mission.waypointv2.common.waypointv2.CameraCustomNameCmdType;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import java.io.IOException;
import okio.ByteString;

public final class ActuatorCameraCustomNameParam
extends Message<ActuatorCameraCustomNameParam, Builder> {
    public static final ProtoAdapter<ActuatorCameraCustomNameParam> ADAPTER = new ProtoAdapter_ActuatorCameraCustomNameParam();
    private static final long serialVersionUID = 0L;
    public static final CameraCustomNameCmdType DEFAULT_CMD_TYPE = CameraCustomNameCmdType.CameraCustomNameCmdTypeUnknown;
    public static final Integer DEFAULT_RETRY_TIMES = 0;
    public static final Integer DEFAULT_DATA_SIZE = 0;
    public static final String DEFAULT_NAME = "";
    @WireField(tag=1, adapter="com.dji.industry.mission.waypointv2.common.waypointv2.CameraCustomNameCmdType#ADAPTER")
    public final CameraCustomNameCmdType cmd_type;
    @WireField(tag=2, adapter="com.squareup.wire.ProtoAdapter#UINT32")
    public final Integer retry_times;
    @WireField(tag=3, adapter="com.squareup.wire.ProtoAdapter#UINT32")
    public final Integer data_size;
    @WireField(tag=4, adapter="com.squareup.wire.ProtoAdapter#STRING")
    public final String name;

    public ActuatorCameraCustomNameParam(CameraCustomNameCmdType cameraCustomNameCmdType, Integer n, Integer n2, String string) {
    }

    public ActuatorCameraCustomNameParam(CameraCustomNameCmdType cameraCustomNameCmdType, Integer n, Integer n2, String string, ByteString byteString) {
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
    extends Message.Builder<ActuatorCameraCustomNameParam, Builder> {
        public CameraCustomNameCmdType cmd_type;
        public Integer retry_times;
        public Integer data_size;
        public String name;

        public Builder cmd_type(CameraCustomNameCmdType cameraCustomNameCmdType) {
            return null;
        }

        public Builder retry_times(Integer n) {
            return null;
        }

        public Builder data_size(Integer n) {
            return null;
        }

        public Builder name(String string) {
            return null;
        }

        public ActuatorCameraCustomNameParam build() {
            return null;
        }
    }

    private static final class ProtoAdapter_ActuatorCameraCustomNameParam
    extends ProtoAdapter<ActuatorCameraCustomNameParam> {
        ProtoAdapter_ActuatorCameraCustomNameParam() {
        }

        public int encodedSize(ActuatorCameraCustomNameParam actuatorCameraCustomNameParam) {
            return 0;
        }

        public void encode(ProtoWriter protoWriter, ActuatorCameraCustomNameParam actuatorCameraCustomNameParam) throws IOException {
        }

        public ActuatorCameraCustomNameParam decode(ProtoReader protoReader) throws IOException {
            return null;
        }

        public ActuatorCameraCustomNameParam redact(ActuatorCameraCustomNameParam actuatorCameraCustomNameParam) {
            return null;
        }
    }
}

