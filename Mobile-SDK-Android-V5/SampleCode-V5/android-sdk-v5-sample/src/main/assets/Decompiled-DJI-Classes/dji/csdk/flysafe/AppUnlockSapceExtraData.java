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

public final class AppUnlockSapceExtraData
extends Message<AppUnlockSapceExtraData, Builder> {
    public static final ProtoAdapter<AppUnlockSapceExtraData> ADAPTER = new ProtoAdapter_AppUnlockSapceExtraData();
    private static final long serialVersionUID = 0L;
    public static final String DEFAULT_MESSAGE = "";
    public static final Integer DEFAULT_COUNT = 0;
    public static final Integer DEFAULT_PAGENUMBER = 0;
    @WireField(tag=1, adapter="com.squareup.wire.ProtoAdapter#STRING")
    public final String message;
    @WireField(tag=2, adapter="com.squareup.wire.ProtoAdapter#UINT32")
    public final Integer count;
    @WireField(tag=3, adapter="com.squareup.wire.ProtoAdapter#UINT32")
    public final Integer pageNumber;

    public AppUnlockSapceExtraData(String string, Integer n, Integer n2) {
    }

    public AppUnlockSapceExtraData(String string, Integer n, Integer n2, ByteString byteString) {
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
    extends Message.Builder<AppUnlockSapceExtraData, Builder> {
        public String message;
        public Integer count;
        public Integer pageNumber;

        public Builder message(String string) {
            return null;
        }

        public Builder count(Integer n) {
            return null;
        }

        public Builder pageNumber(Integer n) {
            return null;
        }

        public AppUnlockSapceExtraData build() {
            return null;
        }
    }

    private static final class ProtoAdapter_AppUnlockSapceExtraData
    extends ProtoAdapter<AppUnlockSapceExtraData> {
        ProtoAdapter_AppUnlockSapceExtraData() {
        }

        public int encodedSize(AppUnlockSapceExtraData appUnlockSapceExtraData) {
            return 0;
        }

        public void encode(ProtoWriter protoWriter, AppUnlockSapceExtraData appUnlockSapceExtraData) throws IOException {
        }

        public AppUnlockSapceExtraData decode(ProtoReader protoReader) throws IOException {
            return null;
        }

        public AppUnlockSapceExtraData redact(AppUnlockSapceExtraData appUnlockSapceExtraData) {
            return null;
        }
    }
}

