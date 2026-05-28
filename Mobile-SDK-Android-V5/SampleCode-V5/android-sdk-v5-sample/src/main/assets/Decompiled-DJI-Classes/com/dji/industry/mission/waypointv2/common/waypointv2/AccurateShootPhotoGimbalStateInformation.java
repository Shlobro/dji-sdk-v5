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

public final class AccurateShootPhotoGimbalStateInformation
extends Message<AccurateShootPhotoGimbalStateInformation, Builder> {
    public static final ProtoAdapter<AccurateShootPhotoGimbalStateInformation> ADAPTER = new ProtoAdapter_AccurateShootPhotoGimbalStateInformation();
    private static final long serialVersionUID = 0L;
    public static final Float DEFAULT_PITCH = Float.valueOf(0.0f);
    public static final Float DEFAULT_ROLL = Float.valueOf(0.0f);
    public static final Float DEFAULT_YAW = Float.valueOf(0.0f);
    @WireField(tag=1, adapter="com.squareup.wire.ProtoAdapter#FLOAT")
    public final Float pitch;
    @WireField(tag=2, adapter="com.squareup.wire.ProtoAdapter#FLOAT")
    public final Float roll;
    @WireField(tag=3, adapter="com.squareup.wire.ProtoAdapter#FLOAT")
    public final Float yaw;

    public AccurateShootPhotoGimbalStateInformation(Float f2, Float f3, Float f4) {
    }

    public AccurateShootPhotoGimbalStateInformation(Float f2, Float f3, Float f4, ByteString byteString) {
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
    extends Message.Builder<AccurateShootPhotoGimbalStateInformation, Builder> {
        public Float pitch;
        public Float roll;
        public Float yaw;

        public Builder pitch(Float f2) {
            return null;
        }

        public Builder roll(Float f2) {
            return null;
        }

        public Builder yaw(Float f2) {
            return null;
        }

        public AccurateShootPhotoGimbalStateInformation build() {
            return null;
        }
    }

    private static final class ProtoAdapter_AccurateShootPhotoGimbalStateInformation
    extends ProtoAdapter<AccurateShootPhotoGimbalStateInformation> {
        ProtoAdapter_AccurateShootPhotoGimbalStateInformation() {
        }

        public int encodedSize(AccurateShootPhotoGimbalStateInformation accurateShootPhotoGimbalStateInformation) {
            return 0;
        }

        public void encode(ProtoWriter protoWriter, AccurateShootPhotoGimbalStateInformation accurateShootPhotoGimbalStateInformation) throws IOException {
        }

        public AccurateShootPhotoGimbalStateInformation decode(ProtoReader protoReader) throws IOException {
            return null;
        }

        public AccurateShootPhotoGimbalStateInformation redact(AccurateShootPhotoGimbalStateInformation accurateShootPhotoGimbalStateInformation) {
            return null;
        }
    }
}

