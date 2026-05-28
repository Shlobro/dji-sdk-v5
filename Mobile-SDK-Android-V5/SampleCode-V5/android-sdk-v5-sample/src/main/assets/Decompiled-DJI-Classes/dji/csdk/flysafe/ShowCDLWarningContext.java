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
import dji.csdk.flysafe.CDLWarningEventType;
import dji.csdk.flysafe.LimitArea;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class ShowCDLWarningContext
extends Message<ShowCDLWarningContext, Builder> {
    public static final ProtoAdapter<ShowCDLWarningContext> ADAPTER = new ProtoAdapter_ShowCDLWarningContext();
    private static final long serialVersionUID = 0L;
    public static final CDLWarningEventType DEFAULT_TYPE = CDLWarningEventType.InLimitArea;
    public static final Double DEFAULT_LIMITHEIGHT = 0.0;
    public static final Integer DEFAULT_COUNTDOWN = 0;
    @WireField(tag=1, adapter="dji.flysafe.CDLWarningEventType#ADAPTER")
    public final CDLWarningEventType type;
    @WireField(tag=2, adapter="dji.flysafe.LimitArea#ADAPTER", label=WireField.Label.REPEATED)
    public final List<LimitArea> areas;
    @WireField(tag=3, adapter="com.squareup.wire.ProtoAdapter#DOUBLE")
    public final Double limitHeight;
    @WireField(tag=4, adapter="com.squareup.wire.ProtoAdapter#UINT32")
    public final Integer countdown;

    public ShowCDLWarningContext(CDLWarningEventType cDLWarningEventType, List<LimitArea> list, Double d2, Integer n) {
    }

    public ShowCDLWarningContext(CDLWarningEventType cDLWarningEventType, List<LimitArea> list, Double d2, Integer n, ByteString byteString) {
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
    extends Message.Builder<ShowCDLWarningContext, Builder> {
        public CDLWarningEventType type;
        public List<LimitArea> areas;
        public Double limitHeight;
        public Integer countdown;

        public Builder type(CDLWarningEventType cDLWarningEventType) {
            return null;
        }

        public Builder areas(List<LimitArea> list) {
            return null;
        }

        public Builder limitHeight(Double d2) {
            return null;
        }

        public Builder countdown(Integer n) {
            return null;
        }

        public ShowCDLWarningContext build() {
            return null;
        }
    }

    private static final class ProtoAdapter_ShowCDLWarningContext
    extends ProtoAdapter<ShowCDLWarningContext> {
        ProtoAdapter_ShowCDLWarningContext() {
        }

        public int encodedSize(ShowCDLWarningContext showCDLWarningContext) {
            return 0;
        }

        public void encode(ProtoWriter protoWriter, ShowCDLWarningContext showCDLWarningContext) throws IOException {
        }

        public ShowCDLWarningContext decode(ProtoReader protoReader) throws IOException {
            return null;
        }

        public ShowCDLWarningContext redact(ShowCDLWarningContext showCDLWarningContext) {
            return null;
        }
    }
}

