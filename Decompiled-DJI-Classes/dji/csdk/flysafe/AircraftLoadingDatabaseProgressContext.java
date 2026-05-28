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

public final class AircraftLoadingDatabaseProgressContext
extends Message<AircraftLoadingDatabaseProgressContext, Builder> {
    public static final ProtoAdapter<AircraftLoadingDatabaseProgressContext> ADAPTER = new ProtoAdapter_AircraftLoadingDatabaseProgressContext();
    private static final long serialVersionUID = 0L;
    public static final Integer DEFAULT_LOADINGPROGRESS = 0;
    @WireField(tag=1, adapter="com.squareup.wire.ProtoAdapter#UINT32")
    public final Integer loadingProgress;

    public AircraftLoadingDatabaseProgressContext(Integer n) {
    }

    public AircraftLoadingDatabaseProgressContext(Integer n, ByteString byteString) {
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
    extends Message.Builder<AircraftLoadingDatabaseProgressContext, Builder> {
        public Integer loadingProgress;

        public Builder loadingProgress(Integer n) {
            return null;
        }

        public AircraftLoadingDatabaseProgressContext build() {
            return null;
        }
    }

    private static final class ProtoAdapter_AircraftLoadingDatabaseProgressContext
    extends ProtoAdapter<AircraftLoadingDatabaseProgressContext> {
        ProtoAdapter_AircraftLoadingDatabaseProgressContext() {
        }

        public int encodedSize(AircraftLoadingDatabaseProgressContext aircraftLoadingDatabaseProgressContext) {
            return 0;
        }

        public void encode(ProtoWriter protoWriter, AircraftLoadingDatabaseProgressContext aircraftLoadingDatabaseProgressContext) throws IOException {
        }

        public AircraftLoadingDatabaseProgressContext decode(ProtoReader protoReader) throws IOException {
            return null;
        }

        public AircraftLoadingDatabaseProgressContext redact(AircraftLoadingDatabaseProgressContext aircraftLoadingDatabaseProgressContext) {
            return null;
        }
    }
}

