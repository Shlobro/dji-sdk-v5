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
import dji.csdk.flysafe.v3.License;
import dji.csdk.flysafe.v3.LicenseStatus;
import java.io.IOException;
import okio.ByteString;

public final class LicenseModel
extends Message<LicenseModel, Builder> {
    public static final ProtoAdapter<LicenseModel> ADAPTER = new ProtoAdapter_LicenseModel();
    private static final long serialVersionUID = 0L;
    @WireField(tag=1, adapter="dji.flysafe.v3.License#ADAPTER")
    public final License license;
    @WireField(tag=2, adapter="dji.flysafe.v3.LicenseStatus#ADAPTER")
    public final LicenseStatus license_status;

    public LicenseModel(License license, LicenseStatus licenseStatus) {
    }

    public LicenseModel(License license, LicenseStatus licenseStatus, ByteString byteString) {
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
    extends Message.Builder<LicenseModel, Builder> {
        public License license;
        public LicenseStatus license_status;

        public Builder license(License license) {
            return null;
        }

        public Builder license_status(LicenseStatus licenseStatus) {
            return null;
        }

        public LicenseModel build() {
            return null;
        }
    }

    private static final class ProtoAdapter_LicenseModel
    extends ProtoAdapter<LicenseModel> {
        ProtoAdapter_LicenseModel() {
        }

        public int encodedSize(LicenseModel licenseModel) {
            return 0;
        }

        public void encode(ProtoWriter protoWriter, LicenseModel licenseModel) throws IOException {
        }

        public LicenseModel decode(ProtoReader protoReader) throws IOException {
            return null;
        }

        public LicenseModel redact(LicenseModel licenseModel) {
            return null;
        }
    }
}

