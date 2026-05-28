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

public final class AppUnlockUserVerifyDataItem
extends Message<AppUnlockUserVerifyDataItem, Builder> {
    public static final ProtoAdapter<AppUnlockUserVerifyDataItem> ADAPTER = new ProtoAdapter_AppUnlockUserVerifyDataItem();
    private static final long serialVersionUID = 0L;
    public static final Integer DEFAULT_VERIFYDATAID = 0;
    public static final String DEFAULT_ACCOUNT = "";
    public static final String DEFAULT_NAME = "";
    public static final String DEFAULT_DATE = "";
    public static final Integer DEFAULT_AGREED = 0;
    public static final String DEFAULT_COMPANY = "";
    public static final String DEFAULT_TITLE = "";
    public static final String DEFAULT_ADDRESS = "";
    public static final String DEFAULT_EXT1 = "";
    public static final String DEFAULT_EXT2 = "";
    public static final String DEFAULT_UPDATEDATE = "";
    public static final String DEFAULT_CREATEDATA = "";
    @WireField(tag=1, adapter="com.squareup.wire.ProtoAdapter#UINT32")
    public final Integer verifyDataID;
    @WireField(tag=2, adapter="com.squareup.wire.ProtoAdapter#STRING")
    public final String account;
    @WireField(tag=3, adapter="com.squareup.wire.ProtoAdapter#STRING")
    public final String name;
    @WireField(tag=4, adapter="com.squareup.wire.ProtoAdapter#STRING")
    public final String date;
    @WireField(tag=5, adapter="com.squareup.wire.ProtoAdapter#UINT32")
    public final Integer agreed;
    @WireField(tag=6, adapter="com.squareup.wire.ProtoAdapter#STRING")
    public final String company;
    @WireField(tag=7, adapter="com.squareup.wire.ProtoAdapter#STRING")
    public final String title;
    @WireField(tag=8, adapter="com.squareup.wire.ProtoAdapter#STRING")
    public final String address;
    @WireField(tag=9, adapter="com.squareup.wire.ProtoAdapter#STRING")
    public final String ext1;
    @WireField(tag=10, adapter="com.squareup.wire.ProtoAdapter#STRING")
    public final String ext2;
    @WireField(tag=11, adapter="com.squareup.wire.ProtoAdapter#STRING")
    public final String updateDate;
    @WireField(tag=12, adapter="com.squareup.wire.ProtoAdapter#STRING")
    public final String createData;

    public AppUnlockUserVerifyDataItem(Integer n, String string, String string2, String string3, Integer n2, String string4, String string5, String string6, String string7, String string8, String string9, String string10) {
    }

    public AppUnlockUserVerifyDataItem(Integer n, String string, String string2, String string3, Integer n2, String string4, String string5, String string6, String string7, String string8, String string9, String string10, ByteString byteString) {
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
    extends Message.Builder<AppUnlockUserVerifyDataItem, Builder> {
        public Integer verifyDataID;
        public String account;
        public String name;
        public String date;
        public Integer agreed;
        public String company;
        public String title;
        public String address;
        public String ext1;
        public String ext2;
        public String updateDate;
        public String createData;

        public Builder verifyDataID(Integer n) {
            return null;
        }

        public Builder account(String string) {
            return null;
        }

        public Builder name(String string) {
            return null;
        }

        public Builder date(String string) {
            return null;
        }

        public Builder agreed(Integer n) {
            return null;
        }

        public Builder company(String string) {
            return null;
        }

        public Builder title(String string) {
            return null;
        }

        public Builder address(String string) {
            return null;
        }

        public Builder ext1(String string) {
            return null;
        }

        public Builder ext2(String string) {
            return null;
        }

        public Builder updateDate(String string) {
            return null;
        }

        public Builder createData(String string) {
            return null;
        }

        public AppUnlockUserVerifyDataItem build() {
            return null;
        }
    }

    private static final class ProtoAdapter_AppUnlockUserVerifyDataItem
    extends ProtoAdapter<AppUnlockUserVerifyDataItem> {
        ProtoAdapter_AppUnlockUserVerifyDataItem() {
        }

        public int encodedSize(AppUnlockUserVerifyDataItem appUnlockUserVerifyDataItem) {
            return 0;
        }

        public void encode(ProtoWriter protoWriter, AppUnlockUserVerifyDataItem appUnlockUserVerifyDataItem) throws IOException {
        }

        public AppUnlockUserVerifyDataItem decode(ProtoReader protoReader) throws IOException {
            return null;
        }

        public AppUnlockUserVerifyDataItem redact(AppUnlockUserVerifyDataItem appUnlockUserVerifyDataItem) {
            return null;
        }
    }
}

