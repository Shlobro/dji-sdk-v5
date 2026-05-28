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
import dji.csdk.flysafe.RTHTipsEventType;
import java.io.IOException;
import okio.ByteString;

public final class ShowRTHTipsContext
extends Message<ShowRTHTipsContext, Builder> {
    public static final ProtoAdapter<ShowRTHTipsContext> ADAPTER = new ProtoAdapter_ShowRTHTipsContext();
    private static final long serialVersionUID = 0L;
    public static final RTHTipsEventType DEFAULT_TYPE = RTHTipsEventType.NearBy;
    @WireField(tag=1, adapter="dji.flysafe.RTHTipsEventType#ADAPTER")
    public final RTHTipsEventType type;

    public ShowRTHTipsContext(RTHTipsEventType rTHTipsEventType) {
    }

    public ShowRTHTipsContext(RTHTipsEventType rTHTipsEventType, ByteString byteString) {
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
    extends Message.Builder<ShowRTHTipsContext, Builder> {
        public RTHTipsEventType type;

        public Builder type(RTHTipsEventType rTHTipsEventType) {
            return null;
        }

        public ShowRTHTipsContext build() {
            return null;
        }
    }

    private static final class ProtoAdapter_ShowRTHTipsContext
    extends ProtoAdapter<ShowRTHTipsContext> {
        ProtoAdapter_ShowRTHTipsContext() {
        }

        public int encodedSize(ShowRTHTipsContext showRTHTipsContext) {
            return 0;
        }

        public void encode(ProtoWriter protoWriter, ShowRTHTipsContext showRTHTipsContext) throws IOException {
        }

        public ShowRTHTipsContext decode(ProtoReader protoReader) throws IOException {
            return null;
        }

        public ShowRTHTipsContext redact(ShowRTHTipsContext showRTHTipsContext) {
            return null;
        }
    }
}

