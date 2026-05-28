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

public final class LicenseGroupInfo
extends Message<LicenseGroupInfo, Builder> {
    public static final ProtoAdapter<LicenseGroupInfo> ADAPTER = new ProtoAdapter_LicenseGroupInfo();
    private static final long serialVersionUID = 0L;
    public static final Integer DEFAULT_ID = 0;
    public static final Integer DEFAULT_TIMESTAMP = 0;
    public static final ByteString DEFAULT_SN = ByteString.EMPTY;
    public static final Long DEFAULT_USER_ID = 0L;
    public static final Integer DEFAULT_LICENSES_COUNT = 0;
    @WireField(tag=1, adapter="com.squareup.wire.ProtoAdapter#UINT32")
    public final Integer id;
    @WireField(tag=2, adapter="com.squareup.wire.ProtoAdapter#UINT32")
    public final Integer timestamp;
    @WireField(tag=3, adapter="com.squareup.wire.ProtoAdapter#BYTES")
    public final ByteString sn;
    @WireField(tag=4, adapter="com.squareup.wire.ProtoAdapter#UINT64")
    public final Long user_id;
    @WireField(tag=5, adapter="com.squareup.wire.ProtoAdapter#UINT32")
    public final Integer licenses_count;

    public LicenseGroupInfo(Integer n, Integer n2, ByteString byteString, Long l2, Integer n3) {
    }

    public LicenseGroupInfo(Integer n, Integer n2, ByteString byteString, Long l2, Integer n3, ByteString byteString2) {
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
    extends Message.Builder<LicenseGroupInfo, Builder> {
        public Integer id;
        public Integer timestamp;
        public ByteString sn;
        public Long user_id;
        public Integer licenses_count;

        public Builder id(Integer n) {
            return null;
        }

        public Builder timestamp(Integer n) {
            return null;
        }

        public Builder sn(ByteString byteString) {
            return null;
        }

        public Builder user_id(Long l2) {
            return null;
        }

        public Builder licenses_count(Integer n) {
            return null;
        }

        public LicenseGroupInfo build() {
            return null;
        }
    }

    private static final class ProtoAdapter_LicenseGroupInfo
    extends ProtoAdapter<LicenseGroupInfo> {
        ProtoAdapter_LicenseGroupInfo() {
        }

        public int encodedSize(LicenseGroupInfo licenseGroupInfo) {
            return 0;
        }

        public void encode(ProtoWriter protoWriter, LicenseGroupInfo licenseGroupInfo) throws IOException {
        }

        public LicenseGroupInfo decode(ProtoReader protoReader) throws IOException {
            return null;
        }

        public LicenseGroupInfo redact(LicenseGroupInfo licenseGroupInfo) {
            return null;
        }
    }
}

