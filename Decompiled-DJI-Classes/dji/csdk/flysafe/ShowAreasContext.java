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
package dji.csdk.flysafe;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import dji.csdk.flysafe.LimitArea;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class ShowAreasContext
extends Message<ShowAreasContext, Builder> {
    public static final ProtoAdapter<ShowAreasContext> ADAPTER = new ProtoAdapter_ShowAreasContext();
    private static final long serialVersionUID = 0L;
    @WireField(tag=2, adapter="dji.flysafe.LimitArea#ADAPTER", label=WireField.Label.REPEATED)
    public final List<LimitArea> areas;

    public ShowAreasContext(List<LimitArea> list) {
    }

    public ShowAreasContext(List<LimitArea> list, ByteString byteString) {
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
    extends Message.Builder<ShowAreasContext, Builder> {
        public List<LimitArea> areas;

        public Builder areas(List<LimitArea> list) {
            return null;
        }

        public ShowAreasContext build() {
            return null;
        }
    }

    private static final class ProtoAdapter_ShowAreasContext
    extends ProtoAdapter<ShowAreasContext> {
        ProtoAdapter_ShowAreasContext() {
        }

        public int encodedSize(ShowAreasContext showAreasContext) {
            return 0;
        }

        public void encode(ProtoWriter protoWriter, ShowAreasContext showAreasContext) throws IOException {
        }

        public ShowAreasContext decode(ProtoReader protoReader) throws IOException {
            return null;
        }

        public ShowAreasContext redact(ShowAreasContext showAreasContext) {
            return null;
        }
    }
}

