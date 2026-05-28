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
import dji.csdk.flysafe.UtmissLimitArea;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class ShowUtmissAreasContext
extends Message<ShowUtmissAreasContext, Builder> {
    public static final ProtoAdapter<ShowUtmissAreasContext> ADAPTER = new ProtoAdapter_ShowUtmissAreasContext();
    private static final long serialVersionUID = 0L;
    @WireField(tag=2, adapter="dji.flysafe.UtmissLimitArea#ADAPTER", label=WireField.Label.REPEATED)
    public final List<UtmissLimitArea> areas;

    public ShowUtmissAreasContext(List<UtmissLimitArea> list) {
    }

    public ShowUtmissAreasContext(List<UtmissLimitArea> list, ByteString byteString) {
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
    extends Message.Builder<ShowUtmissAreasContext, Builder> {
        public List<UtmissLimitArea> areas;

        public Builder areas(List<UtmissLimitArea> list) {
            return null;
        }

        public ShowUtmissAreasContext build() {
            return null;
        }
    }

    private static final class ProtoAdapter_ShowUtmissAreasContext
    extends ProtoAdapter<ShowUtmissAreasContext> {
        ProtoAdapter_ShowUtmissAreasContext() {
        }

        public int encodedSize(ShowUtmissAreasContext showUtmissAreasContext) {
            return 0;
        }

        public void encode(ProtoWriter protoWriter, ShowUtmissAreasContext showUtmissAreasContext) throws IOException {
        }

        public ShowUtmissAreasContext decode(ProtoReader protoReader) throws IOException {
            return null;
        }

        public ShowUtmissAreasContext redact(ShowUtmissAreasContext showUtmissAreasContext) {
            return null;
        }
    }
}

