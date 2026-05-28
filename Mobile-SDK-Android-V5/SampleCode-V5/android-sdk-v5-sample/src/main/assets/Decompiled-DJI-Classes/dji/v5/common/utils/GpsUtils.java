/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.location.Location
 */
package dji.v5.common.utils;

import android.annotation.SuppressLint;
import android.location.Location;
import dji.sdk.keyvalue.value.common.LocationCoordinate2D;
import dji.sdk.keyvalue.value.common.LocationCoordinate3D;
import dji.sdk.keyvalue.value.flightcontroller.AirSenseDirection;
import dji.sdk.keyvalue.value.remotecontroller.RcGPSInfo;

public class GpsUtils {
    public static final boolean OPEN = true;
    private static final double M_PI = Math.PI;
    private static final float[] distanceResult = new float[2];
    private static Rectangle[] region = new Rectangle[]{new Rectangle(49.2204, 79.4462, 42.8899, 96.33), new Rectangle(54.1415, 109.6872, 39.3742, 135.0002), new Rectangle(42.8899, 73.1246, 29.5297, 124.143255), new Rectangle(29.5297, 82.9684, 26.7186, 97.0352), new Rectangle(29.5297, 97.0253, 20.414096, 124.367395), new Rectangle(20.414096, 107.975793, 17.871542, 111.744104)};
    private static Rectangle[] exclude = new Rectangle[]{new Rectangle(25.398623, 119.921265, 21.785006, 122.497559), new Rectangle(22.284, 101.8652, 20.0988, 106.665), new Rectangle(21.5422, 106.4525, 20.4878, 108.051), new Rectangle(55.8175, 109.0323, 50.3257, 119.127), new Rectangle(55.8175, 127.4568, 49.5574, 137.0227), new Rectangle(44.8922, 131.2662, 42.5692, 137.0227)};
    private static int TIMES = 1;

    private static double transformLat(double d2, double d3) {
        return 0.0;
    }

    private static double transformLon(double d2, double d3) {
        return 0.0;
    }

    private static LocationCoordinate2D delta(LocationCoordinate2D locationCoordinate2D) {
        return null;
    }

    public static LocationCoordinate2D wgs2gcj(LocationCoordinate2D locationCoordinate2D) {
        return null;
    }

    public static LocationCoordinate2D gcj2wgs(LocationCoordinate2D locationCoordinate2D) {
        return null;
    }

    public static LocationCoordinate2D gcj2wgsMust(LocationCoordinate2D locationCoordinate2D) {
        return null;
    }

    public static LocationCoordinate2D wgs2gcjMust(LocationCoordinate2D locationCoordinate2D) {
        return null;
    }

    public static LocationCoordinate3D wgs2gcjMust(LocationCoordinate3D locationCoordinate3D) {
        return null;
    }

    public static LocationCoordinate3D gcj2wgsMust(LocationCoordinate3D locationCoordinate3D) {
        return null;
    }

    public static double distance(double d2, double d3, double d4, double d5) {
        return 0.0;
    }

    public static double distance3D(LocationCoordinate3D locationCoordinate3D, LocationCoordinate3D locationCoordinate3D2) {
        return 0.0;
    }

    public static double[] transformGpsDMS(double d2, int n) {
        return null;
    }

    public static double[] transformGpsDM(double d2, int n) {
        return null;
    }

    public static double[] transformGpsDMS(double d2) {
        return null;
    }

    public static double getGpsValue(double d2, double d3, double d4, int n) {
        return 0.0;
    }

    public static double getGpsValue(double d2, double d3, double d4) {
        return 0.0;
    }

    public static float distanceBetween(double d2, double d3, double d4, double d5) {
        return 0.0f;
    }

    public static boolean IsInsideChina(LocationCoordinate2D locationCoordinate2D) {
        return false;
    }

    private static boolean InRectangle(Rectangle rectangle, LocationCoordinate2D locationCoordinate2D) {
        return false;
    }

    public static boolean isInAmerican(double d2, double d3) {
        return false;
    }

    public static boolean checkLatitude(double d2) {
        return false;
    }

    public static boolean checkLongitude(double d2) {
        return false;
    }

    public static boolean isLocationValid(LocationCoordinate2D locationCoordinate2D) {
        return false;
    }

    public static float distanceBetweenNoMax(double d2, double d3, double d4, double d5) {
        return 0.0f;
    }

    public static LocationCoordinate2D locationFrom(LocationCoordinate2D locationCoordinate2D, float f2, AirSenseDirection airSenseDirection) {
        return null;
    }

    public static float getDistance(LocationCoordinate2D locationCoordinate2D, LocationCoordinate2D locationCoordinate2D2) {
        return 0.0f;
    }

    public static float[] getAllDistance(LocationCoordinate2D locationCoordinate2D, LocationCoordinate2D locationCoordinate2D2) {
        return null;
    }

    public static boolean outOfChina(double d2, double d3) {
        return false;
    }

    private static boolean checkPoint(int n, int n2) {
        return false;
    }

    private static float D(double d2, double d3, double d4) {
        return 0.0f;
    }

    public static boolean checkGpsNumValid(int n) {
        return false;
    }

    public static boolean checkGpsValid(int n, int n2, int n3) {
        return false;
    }

    public static int getGpsLevel(int n) {
        return 0;
    }

    public static Location convertToLocation(RcGPSInfo rcGPSInfo) {
        return null;
    }

    public static double egm96Altitude(double d2, double d3, double d4) {
        return 0.0;
    }

    public static float egm96AltitudeByUnit(double d2, double d3, double d4) {
        return 0.0f;
    }

    public static double wgs84Altitude(double d2, double d3, double d4) {
        return 0.0;
    }

    public static float wgs84AltitudeByUnit(double d2, double d3, double d4) {
        return 0.0f;
    }

    public static double getGeoidOffset(double d2, double d3) {
        return 0.0;
    }

    public static boolean isValid(double d2, double d3) {
        return false;
    }

    public static double gps2m(double d2, double d3, double d4, double d5, double d6, double d7) {
        return 0.0;
    }

    @SuppressLint(value={"FloatMath"})
    public static double gps2m(double d2, double d3, double d4, double d5) {
        return 0.0;
    }

    private GpsUtils() {
    }

    private static class Rectangle {
        private final double West;
        private final double North;
        private final double East;
        private final double South;

        public Rectangle(double d2, double d3, double d4, double d5) {
        }

        static /* synthetic */ double access$000(Rectangle rectangle) {
            return 0.0;
        }

        static /* synthetic */ double access$100(Rectangle rectangle) {
            return 0.0;
        }

        static /* synthetic */ double access$200(Rectangle rectangle) {
            return 0.0;
        }

        static /* synthetic */ double access$300(Rectangle rectangle) {
            return 0.0;
        }
    }
}

