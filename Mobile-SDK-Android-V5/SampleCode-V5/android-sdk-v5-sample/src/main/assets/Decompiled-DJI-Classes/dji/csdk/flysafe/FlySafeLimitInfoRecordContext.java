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

public final class FlySafeLimitInfoRecordContext
extends Message<FlySafeLimitInfoRecordContext, Builder> {
    public static final ProtoAdapter<FlySafeLimitInfoRecordContext> ADAPTER = new ProtoAdapter_FlySafeLimitInfoRecordContext();
    private static final long serialVersionUID = 0L;
    public static final ByteString DEFAULT_INFO = ByteString.EMPTY;
    @WireField(tag=2, adapter="com.squareup.wire.ProtoAdapter#BYTES")
    public final ByteString info;

    public FlySafeLimitInfoRecordContext(ByteString byteString) {
    }

    public FlySafeLimitInfoRecordContext(ByteString byteString, ByteString byteString2) {
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
    extends Message.Builder<FlySafeLimitInfoRecordContext, Builder> {
        public ByteString info;

        public Builder info(ByteString byteString) {
            return null;
        }

        public FlySafeLimitInfoRecordContext build() {
            return null;
        }
    }

    private static final class ProtoAdapter_FlySafeLimitInfoRecordContext
    extends ProtoAdapter<FlySafeLimitInfoRecordContext> {
        ProtoAdapter_FlySafeLimitInfoRecordContext() {
        }

        public int encodedSize(FlySafeLimitInfoRecordContext flySafeLimitInfoRecordContext) {
            return 0;
        }

        public void encode(ProtoWriter protoWriter, FlySafeLimitInfoRecordContext flySafeLimitInfoRecordContext) throws IOException {
        }

        public FlySafeLimitInfoRecordContext decode(ProtoReader protoReader) throws IOException {
            return null;
        }

        public FlySafeLimitInfoRecordContext redact(FlySafeLimitInfoRecordContext flySafeLimitInfoRecordContext) {
            return null;
        }
    }
}

