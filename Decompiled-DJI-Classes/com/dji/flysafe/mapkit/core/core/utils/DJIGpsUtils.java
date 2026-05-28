/*
 * Decompiled with CFR 0.152.
 */
package com.dji.flysafe.mapkit.core.core.utils;

import com.dji.flysafe.mapkit.core.core.models.DJILatLng;

public class DJIGpsUtils {
    private static final double ZERO_DEBOUNCE_THRESHOLD = 8.99322E-6;
    public static boolean OPEN = true;
    private static final double M_PI = Math.PI;
    private static final DeltaLatLngCache sDeltaLatLngCache = new DeltaLatLngCache(null);
    private static Rectangle[] region = new Rectangle[]{new Rectangle(49.2204, 79.4462, 42.8899, 96.33), new Rectangle(54.1415, 109.6872, 39.3742, 135.0002), new Rectangle(42.8899, 73.1246, 29.5297, 124.143255), new Rectangle(29.5297, 82.9684, 26.7186, 97.0352), new Rectangle(29.5297, 97.0253, 20.414096, 124.367395), new Rectangle(20.414096, 107.975793, 17.871542, 111.744104)};
    private static Rectangle[] exclude = new Rectangle[]{new Rectangle(25.398623, 119.921265, 21.785006, 122.497559), new Rectangle(22.284, 101.8652, 20.0988, 106.665), new Rectangle(21.5422, 106.4525, 20.4878, 108.051), new Rectangle(55.8175, 109.0323, 50.3257, 119.127), new Rectangle(55.8175, 127.4568, 49.5574, 137.0227), new Rectangle(44.8922, 131.2662, 42.5692, 137.0227)};

    private static double transformLat(double d2, double d3) {
        return 0.0;
    }

    private static double transformLon(double d2, double d3) {
        return 0.0;
    }

    private static DJILatLng delta(DJILatLng dJILatLng) {
        return null;
    }

    private static DeltaLatLngCache delta(double d2, double d3) {
        return null;
    }

    public static DJILatLng wgs2gcjInChina(DJILatLng dJILatLng) {
        return null;
    }

    public static DJILatLng wgs2gcjJustInMainlandChina(DJILatLng dJILatLng) {
        return null;
    }

    public static DJILatLng gcj2wgsInChina(DJILatLng dJILatLng) {
        return null;
    }

    public static DJILatLng gcj2wgsJustInMainlandChina(DJILatLng dJILatLng) {
        return null;
    }

    public static DJILatLng wgs2gcjMust(DJILatLng dJILatLng) {
        return null;
    }

    public static DJILatLng gcj2wgsMust(DJILatLng dJILatLng) {
        return null;
    }

    public static DJILatLng gcj2wgs_exact(DJILatLng dJILatLng) {
        return null;
    }

    public static double distance(double d2, double d3, double d4, double d5) {
        return 0.0;
    }

    public static double distance(DJILatLng dJILatLng, DJILatLng dJILatLng2) {
        return 0.0;
    }

    public static boolean isAvailable(double d2, double d3) {
        return false;
    }

    private static boolean isZero(double d2) {
        return false;
    }

    public static boolean IsInsideChina(DJILatLng dJILatLng) {
        return false;
    }

    public static double getBearing(double d2, double d3, double d4, double d5) {
        return 0.0;
    }

    private static double bearing(double d2, double d3, double d4, double d5) {
        return 0.0;
    }

    public static boolean IsInsideChinaMust(DJILatLng dJILatLng) {
        return false;
    }

    private static boolean InRectangle(Rectangle rectangle, DJILatLng dJILatLng) {
        return false;
    }

    private static class DeltaLatLngCache {
        private double latitude;
        private double longitude;

        private DeltaLatLngCache() {
        }

        /* synthetic */ DeltaLatLngCache(1 var1_1) {
        }

        static /* synthetic */ double access$102(DeltaLatLngCache deltaLatLngCache, double d2) {
            return 0.0;
        }

        static /* synthetic */ double access$202(DeltaLatLngCache deltaLatLngCache, double d2) {
            return 0.0;
        }

        static /* synthetic */ double access$100(DeltaLatLngCache deltaLatLngCache) {
            return 0.0;
        }

        static /* synthetic */ double access$200(DeltaLatLngCache deltaLatLngCache) {
            return 0.0;
        }
    }

    private static class Rectangle {
        public double West;
        public double North;
        public double East;
        public double South;

        public Rectangle(double d2, double d3, double d4, double d5) {
        }
    }
}

