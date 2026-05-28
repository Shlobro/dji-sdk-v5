/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.location.Location
 */
package dji.v5.utils.common;

import android.location.Location;

public final class LocationUtil {
    private static final float MAXIMUM_DISTANCE = 100000.0f;
    private static final double MINIMUM_LAT_LONG = 1.0E-6;
    private static final double MAXIMUM_LATITUDE = 90.0;
    private static final double MAXIMUM_LONGITUDE = 180.0;

    private LocationUtil() {
    }

    public static boolean checkLongitude(double d2) {
        return false;
    }

    public static boolean checkLatitude(double d2) {
        return false;
    }

    public static float distanceBetween(double d2, double d3, double d4, double d5) {
        return 0.0f;
    }

    public static float[] calculateAngleAndDistance(double d2, double d3, double d4, double d5) {
        return null;
    }

    public static Location getLastLocation() {
        return null;
    }

    public static boolean isLocationEnabled() {
        return false;
    }

    public static boolean iLocationPermissionEnable() {
        return false;
    }
}

