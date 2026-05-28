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
package dji.csdk.flysafe;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import java.io.IOException;
import okio.ByteString;

public final class LocationCoordinate
extends Message<LocationCoordinate, Builder> {
    public static final ProtoAdapter<LocationCoordinate> ADAPTER = new ProtoAdapter_LocationCoordinate();
    private static final long serialVersionUID = 0L;
    public static final Double DEFAULT_LATITUDE = 0.0;
    public static final Double DEFAULT_LONGITUDE = 0.0;
    @WireField(tag=1, adapter="com.squareup.wire.ProtoAdapter#DOUBLE")
    public final Double latitude;
    @WireField(tag=2, adapter="com.squareup.wire.ProtoAdapter#DOUBLE")
    public final Double longitude;

    public LocationCoordinate(Double d2, Double d3) {
    }

    public LocationCoordinate(Double d2, Double d3, ByteString byteString) {
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
    extends Message.Builder<LocationCoordinate, Builder> {
        public Double latitude;
        public Double longitude;

        public Builder latitude(Double d2) {
            return null;
        }

        public Builder longitude(Double d2) {
            return null;
        }

        public LocationCoordinate build() {
            return null;
        }
    }

    private static final class ProtoAdapter_LocationCoordinate
    extends ProtoAdapter<LocationCoordinate> {
        ProtoAdapter_LocationCoordinate() {
        }

        public int encodedSize(LocationCoordinate locationCoordinate) {
            return 0;
        }

        public void encode(ProtoWriter protoWriter, LocationCoordinate locationCoordinate) throws IOException {
        }

        public LocationCoordinate decode(ProtoReader protoReader) throws IOException {
            return null;
        }

        public LocationCoordinate redact(LocationCoordinate locationCoordinate) {
            return null;
        }
    }
}

