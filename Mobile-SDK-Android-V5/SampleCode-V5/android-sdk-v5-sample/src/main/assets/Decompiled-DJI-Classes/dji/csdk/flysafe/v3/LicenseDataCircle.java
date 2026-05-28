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
import dji.csdk.flysafe.v3.GPSPoint;
import java.io.IOException;
import okio.ByteString;

public final class LicenseDataCircle
extends Message<LicenseDataCircle, Builder> {
    public static final ProtoAdapter<LicenseDataCircle> ADAPTER = new ProtoAdapter_LicenseDataCircle();
    private static final long serialVersionUID = 0L;
    public static final Integer DEFAULT_RADIUS = 0;
    public static final Integer DEFAULT_HEIGHT_LIMIT = 0;
    @WireField(tag=1, adapter="dji.flysafe.v3.GPSPoint#ADAPTER")
    public final GPSPoint point;
    @WireField(tag=2, adapter="com.squareup.wire.ProtoAdapter#UINT32")
    public final Integer radius;
    @WireField(tag=3, adapter="com.squareup.wire.ProtoAdapter#UINT32")
    public final Integer height_limit;

    public LicenseDataCircle(GPSPoint gPSPoint, Integer n, Integer n2) {
    }

    public LicenseDataCircle(GPSPoint gPSPoint, Integer n, Integer n2, ByteString byteString) {
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
    extends Message.Builder<LicenseDataCircle, Builder> {
        public GPSPoint point;
        public Integer radius;
        public Integer height_limit;

        public Builder point(GPSPoint gPSPoint) {
            return null;
        }

        public Builder radius(Integer n) {
            return null;
        }

        public Builder height_limit(Integer n) {
            return null;
        }

        public LicenseDataCircle build() {
            return null;
        }
    }

    private static final class ProtoAdapter_LicenseDataCircle
    extends ProtoAdapter<LicenseDataCircle> {
        ProtoAdapter_LicenseDataCircle() {
        }

        public int encodedSize(LicenseDataCircle licenseDataCircle) {
            return 0;
        }

        public void encode(ProtoWriter protoWriter, LicenseDataCircle licenseDataCircle) throws IOException {
        }

        public LicenseDataCircle decode(ProtoReader protoReader) throws IOException {
            return null;
        }

        public LicenseDataCircle redact(LicenseDataCircle licenseDataCircle) {
            return null;
        }
    }
}

