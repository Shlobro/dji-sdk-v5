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
import dji.csdk.flysafe.WarningEventType;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class ShowWarningContext
extends Message<ShowWarningContext, Builder> {
    public static final ProtoAdapter<ShowWarningContext> ADAPTER = new ProtoAdapter_ShowWarningContext();
    private static final long serialVersionUID = 0L;
    public static final WarningEventType DEFAULT_TYPE = WarningEventType.TakeOffFailedUnderLimitArea;
    public static final Double DEFAULT_LIMITHEIGHT = 0.0;
    @WireField(tag=1, adapter="dji.flysafe.WarningEventType#ADAPTER")
    public final WarningEventType type;
    @WireField(tag=2, adapter="dji.flysafe.LimitArea#ADAPTER", label=WireField.Label.REPEATED)
    public final List<LimitArea> areas;
    @WireField(tag=3, adapter="com.squareup.wire.ProtoAdapter#DOUBLE")
    public final Double limitHeight;

    public ShowWarningContext(WarningEventType warningEventType, List<LimitArea> list, Double d2) {
    }

    public ShowWarningContext(WarningEventType warningEventType, List<LimitArea> list, Double d2, ByteString byteString) {
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
    extends Message.Builder<ShowWarningContext, Builder> {
        public WarningEventType type;
        public List<LimitArea> areas;
        public Double limitHeight;

        public Builder type(WarningEventType warningEventType) {
            return null;
        }

        public Builder areas(List<LimitArea> list) {
            return null;
        }

        public Builder limitHeight(Double d2) {
            return null;
        }

        public ShowWarningContext build() {
            return null;
        }
    }

    private static final class ProtoAdapter_ShowWarningContext
    extends ProtoAdapter<ShowWarningContext> {
        ProtoAdapter_ShowWarningContext() {
        }

        public int encodedSize(ShowWarningContext showWarningContext) {
            return 0;
        }

        public void encode(ProtoWriter protoWriter, ShowWarningContext showWarningContext) throws IOException {
        }

        public ShowWarningContext decode(ProtoReader protoReader) throws IOException {
            return null;
        }

        public ShowWarningContext redact(ShowWarningContext showWarningContext) {
            return null;
        }
    }
}

