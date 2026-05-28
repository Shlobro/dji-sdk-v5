/*
 * Decompiled with CFR 0.152.
 */
package djimrtc.natives.model;

public class RealTimeTargetPoint {
    private final int type;
    private final int index;
    private final double latitude;
    private final double longitude;
    private final float ellipsoidAltitude;
    private final float relativeAltitude;
    private final float videoStreamWindowX;
    private final float videoStreamWindowY;

    private RealTimeTargetPoint(Builder builder) {
    }

    public int getType() {
        return 0;
    }

    public int getIndex() {
        return 0;
    }

    public double getLatitude() {
        return 0.0;
    }

    public double getLongitude() {
        return 0.0;
    }

    public float getEllipsoidAltitude() {
        return 0.0f;
    }

    public float getRelativeAltitude() {
        return 0.0f;
    }

    public float getVideoStreamWindowX() {
        return 0.0f;
    }

    public float getVideoStreamWindowY() {
        return 0.0f;
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

    /* synthetic */ RealTimeTargetPoint(Builder builder, 1 var2_2) {
    }

    public static final class Builder {
        private int type;
        private int index;
        private double latitude;
        private double longitude;
        private float ellipsoidAltitude;
        private float relativeAltitude;
        private float videoStreamWindowX;
        private float videoStreamWindowY;

        public Builder setType(int n) {
            return null;
        }

        public Builder setIndex(int n) {
            return null;
        }

        public Builder setLatitude(double d2) {
            return null;
        }

        public Builder setLongitude(double d2) {
            return null;
        }

        public Builder setEllipsoidAltitude(float f2) {
            return null;
        }

        public Builder setRelativeAltitude(float f2) {
            return null;
        }

        public Builder setVideoStreamWindowX(float f2) {
            return null;
        }

        public Builder setVideoStreamWindowY(float f2) {
            return null;
        }

        public RealTimeTargetPoint build() {
            return null;
        }

        static /* synthetic */ int access$000(Builder builder) {
            return 0;
        }

        static /* synthetic */ int access$100(Builder builder) {
            return 0;
        }

        static /* synthetic */ double access$200(Builder builder) {
            return 0.0;
        }

        static /* synthetic */ double access$300(Builder builder) {
            return 0.0;
        }

        static /* synthetic */ float access$400(Builder builder) {
            return 0.0f;
        }

        static /* synthetic */ float access$500(Builder builder) {
            return 0.0f;
        }

        static /* synthetic */ float access$600(Builder builder) {
            return 0.0f;
        }

        static /* synthetic */ float access$700(Builder builder) {
            return 0.0f;
        }
    }
}

