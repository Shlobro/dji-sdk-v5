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

public final class SupervisorRecordContext
extends Message<SupervisorRecordContext, Builder> {
    public static final ProtoAdapter<SupervisorRecordContext> ADAPTER = new ProtoAdapter_SupervisorRecordContext();
    private static final long serialVersionUID = 0L;
    public static final Integer DEFAULT_TFR_UPDATE_STATE = 0;
    public static final Integer DEFAULT_UPLOAD_NUMBER = 0;
    public static final Integer DEFAULT_LIMIT_STATE = 0;
    public static final String DEFAULT_APP_DYNAMIC_DB_UUID = "";
    public static final String DEFAULT_DJI_FLIGHT_DYNAMIC_DB_UUID = "";
    @WireField(tag=2, adapter="com.squareup.wire.ProtoAdapter#UINT32")
    public final Integer tfr_update_state;
    @WireField(tag=3, adapter="com.squareup.wire.ProtoAdapter#UINT32")
    public final Integer upload_number;
    @WireField(tag=4, adapter="com.squareup.wire.ProtoAdapter#UINT32")
    public final Integer limit_state;
    @WireField(tag=5, adapter="com.squareup.wire.ProtoAdapter#STRING")
    public final String app_dynamic_db_uuid;
    @WireField(tag=6, adapter="com.squareup.wire.ProtoAdapter#STRING")
    public final String dji_flight_dynamic_db_uuid;

    public SupervisorRecordContext(Integer n, Integer n2, Integer n3, String string, String string2) {
    }

    public SupervisorRecordContext(Integer n, Integer n2, Integer n3, String string, String string2, ByteString byteString) {
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
    extends Message.Builder<SupervisorRecordContext, Builder> {
        public Integer tfr_update_state;
        public Integer upload_number;
        public Integer limit_state;
        public String app_dynamic_db_uuid;
        public String dji_flight_dynamic_db_uuid;

        public Builder tfr_update_state(Integer n) {
            return null;
        }

        public Builder upload_number(Integer n) {
            return null;
        }

        public Builder limit_state(Integer n) {
            return null;
        }

        public Builder app_dynamic_db_uuid(String string) {
            return null;
        }

        public Builder dji_flight_dynamic_db_uuid(String string) {
            return null;
        }

        public SupervisorRecordContext build() {
            return null;
        }
    }

    private static final class ProtoAdapter_SupervisorRecordContext
    extends ProtoAdapter<SupervisorRecordContext> {
        ProtoAdapter_SupervisorRecordContext() {
        }

        public int encodedSize(SupervisorRecordContext supervisorRecordContext) {
            return 0;
        }

        public void encode(ProtoWriter protoWriter, SupervisorRecordContext supervisorRecordContext) throws IOException {
        }

        public SupervisorRecordContext decode(ProtoReader protoReader) throws IOException {
            return null;
        }

        public SupervisorRecordContext redact(SupervisorRecordContext supervisorRecordContext) {
            return null;
        }
    }
}

