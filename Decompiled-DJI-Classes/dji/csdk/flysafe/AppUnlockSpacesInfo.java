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

public final class AppUnlockSpacesInfo
extends Message<AppUnlockSpacesInfo, Builder> {
    public static final ProtoAdapter<AppUnlockSpacesInfo> ADAPTER = new ProtoAdapter_AppUnlockSpacesInfo();
    private static final long serialVersionUID = 0L;
    public static final Integer DEFAULT_BEGINTIME = 0;
    public static final Integer DEFAULT_ENDTIME = 0;
    public static final Integer DEFAULT_SPACEID = 0;
    public static final String DEFAULT_MCSN = "";
    public static final Integer DEFAULT_ITEMID = 0;
    @WireField(tag=1, adapter="com.squareup.wire.ProtoAdapter#UINT32")
    public final Integer beginTime;
    @WireField(tag=2, adapter="com.squareup.wire.ProtoAdapter#UINT32")
    public final Integer endTime;
    @WireField(tag=3, adapter="com.squareup.wire.ProtoAdapter#UINT32")
    public final Integer spaceID;
    @WireField(tag=4, adapter="com.squareup.wire.ProtoAdapter#STRING")
    public final String MCSN;
    @WireField(tag=5, adapter="com.squareup.wire.ProtoAdapter#UINT32")
    public final Integer itemID;

    public AppUnlockSpacesInfo(Integer n, Integer n2, Integer n3, String string, Integer n4) {
    }

    public AppUnlockSpacesInfo(Integer n, Integer n2, Integer n3, String string, Integer n4, ByteString byteString) {
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
    extends Message.Builder<AppUnlockSpacesInfo, Builder> {
        public Integer beginTime;
        public Integer endTime;
        public Integer spaceID;
        public String MCSN;
        public Integer itemID;

        public Builder beginTime(Integer n) {
            return null;
        }

        public Builder endTime(Integer n) {
            return null;
        }

        public Builder spaceID(Integer n) {
            return null;
        }

        public Builder MCSN(String string) {
            return null;
        }

        public Builder itemID(Integer n) {
            return null;
        }

        public AppUnlockSpacesInfo build() {
            return null;
        }
    }

    private static final class ProtoAdapter_AppUnlockSpacesInfo
    extends ProtoAdapter<AppUnlockSpacesInfo> {
        ProtoAdapter_AppUnlockSpacesInfo() {
        }

        public int encodedSize(AppUnlockSpacesInfo appUnlockSpacesInfo) {
            return 0;
        }

        public void encode(ProtoWriter protoWriter, AppUnlockSpacesInfo appUnlockSpacesInfo) throws IOException {
        }

        public AppUnlockSpacesInfo decode(ProtoReader protoReader) throws IOException {
            return null;
        }

        public AppUnlockSpacesInfo redact(AppUnlockSpacesInfo appUnlockSpacesInfo) {
            return null;
        }
    }
}

