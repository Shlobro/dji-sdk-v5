/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value;

import dji.sdk.keyvalue.value.common.LocationCoordinate2D;
import dji.sdk.keyvalue.value.common.LocationCoordinate3D;

public class ValueUtil {
    private static final double HALF_METER_OFFSET = 4.49661E-6;
    public static final LocationCoordinate3D INVALID_LOCATION_3D = new LocationCoordinate3D(Double.NaN, Double.NaN, Double.NaN);
    public static final LocationCoordinate2D INVALID_LOCATION_2D = new LocationCoordinate2D(Double.NaN, Double.NaN);

    public static int toInt(Object object) {
        return 0;
    }

    public static boolean toBool(Object object) {
        return false;
    }

    public static boolean toBool(Object object, boolean bl) {
        return false;
    }

    public static double toDouble(Object object) {
        return 0.0;
    }

    public static long toLong(Object object) {
        return 0L;
    }

    public static short toShort(Object object) {
        return 0;
    }

    public static int toInt(Object object, int n) {
        return 0;
    }

    public static float toFloat(Object object) {
        return 0.0f;
    }

    public static float toFloat(Object object, float f2) {
        return 0.0f;
    }

    public static boolean isCoordinateValid(LocationCoordinate2D locationCoordinate2D) {
        return false;
    }

    public static boolean isCoordinateValid(double d2, double d3) {
        return false;
    }

    public static boolean isEqualPosition(LocationCoordinate2D locationCoordinate2D, LocationCoordinate2D locationCoordinate2D2) {
        return false;
    }
}

