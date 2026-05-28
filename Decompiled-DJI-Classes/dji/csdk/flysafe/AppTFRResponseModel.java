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

public final class AppTFRResponseModel
extends Message<AppTFRResponseModel, Builder> {
    public static final ProtoAdapter<AppTFRResponseModel> ADAPTER = new ProtoAdapter_AppTFRResponseModel();
    private static final long serialVersionUID = 0L;
    public static final Integer DEFAULT_TIME_STAMP = 0;
    public static final String DEFAULT_UID = "";
    @WireField(tag=1, adapter="com.squareup.wire.ProtoAdapter#UINT32")
    public final Integer time_stamp;
    @WireField(tag=2, adapter="com.squareup.wire.ProtoAdapter#STRING")
    public final String uid;
    @WireField(tag=3, adapter="dji.flysafe.LimitArea#ADAPTER", label=WireField.Label.REPEATED)
    public final List<LimitArea> tfrs_infos;

    public AppTFRResponseModel(Integer n, String string, List<LimitArea> list) {
    }

    public AppTFRResponseModel(Integer n, String string, List<LimitArea> list, ByteString byteString) {
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
    extends Message.Builder<AppTFRResponseModel, Builder> {
        public Integer time_stamp;
        public String uid;
        public List<LimitArea> tfrs_infos;

        public Builder time_stamp(Integer n) {
            return null;
        }

        public Builder uid(String string) {
            return null;
        }

        public Builder tfrs_infos(List<LimitArea> list) {
            return null;
        }

        public AppTFRResponseModel build() {
            return null;
        }
    }

    private static final class ProtoAdapter_AppTFRResponseModel
    extends ProtoAdapter<AppTFRResponseModel> {
        ProtoAdapter_AppTFRResponseModel() {
        }

        public int encodedSize(AppTFRResponseModel appTFRResponseModel) {
            return 0;
        }

        public void encode(ProtoWriter protoWriter, AppTFRResponseModel appTFRResponseModel) throws IOException {
        }

        public AppTFRResponseModel decode(ProtoReader protoReader) throws IOException {
            return null;
        }

        public AppTFRResponseModel redact(AppTFRResponseModel appTFRResponseModel) {
            return null;
        }
    }
}

