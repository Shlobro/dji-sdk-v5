/*
 * Decompiled with CFR 0.152.
 */
package com.dji.wpmzsdk.common.utils.kml.model;

public class Location2D {
    public static final float ACCURACY_GPS_FINE = 16.0f;
    public static final double GPS_CHANGED = 1.0E-6;
    public double latitude;
    public double longitude;
    public float accuracy;

    public Location2D(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
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

    public float getAccuracy() {
        return this.accuracy;
    }

    public void setAccuracy(float accuracy) {
        this.accuracy = accuracy;
    }

    public boolean isChanged(double lat, double lng) {
        return Math.abs(this.latitude - lat) >= 1.0E-6 || Math.abs(this.longitude - lng) >= 1.0E-6;
    }

    public boolean isAvailable() {
        return Location2D.isAvailable(this.latitude, this.longitude);
    }

    public boolean isFineAccuracy() {
        return this.isFineAccuracy(16.0f);
    }

    public boolean isFineAccuracy(float meters) {
        return Location2D.isFineAccuracy(this.accuracy, meters);
    }

    public static boolean isFineAccuracy(float accuracy, float meter) {
        return 0.0f < accuracy && accuracy <= meter;
    }

    public boolean _equals(Location2D latLng) {
        return latLng != null && latLng.latitude == this.latitude && latLng.longitude == this.longitude;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Location2D)) {
            return false;
        }
        Location2D obj1 = (Location2D)obj;
        return Double.doubleToLongBits(this.latitude) == Double.doubleToLongBits(obj1.latitude) && Double.doubleToLongBits(this.longitude) == Double.doubleToLongBits(obj1.longitude);
    }

    public String toString() {
        return this.latitude + "," + this.longitude;
    }

    public static Location2D valueOf(String string) {
        String[] s = string.split(",");
        return s.length != 2 ? null : new Location2D(Double.valueOf(s[0]), Double.valueOf(s[1]));
    }

    public static boolean isAvailable(double latitude, double longitude) {
        return Math.abs(latitude) > 1.0E-7 && Math.abs(longitude) > 1.0E-7 && Math.abs(latitude) <= 90.0 && Math.abs(longitude) <= 180.0;
    }
}

