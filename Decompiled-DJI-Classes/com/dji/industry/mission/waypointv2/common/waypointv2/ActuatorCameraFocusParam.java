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

import com.dji.industry.mission.waypointv2.common.waypointv2.CameraFocusRegionType;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import java.io.IOException;
import okio.ByteString;

public final class ActuatorCameraFocusParam
extends Message<ActuatorCameraFocusParam, Builder> {
    public static final ProtoAdapter<ActuatorCameraFocusParam> ADAPTER = new ProtoAdapter_ActuatorCameraFocusParam();
    private static final long serialVersionUID = 0L;
    public static final Float DEFAULT_X_POSITION = Float.valueOf(0.0f);
    public static final Float DEFAULT_Y_POSITION = Float.valueOf(0.0f);
    public static final CameraFocusRegionType DEFAULT_REGION_TYPE = CameraFocusRegionType.CameraFocusRegionTypeUnknown;
    public static final Float DEFAULT_WIDTH = Float.valueOf(0.0f);
    public static final Float DEFAULT_HEIGHT = Float.valueOf(0.0f);
    public static final Integer DEFAULT_ATTRIBUTE = 0;
    public static final Integer DEFAULT_RETRY_TIMES = 0;
    @WireField(tag=1, adapter="com.squareup.wire.ProtoAdapter#FLOAT")
    public final Float x_position;
    @WireField(tag=2, adapter="com.squareup.wire.ProtoAdapter#FLOAT")
    public final Float y_position;
    @WireField(tag=3, adapter="com.dji.industry.mission.waypointv2.common.waypointv2.CameraFocusRegionType#ADAPTER")
    public final CameraFocusRegionType region_type;
    @WireField(tag=4, adapter="com.squareup.wire.ProtoAdapter#FLOAT")
    public final Float width;
    @WireField(tag=5, adapter="com.squareup.wire.ProtoAdapter#FLOAT")
    public final Float height;
    @WireField(tag=6, adapter="com.squareup.wire.ProtoAdapter#UINT32")
    public final Integer attribute;
    @WireField(tag=7, adapter="com.squareup.wire.ProtoAdapter#UINT32")
    public final Integer retry_times;

    public ActuatorCameraFocusParam(Float f2, Float f3, CameraFocusRegionType cameraFocusRegionType, Float f4, Float f5, Integer n, Integer n2) {
    }

    public ActuatorCameraFocusParam(Float f2, Float f3, CameraFocusRegionType cameraFocusRegionType, Float f4, Float f5, Integer n, Integer n2, ByteString byteString) {
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
    extends Message.Builder<ActuatorCameraFocusParam, Builder> {
        public Float x_position;
        public Float y_position;
        public CameraFocusRegionType region_type;
        public Float width;
        public Float height;
        public Integer attribute;
        public Integer retry_times;

        public Builder x_position(Float f2) {
            return null;
        }

        public Builder y_position(Float f2) {
            return null;
        }

        public Builder region_type(CameraFocusRegionType cameraFocusRegionType) {
            return null;
        }

        public Builder width(Float f2) {
            return null;
        }

        public Builder height(Float f2) {
            return null;
        }

        public Builder attribute(Integer n) {
            return null;
        }

        public Builder retry_times(Integer n) {
            return null;
        }

        public ActuatorCameraFocusParam build() {
            return null;
        }
    }

    private static final class ProtoAdapter_ActuatorCameraFocusParam
    extends ProtoAdapter<ActuatorCameraFocusParam> {
        ProtoAdapter_ActuatorCameraFocusParam() {
        }

        public int encodedSize(ActuatorCameraFocusParam actuatorCameraFocusParam) {
            return 0;
        }

        public void encode(ProtoWriter protoWriter, ActuatorCameraFocusParam actuatorCameraFocusParam) throws IOException {
        }

        public ActuatorCameraFocusParam decode(ProtoReader protoReader) throws IOException {
            return null;
        }

        public ActuatorCameraFocusParam redact(ActuatorCameraFocusParam actuatorCameraFocusParam) {
            return null;
        }
    }
}

