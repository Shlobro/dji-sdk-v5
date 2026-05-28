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
import dji.csdk.flysafe.v3.License;
import dji.csdk.flysafe.v3.LicenseGroupInfo;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class LicenseGroup
extends Message<LicenseGroup, Builder> {
    public static final ProtoAdapter<LicenseGroup> ADAPTER = new ProtoAdapter_LicenseGroup();
    private static final long serialVersionUID = 0L;
    public static final Integer DEFAULT_VERSION = 0;
    @WireField(tag=1, adapter="com.squareup.wire.ProtoAdapter#UINT32")
    public final Integer version;
    @WireField(tag=2, adapter="dji.flysafe.v3.LicenseGroupInfo#ADAPTER")
    public final LicenseGroupInfo info;
    @WireField(tag=3, adapter="dji.flysafe.v3.License#ADAPTER", label=WireField.Label.REPEATED)
    public final List<License> licenses;

    public LicenseGroup(Integer n, LicenseGroupInfo licenseGroupInfo, List<License> list) {
    }

    public LicenseGroup(Integer n, LicenseGroupInfo licenseGroupInfo, List<License> list, ByteString byteString) {
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
    extends Message.Builder<LicenseGroup, Builder> {
        public Integer version;
        public LicenseGroupInfo info;
        public List<License> licenses;

        public Builder version(Integer n) {
            return null;
        }

        public Builder info(LicenseGroupInfo licenseGroupInfo) {
            return null;
        }

        public Builder licenses(List<License> list) {
            return null;
        }

        public LicenseGroup build() {
            return null;
        }
    }

    private static final class ProtoAdapter_LicenseGroup
    extends ProtoAdapter<LicenseGroup> {
        ProtoAdapter_LicenseGroup() {
        }

        public int encodedSize(LicenseGroup licenseGroup) {
            return 0;
        }

        public void encode(ProtoWriter protoWriter, LicenseGroup licenseGroup) throws IOException {
        }

        public LicenseGroup decode(ProtoReader protoReader) throws IOException {
            return null;
        }

        public LicenseGroup redact(LicenseGroup licenseGroup) {
            return null;
        }
    }
}

