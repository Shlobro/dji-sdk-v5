/*
 * Decompiled with CFR 0.152.
 */
package com.dji.flysafe.mapkit.core.core.models;

import java.io.Serializable;

public class DJILatLng
implements Serializable {
    private static final long serialVersionUID = 1038200165218942703L;
    private static final String TAG = DJILatLng.class.getSimpleName();
    public static final float ACCURACY_GPS_FINE = 16.0f;
    public static final float HIGH_ACCURACY_GPS_FINE = 6.0f;
    private static final double ZERO_DEBOUNCE_THRESHOLD = 1.0E-8;
    public double latitude;
    public double longitude;
    public double altitude;
    public float accuracy;
    public long time;
    public long elapsedRealtimeNanos;
    public float speed;
    public float bearing;

    public DJILatLng(double d2, double d3) {
    }

    public DJILatLng(double d2, double d3, double d4) {
    }

    public DJILatLng(double d2, double d3, double d4, float f2) {
    }

    public DJILatLng(double d2, double d3, double d4, float f2, long l2) {
    }

    public DJILatLng(double d2, double d3, double d4, float f2, long l2, long l3) {
    }

    public DJILatLng(double d2, double d3, double d4, float f2, float f3, float f4, long l2, long l3) {
    }

    public DJILatLng(DJILatLng dJILatLng) {
    }

    public double getLatitude() {
        return 0.0;
    }

    public void setLatitude(double d2) {
    }

    public double getLongitude() {
        return 0.0;
    }

    public void setLongitude(double d2) {
    }

    public double getAltitude() {
        return 0.0;
    }

    public float getAccuracy() {
        return 0.0f;
    }

    public void setAccuracy(float f2) {
    }

    public long getTime() {
        return 0L;
    }

    public void setTime(long l2) {
    }

    public long getElapsedRealtimeNanos() {
        return 0L;
    }

    public void setElapsedRealtimeNanos(long l2) {
    }

    public boolean isAvailable() {
        return false;
    }

    public boolean isFineAccuracy() {
        return false;
    }

    public boolean isFineAccuracy(float f2) {
        return false;
    }

    public void copyFrom(DJILatLng dJILatLng) {
    }

    public static boolean isFineAccuracy(float f2, float f3) {
        return false;
    }

    public static DJILatLng valueOf(String string) {
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
}

