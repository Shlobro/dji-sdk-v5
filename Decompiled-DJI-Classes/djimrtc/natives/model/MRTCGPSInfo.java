/*
 * Decompiled with CFR 0.152.
 */
package djimrtc.natives.model;

import djimrtc.natives.model.UtcTime;

public class MRTCGPSInfo {
    private final double latitude;
    private final double longitude;
    private final float altitude;
    private final int status;
    private final int altitudeType;
    private final int coordinateType;
    private final UtcTime utcTime;
    private final String identify;

    public MRTCGPSInfo(Builder builder) {
    }

    public double getLatitude() {
        return 0.0;
    }

    public double getLongitude() {
        return 0.0;
    }

    public float getAltitude() {
        return 0.0f;
    }

    public int getStatus() {
        return 0;
    }

    public int getAltitudeType() {
        return 0;
    }

    public int getCoordinateType() {
        return 0;
    }

    public UtcTime getUtcTime() {
        return null;
    }

    public String getIdentify() {
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

    public static final class Builder {
        private double latitude;
        private double longitude;
        private float altitude;
        private int status;
        private int altitudeType;
        private int coordinateType;
        private UtcTime utcTime;
        private String identify;

        public Builder setLatitude(double d2) {
            return null;
        }

        public Builder setLongitude(double d2) {
            return null;
        }

        public Builder setAltitude(float f2) {
            return null;
        }

        public Builder setStatus(int n) {
            return null;
        }

        public Builder setAltitudeType(int n) {
            return null;
        }

        public Builder setCoordinateType(int n) {
            return null;
        }

        public Builder setUtcTime(UtcTime utcTime) {
            return null;
        }

        public Builder setIdentify(String string) {
            return null;
        }

        public MRTCGPSInfo build() {
            return null;
        }

        static /* synthetic */ int access$000(Builder builder) {
            return 0;
        }

        static /* synthetic */ int access$100(Builder builder) {
            return 0;
        }

        static /* synthetic */ String access$200(Builder builder) {
            return null;
        }

        static /* synthetic */ double access$300(Builder builder) {
            return 0.0;
        }

        static /* synthetic */ double access$400(Builder builder) {
            return 0.0;
        }

        static /* synthetic */ int access$500(Builder builder) {
            return 0;
        }

        static /* synthetic */ UtcTime access$600(Builder builder) {
            return null;
        }

        static /* synthetic */ float access$700(Builder builder) {
            return 0.0f;
        }
    }
}

