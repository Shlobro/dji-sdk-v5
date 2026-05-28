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
import java.io.IOException;
import okio.ByteString;

public final class V1WhiteListUnlockLicense
extends Message<V1WhiteListUnlockLicense, Builder> {
    public static final ProtoAdapter<V1WhiteListUnlockLicense> ADAPTER = new ProtoAdapter_V1WhiteListUnlockLicense();
    private static final long serialVersionUID = 0L;
    public static final String DEFAULT_ACCOUNT = "";
    public static final Boolean DEFAULT_DISABLE = false;
    public static final String DEFAULT_REGISTER_PHONE = "";
    public static final Integer DEFAULT_ID = 0;
    public static final Integer DEFAULT_USERUNLOCKID = 0;
    public static final String DEFAULT_MCSN = "";
    public static final String DEFAULT_LICENSEKEY = "";
    public static final String DEFAULT_UPDATETIME = "";
    public static final String DEFAULT_CREATETIME = "";
    public static final String DEFAULT_NAME = "";
    public static final String DEFAULT_USERID = "";
    @WireField(tag=1, adapter="com.squareup.wire.ProtoAdapter#STRING")
    public final String account;
    @WireField(tag=2, adapter="com.squareup.wire.ProtoAdapter#BOOL")
    public final Boolean disable;
    @WireField(tag=3, adapter="com.squareup.wire.ProtoAdapter#STRING")
    public final String register_phone;
    @WireField(tag=4, adapter="com.squareup.wire.ProtoAdapter#UINT32")
    public final Integer ID;
    @WireField(tag=5, adapter="com.squareup.wire.ProtoAdapter#UINT32")
    public final Integer userUnlockID;
    @WireField(tag=6, adapter="com.squareup.wire.ProtoAdapter#STRING")
    public final String MCSN;
    @WireField(tag=7, adapter="com.squareup.wire.ProtoAdapter#STRING")
    public final String licenseKey;
    @WireField(tag=8, adapter="com.squareup.wire.ProtoAdapter#STRING")
    public final String updateTime;
    @WireField(tag=9, adapter="com.squareup.wire.ProtoAdapter#STRING")
    public final String createTime;
    @WireField(tag=10, adapter="com.squareup.wire.ProtoAdapter#STRING")
    public final String name;
    @WireField(tag=11, adapter="com.squareup.wire.ProtoAdapter#STRING")
    public final String userID;

    public V1WhiteListUnlockLicense(String string, Boolean bl, String string2, Integer n, Integer n2, String string3, String string4, String string5, String string6, String string7, String string8) {
    }

    public V1WhiteListUnlockLicense(String string, Boolean bl, String string2, Integer n, Integer n2, String string3, String string4, String string5, String string6, String string7, String string8, ByteString byteString) {
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
    extends Message.Builder<V1WhiteListUnlockLicense, Builder> {
        public String account;
        public Boolean disable;
        public String register_phone;
        public Integer ID;
        public Integer userUnlockID;
        public String MCSN;
        public String licenseKey;
        public String updateTime;
        public String createTime;
        public String name;
        public String userID;

        public Builder account(String string) {
            return null;
        }

        public Builder disable(Boolean bl) {
            return null;
        }

        public Builder register_phone(String string) {
            return null;
        }

        public Builder ID(Integer n) {
            return null;
        }

        public Builder userUnlockID(Integer n) {
            return null;
        }

        public Builder MCSN(String string) {
            return null;
        }

        public Builder licenseKey(String string) {
            return null;
        }

        public Builder updateTime(String string) {
            return null;
        }

        public Builder createTime(String string) {
            return null;
        }

        public Builder name(String string) {
            return null;
        }

        public Builder userID(String string) {
            return null;
        }

        public V1WhiteListUnlockLicense build() {
            return null;
        }
    }

    private static final class ProtoAdapter_V1WhiteListUnlockLicense
    extends ProtoAdapter<V1WhiteListUnlockLicense> {
        ProtoAdapter_V1WhiteListUnlockLicense() {
        }

        public int encodedSize(V1WhiteListUnlockLicense v1WhiteListUnlockLicense) {
            return 0;
        }

        public void encode(ProtoWriter protoWriter, V1WhiteListUnlockLicense v1WhiteListUnlockLicense) throws IOException {
        }

        public V1WhiteListUnlockLicense decode(ProtoReader protoReader) throws IOException {
            return null;
        }

        public V1WhiteListUnlockLicense redact(V1WhiteListUnlockLicense v1WhiteListUnlockLicense) {
            return null;
        }
    }
}

