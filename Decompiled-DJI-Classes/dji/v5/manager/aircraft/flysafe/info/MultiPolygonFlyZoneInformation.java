/*
 * Decompiled with CFR 0.152.
 */
package dji.v5.manager.aircraft.flysafe.info;

import dji.sdk.keyvalue.value.common.LocationCoordinate2D;
import dji.v5.manager.aircraft.flysafe.info.MultiPolygonFlyZoneShape;
import java.util.List;

public class MultiPolygonFlyZoneInformation {
    private final int flyZoneID;
    private final MultiPolygonFlyZoneShape shape;
    private final List<LocationCoordinate2D> polygonPoints;
    private final int limitedHeight;
    private final LocationCoordinate2D cylinderCenter;
    private final double cylinderRadius;

    private MultiPolygonFlyZoneInformation(Builder builder) {
    }

    public int getFlyZoneID() {
        return 0;
    }

    public MultiPolygonFlyZoneShape getShape() {
        return null;
    }

    public List<LocationCoordinate2D> getPolygonPoints() {
        return null;
    }

    public int getLimitedHeight() {
        return 0;
    }

    public LocationCoordinate2D getCylinderCenter() {
        return null;
    }

    public double getCylinderRadius() {
        return 0.0;
    }

    public boolean equals(Object object) {
        return false;
    }

    public int hashCode() {
        return 0;
    }

    /* synthetic */ MultiPolygonFlyZoneInformation(Builder builder, 1 var2_2) {
    }

    public static final class Builder {
        private int flyZoneID;
        private MultiPolygonFlyZoneShape shape;
        private List<LocationCoordinate2D> vertices;
        private int maximumFlightHeight;
        private LocationCoordinate2D center;
        private double radius;

        private Builder() {
        }

        public static Builder newBuilder() {
            return null;
        }

        public Builder areaID(int n) {
            return null;
        }

        public Builder shape(MultiPolygonFlyZoneShape multiPolygonFlyZoneShape) {
            return null;
        }

        public Builder vertices(List<LocationCoordinate2D> list) {
            return null;
        }

        public Builder maximumFlightHeight(int n) {
            return null;
        }

        public Builder center(LocationCoordinate2D locationCoordinate2D) {
            return null;
        }

        public Builder radius(double d2) {
            return null;
        }

        public MultiPolygonFlyZoneInformation build() {
            return null;
        }

        static /* synthetic */ int access$000(Builder builder) {
            return 0;
        }

        static /* synthetic */ MultiPolygonFlyZoneShape access$100(Builder builder) {
            return null;
        }

        static /* synthetic */ List access$200(Builder builder) {
            return null;
        }

        static /* synthetic */ int access$300(Builder builder) {
            return 0;
        }

        static /* synthetic */ LocationCoordinate2D access$400(Builder builder) {
            return null;
        }

        static /* synthetic */ double access$500(Builder builder) {
            return 0.0;
        }
    }
}

