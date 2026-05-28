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
package com.dji.industry.mission.waypointv2.common.waypointv2;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import java.io.IOException;
import okio.ByteString;

public final class WaypointUploadData
extends Message<WaypointUploadData, Builder> {
    public static final ProtoAdapter<WaypointUploadData> UPLOAD_DATA = new ProtoAdapter_WaypointUploadData();
    private static final long serialVersionUID = 0L;
    public static final Boolean DEFAULT_IS_WAYPOINT_SUMMARY_UPLOADED = false;
    public static final Integer DEFAULT_UPLOADED_WAYPOINT_INDEX = 0;
    public static final Integer DEFAULT_TOTAL_WAYPOINT_COUNT = 0;
    public static final Integer DEFAULT_ERROR_CODE = 0;
    @WireField(tag=1, adapter="com.squareup.wire.ProtoAdapter#BOOL")
    public final Boolean isWaypointSummaryUploaded;
    @WireField(tag=2, adapter="com.squareup.wire.ProtoAdapter#INT32")
    public final Integer uploaded_waypoint_index;
    @WireField(tag=3, adapter="com.squareup.wire.ProtoAdapter#UINT32")
    public final Integer total_waypoint_count;
    @WireField(tag=4, adapter="com.squareup.wire.ProtoAdapter#INT32")
    public final Integer error_code;

    public WaypointUploadData(Boolean bl, Integer n, Integer n2, Integer n3) {
    }

    public WaypointUploadData(Boolean bl, Integer n, Integer n2, Integer n3, ByteString byteString) {
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
    extends Message.Builder<WaypointUploadData, Builder> {
        public Boolean is_waypoint_summary_uploaded;
        public Integer uploaded_waypoint_index;
        public Integer total_waypoint_count;
        public Integer error_code;

        public Builder is_waypoint_summary_uploaded(Boolean bl) {
            return null;
        }

        public Builder uploaded_waypoint_index(Integer n) {
            return null;
        }

        public Builder total_waypoint_count(Integer n) {
            return null;
        }

        public Builder error_code(Integer n) {
            return null;
        }

        public WaypointUploadData build() {
            return null;
        }
    }

    private static final class ProtoAdapter_WaypointUploadData
    extends ProtoAdapter<WaypointUploadData> {
        ProtoAdapter_WaypointUploadData() {
        }

        public int encodedSize(WaypointUploadData waypointUploadData) {
            return 0;
        }

        public void encode(ProtoWriter protoWriter, WaypointUploadData waypointUploadData) throws IOException {
        }

        public WaypointUploadData decode(ProtoReader protoReader) throws IOException {
            return null;
        }

        public WaypointUploadData redact(WaypointUploadData waypointUploadData) {
            return null;
        }
    }
}

