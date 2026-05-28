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

public final class V1WhiteListLicenseInfo
extends Message<V1WhiteListLicenseInfo, Builder> {
    public static final ProtoAdapter<V1WhiteListLicenseInfo> ADAPTER = new ProtoAdapter_V1WhiteListLicenseInfo();
    private static final long serialVersionUID = 0L;
    public static final String DEFAULT_NAME = "";
    public static final String DEFAULT_CREATE_TIME = "";
    public static final String DEFAULT_LICENSE_DATA = "";
    public static final String DEFAULT_CONTAIN_SNS = "";
    public static final String DEFAULT_MAIN_KEY = "";
    public static final String DEFAULT_LICENSE_KEY = "";
    @WireField(tag=1, adapter="com.squareup.wire.ProtoAdapter#STRING")
    public final String name;
    @WireField(tag=2, adapter="com.squareup.wire.ProtoAdapter#STRING")
    public final String create_time;
    @WireField(tag=3, adapter="com.squareup.wire.ProtoAdapter#STRING")
    public final String license_data;
    @WireField(tag=4, adapter="com.squareup.wire.ProtoAdapter#STRING")
    public final String contain_sns;
    @WireField(tag=5, adapter="com.squareup.wire.ProtoAdapter#STRING")
    public final String main_key;
    @WireField(tag=6, adapter="com.squareup.wire.ProtoAdapter#STRING")
    public final String license_key;

    public V1WhiteListLicenseInfo(String string, String string2, String string3, String string4, String string5, String string6) {
    }

    public V1WhiteListLicenseInfo(String string, String string2, String string3, String string4, String string5, String string6, ByteString byteString) {
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
    extends Message.Builder<V1WhiteListLicenseInfo, Builder> {
        public String name;
        public String create_time;
        public String license_data;
        public String contain_sns;
        public String main_key;
        public String license_key;

        public Builder name(String string) {
            return null;
        }

        public Builder create_time(String string) {
            return null;
        }

        public Builder license_data(String string) {
            return null;
        }

        public Builder contain_sns(String string) {
            return null;
        }

        public Builder main_key(String string) {
            return null;
        }

        public Builder license_key(String string) {
            return null;
        }

        public V1WhiteListLicenseInfo build() {
            return null;
        }
    }

    private static final class ProtoAdapter_V1WhiteListLicenseInfo
    extends ProtoAdapter<V1WhiteListLicenseInfo> {
        ProtoAdapter_V1WhiteListLicenseInfo() {
        }

        public int encodedSize(V1WhiteListLicenseInfo v1WhiteListLicenseInfo) {
            return 0;
        }

        public void encode(ProtoWriter protoWriter, V1WhiteListLicenseInfo v1WhiteListLicenseInfo) throws IOException {
        }

        public V1WhiteListLicenseInfo decode(ProtoReader protoReader) throws IOException {
            return null;
        }

        public V1WhiteListLicenseInfo redact(V1WhiteListLicenseInfo v1WhiteListLicenseInfo) {
            return null;
        }
    }
}

