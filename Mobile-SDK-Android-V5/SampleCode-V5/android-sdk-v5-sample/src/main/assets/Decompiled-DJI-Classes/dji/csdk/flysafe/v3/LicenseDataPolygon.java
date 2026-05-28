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
 *  com.squareup.wire.WireField$Label
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
import java.util.List;
import okio.ByteString;

public final class LicenseDataPolygon
extends Message<LicenseDataPolygon, Builder> {
    public static final ProtoAdapter<LicenseDataPolygon> ADAPTER = new ProtoAdapter_LicenseDataPolygon();
    private static final long serialVersionUID = 0L;
    public static final Integer DEFAULT_HEIGHT_LIMIT = 0;
    @WireField(tag=1, adapter="dji.flysafe.v3.GPSPoint#ADAPTER", label=WireField.Label.REPEATED)
    public final List<GPSPoint> points;
    @WireField(tag=2, adapter="com.squareup.wire.ProtoAdapter#UINT32")
    public final Integer height_limit;

    public LicenseDataPolygon(List<GPSPoint> list, Integer n) {
    }

    public LicenseDataPolygon(List<GPSPoint> list, Integer n, ByteString byteString) {
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
    extends Message.Builder<LicenseDataPolygon, Builder> {
        public List<GPSPoint> points;
        public Integer height_limit;

        public Builder points(List<GPSPoint> list) {
            return null;
        }

        public Builder height_limit(Integer n) {
            return null;
        }

        public LicenseDataPolygon build() {
            return null;
        }
    }

    private static final class ProtoAdapter_LicenseDataPolygon
    extends ProtoAdapter<LicenseDataPolygon> {
        ProtoAdapter_LicenseDataPolygon() {
        }

        public int encodedSize(LicenseDataPolygon licenseDataPolygon) {
            return 0;
        }

        public void encode(ProtoWriter protoWriter, LicenseDataPolygon licenseDataPolygon) throws IOException {
        }

        public LicenseDataPolygon decode(ProtoReader protoReader) throws IOException {
            return null;
        }

        public LicenseDataPolygon redact(LicenseDataPolygon licenseDataPolygon) {
            return null;
        }
    }
}

