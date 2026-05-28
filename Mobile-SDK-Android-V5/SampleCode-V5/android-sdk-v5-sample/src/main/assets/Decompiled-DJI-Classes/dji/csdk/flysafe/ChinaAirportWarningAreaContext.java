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

public final class ChinaAirportWarningAreaContext
extends Message<ChinaAirportWarningAreaContext, Builder> {
    public static final ProtoAdapter<ChinaAirportWarningAreaContext> ADAPTER = new ProtoAdapter_ChinaAirportWarningAreaContext();
    private static final long serialVersionUID = 0L;
    public static final Boolean DEFAULT_ISINCHINAAIRPORTWARNINGAREA = false;
    @WireField(tag=2, adapter="com.squareup.wire.ProtoAdapter#BOOL")
    public final Boolean isInChinaAirportWarningArea;

    public ChinaAirportWarningAreaContext(Boolean bl) {
    }

    public ChinaAirportWarningAreaContext(Boolean bl, ByteString byteString) {
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
    extends Message.Builder<ChinaAirportWarningAreaContext, Builder> {
        public Boolean isInChinaAirportWarningArea;

        public Builder isInChinaAirportWarningArea(Boolean bl) {
            return null;
        }

        public ChinaAirportWarningAreaContext build() {
            return null;
        }
    }

    private static final class ProtoAdapter_ChinaAirportWarningAreaContext
    extends ProtoAdapter<ChinaAirportWarningAreaContext> {
        ProtoAdapter_ChinaAirportWarningAreaContext() {
        }

        public int encodedSize(ChinaAirportWarningAreaContext chinaAirportWarningAreaContext) {
            return 0;
        }

        public void encode(ProtoWriter protoWriter, ChinaAirportWarningAreaContext chinaAirportWarningAreaContext) throws IOException {
        }

        public ChinaAirportWarningAreaContext decode(ProtoReader protoReader) throws IOException {
            return null;
        }

        public ChinaAirportWarningAreaContext redact(ChinaAirportWarningAreaContext chinaAirportWarningAreaContext) {
            return null;
        }
    }
}

