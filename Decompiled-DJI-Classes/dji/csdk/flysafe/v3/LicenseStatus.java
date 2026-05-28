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

public final class LicenseStatus
extends Message<LicenseStatus, Builder> {
    public static final ProtoAdapter<LicenseStatus> ADAPTER = new ProtoAdapter_LicenseStatus();
    private static final long serialVersionUID = 0L;
    public static final Boolean DEFAULT_ENABLE = false;
    public static final Boolean DEFAULT_IN_VALID_DATE = false;
    public static final Boolean DEFAULT_INVALID = false;
    @WireField(tag=1, adapter="com.squareup.wire.ProtoAdapter#BOOL")
    public final Boolean enable;
    @WireField(tag=2, adapter="com.squareup.wire.ProtoAdapter#BOOL")
    public final Boolean in_valid_date;
    @WireField(tag=3, adapter="com.squareup.wire.ProtoAdapter#BOOL")
    public final Boolean invalid;

    public LicenseStatus(Boolean bl, Boolean bl2, Boolean bl3) {
    }

    public LicenseStatus(Boolean bl, Boolean bl2, Boolean bl3, ByteString byteString) {
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
    extends Message.Builder<LicenseStatus, Builder> {
        public Boolean enable;
        public Boolean in_valid_date;
        public Boolean invalid;

        public Builder enable(Boolean bl) {
            return null;
        }

        public Builder in_valid_date(Boolean bl) {
            return null;
        }

        public Builder invalid(Boolean bl) {
            return null;
        }

        public LicenseStatus build() {
            return null;
        }
    }

    private static final class ProtoAdapter_LicenseStatus
    extends ProtoAdapter<LicenseStatus> {
        ProtoAdapter_LicenseStatus() {
        }

        public int encodedSize(LicenseStatus licenseStatus) {
            return 0;
        }

        public void encode(ProtoWriter protoWriter, LicenseStatus licenseStatus) throws IOException {
        }

        public LicenseStatus decode(ProtoReader protoReader) throws IOException {
            return null;
        }

        public LicenseStatus redact(LicenseStatus licenseStatus) {
            return null;
        }
    }
}

