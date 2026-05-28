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
import dji.csdk.flysafe.LimitAreaShape;
import dji.csdk.flysafe.LimitAreaType;
import dji.csdk.flysafe.LocationCoordinate;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class UtmissLimitArea
extends Message<UtmissLimitArea, Builder> {
    public static final ProtoAdapter<UtmissLimitArea> ADAPTER = new ProtoAdapter_UtmissLimitArea();
    private static final long serialVersionUID = 0L;
    public static final Long DEFAULT_AREA_ID = 0L;
    public static final String DEFAULT_NAME = "";
    public static final LimitAreaType DEFAULT_TYPE = LimitAreaType.DJIAirport;
    public static final Double DEFAULT_LATITUDE = 0.0;
    public static final Double DEFAULT_LONGITUDE = 0.0;
    public static final LimitAreaShape DEFAULT_SHAPE = LimitAreaShape.Circle;
    public static final Double DEFAULT_BOTTOM_HEIGHT = 0.0;
    public static final Double DEFAULT_TOP_HEIGHT = 0.0;
    public static final Double DEFAULT_RADIUS = 0.0;
    public static final Integer DEFAULT_REGION = 0;
    public static final String DEFAULT_CREATED_TIME = "";
    public static final String DEFAULT_UPDATE_TIME = "";
    public static final String DEFAULT_MD5 = "";
    @WireField(tag=1, adapter="com.squareup.wire.ProtoAdapter#UINT64")
    public final Long area_id;
    @WireField(tag=2, adapter="com.squareup.wire.ProtoAdapter#STRING")
    public final String name;
    @WireField(tag=3, adapter="dji.flysafe.LimitAreaType#ADAPTER")
    public final LimitAreaType type;
    @WireField(tag=4, adapter="com.squareup.wire.ProtoAdapter#DOUBLE")
    public final Double latitude;
    @WireField(tag=5, adapter="com.squareup.wire.ProtoAdapter#DOUBLE")
    public final Double longitude;
    @WireField(tag=6, adapter="dji.flysafe.LimitAreaShape#ADAPTER")
    public final LimitAreaShape shape;
    @WireField(tag=7, adapter="com.squareup.wire.ProtoAdapter#DOUBLE")
    public final Double bottom_height;
    @WireField(tag=8, adapter="com.squareup.wire.ProtoAdapter#DOUBLE")
    public final Double top_height;
    @WireField(tag=9, adapter="com.squareup.wire.ProtoAdapter#DOUBLE")
    public final Double radius;
    @WireField(tag=10, adapter="com.squareup.wire.ProtoAdapter#UINT32")
    public final Integer region;
    @WireField(tag=11, adapter="com.squareup.wire.ProtoAdapter#STRING")
    public final String created_time;
    @WireField(tag=12, adapter="com.squareup.wire.ProtoAdapter#STRING")
    public final String update_time;
    @WireField(tag=13, adapter="com.squareup.wire.ProtoAdapter#STRING")
    public final String md5;
    @WireField(tag=14, adapter="dji.flysafe.LocationCoordinate#ADAPTER", label=WireField.Label.REPEATED)
    public final List<LocationCoordinate> polygon_points;

    public UtmissLimitArea(Long l2, String string, LimitAreaType limitAreaType, Double d2, Double d3, LimitAreaShape limitAreaShape, Double d4, Double d5, Double d6, Integer n, String string2, String string3, String string4, List<LocationCoordinate> list) {
    }

    public UtmissLimitArea(Long l2, String string, LimitAreaType limitAreaType, Double d2, Double d3, LimitAreaShape limitAreaShape, Double d4, Double d5, Double d6, Integer n, String string2, String string3, String string4, List<LocationCoordinate> list, ByteString byteString) {
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
    extends Message.Builder<UtmissLimitArea, Builder> {
        public Long area_id;
        public String name;
        public LimitAreaType type;
        public Double latitude;
        public Double longitude;
        public LimitAreaShape shape;
        public Double bottom_height;
        public Double top_height;
        public Double radius;
        public Integer region;
        public String created_time;
        public String update_time;
        public String md5;
        public List<LocationCoordinate> polygon_points;

        public Builder area_id(Long l2) {
            return null;
        }

        public Builder name(String string) {
            return null;
        }

        public Builder type(LimitAreaType limitAreaType) {
            return null;
        }

        public Builder latitude(Double d2) {
            return null;
        }

        public Builder longitude(Double d2) {
            return null;
        }

        public Builder shape(LimitAreaShape limitAreaShape) {
            return null;
        }

        public Builder bottom_height(Double d2) {
            return null;
        }

        public Builder top_height(Double d2) {
            return null;
        }

        public Builder radius(Double d2) {
            return null;
        }

        public Builder region(Integer n) {
            return null;
        }

        public Builder created_time(String string) {
            return null;
        }

        public Builder update_time(String string) {
            return null;
        }

        public Builder md5(String string) {
            return null;
        }

        public Builder polygon_points(List<LocationCoordinate> list) {
            return null;
        }

        public UtmissLimitArea build() {
            return null;
        }
    }

    private static final class ProtoAdapter_UtmissLimitArea
    extends ProtoAdapter<UtmissLimitArea> {
        ProtoAdapter_UtmissLimitArea() {
        }

        public int encodedSize(UtmissLimitArea utmissLimitArea) {
            return 0;
        }

        public void encode(ProtoWriter protoWriter, UtmissLimitArea utmissLimitArea) throws IOException {
        }

        public UtmissLimitArea decode(ProtoReader protoReader) throws IOException {
            return null;
        }

        public UtmissLimitArea redact(UtmissLimitArea utmissLimitArea) {
            return null;
        }
    }
}

