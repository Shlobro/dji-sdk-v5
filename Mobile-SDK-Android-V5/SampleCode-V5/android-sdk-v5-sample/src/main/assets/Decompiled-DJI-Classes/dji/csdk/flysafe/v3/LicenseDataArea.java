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
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class LicenseDataArea
extends Message<LicenseDataArea, Builder> {
    public static final ProtoAdapter<LicenseDataArea> ADAPTER = new ProtoAdapter_LicenseDataArea();
    private static final long serialVersionUID = 0L;
    public static final Integer DEFAULT_HEIGHT_LIMIT = 0;
    @WireField(tag=1, adapter="com.squareup.wire.ProtoAdapter#UINT32", label=WireField.Label.REPEATED)
    public final List<Integer> area_ids;
    @WireField(tag=2, adapter="com.squareup.wire.ProtoAdapter#UINT32")
    public final Integer height_limit;

    public LicenseDataArea(List<Integer> list, Integer n) {
    }

    public LicenseDataArea(List<Integer> list, Integer n, ByteString byteString) {
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
    extends Message.Builder<LicenseDataArea, Builder> {
        public List<Integer> area_ids;
        public Integer height_limit;

        public Builder area_ids(List<Integer> list) {
            return null;
        }

        public Builder height_limit(Integer n) {
            return null;
        }

        public LicenseDataArea build() {
            return null;
        }
    }

    private static final class ProtoAdapter_LicenseDataArea
    extends ProtoAdapter<LicenseDataArea> {
        ProtoAdapter_LicenseDataArea() {
        }

        public int encodedSize(LicenseDataArea licenseDataArea) {
            return 0;
        }

        public void encode(ProtoWriter protoWriter, LicenseDataArea licenseDataArea) throws IOException {
        }

        public LicenseDataArea decode(ProtoReader protoReader) throws IOException {
            return null;
        }

        public LicenseDataArea redact(LicenseDataArea licenseDataArea) {
            return null;
        }
    }
}

