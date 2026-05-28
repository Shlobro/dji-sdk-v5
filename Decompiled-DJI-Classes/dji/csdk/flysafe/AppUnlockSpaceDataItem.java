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

public final class AppUnlockSpaceDataItem
extends Message<AppUnlockSpaceDataItem, Builder> {
    public static final ProtoAdapter<AppUnlockSpaceDataItem> ADAPTER = new ProtoAdapter_AppUnlockSpaceDataItem();
    private static final long serialVersionUID = 0L;
    public static final Integer DEFAULT_ITEMID = 0;
    public static final String DEFAULT_ACCOUNT = "";
    public static final Integer DEFAULT_BEGINTIME = 0;
    public static final Integer DEFAULT_ENDTIME = 0;
    public static final String DEFAULT_DATASOURCETYPE = "";
    public static final String DEFAULT_AREAID = "";
    public static final String DEFAULT_MCSN = "";
    public static final String DEFAULT_SIGNATURE = "";
    public static final String DEFAULT_PLACES = "";
    public static final String DEFAULT_TIMEZONE = "";
    public static final String DEFAULT_LOCATION = "";
    public static final String DEFAULT_COUNTRY = "";
    public static final String DEFAULT_CITY = "";
    public static final String DEFAULT_TYPE = "";
    public static final String DEFAULT_BEGINDATASTR = "";
    public static final String DEFAULT_ENDDATESTR = "";
    public static final Boolean DEFAULT_DISABLE = false;
    public static final String DEFAULT_STATUSSTR = "";
    public static final String DEFAULT_OSTYPE = "";
    @WireField(tag=1, adapter="com.squareup.wire.ProtoAdapter#UINT32")
    public final Integer itemID;
    @WireField(tag=2, adapter="com.squareup.wire.ProtoAdapter#STRING")
    public final String account;
    @WireField(tag=3, adapter="com.squareup.wire.ProtoAdapter#UINT32")
    public final Integer beginTime;
    @WireField(tag=4, adapter="com.squareup.wire.ProtoAdapter#UINT32")
    public final Integer endTime;
    @WireField(tag=5, adapter="com.squareup.wire.ProtoAdapter#STRING")
    public final String dataSourceType;
    @WireField(tag=6, adapter="com.squareup.wire.ProtoAdapter#STRING")
    public final String areaID;
    @WireField(tag=7, adapter="com.squareup.wire.ProtoAdapter#STRING")
    public final String MCSN;
    @WireField(tag=8, adapter="com.squareup.wire.ProtoAdapter#STRING")
    public final String signature;
    @WireField(tag=9, adapter="com.squareup.wire.ProtoAdapter#STRING")
    public final String places;
    @WireField(tag=10, adapter="com.squareup.wire.ProtoAdapter#STRING")
    public final String timezone;
    @WireField(tag=11, adapter="com.squareup.wire.ProtoAdapter#STRING")
    public final String location;
    @WireField(tag=12, adapter="com.squareup.wire.ProtoAdapter#STRING")
    public final String country;
    @WireField(tag=13, adapter="com.squareup.wire.ProtoAdapter#STRING")
    public final String city;
    @WireField(tag=14, adapter="com.squareup.wire.ProtoAdapter#STRING")
    public final String type;
    @WireField(tag=15, adapter="com.squareup.wire.ProtoAdapter#STRING")
    public final String beginDataStr;
    @WireField(tag=16, adapter="com.squareup.wire.ProtoAdapter#STRING")
    public final String endDateStr;
    @WireField(tag=17, adapter="com.squareup.wire.ProtoAdapter#BOOL")
    public final Boolean disable;
    @WireField(tag=18, adapter="com.squareup.wire.ProtoAdapter#STRING")
    public final String statusStr;
    @WireField(tag=19, adapter="com.squareup.wire.ProtoAdapter#STRING")
    public final String osType;

    public AppUnlockSpaceDataItem(Integer n, String string, Integer n2, Integer n3, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11, String string12, String string13, Boolean bl, String string14, String string15) {
    }

    public AppUnlockSpaceDataItem(Integer n, String string, Integer n2, Integer n3, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11, String string12, String string13, Boolean bl, String string14, String string15, ByteString byteString) {
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
    extends Message.Builder<AppUnlockSpaceDataItem, Builder> {
        public Integer itemID;
        public String account;
        public Integer beginTime;
        public Integer endTime;
        public String dataSourceType;
        public String areaID;
        public String MCSN;
        public String signature;
        public String places;
        public String timezone;
        public String location;
        public String country;
        public String city;
        public String type;
        public String beginDataStr;
        public String endDateStr;
        public Boolean disable;
        public String statusStr;
        public String osType;

        public Builder itemID(Integer n) {
            return null;
        }

        public Builder account(String string) {
            return null;
        }

        public Builder beginTime(Integer n) {
            return null;
        }

        public Builder endTime(Integer n) {
            return null;
        }

        public Builder dataSourceType(String string) {
            return null;
        }

        public Builder areaID(String string) {
            return null;
        }

        public Builder MCSN(String string) {
            return null;
        }

        public Builder signature(String string) {
            return null;
        }

        public Builder places(String string) {
            return null;
        }

        public Builder timezone(String string) {
            return null;
        }

        public Builder location(String string) {
            return null;
        }

        public Builder country(String string) {
            return null;
        }

        public Builder city(String string) {
            return null;
        }

        public Builder type(String string) {
            return null;
        }

        public Builder beginDataStr(String string) {
            return null;
        }

        public Builder endDateStr(String string) {
            return null;
        }

        public Builder disable(Boolean bl) {
            return null;
        }

        public Builder statusStr(String string) {
            return null;
        }

        public Builder osType(String string) {
            return null;
        }

        public AppUnlockSpaceDataItem build() {
            return null;
        }
    }

    private static final class ProtoAdapter_AppUnlockSpaceDataItem
    extends ProtoAdapter<AppUnlockSpaceDataItem> {
        ProtoAdapter_AppUnlockSpaceDataItem() {
        }

        public int encodedSize(AppUnlockSpaceDataItem appUnlockSpaceDataItem) {
            return 0;
        }

        public void encode(ProtoWriter protoWriter, AppUnlockSpaceDataItem appUnlockSpaceDataItem) throws IOException {
        }

        public AppUnlockSpaceDataItem decode(ProtoReader protoReader) throws IOException {
            return null;
        }

        public AppUnlockSpaceDataItem redact(AppUnlockSpaceDataItem appUnlockSpaceDataItem) {
            return null;
        }
    }
}

