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
import dji.csdk.flysafe.v3.LicenseGroupInfo;
import dji.csdk.flysafe.v3.LicenseModel;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class LicenseGroupModel
extends Message<LicenseGroupModel, Builder> {
    public static final ProtoAdapter<LicenseGroupModel> ADAPTER = new ProtoAdapter_LicenseGroupModel();
    private static final long serialVersionUID = 0L;
    public static final Integer DEFAULT_VERSION = 0;
    public static final Integer DEFAULT_CREATE_AT = 0;
    @WireField(tag=1, adapter="com.squareup.wire.ProtoAdapter#UINT32")
    public final Integer version;
    @WireField(tag=2, adapter="dji.flysafe.v3.LicenseGroupInfo#ADAPTER")
    public final LicenseGroupInfo group_info;
    @WireField(tag=3, adapter="com.squareup.wire.ProtoAdapter#UINT32")
    public final Integer create_at;
    @WireField(tag=4, adapter="dji.flysafe.v3.LicenseModel#ADAPTER", label=WireField.Label.REPEATED)
    public final List<LicenseModel> license_models;

    public LicenseGroupModel(Integer n, LicenseGroupInfo licenseGroupInfo, Integer n2, List<LicenseModel> list) {
    }

    public LicenseGroupModel(Integer n, LicenseGroupInfo licenseGroupInfo, Integer n2, List<LicenseModel> list, ByteString byteString) {
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
    extends Message.Builder<LicenseGroupModel, Builder> {
        public Integer version;
        public LicenseGroupInfo group_info;
        public Integer create_at;
        public List<LicenseModel> license_models;

        public Builder version(Integer n) {
            return null;
        }

        public Builder group_info(LicenseGroupInfo licenseGroupInfo) {
            return null;
        }

        public Builder create_at(Integer n) {
            return null;
        }

        public Builder license_models(List<LicenseModel> list) {
            return null;
        }

        public LicenseGroupModel build() {
            return null;
        }
    }

    private static final class ProtoAdapter_LicenseGroupModel
    extends ProtoAdapter<LicenseGroupModel> {
        ProtoAdapter_LicenseGroupModel() {
        }

        public int encodedSize(LicenseGroupModel licenseGroupModel) {
            return 0;
        }

        public void encode(ProtoWriter protoWriter, LicenseGroupModel licenseGroupModel) throws IOException {
        }

        public LicenseGroupModel decode(ProtoReader protoReader) throws IOException {
            return null;
        }

        public LicenseGroupModel redact(LicenseGroupModel licenseGroupModel) {
            return null;
        }
    }
}

