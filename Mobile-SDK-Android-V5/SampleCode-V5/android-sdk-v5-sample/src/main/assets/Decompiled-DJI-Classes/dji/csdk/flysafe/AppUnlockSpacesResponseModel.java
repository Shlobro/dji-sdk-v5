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
import dji.csdk.flysafe.AppUnlockSapceExtraData;
import dji.csdk.flysafe.AppUnlockSpaceDataItem;
import dji.csdk.flysafe.AppUnlockSpaceDataStatus;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class AppUnlockSpacesResponseModel
extends Message<AppUnlockSpacesResponseModel, Builder> {
    public static final ProtoAdapter<AppUnlockSpacesResponseModel> ADAPTER = new ProtoAdapter_AppUnlockSpacesResponseModel();
    private static final long serialVersionUID = 0L;
    public static final Integer DEFAULT_TIME = 0;
    public static final String DEFAULT_SIGNATURE = "";
    public static final AppUnlockSpaceDataStatus DEFAULT_STATUS = AppUnlockSpaceDataStatus.Inactivate;
    @WireField(tag=1, adapter="com.squareup.wire.ProtoAdapter#UINT32")
    public final Integer time;
    @WireField(tag=2, adapter="com.squareup.wire.ProtoAdapter#STRING")
    public final String signature;
    @WireField(tag=3, adapter="dji.flysafe.AppUnlockSpaceDataStatus#ADAPTER")
    public final AppUnlockSpaceDataStatus status;
    @WireField(tag=4, adapter="dji.flysafe.AppUnlockSapceExtraData#ADAPTER")
    public final AppUnlockSapceExtraData extraData;
    @WireField(tag=5, adapter="dji.flysafe.AppUnlockSpaceDataItem#ADAPTER", label=WireField.Label.REPEATED)
    public final List<AppUnlockSpaceDataItem> unlockSpaceItems;

    public AppUnlockSpacesResponseModel(Integer n, String string, AppUnlockSpaceDataStatus appUnlockSpaceDataStatus, AppUnlockSapceExtraData appUnlockSapceExtraData, List<AppUnlockSpaceDataItem> list) {
    }

    public AppUnlockSpacesResponseModel(Integer n, String string, AppUnlockSpaceDataStatus appUnlockSpaceDataStatus, AppUnlockSapceExtraData appUnlockSapceExtraData, List<AppUnlockSpaceDataItem> list, ByteString byteString) {
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
    extends Message.Builder<AppUnlockSpacesResponseModel, Builder> {
        public Integer time;
        public String signature;
        public AppUnlockSpaceDataStatus status;
        public AppUnlockSapceExtraData extraData;
        public List<AppUnlockSpaceDataItem> unlockSpaceItems;

        public Builder time(Integer n) {
            return null;
        }

        public Builder signature(String string) {
            return null;
        }

        public Builder status(AppUnlockSpaceDataStatus appUnlockSpaceDataStatus) {
            return null;
        }

        public Builder extraData(AppUnlockSapceExtraData appUnlockSapceExtraData) {
            return null;
        }

        public Builder unlockSpaceItems(List<AppUnlockSpaceDataItem> list) {
            return null;
        }

        public AppUnlockSpacesResponseModel build() {
            return null;
        }
    }

    private static final class ProtoAdapter_AppUnlockSpacesResponseModel
    extends ProtoAdapter<AppUnlockSpacesResponseModel> {
        ProtoAdapter_AppUnlockSpacesResponseModel() {
        }

        public int encodedSize(AppUnlockSpacesResponseModel appUnlockSpacesResponseModel) {
            return 0;
        }

        public void encode(ProtoWriter protoWriter, AppUnlockSpacesResponseModel appUnlockSpacesResponseModel) throws IOException {
        }

        public AppUnlockSpacesResponseModel decode(ProtoReader protoReader) throws IOException {
            return null;
        }

        public AppUnlockSpacesResponseModel redact(AppUnlockSpacesResponseModel appUnlockSpacesResponseModel) {
            return null;
        }
    }
}

