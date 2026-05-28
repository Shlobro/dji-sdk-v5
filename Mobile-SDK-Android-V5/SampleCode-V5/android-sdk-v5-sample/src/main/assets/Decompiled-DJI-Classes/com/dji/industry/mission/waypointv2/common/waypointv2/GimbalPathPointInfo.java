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

public final class GimbalPathPointInfo
extends Message<GimbalPathPointInfo, Builder> {
    public static final ProtoAdapter<GimbalPathPointInfo> ADAPTER = new ProtoAdapter_GimbalPathPointInfo();
    private static final long serialVersionUID = 0L;
    public static final Float DEFAULT_RUNNING_TIME = Float.valueOf(0.0f);
    public static final Float DEFAULT_STAY_TIME = Float.valueOf(0.0f);
    public static final Float DEFAULT_EULER_ROLL = Float.valueOf(0.0f);
    public static final Float DEFAULT_EULER_PITCH = Float.valueOf(0.0f);
    public static final Float DEFAULT_EULER_YAW = Float.valueOf(0.0f);
    @WireField(tag=1, adapter="com.squareup.wire.ProtoAdapter#FLOAT")
    public final Float running_time;
    @WireField(tag=2, adapter="com.squareup.wire.ProtoAdapter#FLOAT")
    public final Float stay_time;
    @WireField(tag=3, adapter="com.squareup.wire.ProtoAdapter#FLOAT")
    public final Float euler_roll;
    @WireField(tag=4, adapter="com.squareup.wire.ProtoAdapter#FLOAT")
    public final Float euler_pitch;
    @WireField(tag=5, adapter="com.squareup.wire.ProtoAdapter#FLOAT")
    public final Float euler_yaw;

    public GimbalPathPointInfo(Float f2, Float f3, Float f4, Float f5, Float f6) {
    }

    public GimbalPathPointInfo(Float f2, Float f3, Float f4, Float f5, Float f6, ByteString byteString) {
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
    extends Message.Builder<GimbalPathPointInfo, Builder> {
        public Float running_time;
        public Float stay_time;
        public Float euler_roll;
        public Float euler_pitch;
        public Float euler_yaw;

        public Builder running_time(Float f2) {
            return null;
        }

        public Builder stay_time(Float f2) {
            return null;
        }

        public Builder euler_roll(Float f2) {
            return null;
        }

        public Builder euler_pitch(Float f2) {
            return null;
        }

        public Builder euler_yaw(Float f2) {
            return null;
        }

        public GimbalPathPointInfo build() {
            return null;
        }
    }

    private static final class ProtoAdapter_GimbalPathPointInfo
    extends ProtoAdapter<GimbalPathPointInfo> {
        ProtoAdapter_GimbalPathPointInfo() {
        }

        public int encodedSize(GimbalPathPointInfo gimbalPathPointInfo) {
            return 0;
        }

        public void encode(ProtoWriter protoWriter, GimbalPathPointInfo gimbalPathPointInfo) throws IOException {
        }

        public GimbalPathPointInfo decode(ProtoReader protoReader) throws IOException {
            return null;
        }

        public GimbalPathPointInfo redact(GimbalPathPointInfo gimbalPathPointInfo) {
            return null;
        }
    }
}

