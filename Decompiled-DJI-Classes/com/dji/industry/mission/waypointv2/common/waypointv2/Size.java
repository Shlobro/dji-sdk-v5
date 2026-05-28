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

public final class Size
extends Message<Size, Builder> {
    public static final ProtoAdapter<Size> ADAPTER = new ProtoAdapter_Size();
    private static final long serialVersionUID = 0L;
    public static final Float DEFAULT_WIDTH = Float.valueOf(0.0f);
    public static final Float DEFAULT_HEIGHT = Float.valueOf(0.0f);
    @WireField(tag=1, adapter="com.squareup.wire.ProtoAdapter#FLOAT")
    public final Float width;
    @WireField(tag=2, adapter="com.squareup.wire.ProtoAdapter#FLOAT")
    public final Float height;

    public Size(Float f2, Float f3) {
    }

    public Size(Float f2, Float f3, ByteString byteString) {
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
    extends Message.Builder<Size, Builder> {
        public Float width;
        public Float height;

        public Builder width(Float f2) {
            return null;
        }

        public Builder height(Float f2) {
            return null;
        }

        public Size build() {
            return null;
        }
    }

    private static final class ProtoAdapter_Size
    extends ProtoAdapter<Size> {
        ProtoAdapter_Size() {
        }

        public int encodedSize(Size size) {
            return 0;
        }

        public void encode(ProtoWriter protoWriter, Size size) throws IOException {
        }

        public Size decode(ProtoReader protoReader) throws IOException {
            return null;
        }

        public Size redact(Size size) {
            return null;
        }
    }
}

