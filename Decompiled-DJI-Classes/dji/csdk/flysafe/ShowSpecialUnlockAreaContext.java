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
import dji.csdk.flysafe.LocationCoordinate;
import dji.csdk.flysafe.SpecialUnlockType;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class ShowSpecialUnlockAreaContext
extends Message<ShowSpecialUnlockAreaContext, Builder> {
    public static final ProtoAdapter<ShowSpecialUnlockAreaContext> ADAPTER = new ProtoAdapter_ShowSpecialUnlockAreaContext();
    private static final long serialVersionUID = 0L;
    public static final Boolean DEFAULT_IS_SPECIAL_UNLOCK_VALID = false;
    public static final SpecialUnlockType DEFAULT_UNLOCK_TYPE = SpecialUnlockType.InvalidUnlock;
    public static final Integer DEFAULT_CIRCLE_RADIUS = 0;
    public static final Integer DEFAULT_START_DATE = 0;
    public static final Integer DEFAULT_END_DATE = 0;
    @WireField(tag=2, adapter="com.squareup.wire.ProtoAdapter#BOOL")
    public final Boolean is_special_unlock_valid;
    @WireField(tag=3, adapter="dji.flysafe.SpecialUnlockType#ADAPTER")
    public final SpecialUnlockType unlock_type;
    @WireField(tag=4, adapter="dji.flysafe.LocationCoordinate#ADAPTER")
    public final LocationCoordinate circle_center;
    @WireField(tag=5, adapter="com.squareup.wire.ProtoAdapter#UINT32")
    public final Integer circle_radius;
    @WireField(tag=6, adapter="dji.flysafe.LocationCoordinate#ADAPTER", label=WireField.Label.REPEATED)
    public final List<LocationCoordinate> polygon_points;
    @WireField(tag=7, adapter="com.squareup.wire.ProtoAdapter#UINT32")
    public final Integer start_date;
    @WireField(tag=8, adapter="com.squareup.wire.ProtoAdapter#UINT32")
    public final Integer end_date;

    public ShowSpecialUnlockAreaContext(Boolean bl, SpecialUnlockType specialUnlockType, LocationCoordinate locationCoordinate, Integer n, List<LocationCoordinate> list, Integer n2, Integer n3) {
    }

    public ShowSpecialUnlockAreaContext(Boolean bl, SpecialUnlockType specialUnlockType, LocationCoordinate locationCoordinate, Integer n, List<LocationCoordinate> list, Integer n2, Integer n3, ByteString byteString) {
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
    extends Message.Builder<ShowSpecialUnlockAreaContext, Builder> {
        public Boolean is_special_unlock_valid;
        public SpecialUnlockType unlock_type;
        public LocationCoordinate circle_center;
        public Integer circle_radius;
        public List<LocationCoordinate> polygon_points;
        public Integer start_date;
        public Integer end_date;

        public Builder is_special_unlock_valid(Boolean bl) {
            return null;
        }

        public Builder unlock_type(SpecialUnlockType specialUnlockType) {
            return null;
        }

        public Builder circle_center(LocationCoordinate locationCoordinate) {
            return null;
        }

        public Builder circle_radius(Integer n) {
            return null;
        }

        public Builder polygon_points(List<LocationCoordinate> list) {
            return null;
        }

        public Builder start_date(Integer n) {
            return null;
        }

        public Builder end_date(Integer n) {
            return null;
        }

        public ShowSpecialUnlockAreaContext build() {
            return null;
        }
    }

    private static final class ProtoAdapter_ShowSpecialUnlockAreaContext
    extends ProtoAdapter<ShowSpecialUnlockAreaContext> {
        ProtoAdapter_ShowSpecialUnlockAreaContext() {
        }

        public int encodedSize(ShowSpecialUnlockAreaContext showSpecialUnlockAreaContext) {
            return 0;
        }

        public void encode(ProtoWriter protoWriter, ShowSpecialUnlockAreaContext showSpecialUnlockAreaContext) throws IOException {
        }

        public ShowSpecialUnlockAreaContext decode(ProtoReader protoReader) throws IOException {
            return null;
        }

        public ShowSpecialUnlockAreaContext redact(ShowSpecialUnlockAreaContext showSpecialUnlockAreaContext) {
            return null;
        }
    }
}

