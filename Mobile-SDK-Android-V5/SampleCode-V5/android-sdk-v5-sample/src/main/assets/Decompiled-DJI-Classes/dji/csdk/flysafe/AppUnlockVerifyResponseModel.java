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
import dji.csdk.flysafe.AppUnlockUserVerifyDataItem;
import dji.csdk.flysafe.AppUnlockUserVerifyExtraData;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class AppUnlockVerifyResponseModel
extends Message<AppUnlockVerifyResponseModel, Builder> {
    public static final ProtoAdapter<AppUnlockVerifyResponseModel> ADAPTER = new ProtoAdapter_AppUnlockVerifyResponseModel();
    private static final long serialVersionUID = 0L;
    public static final String DEFAULT_COUNTRY = "";
    public static final Integer DEFAULT_TIME = 0;
    public static final String DEFAULT_SIGNATURE = "";
    public static final String DEFAULT_TYPE = "";
    public static final String DEFAULT_URL = "";
    public static final String DEFAULT_URLKEY = "";
    @WireField(tag=1, adapter="com.squareup.wire.ProtoAdapter#STRING")
    public final String country;
    @WireField(tag=2, adapter="com.squareup.wire.ProtoAdapter#UINT32")
    public final Integer time;
    @WireField(tag=3, adapter="com.squareup.wire.ProtoAdapter#STRING")
    public final String signature;
    @WireField(tag=4, adapter="com.squareup.wire.ProtoAdapter#STRING")
    public final String type;
    @WireField(tag=5, adapter="com.squareup.wire.ProtoAdapter#STRING")
    public final String url;
    @WireField(tag=6, adapter="com.squareup.wire.ProtoAdapter#STRING")
    public final String urlKey;
    @WireField(tag=7, adapter="dji.flysafe.AppUnlockUserVerifyDataItem#ADAPTER", label=WireField.Label.REPEATED)
    public final List<AppUnlockUserVerifyDataItem> verifyDataItems;
    @WireField(tag=8, adapter="dji.flysafe.AppUnlockUserVerifyExtraData#ADAPTER")
    public final AppUnlockUserVerifyExtraData extraData;

    public AppUnlockVerifyResponseModel(String string, Integer n, String string2, String string3, String string4, String string5, List<AppUnlockUserVerifyDataItem> list, AppUnlockUserVerifyExtraData appUnlockUserVerifyExtraData) {
    }

    public AppUnlockVerifyResponseModel(String string, Integer n, String string2, String string3, String string4, String string5, List<AppUnlockUserVerifyDataItem> list, AppUnlockUserVerifyExtraData appUnlockUserVerifyExtraData, ByteString byteString) {
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
    extends Message.Builder<AppUnlockVerifyResponseModel, Builder> {
        public String country;
        public Integer time;
        public String signature;
        public String type;
        public String url;
        public String urlKey;
        public List<AppUnlockUserVerifyDataItem> verifyDataItems;
        public AppUnlockUserVerifyExtraData extraData;

        public Builder country(String string) {
            return null;
        }

        public Builder time(Integer n) {
            return null;
        }

        public Builder signature(String string) {
            return null;
        }

        public Builder type(String string) {
            return null;
        }

        public Builder url(String string) {
            return null;
        }

        public Builder urlKey(String string) {
            return null;
        }

        public Builder verifyDataItems(List<AppUnlockUserVerifyDataItem> list) {
            return null;
        }

        public Builder extraData(AppUnlockUserVerifyExtraData appUnlockUserVerifyExtraData) {
            return null;
        }

        public AppUnlockVerifyResponseModel build() {
            return null;
        }
    }

    private static final class ProtoAdapter_AppUnlockVerifyResponseModel
    extends ProtoAdapter<AppUnlockVerifyResponseModel> {
        ProtoAdapter_AppUnlockVerifyResponseModel() {
        }

        public int encodedSize(AppUnlockVerifyResponseModel appUnlockVerifyResponseModel) {
            return 0;
        }

        public void encode(ProtoWriter protoWriter, AppUnlockVerifyResponseModel appUnlockVerifyResponseModel) throws IOException {
        }

        public AppUnlockVerifyResponseModel decode(ProtoReader protoReader) throws IOException {
            return null;
        }

        public AppUnlockVerifyResponseModel redact(AppUnlockVerifyResponseModel appUnlockVerifyResponseModel) {
            return null;
        }
    }
}

