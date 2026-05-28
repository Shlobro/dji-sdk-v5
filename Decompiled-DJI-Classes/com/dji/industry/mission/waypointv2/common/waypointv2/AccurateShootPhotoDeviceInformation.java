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

public final class AccurateShootPhotoDeviceInformation
extends Message<AccurateShootPhotoDeviceInformation, Builder> {
    public static final ProtoAdapter<AccurateShootPhotoDeviceInformation> ADAPTER = new ProtoAdapter_AccurateShootPhotoDeviceInformation();
    private static final long serialVersionUID = 0L;
    public static final Integer DEFAULT_CAMERA_TYPE = 0;
    public static final Integer DEFAULT_GIMBAL_PORT = 0;
    @WireField(tag=1, adapter="com.squareup.wire.ProtoAdapter#UINT32")
    public final Integer camera_type;
    @WireField(tag=2, adapter="com.squareup.wire.ProtoAdapter#UINT32")
    public final Integer gimbal_port;

    public AccurateShootPhotoDeviceInformation(Integer n, Integer n2) {
    }

    public AccurateShootPhotoDeviceInformation(Integer n, Integer n2, ByteString byteString) {
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
    extends Message.Builder<AccurateShootPhotoDeviceInformation, Builder> {
        public Integer camera_type;
        public Integer gimbal_port;

        public Builder camera_type(Integer n) {
            return null;
        }

        public Builder gimbal_port(Integer n) {
            return null;
        }

        public AccurateShootPhotoDeviceInformation build() {
            return null;
        }
    }

    private static final class ProtoAdapter_AccurateShootPhotoDeviceInformation
    extends ProtoAdapter<AccurateShootPhotoDeviceInformation> {
        ProtoAdapter_AccurateShootPhotoDeviceInformation() {
        }

        public int encodedSize(AccurateShootPhotoDeviceInformation accurateShootPhotoDeviceInformation) {
            return 0;
        }

        public void encode(ProtoWriter protoWriter, AccurateShootPhotoDeviceInformation accurateShootPhotoDeviceInformation) throws IOException {
        }

        public AccurateShootPhotoDeviceInformation decode(ProtoReader protoReader) throws IOException {
            return null;
        }

        public AccurateShootPhotoDeviceInformation redact(AccurateShootPhotoDeviceInformation accurateShootPhotoDeviceInformation) {
            return null;
        }
    }
}

