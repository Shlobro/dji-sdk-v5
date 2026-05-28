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

public final class ActuatorCameraShootPhotoParam
extends Message<ActuatorCameraShootPhotoParam, Builder> {
    public static final ProtoAdapter<ActuatorCameraShootPhotoParam> ADAPTER = new ProtoAdapter_ActuatorCameraShootPhotoParam();
    private static final long serialVersionUID = 0L;
    public static final Integer DEFAULT_RETRY_TIMES = 0;
    @WireField(tag=1, adapter="com.squareup.wire.ProtoAdapter#UINT32")
    public final Integer retry_times;

    public ActuatorCameraShootPhotoParam(Integer n) {
    }

    public ActuatorCameraShootPhotoParam(Integer n, ByteString byteString) {
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
    extends Message.Builder<ActuatorCameraShootPhotoParam, Builder> {
        public Integer retry_times;

        public Builder retry_times(Integer n) {
            return null;
        }

        public ActuatorCameraShootPhotoParam build() {
            return null;
        }
    }

    private static final class ProtoAdapter_ActuatorCameraShootPhotoParam
    extends ProtoAdapter<ActuatorCameraShootPhotoParam> {
        ProtoAdapter_ActuatorCameraShootPhotoParam() {
        }

        public int encodedSize(ActuatorCameraShootPhotoParam actuatorCameraShootPhotoParam) {
            return 0;
        }

        public void encode(ProtoWriter protoWriter, ActuatorCameraShootPhotoParam actuatorCameraShootPhotoParam) throws IOException {
        }

        public ActuatorCameraShootPhotoParam decode(ProtoReader protoReader) throws IOException {
            return null;
        }

        public ActuatorCameraShootPhotoParam redact(ActuatorCameraShootPhotoParam actuatorCameraShootPhotoParam) {
            return null;
        }
    }
}

