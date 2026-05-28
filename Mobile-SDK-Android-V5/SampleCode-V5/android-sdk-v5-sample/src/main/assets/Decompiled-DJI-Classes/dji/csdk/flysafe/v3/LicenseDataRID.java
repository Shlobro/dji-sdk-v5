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

public final class LicenseDataRID
extends Message<LicenseDataRID, Builder> {
    public static final ProtoAdapter<LicenseDataRID> ADAPTER = new ProtoAdapter_LicenseDataRID();
    private static final long serialVersionUID = 0L;
    public static final Integer DEFAULT_LEVEL = 0;
    @WireField(tag=1, adapter="com.squareup.wire.ProtoAdapter#UINT32")
    public final Integer level;

    public LicenseDataRID(Integer n) {
    }

    public LicenseDataRID(Integer n, ByteString byteString) {
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
    extends Message.Builder<LicenseDataRID, Builder> {
        public Integer level;

        public Builder level(Integer n) {
            return null;
        }

        public LicenseDataRID build() {
            return null;
        }
    }

    private static final class ProtoAdapter_LicenseDataRID
    extends ProtoAdapter<LicenseDataRID> {
        ProtoAdapter_LicenseDataRID() {
        }

        public int encodedSize(LicenseDataRID licenseDataRID) {
            return 0;
        }

        public void encode(ProtoWriter protoWriter, LicenseDataRID licenseDataRID) throws IOException {
        }

        public LicenseDataRID decode(ProtoReader protoReader) throws IOException {
            return null;
        }

        public LicenseDataRID redact(LicenseDataRID licenseDataRID) {
            return null;
        }
    }
}

