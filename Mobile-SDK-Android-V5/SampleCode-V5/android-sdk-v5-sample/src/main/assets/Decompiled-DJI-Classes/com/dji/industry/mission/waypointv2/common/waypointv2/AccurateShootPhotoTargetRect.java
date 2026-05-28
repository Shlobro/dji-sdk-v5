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

import com.dji.industry.mission.waypointv2.common.waypointv2.Point;
import com.dji.industry.mission.waypointv2.common.waypointv2.Size;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import java.io.IOException;
import okio.ByteString;

public final class AccurateShootPhotoTargetRect
extends Message<AccurateShootPhotoTargetRect, Builder> {
    public static final ProtoAdapter<AccurateShootPhotoTargetRect> ADAPTER = new ProtoAdapter_AccurateShootPhotoTargetRect();
    private static final long serialVersionUID = 0L;
    public static final Float DEFAULT_ANGLE = Float.valueOf(0.0f);
    @WireField(tag=1, adapter="com.dji.industry.mission.waypointv2.common.waypointv2.Point#ADAPTER")
    public final Point position;
    @WireField(tag=2, adapter="com.dji.industry.mission.waypointv2.common.waypointv2.Size#ADAPTER")
    public final Size size;
    @WireField(tag=3, adapter="com.squareup.wire.ProtoAdapter#FLOAT")
    public final Float angle;

    public AccurateShootPhotoTargetRect(Point point, Size size, Float f2) {
    }

    public AccurateShootPhotoTargetRect(Point point, Size size, Float f2, ByteString byteString) {
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
    extends Message.Builder<AccurateShootPhotoTargetRect, Builder> {
        public Point position;
        public Size size;
        public Float angle;

        public Builder position(Point point) {
            return null;
        }

        public Builder size(Size size) {
            return null;
        }

        public Builder angle(Float f2) {
            return null;
        }

        public AccurateShootPhotoTargetRect build() {
            return null;
        }
    }

    private static final class ProtoAdapter_AccurateShootPhotoTargetRect
    extends ProtoAdapter<AccurateShootPhotoTargetRect> {
        ProtoAdapter_AccurateShootPhotoTargetRect() {
        }

        public int encodedSize(AccurateShootPhotoTargetRect accurateShootPhotoTargetRect) {
            return 0;
        }

        public void encode(ProtoWriter protoWriter, AccurateShootPhotoTargetRect accurateShootPhotoTargetRect) throws IOException {
        }

        public AccurateShootPhotoTargetRect decode(ProtoReader protoReader) throws IOException {
            return null;
        }

        public AccurateShootPhotoTargetRect redact(AccurateShootPhotoTargetRect accurateShootPhotoTargetRect) {
            return null;
        }
    }
}

