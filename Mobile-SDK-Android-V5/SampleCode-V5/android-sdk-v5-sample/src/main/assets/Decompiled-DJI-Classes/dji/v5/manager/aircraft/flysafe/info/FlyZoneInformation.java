/*
 * Decompiled with CFR 0.152.
 */
package dji.v5.manager.aircraft.flysafe.info;

import dji.sdk.keyvalue.value.common.LocationCoordinate2D;
import dji.v5.manager.aircraft.flysafe.info.FlyZoneCategory;
import dji.v5.manager.aircraft.flysafe.info.FlyZoneShape;
import dji.v5.manager.aircraft.flysafe.info.FlyZoneType;
import dji.v5.manager.aircraft.flysafe.info.MultiPolygonFlyZoneInformation;
import java.util.List;

public final class FlyZoneInformation {
    private final int flyZoneID;
    private final LocationCoordinate2D circleCenter;
    private final double circleRadius;
    private final FlyZoneType type;
    private final FlyZoneShape shape;
    private final FlyZoneCategory category;
    private final String name;
    private double upperLimit;
    private double lowerLimit;
    private final List<MultiPolygonFlyZoneInformation> multiPolygonFlyZoneInformation;

    private FlyZoneInformation(Builder builder) {
    }

    public int getFlyZoneID() {
        return 0;
    }

    public String getName() {
        return null;
    }

    public double getLowerLimit() {
        return 0.0;
    }

    public double getUpperLimit() {
        return 0.0;
    }

    public FlyZoneType getFlyZoneType() {
        return null;
    }

    public FlyZoneShape getShape() {
        return null;
    }

    public FlyZoneCategory getCategory() {
        return null;
    }

    public LocationCoordinate2D getCircleCenter() {
        return null;
    }

    public double getCircleRadius() {
        return 0.0;
    }

    public List<MultiPolygonFlyZoneInformation> getMultiPolygonFlyZoneInformation() {
        return null;
    }

    public static List<FlyZoneInformation> findFlyZoneByCategory(List<FlyZoneInformation> list, FlyZoneCategory flyZoneCategory) {
        return null;
    }

    public boolean equals(Object object) {
        return false;
    }

    public int hashCode() {
        return 0;
    }

    /* synthetic */ FlyZoneInformation(Builder builder, 1 var2_2) {
    }

    public static final class Builder {
        private int flyZoneID;
        private LocationCoordinate2D coordinate;
        private double radius;
        private FlyZoneType type;
        private FlyZoneShape shape;
        private FlyZoneCategory category;
        private String name;
        private double upperLimit;
        private double lowerLimit;
        private List<MultiPolygonFlyZoneInformation> subFlyZones;

        private Builder() {
        }

        public static Builder newBuilder() {
            return null;
        }

        public Builder flyZoneID(int n) {
            return null;
        }

        public Builder coordinate(LocationCoordinate2D locationCoordinate2D) {
            return null;
        }

        public Builder radius(double d2) {
            return null;
        }

        public Builder type(FlyZoneType flyZoneType) {
            return null;
        }

        public Builder shape(FlyZoneShape flyZoneShape) {
            return null;
        }

        public Builder category(FlyZoneCategory flyZoneCategory) {
            return null;
        }

        public Builder name(String string2) {
            return null;
        }

        public Builder lowerLimit(double d2) {
            return null;
        }

        public Builder upperLimit(double d2) {
            return null;
        }

        public Builder subFlyZones(List<MultiPolygonFlyZoneInformation> list) {
            return null;
        }

        public FlyZoneInformation build() {
            return null;
        }

        static /* synthetic */ int access$000(Builder builder) {
            return 0;
        }

        static /* synthetic */ LocationCoordinate2D access$100(Builder builder) {
            return null;
        }

        static /* synthetic */ double access$200(Builder builder) {
            return 0.0;
        }

        static /* synthetic */ FlyZoneType access$300(Builder builder) {
            return null;
        }

        static /* synthetic */ FlyZoneShape access$400(Builder builder) {
            return null;
        }

        static /* synthetic */ FlyZoneCategory access$500(Builder builder) {
            return null;
        }

        static /* synthetic */ String access$600(Builder builder) {
            return null;
        }

        static /* synthetic */ List access$700(Builder builder) {
            return null;
        }

        static /* synthetic */ double access$800(Builder builder) {
            return 0.0;
        }

        static /* synthetic */ double access$900(Builder builder) {
            return 0.0;
        }
    }
}

