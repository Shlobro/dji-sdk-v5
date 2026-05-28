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
import dji.csdk.flysafe.CEApproachMode;
import dji.csdk.flysafe.CERestrictionType;
import dji.csdk.flysafe.LimitAreaLevel;
import dji.csdk.flysafe.LimitAreaShape;
import dji.csdk.flysafe.LimitAreaSource;
import dji.csdk.flysafe.LimitAreaType;
import dji.csdk.flysafe.LocationCoordinate;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class LimitArea
extends Message<LimitArea, Builder> {
    public static final ProtoAdapter<LimitArea> ADAPTER = new ProtoAdapter_LimitArea();
    private static final long serialVersionUID = 0L;
    public static final Long DEFAULT_AREA_ID = 0L;
    public static final Float DEFAULT_SEARCH_RADIUS = Float.valueOf(0.0f);
    public static final String DEFAULT_PHONE_NUMBER = "";
    public static final Boolean DEFAULT_IS_UNLOCKED = false;
    public static final LimitAreaSource DEFAULT_SOURCE = LimitAreaSource.DJISourceOne;
    public static final LimitAreaShape DEFAULT_SHAPE = LimitAreaShape.Circle;
    public static final LimitAreaType DEFAULT_TYPE = LimitAreaType.DJIAirport;
    public static final Double DEFAULT_LATITUDE = 0.0;
    public static final Double DEFAULT_LONGITUDE = 0.0;
    public static final Integer DEFAULT_RADIUS = 0;
    public static final Integer DEFAULT_OUTER_RADIUS = 0;
    public static final Boolean DEFAULT_IS_WARNING = false;
    public static final LimitAreaLevel DEFAULT_LEVEL = LimitAreaLevel.Warning;
    public static final Integer DEFAULT_COUNTRY = 0;
    public static final String DEFAULT_POINT_DESC = "";
    public static final Long DEFAULT_SUB_AREA_ID = 0L;
    public static final Long DEFAULT_LIMIT_HEIGHT = 0L;
    public static final Long DEFAULT_INTERNAL_HASH = 0L;
    public static final Long DEFAULT_UPDATED_TIME = 0L;
    public static final Long DEFAULT_BEGIN_TIME = 0L;
    public static final Long DEFAULT_END_TIME = 0L;
    public static final String DEFAULT_POLYGON_SHAPE = "";
    public static final Boolean DEFAULT_IS_DISABLE = false;
    public static final String DEFAULT_CITY = "";
    public static final String DEFAULT_NAME = "";
    public static final Long DEFAULT_INDEX = 0L;
    public static final Double DEFAULT_LOWER_LIMIT = 0.0;
    public static final String DEFAULT_LOWER_VERTICAL_REFERENCE = "";
    public static final Double DEFAULT_UPPER_LIMIT = 0.0;
    public static final String DEFAULT_UPPER_VERTICAL_REFERENCE = "";
    public static final Double DEFAULT_HORIZONTAL_LIMIT = 0.0;
    public static final CEApproachMode DEFAULT_MODE = CEApproachMode.Inner;
    public static final Boolean DEFAULT_IS_PERMANENT = false;
    public static final String DEFAULT_CE_ALL_STARTTIME = "";
    public static final String DEFAULT_CE_ALL_ENDTIME = "";
    public static final String DEFAULT_CE_UOM_DIMENSIONS = "";
    public static final CERestrictionType DEFAULT_RESTRICTION_TYPE = CERestrictionType.NoRestriction;
    @WireField(tag=1, adapter="com.squareup.wire.ProtoAdapter#UINT64")
    public final Long area_id;
    @WireField(tag=2, adapter="com.squareup.wire.ProtoAdapter#FLOAT")
    public final Float search_radius;
    @WireField(tag=3, adapter="com.squareup.wire.ProtoAdapter#STRING")
    public final String phone_number;
    @WireField(tag=4, adapter="com.squareup.wire.ProtoAdapter#BOOL")
    public final Boolean is_unlocked;
    @WireField(tag=5, adapter="dji.flysafe.LimitAreaSource#ADAPTER")
    public final LimitAreaSource source;
    @WireField(tag=6, adapter="dji.flysafe.LimitAreaShape#ADAPTER")
    public final LimitAreaShape shape;
    @WireField(tag=7, adapter="dji.flysafe.LimitAreaType#ADAPTER")
    public final LimitAreaType type;
    @WireField(tag=8, adapter="com.squareup.wire.ProtoAdapter#DOUBLE")
    public final Double latitude;
    @WireField(tag=9, adapter="com.squareup.wire.ProtoAdapter#DOUBLE")
    public final Double longitude;
    @WireField(tag=10, adapter="com.squareup.wire.ProtoAdapter#UINT32")
    public final Integer radius;
    @WireField(tag=11, adapter="com.squareup.wire.ProtoAdapter#UINT32")
    public final Integer outer_radius;
    @WireField(tag=12, adapter="com.squareup.wire.ProtoAdapter#BOOL")
    public final Boolean is_warning;
    @WireField(tag=13, adapter="dji.flysafe.LimitAreaLevel#ADAPTER")
    public final LimitAreaLevel level;
    @WireField(tag=14, adapter="com.squareup.wire.ProtoAdapter#UINT32")
    public final Integer country;
    @WireField(tag=15, adapter="com.squareup.wire.ProtoAdapter#STRING")
    public final String point_desc;
    @WireField(tag=16, adapter="com.squareup.wire.ProtoAdapter#UINT64")
    public final Long sub_area_id;
    @WireField(tag=17, adapter="com.squareup.wire.ProtoAdapter#UINT64")
    public final Long limit_height;
    @WireField(tag=18, adapter="dji.flysafe.LimitArea#ADAPTER", label=WireField.Label.REPEATED)
    public final List<LimitArea> sub_shapes;
    @WireField(tag=19, adapter="dji.flysafe.LocationCoordinate#ADAPTER", label=WireField.Label.REPEATED)
    public final List<LocationCoordinate> polygon_points;
    @WireField(tag=20, adapter="com.squareup.wire.ProtoAdapter#UINT64")
    public final Long internal_hash;
    @WireField(tag=21, adapter="com.squareup.wire.ProtoAdapter#UINT64")
    public final Long updated_time;
    @WireField(tag=22, adapter="com.squareup.wire.ProtoAdapter#UINT64")
    public final Long begin_time;
    @WireField(tag=23, adapter="com.squareup.wire.ProtoAdapter#UINT64")
    public final Long end_time;
    @WireField(tag=24, adapter="com.squareup.wire.ProtoAdapter#STRING")
    public final String polygon_shape;
    @WireField(tag=25, adapter="com.squareup.wire.ProtoAdapter#BOOL")
    public final Boolean is_disable;
    @WireField(tag=26, adapter="com.squareup.wire.ProtoAdapter#STRING")
    public final String city;
    @WireField(tag=27, adapter="com.squareup.wire.ProtoAdapter#STRING")
    public final String name;
    @WireField(tag=28, adapter="com.squareup.wire.ProtoAdapter#UINT64")
    public final Long index;
    @WireField(tag=29, adapter="com.squareup.wire.ProtoAdapter#DOUBLE")
    public final Double lower_limit;
    @WireField(tag=30, adapter="com.squareup.wire.ProtoAdapter#STRING")
    public final String lower_vertical_reference;
    @WireField(tag=31, adapter="com.squareup.wire.ProtoAdapter#DOUBLE")
    public final Double upper_limit;
    @WireField(tag=32, adapter="com.squareup.wire.ProtoAdapter#STRING")
    public final String upper_vertical_reference;
    @WireField(tag=33, adapter="com.squareup.wire.ProtoAdapter#DOUBLE")
    public final Double horizontal_limit;
    @WireField(tag=34, adapter="dji.flysafe.CEApproachMode#ADAPTER")
    public final CEApproachMode mode;
    @WireField(tag=35, adapter="com.squareup.wire.ProtoAdapter#STRING", label=WireField.Label.REPEATED)
    public final List<String> ce_day;
    @WireField(tag=36, adapter="com.squareup.wire.ProtoAdapter#STRING", label=WireField.Label.REPEATED)
    public final List<String> ce_starttime;
    @WireField(tag=37, adapter="com.squareup.wire.ProtoAdapter#STRING", label=WireField.Label.REPEATED)
    public final List<String> ce_endime;
    @WireField(tag=38, adapter="com.squareup.wire.ProtoAdapter#BOOL")
    public final Boolean is_permanent;
    @WireField(tag=39, adapter="com.squareup.wire.ProtoAdapter#STRING")
    public final String ce_all_starttime;
    @WireField(tag=40, adapter="com.squareup.wire.ProtoAdapter#STRING")
    public final String ce_all_endtime;
    @WireField(tag=41, adapter="com.squareup.wire.ProtoAdapter#STRING")
    public final String ce_uom_dimensions;
    @WireField(tag=42, adapter="dji.flysafe.CERestrictionType#ADAPTER")
    public final CERestrictionType restriction_type;

    public LimitArea(Long l2, Float f2, String string, Boolean bl, LimitAreaSource limitAreaSource, LimitAreaShape limitAreaShape, LimitAreaType limitAreaType, Double d2, Double d3, Integer n, Integer n2, Boolean bl2, LimitAreaLevel limitAreaLevel, Integer n3, String string2, Long l3, Long l4, List<LimitArea> list, List<LocationCoordinate> list2, Long l5, Long l6, Long l7, Long l8, String string3, Boolean bl3, String string4, String string5, Long l9, Double d4, String string6, Double d5, String string7, Double d6, CEApproachMode cEApproachMode, List<String> list3, List<String> list4, List<String> list5, Boolean bl4, String string8, String string9, String string10, CERestrictionType cERestrictionType) {
    }

    public LimitArea(Long l2, Float f2, String string, Boolean bl, LimitAreaSource limitAreaSource, LimitAreaShape limitAreaShape, LimitAreaType limitAreaType, Double d2, Double d3, Integer n, Integer n2, Boolean bl2, LimitAreaLevel limitAreaLevel, Integer n3, String string2, Long l3, Long l4, List<LimitArea> list, List<LocationCoordinate> list2, Long l5, Long l6, Long l7, Long l8, String string3, Boolean bl3, String string4, String string5, Long l9, Double d4, String string6, Double d5, String string7, Double d6, CEApproachMode cEApproachMode, List<String> list3, List<String> list4, List<String> list5, Boolean bl4, String string8, String string9, String string10, CERestrictionType cERestrictionType, ByteString byteString) {
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
    extends Message.Builder<LimitArea, Builder> {
        public Long area_id;
        public Float search_radius;
        public String phone_number;
        public Boolean is_unlocked;
        public LimitAreaSource source;
        public LimitAreaShape shape;
        public LimitAreaType type;
        public Double latitude;
        public Double longitude;
        public Integer radius;
        public Integer outer_radius;
        public Boolean is_warning;
        public LimitAreaLevel level;
        public Integer country;
        public String point_desc;
        public Long sub_area_id;
        public Long limit_height;
        public List<LimitArea> sub_shapes;
        public List<LocationCoordinate> polygon_points;
        public Long internal_hash;
        public Long updated_time;
        public Long begin_time;
        public Long end_time;
        public String polygon_shape;
        public Boolean is_disable;
        public String city;
        public String name;
        public Long index;
        public Double lower_limit;
        public String lower_vertical_reference;
        public Double upper_limit;
        public String upper_vertical_reference;
        public Double horizontal_limit;
        public CEApproachMode mode;
        public List<String> ce_day;
        public List<String> ce_starttime;
        public List<String> ce_endime;
        public Boolean is_permanent;
        public String ce_all_starttime;
        public String ce_all_endtime;
        public String ce_uom_dimensions;
        public CERestrictionType restriction_type;

        public Builder area_id(Long l2) {
            return null;
        }

        public Builder search_radius(Float f2) {
            return null;
        }

        public Builder phone_number(String string) {
            return null;
        }

        public Builder is_unlocked(Boolean bl) {
            return null;
        }

        public Builder source(LimitAreaSource limitAreaSource) {
            return null;
        }

        public Builder shape(LimitAreaShape limitAreaShape) {
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

        public Builder radius(Integer n) {
            return null;
        }

        public Builder outer_radius(Integer n) {
            return null;
        }

        public Builder is_warning(Boolean bl) {
            return null;
        }

        public Builder level(LimitAreaLevel limitAreaLevel) {
            return null;
        }

        public Builder country(Integer n) {
            return null;
        }

        public Builder point_desc(String string) {
            return null;
        }

        public Builder sub_area_id(Long l2) {
            return null;
        }

        public Builder limit_height(Long l2) {
            return null;
        }

        public Builder sub_shapes(List<LimitArea> list) {
            return null;
        }

        public Builder polygon_points(List<LocationCoordinate> list) {
            return null;
        }

        public Builder internal_hash(Long l2) {
            return null;
        }

        public Builder updated_time(Long l2) {
            return null;
        }

        public Builder begin_time(Long l2) {
            return null;
        }

        public Builder end_time(Long l2) {
            return null;
        }

        public Builder polygon_shape(String string) {
            return null;
        }

        public Builder is_disable(Boolean bl) {
            return null;
        }

        public Builder city(String string) {
            return null;
        }

        public Builder name(String string) {
            return null;
        }

        public Builder index(Long l2) {
            return null;
        }

        public Builder lower_limit(Double d2) {
            return null;
        }

        public Builder lower_vertical_reference(String string) {
            return null;
        }

        public Builder upper_limit(Double d2) {
            return null;
        }

        public Builder upper_vertical_reference(String string) {
            return null;
        }

        public Builder horizontal_limit(Double d2) {
            return null;
        }

        public Builder mode(CEApproachMode cEApproachMode) {
            return null;
        }

        public Builder ce_day(List<String> list) {
            return null;
        }

        public Builder ce_starttime(List<String> list) {
            return null;
        }

        public Builder ce_endime(List<String> list) {
            return null;
        }

        public Builder is_permanent(Boolean bl) {
            return null;
        }

        public Builder ce_all_starttime(String string) {
            return null;
        }

        public Builder ce_all_endtime(String string) {
            return null;
        }

        public Builder ce_uom_dimensions(String string) {
            return null;
        }

        public Builder restriction_type(CERestrictionType cERestrictionType) {
            return null;
        }

        public LimitArea build() {
            return null;
        }
    }

    private static final class ProtoAdapter_LimitArea
    extends ProtoAdapter<LimitArea> {
        ProtoAdapter_LimitArea() {
        }

        public int encodedSize(LimitArea limitArea) {
            return 0;
        }

        public void encode(ProtoWriter protoWriter, LimitArea limitArea) throws IOException {
        }

        public LimitArea decode(ProtoReader protoReader) throws IOException {
            return null;
        }

        public LimitArea redact(LimitArea limitArea) {
            return null;
        }
    }
}

