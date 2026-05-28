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
import dji.csdk.flysafe.LicenseUnlockVersion;
import java.io.IOException;
import okio.ByteString;

public final class UpdateLicenseUnlockVersionContext
extends Message<UpdateLicenseUnlockVersionContext, Builder> {
    public static final ProtoAdapter<UpdateLicenseUnlockVersionContext> ADAPTER = new ProtoAdapter_UpdateLicenseUnlockVersionContext();
    private static final long serialVersionUID = 0L;
    public static final LicenseUnlockVersion DEFAULT_UNLOCK_VERSION = LicenseUnlockVersion.Version2;
    @WireField(tag=2, adapter="dji.flysafe.LicenseUnlockVersion#ADAPTER")
    public final LicenseUnlockVersion unlock_version;

    public UpdateLicenseUnlockVersionContext(LicenseUnlockVersion licenseUnlockVersion) {
    }

    public UpdateLicenseUnlockVersionContext(LicenseUnlockVersion licenseUnlockVersion, ByteString byteString) {
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
    extends Message.Builder<UpdateLicenseUnlockVersionContext, Builder> {
        public LicenseUnlockVersion unlock_version;

        public Builder unlock_version(LicenseUnlockVersion licenseUnlockVersion) {
            return null;
        }

        public UpdateLicenseUnlockVersionContext build() {
            return null;
        }
    }

    private static final class ProtoAdapter_UpdateLicenseUnlockVersionContext
    extends ProtoAdapter<UpdateLicenseUnlockVersionContext> {
        ProtoAdapter_UpdateLicenseUnlockVersionContext() {
        }

        public int encodedSize(UpdateLicenseUnlockVersionContext updateLicenseUnlockVersionContext) {
            return 0;
        }

        public void encode(ProtoWriter protoWriter, UpdateLicenseUnlockVersionContext updateLicenseUnlockVersionContext) throws IOException {
        }

        public UpdateLicenseUnlockVersionContext decode(ProtoReader protoReader) throws IOException {
            return null;
        }

        public UpdateLicenseUnlockVersionContext redact(UpdateLicenseUnlockVersionContext updateLicenseUnlockVersionContext) {
            return null;
        }
    }
}

