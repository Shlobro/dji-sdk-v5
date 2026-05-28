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

public final class LicenseDataHeight
extends Message<LicenseDataHeight, Builder> {
    public static final ProtoAdapter<LicenseDataHeight> ADAPTER = new ProtoAdapter_LicenseDataHeight();
    private static final long serialVersionUID = 0L;
    public static final Integer DEFAULT_HEIGHT_LIMIT = 0;
    @WireField(tag=1, adapter="com.squareup.wire.ProtoAdapter#UINT32")
    public final Integer height_limit;

    public LicenseDataHeight(Integer n) {
    }

    public LicenseDataHeight(Integer n, ByteString byteString) {
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
    extends Message.Builder<LicenseDataHeight, Builder> {
        public Integer height_limit;

        public Builder height_limit(Integer n) {
            return null;
        }

        public LicenseDataHeight build() {
            return null;
        }
    }

    private static final class ProtoAdapter_LicenseDataHeight
    extends ProtoAdapter<LicenseDataHeight> {
        ProtoAdapter_LicenseDataHeight() {
        }

        public int encodedSize(LicenseDataHeight licenseDataHeight) {
            return 0;
        }

        public void encode(ProtoWriter protoWriter, LicenseDataHeight licenseDataHeight) throws IOException {
        }

        public LicenseDataHeight decode(ProtoReader protoReader) throws IOException {
            return null;
        }

        public LicenseDataHeight redact(LicenseDataHeight licenseDataHeight) {
            return null;
        }
    }
}

