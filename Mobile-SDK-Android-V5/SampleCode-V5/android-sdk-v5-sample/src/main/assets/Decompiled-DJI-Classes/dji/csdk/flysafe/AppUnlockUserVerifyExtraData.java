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

public final class AppUnlockUserVerifyExtraData
extends Message<AppUnlockUserVerifyExtraData, Builder> {
    public static final ProtoAdapter<AppUnlockUserVerifyExtraData> ADAPTER = new ProtoAdapter_AppUnlockUserVerifyExtraData();
    private static final long serialVersionUID = 0L;
    public static final String DEFAULT_MESSAGE = "";
    public static final String DEFAULT_USERID = "";
    @WireField(tag=1, adapter="com.squareup.wire.ProtoAdapter#STRING")
    public final String message;
    @WireField(tag=2, adapter="com.squareup.wire.ProtoAdapter#STRING")
    public final String userID;

    public AppUnlockUserVerifyExtraData(String string, String string2) {
    }

    public AppUnlockUserVerifyExtraData(String string, String string2, ByteString byteString) {
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
    extends Message.Builder<AppUnlockUserVerifyExtraData, Builder> {
        public String message;
        public String userID;

        public Builder message(String string) {
            return null;
        }

        public Builder userID(String string) {
            return null;
        }

        public AppUnlockUserVerifyExtraData build() {
            return null;
        }
    }

    private static final class ProtoAdapter_AppUnlockUserVerifyExtraData
    extends ProtoAdapter<AppUnlockUserVerifyExtraData> {
        ProtoAdapter_AppUnlockUserVerifyExtraData() {
        }

        public int encodedSize(AppUnlockUserVerifyExtraData appUnlockUserVerifyExtraData) {
            return 0;
        }

        public void encode(ProtoWriter protoWriter, AppUnlockUserVerifyExtraData appUnlockUserVerifyExtraData) throws IOException {
        }

        public AppUnlockUserVerifyExtraData decode(ProtoReader protoReader) throws IOException {
            return null;
        }

        public AppUnlockUserVerifyExtraData redact(AppUnlockUserVerifyExtraData appUnlockUserVerifyExtraData) {
            return null;
        }
    }
}

