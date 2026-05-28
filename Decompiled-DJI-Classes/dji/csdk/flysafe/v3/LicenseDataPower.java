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

public final class LicenseDataPower
extends Message<LicenseDataPower, Builder> {
    public static final ProtoAdapter<LicenseDataPower> ADAPTER = new ProtoAdapter_LicenseDataPower();
    private static final long serialVersionUID = 0L;
    public static final Integer DEFAULT_LEVEL_LIMIT = 0;
    @WireField(tag=1, adapter="com.squareup.wire.ProtoAdapter#UINT32")
    public final Integer level_limit;

    public LicenseDataPower(Integer n) {
    }

    public LicenseDataPower(Integer n, ByteString byteString) {
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
    extends Message.Builder<LicenseDataPower, Builder> {
        public Integer level_limit;

        public Builder level_limit(Integer n) {
            return null;
        }

        public LicenseDataPower build() {
            return null;
        }
    }

    private static final class ProtoAdapter_LicenseDataPower
    extends ProtoAdapter<LicenseDataPower> {
        ProtoAdapter_LicenseDataPower() {
        }

        public int encodedSize(LicenseDataPower licenseDataPower) {
            return 0;
        }

        public void encode(ProtoWriter protoWriter, LicenseDataPower licenseDataPower) throws IOException {
        }

        public LicenseDataPower decode(ProtoReader protoReader) throws IOException {
            return null;
        }

        public LicenseDataPower redact(LicenseDataPower licenseDataPower) {
            return null;
        }
    }
}

