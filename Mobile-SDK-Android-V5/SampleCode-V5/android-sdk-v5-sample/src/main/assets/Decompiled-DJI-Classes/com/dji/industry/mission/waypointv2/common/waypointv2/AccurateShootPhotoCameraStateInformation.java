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

public final class AccurateShootPhotoCameraStateInformation
extends Message<AccurateShootPhotoCameraStateInformation, Builder> {
    public static final ProtoAdapter<AccurateShootPhotoCameraStateInformation> ADAPTER = new ProtoAdapter_AccurateShootPhotoCameraStateInformation();
    private static final long serialVersionUID = 0L;
    public static final Integer DEFAULT_FOCAL_DISTANCE = 0;
    public static final Integer DEFAULT_AF_POSITION = 0;
    @WireField(tag=1, adapter="com.squareup.wire.ProtoAdapter#UINT32")
    public final Integer focal_distance;
    @WireField(tag=2, adapter="com.squareup.wire.ProtoAdapter#UINT32")
    public final Integer AF_position;

    public AccurateShootPhotoCameraStateInformation(Integer n, Integer n2) {
    }

    public AccurateShootPhotoCameraStateInformation(Integer n, Integer n2, ByteString byteString) {
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
    extends Message.Builder<AccurateShootPhotoCameraStateInformation, Builder> {
        public Integer focal_distance;
        public Integer AF_position;

        public Builder focal_distance(Integer n) {
            return null;
        }

        public Builder AF_position(Integer n) {
            return null;
        }

        public AccurateShootPhotoCameraStateInformation build() {
            return null;
        }
    }

    private static final class ProtoAdapter_AccurateShootPhotoCameraStateInformation
    extends ProtoAdapter<AccurateShootPhotoCameraStateInformation> {
        ProtoAdapter_AccurateShootPhotoCameraStateInformation() {
        }

        public int encodedSize(AccurateShootPhotoCameraStateInformation accurateShootPhotoCameraStateInformation) {
            return 0;
        }

        public void encode(ProtoWriter protoWriter, AccurateShootPhotoCameraStateInformation accurateShootPhotoCameraStateInformation) throws IOException {
        }

        public AccurateShootPhotoCameraStateInformation decode(ProtoReader protoReader) throws IOException {
            return null;
        }

        public AccurateShootPhotoCameraStateInformation redact(AccurateShootPhotoCameraStateInformation accurateShootPhotoCameraStateInformation) {
            return null;
        }
    }
}

