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

public final class NetworkingRequestData
extends Message<NetworkingRequestData, Builder> {
    public static final ProtoAdapter<NetworkingRequestData> ADAPTER = new ProtoAdapter_NetworkingRequestData();
    private static final long serialVersionUID = 0L;
    public static final String DEFAULT_REQUEST_PARAMS_STRING = "";
    public static final String DEFAULT_REQUEST_API = "";
    public static final String DEFAULT_REQUEST_SIGNATURE = "";
    public static final String DEFAULT_REQUEST_METHOD = "";
    public static final Boolean DEFAULT_REQUEST_USED_FORM = false;
    @WireField(tag=1, adapter="com.squareup.wire.ProtoAdapter#STRING")
    public final String request_params_string;
    @WireField(tag=2, adapter="com.squareup.wire.ProtoAdapter#STRING")
    public final String request_api;
    @WireField(tag=3, adapter="com.squareup.wire.ProtoAdapter#STRING")
    public final String request_signature;
    @WireField(tag=4, adapter="com.squareup.wire.ProtoAdapter#STRING")
    public final String request_method;
    @WireField(tag=5, adapter="com.squareup.wire.ProtoAdapter#BOOL")
    public final Boolean request_used_form;

    public NetworkingRequestData(String string, String string2, String string3, String string4, Boolean bl) {
    }

    public NetworkingRequestData(String string, String string2, String string3, String string4, Boolean bl, ByteString byteString) {
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
    extends Message.Builder<NetworkingRequestData, Builder> {
        public String request_params_string;
        public String request_api;
        public String request_signature;
        public String request_method;
        public Boolean request_used_form;

        public Builder request_params_string(String string) {
            return null;
        }

        public Builder request_api(String string) {
            return null;
        }

        public Builder request_signature(String string) {
            return null;
        }

        public Builder request_method(String string) {
            return null;
        }

        public Builder request_used_form(Boolean bl) {
            return null;
        }

        public NetworkingRequestData build() {
            return null;
        }
    }

    private static final class ProtoAdapter_NetworkingRequestData
    extends ProtoAdapter<NetworkingRequestData> {
        ProtoAdapter_NetworkingRequestData() {
        }

        public int encodedSize(NetworkingRequestData networkingRequestData) {
            return 0;
        }

        public void encode(ProtoWriter protoWriter, NetworkingRequestData networkingRequestData) throws IOException {
        }

        public NetworkingRequestData decode(ProtoReader protoReader) throws IOException {
            return null;
        }

        public NetworkingRequestData redact(NetworkingRequestData networkingRequestData) {
            return null;
        }
    }
}

