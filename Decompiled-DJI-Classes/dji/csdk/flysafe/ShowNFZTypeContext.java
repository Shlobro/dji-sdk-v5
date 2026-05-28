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
import dji.csdk.flysafe.NFZType;
import java.io.IOException;
import okio.ByteString;

public final class ShowNFZTypeContext
extends Message<ShowNFZTypeContext, Builder> {
    public static final ProtoAdapter<ShowNFZTypeContext> ADAPTER = new ProtoAdapter_ShowNFZTypeContext();
    private static final long serialVersionUID = 0L;
    public static final NFZType DEFAULT_TYPE = NFZType.None;
    @WireField(tag=1, adapter="dji.flysafe.NFZType#ADAPTER")
    public final NFZType type;

    public ShowNFZTypeContext(NFZType nFZType) {
    }

    public ShowNFZTypeContext(NFZType nFZType, ByteString byteString) {
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
    extends Message.Builder<ShowNFZTypeContext, Builder> {
        public NFZType type;

        public Builder type(NFZType nFZType) {
            return null;
        }

        public ShowNFZTypeContext build() {
            return null;
        }
    }

    private static final class ProtoAdapter_ShowNFZTypeContext
    extends ProtoAdapter<ShowNFZTypeContext> {
        ProtoAdapter_ShowNFZTypeContext() {
        }

        public int encodedSize(ShowNFZTypeContext showNFZTypeContext) {
            return 0;
        }

        public void encode(ProtoWriter protoWriter, ShowNFZTypeContext showNFZTypeContext) throws IOException {
        }

        public ShowNFZTypeContext decode(ProtoReader protoReader) throws IOException {
            return null;
        }

        public ShowNFZTypeContext redact(ShowNFZTypeContext showNFZTypeContext) {
            return null;
        }
    }
}

