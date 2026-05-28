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
import dji.csdk.flysafe.v3.LicenseData;
import java.io.IOException;
import okio.ByteString;

public final class License
extends Message<License, Builder> {
    public static final ProtoAdapter<License> ADAPTER = new ProtoAdapter_License();
    private static final long serialVersionUID = 0L;
    public static final Integer DEFAULT_ID = 0;
    public static final String DEFAULT_DESCRIPTION = "";
    public static final Integer DEFAULT_START_AT = 0;
    public static final Integer DEFAULT_END_AT = 0;
    public static final Boolean DEFAULT_USER_ONLY = false;
    public static final ByteString DEFAULT_DESC_JAVA = ByteString.EMPTY;
    @WireField(tag=1, adapter="com.squareup.wire.ProtoAdapter#UINT32")
    public final Integer id;
    @WireField(tag=2, adapter="com.squareup.wire.ProtoAdapter#STRING")
    public final String description;
    @WireField(tag=3, adapter="com.squareup.wire.ProtoAdapter#UINT32")
    public final Integer start_at;
    @WireField(tag=4, adapter="com.squareup.wire.ProtoAdapter#UINT32")
    public final Integer end_at;
    @WireField(tag=5, adapter="com.squareup.wire.ProtoAdapter#BOOL")
    public final Boolean user_only;
    @WireField(tag=6, adapter="dji.flysafe.v3.LicenseData#ADAPTER")
    public final LicenseData data;
    @WireField(tag=7, adapter="com.squareup.wire.ProtoAdapter#BYTES")
    public final ByteString desc_java;

    public License(Integer n, String string, Integer n2, Integer n3, Boolean bl, LicenseData licenseData, ByteString byteString) {
    }

    public License(Integer n, String string, Integer n2, Integer n3, Boolean bl, LicenseData licenseData, ByteString byteString, ByteString byteString2) {
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
    extends Message.Builder<License, Builder> {
        public Integer id;
        public String description;
        public Integer start_at;
        public Integer end_at;
        public Boolean user_only;
        public LicenseData data;
        public ByteString desc_java;

        public Builder id(Integer n) {
            return null;
        }

        public Builder description(String string) {
            return null;
        }

        public Builder start_at(Integer n) {
            return null;
        }

        public Builder end_at(Integer n) {
            return null;
        }

        public Builder user_only(Boolean bl) {
            return null;
        }

        public Builder data(LicenseData licenseData) {
            return null;
        }

        public Builder desc_java(ByteString byteString) {
            return null;
        }

        public License build() {
            return null;
        }
    }

    private static final class ProtoAdapter_License
    extends ProtoAdapter<License> {
        ProtoAdapter_License() {
        }

        public int encodedSize(License license) {
            return 0;
        }

        public void encode(ProtoWriter protoWriter, License license) throws IOException {
        }

        public License decode(ProtoReader protoReader) throws IOException {
            return null;
        }

        public License redact(License license) {
            return null;
        }
    }
}

