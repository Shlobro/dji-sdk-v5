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
package dji.csdk.flysafe.v3;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import java.io.IOException;
import okio.ByteString;

public final class GPSPoint
extends Message<GPSPoint, Builder> {
    public static final ProtoAdapter<GPSPoint> ADAPTER = new ProtoAdapter_GPSPoint();
    private static final long serialVersionUID = 0L;
    public static final Float DEFAULT_LAT = Float.valueOf(0.0f);
    public static final Float DEFAULT_LNG = Float.valueOf(0.0f);
    @WireField(tag=1, adapter="com.squareup.wire.ProtoAdapter#FLOAT")
    public final Float lat;
    @WireField(tag=2, adapter="com.squareup.wire.ProtoAdapter#FLOAT")
    public final Float lng;

    public GPSPoint(Float f2, Float f3) {
    }

    public GPSPoint(Float f2, Float f3, ByteString byteString) {
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
    extends Message.Builder<GPSPoint, Builder> {
        public Float lat;
        public Float lng;

        public Builder lat(Float f2) {
            return null;
        }

        public Builder lng(Float f2) {
            return null;
        }

        public GPSPoint build() {
            return null;
        }
    }

    private static final class ProtoAdapter_GPSPoint
    extends ProtoAdapter<GPSPoint> {
        ProtoAdapter_GPSPoint() {
        }

        public int encodedSize(GPSPoint gPSPoint) {
            return 0;
        }

        public void encode(ProtoWriter protoWriter, GPSPoint gPSPoint) throws IOException {
        }

        public GPSPoint decode(ProtoReader protoReader) throws IOException {
            return null;
        }

        public GPSPoint redact(GPSPoint gPSPoint) {
            return null;
        }
    }
}

