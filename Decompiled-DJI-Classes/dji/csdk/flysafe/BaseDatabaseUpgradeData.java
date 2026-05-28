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

public final class BaseDatabaseUpgradeData
extends Message<BaseDatabaseUpgradeData, Builder> {
    public static final ProtoAdapter<BaseDatabaseUpgradeData> ADAPTER = new ProtoAdapter_BaseDatabaseUpgradeData();
    private static final long serialVersionUID = 0L;
    public static final String DEFAULT_VERSION = "";
    public static final Integer DEFAULT_FILESIZE = 0;
    public static final String DEFAULT_UPGRADEURL = "";
    public static final Integer DEFAULT_UPGRADESTATE = 0;
    public static final Integer DEFAULT_STATUS = 0;
    @WireField(tag=1, adapter="com.squareup.wire.ProtoAdapter#STRING")
    public final String version;
    @WireField(tag=2, adapter="com.squareup.wire.ProtoAdapter#UINT32")
    public final Integer fileSize;
    @WireField(tag=3, adapter="com.squareup.wire.ProtoAdapter#STRING")
    public final String upgradeURL;
    @WireField(tag=4, adapter="com.squareup.wire.ProtoAdapter#UINT32")
    public final Integer upgradeState;
    @WireField(tag=5, adapter="com.squareup.wire.ProtoAdapter#UINT32")
    public final Integer status;

    public BaseDatabaseUpgradeData(String string, Integer n, String string2, Integer n2, Integer n3) {
    }

    public BaseDatabaseUpgradeData(String string, Integer n, String string2, Integer n2, Integer n3, ByteString byteString) {
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
    extends Message.Builder<BaseDatabaseUpgradeData, Builder> {
        public String version;
        public Integer fileSize;
        public String upgradeURL;
        public Integer upgradeState;
        public Integer status;

        public Builder version(String string) {
            return null;
        }

        public Builder fileSize(Integer n) {
            return null;
        }

        public Builder upgradeURL(String string) {
            return null;
        }

        public Builder upgradeState(Integer n) {
            return null;
        }

        public Builder status(Integer n) {
            return null;
        }

        public BaseDatabaseUpgradeData build() {
            return null;
        }
    }

    private static final class ProtoAdapter_BaseDatabaseUpgradeData
    extends ProtoAdapter<BaseDatabaseUpgradeData> {
        ProtoAdapter_BaseDatabaseUpgradeData() {
        }

        public int encodedSize(BaseDatabaseUpgradeData baseDatabaseUpgradeData) {
            return 0;
        }

        public void encode(ProtoWriter protoWriter, BaseDatabaseUpgradeData baseDatabaseUpgradeData) throws IOException {
        }

        public BaseDatabaseUpgradeData decode(ProtoReader protoReader) throws IOException {
            return null;
        }

        public BaseDatabaseUpgradeData redact(BaseDatabaseUpgradeData baseDatabaseUpgradeData) {
            return null;
        }
    }
}

