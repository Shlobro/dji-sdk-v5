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

public final class SpeicalAreaTermsInfo
extends Message<SpeicalAreaTermsInfo, Builder> {
    public static final ProtoAdapter<SpeicalAreaTermsInfo> ADAPTER = new ProtoAdapter_SpeicalAreaTermsInfo();
    private static final long serialVersionUID = 0L;
    public static final Integer DEFAULT_BEGINTIME = 0;
    public static final Integer DEFAULT_ENDTIME = 0;
    public static final Integer DEFAULT_AREAID = 0;
    public static final String DEFAULT_MCSN = "";
    @WireField(tag=1, adapter="com.squareup.wire.ProtoAdapter#UINT32")
    public final Integer beginTime;
    @WireField(tag=2, adapter="com.squareup.wire.ProtoAdapter#UINT32")
    public final Integer endTime;
    @WireField(tag=3, adapter="com.squareup.wire.ProtoAdapter#UINT32")
    public final Integer areaID;
    @WireField(tag=4, adapter="com.squareup.wire.ProtoAdapter#STRING")
    public final String MCSN;

    public SpeicalAreaTermsInfo(Integer n, Integer n2, Integer n3, String string) {
    }

    public SpeicalAreaTermsInfo(Integer n, Integer n2, Integer n3, String string, ByteString byteString) {
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
    extends Message.Builder<SpeicalAreaTermsInfo, Builder> {
        public Integer beginTime;
        public Integer endTime;
        public Integer areaID;
        public String MCSN;

        public Builder beginTime(Integer n) {
            return null;
        }

        public Builder endTime(Integer n) {
            return null;
        }

        public Builder areaID(Integer n) {
            return null;
        }

        public Builder MCSN(String string) {
            return null;
        }

        public SpeicalAreaTermsInfo build() {
            return null;
        }
    }

    private static final class ProtoAdapter_SpeicalAreaTermsInfo
    extends ProtoAdapter<SpeicalAreaTermsInfo> {
        ProtoAdapter_SpeicalAreaTermsInfo() {
        }

        public int encodedSize(SpeicalAreaTermsInfo speicalAreaTermsInfo) {
            return 0;
        }

        public void encode(ProtoWriter protoWriter, SpeicalAreaTermsInfo speicalAreaTermsInfo) throws IOException {
        }

        public SpeicalAreaTermsInfo decode(ProtoReader protoReader) throws IOException {
            return null;
        }

        public SpeicalAreaTermsInfo redact(SpeicalAreaTermsInfo speicalAreaTermsInfo) {
            return null;
        }
    }
}

