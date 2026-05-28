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

public final class LicenseDataCountry
extends Message<LicenseDataCountry, Builder> {
    public static final ProtoAdapter<LicenseDataCountry> ADAPTER = new ProtoAdapter_LicenseDataCountry();
    private static final long serialVersionUID = 0L;
    public static final Integer DEFAULT_COUNTRY_NUMBER = 0;
    public static final Integer DEFAULT_HEIGHT_LIMIT = 0;
    @WireField(tag=1, adapter="com.squareup.wire.ProtoAdapter#UINT32")
    public final Integer country_number;
    @WireField(tag=2, adapter="com.squareup.wire.ProtoAdapter#UINT32")
    public final Integer height_limit;

    public LicenseDataCountry(Integer n, Integer n2) {
    }

    public LicenseDataCountry(Integer n, Integer n2, ByteString byteString) {
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
    extends Message.Builder<LicenseDataCountry, Builder> {
        public Integer country_number;
        public Integer height_limit;

        public Builder country_number(Integer n) {
            return null;
        }

        public Builder height_limit(Integer n) {
            return null;
        }

        public LicenseDataCountry build() {
            return null;
        }
    }

    private static final class ProtoAdapter_LicenseDataCountry
    extends ProtoAdapter<LicenseDataCountry> {
        ProtoAdapter_LicenseDataCountry() {
        }

        public int encodedSize(LicenseDataCountry licenseDataCountry) {
            return 0;
        }

        public void encode(ProtoWriter protoWriter, LicenseDataCountry licenseDataCountry) throws IOException {
        }

        public LicenseDataCountry decode(ProtoReader protoReader) throws IOException {
            return null;
        }

        public LicenseDataCountry redact(LicenseDataCountry licenseDataCountry) {
            return null;
        }
    }
}

