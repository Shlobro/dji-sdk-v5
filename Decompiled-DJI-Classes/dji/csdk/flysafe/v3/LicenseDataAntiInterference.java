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

public final class LicenseDataAntiInterference
extends Message<LicenseDataAntiInterference, Builder> {
    public static final ProtoAdapter<LicenseDataAntiInterference> ADAPTER = new ProtoAdapter_LicenseDataAntiInterference();
    private static final long serialVersionUID = 0L;
    public static final Integer DEFAULT_LEVEL = 0;
    @WireField(tag=1, adapter="com.squareup.wire.ProtoAdapter#UINT32")
    public final Integer level;

    public LicenseDataAntiInterference(Integer n) {
    }

    public LicenseDataAntiInterference(Integer n, ByteString byteString) {
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
    extends Message.Builder<LicenseDataAntiInterference, Builder> {
        public Integer level;

        public Builder level(Integer n) {
            return null;
        }

        public LicenseDataAntiInterference build() {
            return null;
        }
    }

    private static final class ProtoAdapter_LicenseDataAntiInterference
    extends ProtoAdapter<LicenseDataAntiInterference> {
        ProtoAdapter_LicenseDataAntiInterference() {
        }

        public int encodedSize(LicenseDataAntiInterference licenseDataAntiInterference) {
            return 0;
        }

        public void encode(ProtoWriter protoWriter, LicenseDataAntiInterference licenseDataAntiInterference) throws IOException {
        }

        public LicenseDataAntiInterference decode(ProtoReader protoReader) throws IOException {
            return null;
        }

        public LicenseDataAntiInterference redact(LicenseDataAntiInterference licenseDataAntiInterference) {
            return null;
        }
    }
}

