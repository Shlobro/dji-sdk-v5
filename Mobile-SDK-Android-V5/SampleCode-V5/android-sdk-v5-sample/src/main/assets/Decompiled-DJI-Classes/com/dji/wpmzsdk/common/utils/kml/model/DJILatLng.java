/*
 * Decompiled with CFR 0.152.
 */
package com.dji.wpmzsdk.common.utils.kml.model;

import com.dji.wpmzsdk.common.utils.DJIGpsUtils;

public class DJILatLng {
    private static final String TAG = DJILatLng.class.getSimpleName();
    public static final float ACCURACY_GPS_FINE = 16.0f;
    private static final double ZERO_DEBOUNCE_THRESHOLD = 1.0E-8;
    public double latitude;
    public double longitude;
    public double altitude;
    public float accuracy;
    public long time;
    public long elapsedRealtimeNanos;
    public int flag;
    public int flag2;
    public int tag;
    public int flightType;

    public DJILatLng(double latitude, double longitude) {
        this(latitude, longitude, 0.0);
    }

    public DJILatLng(double latitude, double longitude, double altitude) {
        this(latitude, longitude, altitude, 0.0f);
    }

    public DJILatLng(double latitude, double longitude, double altitude, float accuracy) {
        this(latitude, longitude, altitude, accuracy, 0L, 0L);
    }

    public DJILatLng(double latitude, double longitude, double altitude, float accuracy, long time) {
        this(latitude, longitude, altitude, accuracy, time, 0L);
    }

    public DJILatLng(double latitude, double longitude, double altitude, float accuracy, long time, long elapsedRealtimeNanos) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.altitude = altitude;
        this.accuracy = accuracy;
        this.time = time;
        this.elapsedRealtimeNanos = elapsedRealtimeNanos;
    }

    public DJILatLng(DJILatLng latLng) {
        this(latLng.latitude, latLng.longitude, latLng.altitude, latLng.accuracy, latLng.time, latLng.elapsedRealtimeNanos);
    }

    public double getLatitude() {
        return this.latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return this.longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getAltitude() {
        return this.altitude;
    }

    public float getAccuracy() {
        return this.accuracy;
    }

    public void setAccuracy(float accuracy) {
        this.accuracy = accuracy;
    }

    public long getTime() {
        return this.time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public long getElapsedRealtimeNanos() {
        return this.elapsedRealtimeNanos;
    }

    public void setElapsedRealtimeNanos(long elapsedRealtimeNanos) {
        this.elapsedRealtimeNanos = elapsedRealtimeNanos;
    }

    public boolean isAvailable() {
        return DJIGpsUtils.isAvailable(this.latitude, this.longitude);
    }

    public boolean isFineAccuracy() {
        return this.isFineAccuracy(16.0f);
    }

    public boolean isFineAccuracy(float meters) {
        return DJILatLng.isFineAccuracy(this.accuracy, meters);
    }

    public static boolean isFineAccuracy(float accuracy, float meter) {
        return 0.0f < accuracy && accuracy <= meter;
    }

    public static DJILatLng valueOf(String string) {
        String[] s = string.split(",");
        return s.length != 2 ? null : new DJILatLng(Double.valueOf(s[0]), Double.valueOf(s[1]));
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        DJILatLng latLng = (DJILatLng)o;
        if (Double.compare(latLng.latitude, this.latitude) != 0) {
            return false;
        }
        if (Double.compare(latLng.longitude, this.longitude) != 0) {
            return false;
        }
        if (Double.compare(latLng.altitude, this.altitude) != 0) {
            return false;
        }
        if (Float.compare(latLng.accuracy, this.accuracy) != 0) {
            return false;
        }
        return this.time == latLng.time;
    }

    public int hashCode() {
        long temp = Double.doubleToLongBits(this.latitude);
        int result = (int)(temp ^ temp >>> 32);
        temp = Double.doubleToLongBits(this.longitude);
        result = 31 * result + (int)(temp ^ temp >>> 32);
        temp = Double.doubleToLongBits(this.altitude);
        result = 31 * result + (int)(temp ^ temp >>> 32);
        result = 31 * result + (this.accuracy != 0.0f ? Float.floatToIntBits(this.accuracy) : 0);
        result = 31 * result + (int)(this.time ^ this.time >>> 32);
        return result;
    }

    public String toString() {
        double lat = this.latitude;
        double lng = this.longitude;
        double altitude = this.altitude;
        float accuracy = this.accuracy;
        return new StringBuilder(60).append("lat/lng: (").append(lat).append(",").append(lng).append(")").append(" altitude=").append(altitude).append(" accuracy=").append(accuracy).toString();
    }
}

