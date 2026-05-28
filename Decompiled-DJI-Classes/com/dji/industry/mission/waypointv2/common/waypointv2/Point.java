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

public final class Point
extends Message<Point, Builder> {
    public static final ProtoAdapter<Point> ADAPTER = new ProtoAdapter_Point();
    private static final long serialVersionUID = 0L;
    public static final Float DEFAULT_X = Float.valueOf(0.0f);
    public static final Float DEFAULT_Y = Float.valueOf(0.0f);
    @WireField(tag=1, adapter="com.squareup.wire.ProtoAdapter#FLOAT")
    public final Float x;
    @WireField(tag=2, adapter="com.squareup.wire.ProtoAdapter#FLOAT")
    public final Float y;

    public Point(Float f2, Float f3) {
    }

    public Point(Float f2, Float f3, ByteString byteString) {
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
    extends Message.Builder<Point, Builder> {
        public Float x;
        public Float y;

        public Builder x(Float f2) {
            return null;
        }

        public Builder y(Float f2) {
            return null;
        }

        public Point build() {
            return null;
        }
    }

    private static final class ProtoAdapter_Point
    extends ProtoAdapter<Point> {
        ProtoAdapter_Point() {
        }

        public int encodedSize(Point point) {
            return 0;
        }

        public void encode(ProtoWriter protoWriter, Point point) throws IOException {
        }

        public Point decode(ProtoReader protoReader) throws IOException {
            return null;
        }

        public Point redact(Point point) {
            return null;
        }
    }
}

