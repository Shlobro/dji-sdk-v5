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
package dji.csdk.flysafe;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import dji.csdk.flysafe.V1WhiteListUnlockLicense;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class V1WhiteListUnlockLicenseResponseModel
extends Message<V1WhiteListUnlockLicenseResponseModel, Builder> {
    public static final ProtoAdapter<V1WhiteListUnlockLicenseResponseModel> ADAPTER = new ProtoAdapter_V1WhiteListUnlockLicenseResponseModel();
    private static final long serialVersionUID = 0L;
    @WireField(tag=1, adapter="dji.flysafe.V1WhiteListUnlockLicense#ADAPTER", label=WireField.Label.REPEATED)
    public final List<V1WhiteListUnlockLicense> whiteListUnlockLicenses;

    public V1WhiteListUnlockLicenseResponseModel(List<V1WhiteListUnlockLicense> list) {
    }

    public V1WhiteListUnlockLicenseResponseModel(List<V1WhiteListUnlockLicense> list, ByteString byteString) {
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
    extends Message.Builder<V1WhiteListUnlockLicenseResponseModel, Builder> {
        public List<V1WhiteListUnlockLicense> whiteListUnlockLicenses;

        public Builder whiteListUnlockLicenses(List<V1WhiteListUnlockLicense> list) {
            return null;
        }

        public V1WhiteListUnlockLicenseResponseModel build() {
            return null;
        }
    }

    private static final class ProtoAdapter_V1WhiteListUnlockLicenseResponseModel
    extends ProtoAdapter<V1WhiteListUnlockLicenseResponseModel> {
        ProtoAdapter_V1WhiteListUnlockLicenseResponseModel() {
        }

        public int encodedSize(V1WhiteListUnlockLicenseResponseModel v1WhiteListUnlockLicenseResponseModel) {
            return 0;
        }

        public void encode(ProtoWriter protoWriter, V1WhiteListUnlockLicenseResponseModel v1WhiteListUnlockLicenseResponseModel) throws IOException {
        }

        public V1WhiteListUnlockLicenseResponseModel decode(ProtoReader protoReader) throws IOException {
            return null;
        }

        public V1WhiteListUnlockLicenseResponseModel redact(V1WhiteListUnlockLicenseResponseModel v1WhiteListUnlockLicenseResponseModel) {
            return null;
        }
    }
}

