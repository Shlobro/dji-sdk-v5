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

public final class FlightTFRResponseModel
extends Message<FlightTFRResponseModel, Builder> {
    public static final ProtoAdapter<FlightTFRResponseModel> ADAPTER = new ProtoAdapter_FlightTFRResponseModel();
    private static final long serialVersionUID = 0L;
    public static final String DEFAULT_TFRS_DATA = "";
    public static final String DEFAULT_UID = "";
    public static final String DEFAULT_AMBA_UID = "";
    public static final String DEFAULT_AMBA_TFRS_DATA = "";
    public static final String DEFAULT_ECC_UID = "";
    public static final String DEFAULT_ECC_TFRS_DATA = "";
    @WireField(tag=1, adapter="com.squareup.wire.ProtoAdapter#STRING")
    public final String tfrs_data;
    @WireField(tag=2, adapter="com.squareup.wire.ProtoAdapter#STRING")
    public final String uid;
    @WireField(tag=3, adapter="dji.flysafe.LimitArea#ADAPTER", label=WireField.Label.REPEATED)
    public final List<LimitArea> tfrs_infos;
    @WireField(tag=4, adapter="com.squareup.wire.ProtoAdapter#STRING")
    public final String amba_uid;
    @WireField(tag=5, adapter="com.squareup.wire.ProtoAdapter#STRING")
    public final String amba_tfrs_data;
    @WireField(tag=6, adapter="com.squareup.wire.ProtoAdapter#STRING")
    public final String ecc_uid;
    @WireField(tag=7, adapter="com.squareup.wire.ProtoAdapter#STRING")
    public final String ecc_tfrs_data;

    public FlightTFRResponseModel(String string, String string2, List<LimitArea> list, String string3, String string4, String string5, String string6) {
    }

    public FlightTFRResponseModel(String string, String string2, List<LimitArea> list, String string3, String string4, String string5, String string6, ByteString byteString) {
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
    extends Message.Builder<FlightTFRResponseModel, Builder> {
        public String tfrs_data;
        public String uid;
        public List<LimitArea> tfrs_infos;
        public String amba_uid;
        public String amba_tfrs_data;
        public String ecc_uid;
        public String ecc_tfrs_data;

        public Builder tfrs_data(String string) {
            return null;
        }

        public Builder uid(String string) {
            return null;
        }

        public Builder tfrs_infos(List<LimitArea> list) {
            return null;
        }

        public Builder amba_uid(String string) {
            return null;
        }

        public Builder amba_tfrs_data(String string) {
            return null;
        }

        public Builder ecc_uid(String string) {
            return null;
        }

        public Builder ecc_tfrs_data(String string) {
            return null;
        }

        public FlightTFRResponseModel build() {
            return null;
        }
    }

    private static final class ProtoAdapter_FlightTFRResponseModel
    extends ProtoAdapter<FlightTFRResponseModel> {
        ProtoAdapter_FlightTFRResponseModel() {
        }

        public int encodedSize(FlightTFRResponseModel flightTFRResponseModel) {
            return 0;
        }

        public void encode(ProtoWriter protoWriter, FlightTFRResponseModel flightTFRResponseModel) throws IOException {
        }

        public FlightTFRResponseModel decode(ProtoReader protoReader) throws IOException {
            return null;
        }

        public FlightTFRResponseModel redact(FlightTFRResponseModel flightTFRResponseModel) {
            return null;
        }
    }
}

